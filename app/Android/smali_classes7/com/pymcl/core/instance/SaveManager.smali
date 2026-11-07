.class public final Lcom/pymcl/core/instance/SaveManager;
.super Ljava/lang/Object;
.source "Saves.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/instance/SaveManager$Companion;,
        Lcom/pymcl/core/instance/SaveManager$LevelMeta;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaves.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Saves.kt\ncom/pymcl/core/instance/SaveManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,279:1\n1#2:280\n1#2:327\n3938#3:281\n4474#3,2:282\n12746#3:288\n13093#3,3:289\n3938#3:292\n4474#3,2:293\n3938#3:306\n4474#3,2:307\n3938#3:309\n4474#3,2:310\n13074#3,10:316\n15101#3:326\n15102#3:328\n13084#3:329\n15101#3,2:331\n1739#4:284\n1814#4,3:285\n1739#4:295\n1814#4,3:296\n777#4:299\n873#4,2:300\n1739#4:312\n1814#4,3:313\n1233#4:330\n1505#5,2:302\n1505#5,2:304\n*S KotlinDebug\n*F\n+ 1 Saves.kt\ncom/pymcl/core/instance/SaveManager\n*L\n260#1:327\n126#1:281\n126#1:282,2\n190#1:288\n190#1:289,3\n195#1:292\n195#1:293,2\n236#1:306\n236#1:307,2\n237#1:309\n237#1:310,2\n260#1:316,10\n260#1:326\n260#1:328\n260#1:329\n277#1:331,2\n126#1:284\n126#1:285,3\n195#1:295\n195#1:296,3\n197#1:299\n197#1:300,2\n238#1:312\n238#1:313,3\n262#1:330\n208#1:302,2\n218#1:304,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 D2\u00020\u0001:\u0002DEB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J \u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\u0008\u0008\u0002\u0010%\u001a\u00020\u0019J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010\'\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0003J\u0014\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010)\u001a\u00020\u0014J\u0018\u0010,\u001a\u0008\u0012\u0004\u0012\u00020-0\u00162\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u0014J\u000e\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0014J\u0018\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00142\u0008\u0008\u0002\u00102\u001a\u00020\u0019J\u000e\u00103\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0014J\u0014\u00104\u001a\u0008\u0012\u0004\u0012\u0002050\u00162\u0006\u00106\u001a\u000207J\u0016\u00108\u001a\u00020\u00032\u0006\u00106\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u0014J \u00109\u001a\u00020\u00142\u0006\u00106\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u00020\u00032\u0006\u00106\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010=\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0003J\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020@0\u0016J\u000e\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u0014J\u0006\u0010C\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\nR\u0011\u0010\r\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\n\u00a8\u0006F"
    }
    d2 = {
        "Lcom/pymcl/core/instance/SaveManager;",
        "",
        "gameDir",
        "Ljava/io/File;",
        "clock",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Ljava/io/File;Lkotlin/jvm/functions/Function0;)V",
        "getGameDir",
        "()Ljava/io/File;",
        "savesDir",
        "getSavesDir",
        "backupsDir",
        "getBackupsDir",
        "trashDir",
        "getTrashDir",
        "child",
        "root",
        "name",
        "",
        "listSaves",
        "",
        "Lcom/pymcl/core/instance/SaveInfo;",
        "withSize",
        "",
        "saveDir",
        "backup",
        "export",
        "",
        "out",
        "Ljava/io/OutputStream;",
        "deleteSave",
        "rename",
        "Lcom/pymcl/core/instance/RenameResult;",
        "old",
        "newName",
        "updateLevelName",
        "setLevelName",
        "levelDat",
        "installDatapack",
        "saveName",
        "pack",
        "installedDatapacks",
        "listBackups",
        "Lcom/pymcl/core/instance/SaveBackup;",
        "backupSaveName",
        "fileName",
        "restoreBackup",
        "backupName",
        "overwrite",
        "deleteBackup",
        "listMedia",
        "Lcom/pymcl/core/instance/MediaFile;",
        "kind",
        "Lcom/pymcl/core/instance/MediaKind;",
        "mediaFile",
        "readMedia",
        "maxBytes",
        "",
        "deleteMedia",
        "moveToTrash",
        "f",
        "listTrash",
        "Lcom/pymcl/core/instance/TrashEntry;",
        "restoreTrash",
        "entryName",
        "emptyTrash",
        "Companion",
        "LevelMeta",
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


# static fields
.field private static final BACKUP_SUFFIX:Lkotlin/text/Regex;

.field public static final Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

.field private static final ILLEGAL:Lkotlin/text/Regex;

.field private static final SKIP:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final TRASH_SUFFIX:Lkotlin/text/Regex;


# instance fields
.field private final clock:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final gameDir:Ljava/io/File;


# direct methods
.method public static synthetic $r8$lambda$hiSEpXpyd3Cnebh9wtP4ypSa09A(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/instance/SaveManager;->restoreBackup$lambda$3$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$hrUORdMoiL394aXicyjpxElBo-k(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/instance/SaveManager;->restoreBackup$lambda$1$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/core/instance/SaveManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/instance/SaveManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    .line 69
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "[\\\\/:*?\"<>|\\u0000-\\u001f]"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/instance/SaveManager;->ILLEGAL:Lkotlin/text/Regex;

    .line 70
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "-(\\d{8}-\\d{6})(-\\d+)?\\.zip$"

    sget-object v2, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    invoke-direct {v0, v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lkotlin/text/RegexOption;)V

    sput-object v0, Lcom/pymcl/core/instance/SaveManager;->BACKUP_SUFFIX:Lkotlin/text/Regex;

    .line 71
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "^(saves|backups|screenshots|crash-reports|logs)~(.+)~(\\d{13})$"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/instance/SaveManager;->TRASH_SUFFIX:Lkotlin/text/Regex;

    .line 73
    const-string v0, "session.lock"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/instance/SaveManager;->SKIP:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "gameDir"    # Ljava/io/File;
    .param p2, "clock"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "gameDir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/instance/SaveManager;->gameDir:Ljava/io/File;

    iput-object p2, p0, Lcom/pymcl/core/instance/SaveManager;->clock:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 63
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lcom/pymcl/core/instance/SaveManager$1;->INSTANCE:Lcom/pymcl/core/instance/SaveManager$1;

    check-cast p2, Lkotlin/jvm/functions/Function0;

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/pymcl/core/instance/SaveManager;-><init>(Ljava/io/File;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static final synthetic access$getILLEGAL$cp()Lkotlin/text/Regex;
    .locals 1

    .line 63
    sget-object v0, Lcom/pymcl/core/instance/SaveManager;->ILLEGAL:Lkotlin/text/Regex;

    return-object v0
.end method

.method public static final synthetic access$getSKIP$cp()Ljava/util/Set;
    .locals 1

    .line 63
    sget-object v0, Lcom/pymcl/core/instance/SaveManager;->SKIP:Ljava/util/Set;

    return-object v0
.end method

.method private final child(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 6
    .param p1, "root"    # Ljava/io/File;
    .param p2, "name"    # Ljava/lang/String;

    .line 118
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    const-string v0, "."

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ".."

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    const/16 v3, 0x2f

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v3, v2, v4, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    const/16 v3, 0x5c

    invoke-static {v0, v3, v2, v4, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0, v2, v2, v4, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    if-eqz v1, :cond_2

    .line 120
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0

    .line 280
    :cond_2
    const/4 v0, 0x0

    .line 118
    .local v0, "$i$a$-require-SaveManager$child$1":I
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u975e\u6cd5\u540d\u79f0: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-SaveManager$child$1":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic listBackups$default(Lcom/pymcl/core/instance/SaveManager;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 194
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/pymcl/core/instance/SaveManager;->listBackups(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic listSaves$default(Lcom/pymcl/core/instance/SaveManager;ZILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 125
    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/pymcl/core/instance/SaveManager;->listSaves(Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic readMedia$default(Lcom/pymcl/core/instance/SaveManager;Lcom/pymcl/core/instance/MediaKind;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 245
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/high16 p3, 0x80000

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/instance/SaveManager;->readMedia(Lcom/pymcl/core/instance/MediaKind;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic rename$default(Lcom/pymcl/core/instance/SaveManager;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/core/instance/RenameResult;
    .locals 0

    .line 157
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/instance/SaveManager;->rename(Ljava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/instance/RenameResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic restoreBackup$default(Lcom/pymcl/core/instance/SaveManager;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 205
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/instance/SaveManager;->restoreBackup(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final restoreBackup$lambda$1$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 1
    .param p0, "$z"    # Ljava/util/zip/ZipInputStream;

    .line 208
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v0

    return-object v0
.end method

.method private static final restoreBackup$lambda$3$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 1
    .param p0, "$z"    # Ljava/util/zip/ZipInputStream;

    .line 218
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v0

    return-object v0
.end method

.method private final setLevelName(Ljava/io/File;Ljava/lang/String;)Z
    .locals 9
    .param p1, "levelDat"    # Ljava/io/File;
    .param p2, "name"    # Ljava/lang/String;

    .line 173
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 174
    :cond_0
    sget-object v0, Lcom/pymcl/core/instance/LevelNbt;->INSTANCE:Lcom/pymcl/core/instance/LevelNbt;

    invoke-virtual {v0, p1}, Lcom/pymcl/core/instance/LevelNbt;->readFile(Ljava/io/File;)Lcom/pymcl/core/instance/LevelNbt$Root;

    move-result-object v0

    .local v0, "root":Lcom/pymcl/core/instance/LevelNbt$Root;
    invoke-virtual {v0}, Lcom/pymcl/core/instance/LevelNbt$Root;->getTag()Lcom/pymcl/core/instance/LevelNbt$NbtCompound;

    move-result-object v2

    const-string v3, "Data"

    invoke-virtual {v2, v3}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->compound(Ljava/lang/String;)Lcom/pymcl/core/instance/LevelNbt$NbtCompound;

    move-result-object v2

    if-nez v2, :cond_1

    return v1

    .line 175
    .local v2, "data":Lcom/pymcl/core/instance/LevelNbt$NbtCompound;
    :cond_1
    const-string v1, "LevelName"

    invoke-virtual {v2, v1, p2}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    sget-object v1, Lcom/pymcl/core/instance/LevelNbt;->INSTANCE:Lcom/pymcl/core/instance/LevelNbt;

    invoke-virtual {v1, v0}, Lcom/pymcl/core/instance/LevelNbt;->writeGzip(Lcom/pymcl/core/instance/LevelNbt$Root;)[B

    move-result-object v1

    .line 177
    .local v1, "bytes":[B
    new-instance v4, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    const-string v5, "level.dat_old"

    invoke-direct {v4, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v3, p1

    .end local p1    # "levelDat":Ljava/io/File;
    .local v3, "levelDat":Ljava/io/File;
    invoke-static/range {v3 .. v8}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .line 178
    new-instance p1, Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    const-string v5, "level.dat.part"

    invoke-direct {p1, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local p1, "tmp":Ljava/io/File;
    invoke-static {p1, v1}, Lkotlin/io/FilesKt;->writeBytes(Ljava/io/File;[B)V

    .line 179
    invoke-virtual {p1, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    invoke-virtual {p1, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    new-instance v4, Ljava/io/IOException;

    const-string v5, "\u5199 level.dat \u5931\u8d25"

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 180
    :cond_3
    :goto_0
    const/4 v4, 0x1

    return v4
.end method


# virtual methods
.method public final backup(Ljava/lang/String;)Ljava/io/File;
    .locals 10
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    invoke-virtual {p0, p1}, Lcom/pymcl/core/instance/SaveManager;->saveDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .local v0, "dir":Ljava/io/File;
    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getBackupsDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 139
    sget-object v1, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    iget-object v2, p0, Lcom/pymcl/core/instance/SaveManager;->clock:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/core/instance/SaveManager$Companion;->stamp(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .local v1, "base":Ljava/lang/String;
    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getBackupsDir()Ljava/io/File;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ".zip"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v2, "f":Ljava/io/File;
    const/4 v4, 0x2

    .line 140
    .local v4, "i":I
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_0

    new-instance v5, Ljava/io/File;

    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getBackupsDir()Ljava/io/File;

    move-result-object v7

    add-int/lit8 v8, v4, 0x1

    .end local v4    # "i":I
    .local v8, "i":I
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v7, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v2, v5

    move v4, v8

    goto :goto_0

    .line 141
    .end local v8    # "i":I
    .restart local v4    # "i":I
    :cond_0
    new-instance v3, Ljava/io/File;

    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getBackupsDir()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ".part"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 142
    .local v3, "tmp":Ljava/io/File;
    :try_start_0
    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v5, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    move-object v6, v5

    check-cast v6, Ljava/io/FileOutputStream;

    .line 280
    .local v6, "it":Ljava/io/FileOutputStream;
    const/4 v7, 0x0

    .line 142
    .local v7, "$i$a$-use-SaveManager$backup$1":I
    sget-object v8, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    move-object v9, v6

    check-cast v9, Ljava/io/OutputStream;

    invoke-virtual {v8, v0, p1, v9}, Lcom/pymcl/core/instance/SaveManager$Companion;->zipDir(Ljava/io/File;Ljava/lang/String;Ljava/io/OutputStream;)V

    .end local v6    # "it":Ljava/io/FileOutputStream;
    .end local v7    # "$i$a$-use-SaveManager$backup$1":I
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v6, 0x0

    :try_start_2
    invoke-static {v5, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v3, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v5, :cond_1

    .line 143
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 144
    return-object v2

    .line 142
    :cond_1
    :try_start_3
    new-instance v5, Ljava/io/IOException;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u65e0\u6cd5\u5199\u5165\u5907\u4efd "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v0    # "dir":Ljava/io/File;
    .end local v1    # "base":Ljava/lang/String;
    .end local v2    # "f":Ljava/io/File;
    .end local v3    # "tmp":Ljava/io/File;
    .end local v4    # "i":I
    .end local p1    # "name":Ljava/lang/String;
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .restart local v0    # "dir":Ljava/io/File;
    .restart local v1    # "base":Ljava/lang/String;
    .restart local v2    # "f":Ljava/io/File;
    .restart local v3    # "tmp":Ljava/io/File;
    .restart local v4    # "i":I
    .restart local p1    # "name":Ljava/lang/String;
    :catchall_0
    move-exception v6

    .end local v0    # "dir":Ljava/io/File;
    .end local v1    # "base":Ljava/lang/String;
    .end local v2    # "f":Ljava/io/File;
    .end local v3    # "tmp":Ljava/io/File;
    .end local v4    # "i":I
    .end local p1    # "name":Ljava/lang/String;
    :try_start_4
    throw v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .restart local v0    # "dir":Ljava/io/File;
    .restart local v1    # "base":Ljava/lang/String;
    .restart local v2    # "f":Ljava/io/File;
    .restart local v3    # "tmp":Ljava/io/File;
    .restart local v4    # "i":I
    .restart local p1    # "name":Ljava/lang/String;
    :catchall_1
    move-exception v7

    :try_start_5
    invoke-static {v5, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v0    # "dir":Ljava/io/File;
    .end local v1    # "base":Ljava/lang/String;
    .end local v2    # "f":Ljava/io/File;
    .end local v3    # "tmp":Ljava/io/File;
    .end local v4    # "i":I
    .end local p1    # "name":Ljava/lang/String;
    throw v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 143
    .restart local v0    # "dir":Ljava/io/File;
    .restart local v1    # "base":Ljava/lang/String;
    .restart local v2    # "f":Ljava/io/File;
    .restart local v3    # "tmp":Ljava/io/File;
    .restart local v4    # "i":I
    .restart local p1    # "name":Ljava/lang/String;
    :catchall_2
    move-exception v5

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    throw v5
.end method

.method public final backupSaveName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "fileName"    # Ljava/lang/String;

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    sget-object v0, Lcom/pymcl/core/instance/SaveManager;->BACKUP_SUFFIX:Lkotlin/text/Regex;

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".zip"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final deleteBackup(Ljava/lang/String;)Ljava/io/File;
    .locals 5
    .param p1, "backupName"    # Ljava/lang/String;

    const-string v0, "backupName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getBackupsDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/pymcl/core/instance/SaveManager;->child(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 280
    move-object v1, v0

    .local v1, "it":Ljava/io/File;
    const/4 v2, 0x0

    .line 231
    .local v2, "$i$a$-also-SaveManager$deleteBackup$1":I
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_0

    .end local v1    # "it":Ljava/io/File;
    .end local v2    # "$i$a$-also-SaveManager$deleteBackup$1":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const-string v1, "backups"

    invoke-virtual {p0, v1, v0}, Lcom/pymcl/core/instance/SaveManager;->moveToTrash(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0

    .restart local v1    # "it":Ljava/io/File;
    .restart local v2    # "$i$a$-also-SaveManager$deleteBackup$1":I
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5907\u4efd\u4e0d\u5b58\u5728: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final deleteMedia(Lcom/pymcl/core/instance/MediaKind;Ljava/lang/String;)Ljava/io/File;
    .locals 2
    .param p1, "kind"    # Lcom/pymcl/core/instance/MediaKind;
    .param p2, "name"    # Ljava/lang/String;

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    invoke-virtual {p1}, Lcom/pymcl/core/instance/MediaKind;->getDir()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/instance/SaveManager;->mediaFile(Lcom/pymcl/core/instance/MediaKind;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/pymcl/core/instance/SaveManager;->moveToTrash(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final deleteSave(Ljava/lang/String;)Ljava/io/File;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    const-string v0, "saves"

    invoke-virtual {p0, p1}, Lcom/pymcl/core/instance/SaveManager;->saveDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/pymcl/core/instance/SaveManager;->moveToTrash(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final emptyTrash()J
    .locals 9

    .line 277
    sget-object v0, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getTrashDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/instance/SaveManager$Companion;->dirSize(Ljava/io/File;)J

    move-result-wide v0

    .local v0, "n":J
    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getTrashDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_1

    .local v2, "$this$forEach$iv":[Ljava/lang/Object;
    const/4 v3, 0x0

    .line 331
    .local v3, "$i$f$forEach":I
    array-length v4, v2

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v2, v5

    .local v6, "element$iv":Ljava/lang/Object;
    move-object v7, v6

    .local v7, "it":Ljava/io/File;
    const/4 v8, 0x0

    .line 277
    .local v8, "$i$a$-forEach-SaveManager$emptyTrash$1":I
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v7}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    .line 331
    .end local v7    # "it":Ljava/io/File;
    .end local v8    # "$i$a$-forEach-SaveManager$emptyTrash$1":I
    nop

    .end local v6    # "element$iv":Ljava/lang/Object;
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 332
    :cond_0
    nop

    .line 277
    .end local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v3    # "$i$f$forEach":I
    :cond_1
    return-wide v0
.end method

.method public final export(Ljava/lang/String;Ljava/io/OutputStream;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "out"    # Ljava/io/OutputStream;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "out"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    sget-object v0, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    invoke-virtual {p0, p1}, Lcom/pymcl/core/instance/SaveManager;->saveDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lcom/pymcl/core/instance/SaveManager$Companion;->zipDir(Ljava/io/File;Ljava/lang/String;Ljava/io/OutputStream;)V

    return-void
.end method

.method public final getBackupsDir()Ljava/io/File;
    .locals 3

    .line 65
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/instance/SaveManager;->gameDir:Ljava/io/File;

    const-string v2, "backups"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getGameDir()Ljava/io/File;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager;->gameDir:Ljava/io/File;

    return-object v0
.end method

.method public final getSavesDir()Ljava/io/File;
    .locals 3

    .line 64
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/instance/SaveManager;->gameDir:Ljava/io/File;

    const-string v2, "saves"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getTrashDir()Ljava/io/File;
    .locals 3

    .line 66
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/instance/SaveManager;->gameDir:Ljava/io/File;

    const-string v2, ".trash"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final installDatapack(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    .locals 9
    .param p1, "saveName"    # Ljava/lang/String;
    .param p2, "pack"    # Ljava/io/File;

    const-string v0, "saveName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/pymcl/core/instance/SaveManager;->saveDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, "datapacks"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v1, v0

    .line 280
    .local v1, "it":Ljava/io/File;
    const/4 v2, 0x0

    .line 185
    .local v2, "$i$a$-also-SaveManager$installDatapack$dir$1":I
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .end local v1    # "it":Ljava/io/File;
    .end local v2    # "$i$a$-also-SaveManager$installDatapack$dir$1":I
    .local v0, "dir":Ljava/io/File;
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, v1}, Lcom/pymcl/core/instance/SaveManager;->child(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 186
    .local v4, "dst":Ljava/io/File;
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v3, p2

    .end local p2    # "pack":Ljava/io/File;
    .local v3, "pack":Ljava/io/File;
    invoke-static/range {v3 .. v8}, Lkotlin/io/FilesKt;->copyRecursively$default(Ljava/io/File;Ljava/io/File;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_0

    .end local v3    # "pack":Ljava/io/File;
    .restart local p2    # "pack":Ljava/io/File;
    :cond_0
    move-object v3, p2

    .end local p2    # "pack":Ljava/io/File;
    .restart local v3    # "pack":Ljava/io/File;
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .line 187
    :goto_0
    return-object v4
.end method

.method public final installedDatapacks(Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .param p1, "saveName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "saveName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/pymcl/core/instance/SaveManager;->saveDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, "datapacks"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    .local v0, "$this$map$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 288
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 289
    .local v4, "$i$f$mapTo":I
    array-length v5, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v3, v6

    .line 290
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it":Ljava/io/File;
    const/4 v9, 0x0

    .line 190
    .local v9, "$i$a$-map-SaveManager$installedDatapacks$1":I
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    .line 290
    .end local v8    # "it":Ljava/io/File;
    .end local v9    # "$i$a$-map-SaveManager$installedDatapacks$1":I
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 289
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 291
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 288
    nop

    .line 190
    .end local v0    # "$this$map$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$map":I
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->sorted(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final listBackups(Ljava/lang/String;)Ljava/util/List;
    .locals 22
    .param p1, "saveName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveBackup;",
            ">;"
        }
    .end annotation

    .line 195
    move-object/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/core/instance/SaveManager;->getBackupsDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    const-string v2, "getName(...)"

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    .local v1, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 292
    .local v5, "$i$f$filter":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v1

    .local v7, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 293
    .local v8, "$i$f$filterTo":I
    array-length v9, v7

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_2

    aget-object v11, v7, v10

    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it":Ljava/io/File;
    const/4 v13, 0x0

    .line 195
    .local v13, "$i$a$-filter-SaveManager$listBackups$1":I
    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    move-result v14

    if-eqz v14, :cond_0

    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, ".zip"

    invoke-static {v14, v15, v4}, Lkotlin/text/StringsKt;->endsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v14

    if-eqz v14, :cond_0

    move v12, v4

    goto :goto_1

    :cond_0
    const/4 v12, 0x0

    .line 293
    .end local v12    # "it":Ljava/io/File;
    .end local v13    # "$i$a$-filter-SaveManager$listBackups$1":I
    :goto_1
    if-eqz v12, :cond_1

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 294
    :cond_2
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$filterTo":I
    check-cast v6, Ljava/util/List;

    .line 292
    nop

    .line 195
    .end local v1    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$filter":I
    goto :goto_2

    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v6

    :goto_2
    move-object v1, v6

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 295
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v1, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .restart local v6    # "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v1

    .local v7, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 296
    .local v8, "$i$f$mapTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 297
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Ljava/io/File;

    .local v11, "f":Ljava/io/File;
    const/4 v12, 0x0

    .line 196
    .local v12, "$i$a$-map-SaveManager$listBackups$2":I
    new-instance v13, Lcom/pymcl/core/instance/SaveBackup;

    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p0

    invoke-virtual {v3, v15}, Lcom/pymcl/core/instance/SaveManager;->backupSaveName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11}, Ljava/io/File;->lastModified()J

    move-result-wide v16

    invoke-virtual {v11}, Ljava/io/File;->length()J

    move-result-wide v18

    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v21, v1

    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .local v21, "$this$map$iv":Ljava/lang/Iterable;
    const-string v1, "getAbsolutePath(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v20, v4

    invoke-direct/range {v13 .. v20}, Lcom/pymcl/core/instance/SaveBackup;-><init>(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    .line 297
    .end local v11    # "f":Ljava/io/File;
    .end local v12    # "$i$a$-map-SaveManager$listBackups$2":I
    invoke-interface {v6, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v21

    const/4 v4, 0x1

    goto :goto_3

    .line 298
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    .end local v21    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v1    # "$this$map$iv":Ljava/lang/Iterable;
    :cond_4
    move-object/from16 v3, p0

    move-object/from16 v21, v1

    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo":I
    .restart local v21    # "$this$map$iv":Ljava/lang/Iterable;
    move-object v1, v6

    check-cast v1, Ljava/util/List;

    .line 295
    nop

    .end local v5    # "$i$f$map":I
    .end local v21    # "$this$map$iv":Ljava/lang/Iterable;
    check-cast v1, Ljava/lang/Iterable;

    .line 197
    nop

    .local v1, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 299
    .local v2, "$i$f$filter":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 300
    .local v6, "$i$f$filterTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lcom/pymcl/core/instance/SaveBackup;

    .local v9, "it":Lcom/pymcl/core/instance/SaveBackup;
    const/4 v10, 0x0

    .line 197
    .local v10, "$i$a$-filter-SaveManager$listBackups$3":I
    if-eqz v0, :cond_7

    invoke-virtual {v9}, Lcom/pymcl/core/instance/SaveBackup;->getSaveName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_5

    :cond_6
    const/4 v9, 0x0

    goto :goto_6

    :cond_7
    :goto_5
    const/4 v9, 0x1

    .line 300
    .end local v9    # "it":Lcom/pymcl/core/instance/SaveBackup;
    .end local v10    # "$i$a$-filter-SaveManager$listBackups$3":I
    :goto_6
    if-eqz v9, :cond_5

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 301
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    :cond_8
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filterTo":I
    check-cast v4, Ljava/util/List;

    .line 299
    nop

    .end local v1    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$filter":I
    check-cast v4, Ljava/lang/Iterable;

    .line 197
    new-instance v1, Lcom/pymcl/core/instance/SaveManager$listBackups$$inlined$compareByDescending$1;

    invoke-direct {v1}, Lcom/pymcl/core/instance/SaveManager$listBackups$$inlined$compareByDescending$1;-><init>()V

    check-cast v1, Ljava/util/Comparator;

    new-instance v2, Lcom/pymcl/core/instance/SaveManager$listBackups$$inlined$thenByDescending$1;

    invoke-direct {v2, v1}, Lcom/pymcl/core/instance/SaveManager$listBackups$$inlined$thenByDescending$1;-><init>(Ljava/util/Comparator;)V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method public final listMedia(Lcom/pymcl/core/instance/MediaKind;)Ljava/util/List;
    .locals 18
    .param p1, "kind"    # Lcom/pymcl/core/instance/MediaKind;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/instance/MediaKind;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/MediaFile;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "kind"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    new-instance v2, Ljava/io/File;

    iget-object v3, v0, Lcom/pymcl/core/instance/SaveManager;->gameDir:Ljava/io/File;

    invoke-virtual {v1}, Lcom/pymcl/core/instance/MediaKind;->getDir()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    const-string v4, "getName(...)"

    if-eqz v2, :cond_3

    .local v2, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v6, 0x0

    .line 306
    .local v6, "$i$f$filter":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v2

    .local v8, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v9, 0x0

    .line 307
    .local v9, "$i$f$filterTo":I
    array-length v10, v8

    const/4 v11, 0x0

    :goto_0
    if-ge v11, v10, :cond_2

    aget-object v12, v8, v11

    .local v12, "element$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "it":Ljava/io/File;
    const/4 v14, 0x0

    .line 236
    .local v14, "$i$a$-filter-SaveManager$listMedia$files$1":I
    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    move-result v15

    if-eqz v15, :cond_0

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Lcom/pymcl/core/instance/MediaKind;->accepts(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_0

    const/4 v13, 0x1

    goto :goto_1

    :cond_0
    const/4 v13, 0x0

    .line 307
    .end local v13    # "it":Ljava/io/File;
    .end local v14    # "$i$a$-filter-SaveManager$listMedia$files$1":I
    :goto_1
    if-eqz v13, :cond_1

    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 308
    :cond_2
    nop

    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v9    # "$i$f$filterTo":I
    check-cast v7, Ljava/util/List;

    .line 306
    nop

    .line 236
    .end local v2    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v6    # "$i$f$filter":I
    goto :goto_2

    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    :goto_2
    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    .line 237
    .local v2, "files":Ljava/util/List;
    sget-object v6, Lcom/pymcl/core/instance/MediaKind;->CRASH_REPORTS:Lcom/pymcl/core/instance/MediaKind;

    if-ne v1, v6, :cond_8

    iget-object v6, v0, Lcom/pymcl/core/instance/SaveManager;->gameDir:Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_8

    .local v6, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v7, 0x0

    .line 309
    .local v7, "$i$f$filter":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v6

    .local v9, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v10, 0x0

    .line 310
    .local v10, "$i$f$filterTo":I
    array-length v11, v9

    const/4 v12, 0x0

    :goto_3
    if-ge v12, v11, :cond_7

    aget-object v13, v9, v12

    .local v13, "element$iv$iv":Ljava/lang/Object;
    move-object v14, v13

    .local v14, "it":Ljava/io/File;
    const/4 v15, 0x0

    .line 237
    .local v15, "$i$a$-filter-SaveManager$listMedia$1":I
    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "hs_err_pid"

    const/4 v0, 0x2

    const/4 v1, 0x0

    move-object/from16 v17, v2

    const/4 v2, 0x0

    .end local v2    # "files":Ljava/util/List;
    .local v17, "files":Ljava/util/List;
    invoke-static {v3, v5, v2, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, ".log"

    invoke-static {v3, v5, v2, v0, v1}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    .end local v17    # "files":Ljava/util/List;
    .restart local v2    # "files":Ljava/util/List;
    :cond_4
    move-object/from16 v17, v2

    const/4 v2, 0x0

    .end local v2    # "files":Ljava/util/List;
    .restart local v17    # "files":Ljava/util/List;
    :cond_5
    move v0, v2

    .line 310
    .end local v14    # "it":Ljava/io/File;
    .end local v15    # "$i$a$-filter-SaveManager$listMedia$1":I
    :goto_4
    if-eqz v0, :cond_6

    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v13    # "element$iv$iv":Ljava/lang/Object;
    :cond_6
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, v17

    goto :goto_3

    .line 311
    .end local v17    # "files":Ljava/util/List;
    .restart local v2    # "files":Ljava/util/List;
    :cond_7
    move-object/from16 v17, v2

    .end local v2    # "files":Ljava/util/List;
    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v10    # "$i$f$filterTo":I
    .restart local v17    # "files":Ljava/util/List;
    move-object v0, v8

    check-cast v0, Ljava/util/List;

    .line 309
    nop

    .line 237
    .end local v6    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v7    # "$i$f$filter":I
    nop

    .line 280
    .local v0, "it":Ljava/util/List;
    const/4 v1, 0x0

    .line 237
    .local v1, "$i$a$-let-SaveManager$listMedia$2":I
    move-object/from16 v2, v17

    check-cast v2, Ljava/util/Collection;

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .end local v0    # "it":Ljava/util/List;
    .end local v1    # "$i$a$-let-SaveManager$listMedia$2":I
    goto :goto_5

    .end local v17    # "files":Ljava/util/List;
    .restart local v2    # "files":Ljava/util/List;
    :cond_8
    move-object/from16 v17, v2

    .line 238
    .end local v2    # "files":Ljava/util/List;
    .restart local v17    # "files":Ljava/util/List;
    :goto_5
    move-object/from16 v0, v17

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 312
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 313
    .local v5, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 314
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/io/File;

    .local v8, "it":Ljava/io/File;
    const/4 v9, 0x0

    .line 238
    .local v9, "$i$a$-map-SaveManager$listMedia$3":I
    new-instance v10, Lcom/pymcl/core/instance/MediaFile;

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    const-string v13, "getAbsolutePath(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    move-result-wide v13

    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v15

    invoke-direct/range {v10 .. v16}, Lcom/pymcl/core/instance/MediaFile;-><init>(Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 314
    .end local v8    # "it":Ljava/io/File;
    .end local v9    # "$i$a$-map-SaveManager$listMedia$3":I
    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 315
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    :cond_9
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 312
    nop

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    check-cast v2, Ljava/lang/Iterable;

    .line 239
    new-instance v0, Lcom/pymcl/core/instance/SaveManager$listMedia$$inlined$compareByDescending$1;

    invoke-direct {v0}, Lcom/pymcl/core/instance/SaveManager$listMedia$$inlined$compareByDescending$1;-><init>()V

    check-cast v0, Ljava/util/Comparator;

    new-instance v1, Lcom/pymcl/core/instance/SaveManager$listMedia$$inlined$thenByDescending$1;

    invoke-direct {v1, v0}, Lcom/pymcl/core/instance/SaveManager$listMedia$$inlined$thenByDescending$1;-><init>(Ljava/util/Comparator;)V

    check-cast v1, Ljava/util/Comparator;

    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 238
    return-object v0
.end method

.method public final listSaves(Z)Ljava/util/List;
    .locals 29
    .param p1, "withSize"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveInfo;",
            ">;"
        }
    .end annotation

    .line 126
    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/core/instance/SaveManager;->getSavesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    const-string v1, "getName(...)"

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    .local v0, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 281
    .local v5, "$i$f$filter":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v0

    .local v7, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 282
    .local v8, "$i$f$filterTo":I
    array-length v9, v7

    move v10, v3

    :goto_0
    if-ge v10, v9, :cond_2

    aget-object v11, v7, v10

    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "it":Ljava/io/File;
    const/4 v13, 0x0

    .line 126
    .local v13, "$i$a$-filter-SaveManager$listSaves$1":I
    invoke-virtual {v12}, Ljava/io/File;->isDirectory()Z

    move-result v14

    if-eqz v14, :cond_0

    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v15, "."

    const/4 v2, 0x2

    invoke-static {v14, v15, v3, v2, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    move v2, v3

    .line 282
    .end local v12    # "it":Ljava/io/File;
    .end local v13    # "$i$a$-filter-SaveManager$listSaves$1":I
    :goto_1
    if-eqz v2, :cond_1

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 283
    :cond_2
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v8    # "$i$f$filterTo":I
    move-object v2, v6

    check-cast v2, Ljava/util/List;

    .line 281
    nop

    .line 126
    .end local v0    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$filter":I
    goto :goto_2

    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    :goto_2
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 284
    .local v2, "$i$f$map":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v0

    .local v6, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 285
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_16

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 286
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/io/File;

    .local v10, "d":Ljava/io/File;
    const/4 v11, 0x0

    .line 127
    .local v11, "$i$a$-map-SaveManager$listSaves$2":I
    new-instance v12, Ljava/io/File;

    const-string v13, "level.dat"

    invoke-direct {v12, v10, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v13, v12

    .line 280
    .local v13, "it":Ljava/io/File;
    const/4 v14, 0x0

    .line 127
    .local v14, "$i$a$-takeIf-SaveManager$listSaves$2$meta$1":I
    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    move-result v13

    .end local v13    # "it":Ljava/io/File;
    .end local v14    # "$i$a$-takeIf-SaveManager$listSaves$2$meta$1":I
    if-eqz v13, :cond_4

    goto :goto_4

    :cond_4
    move-object v12, v4

    :goto_4
    if-eqz v12, :cond_5

    .line 280
    .restart local v12    # "it":Ljava/io/File;
    const/4 v13, 0x0

    .line 127
    .local v13, "$i$a$-let-SaveManager$listSaves$2$meta$2":I
    sget-object v14, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    invoke-virtual {v14, v12}, Lcom/pymcl/core/instance/SaveManager$Companion;->readLevel(Ljava/io/File;)Lcom/pymcl/core/instance/SaveManager$LevelMeta;

    move-result-object v12

    .end local v12    # "it":Ljava/io/File;
    .end local v13    # "$i$a$-let-SaveManager$listSaves$2$meta$2":I
    if-nez v12, :cond_8

    .line 128
    :cond_5
    new-instance v12, Ljava/io/File;

    const-string v13, "level.dat_old"

    invoke-direct {v12, v10, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v13, v12

    .line 280
    .local v13, "it":Ljava/io/File;
    const/4 v14, 0x0

    .line 128
    .local v14, "$i$a$-takeIf-SaveManager$listSaves$2$meta$3":I
    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    move-result v13

    .end local v13    # "it":Ljava/io/File;
    .end local v14    # "$i$a$-takeIf-SaveManager$listSaves$2$meta$3":I
    if-eqz v13, :cond_6

    goto :goto_5

    :cond_6
    move-object v12, v4

    :goto_5
    if-eqz v12, :cond_7

    .line 280
    .restart local v12    # "it":Ljava/io/File;
    const/4 v13, 0x0

    .line 128
    .local v13, "$i$a$-let-SaveManager$listSaves$2$meta$4":I
    sget-object v14, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    invoke-virtual {v14, v12}, Lcom/pymcl/core/instance/SaveManager$Companion;->readLevel(Ljava/io/File;)Lcom/pymcl/core/instance/SaveManager$LevelMeta;

    move-result-object v12

    .end local v12    # "it":Ljava/io/File;
    .end local v13    # "$i$a$-let-SaveManager$listSaves$2$meta$4":I
    goto :goto_6

    :cond_7
    move-object v12, v4

    .line 127
    :cond_8
    :goto_6
    nop

    .line 129
    .local v12, "meta":Lcom/pymcl/core/instance/SaveManager$LevelMeta;
    new-instance v13, Ljava/io/File;

    const-string v14, "icon.png"

    invoke-direct {v13, v10, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v14, v13

    .line 280
    .local v14, "it":Ljava/io/File;
    const/4 v15, 0x0

    .line 129
    .local v15, "$i$a$-takeIf-SaveManager$listSaves$2$icon$1":I
    invoke-virtual {v14}, Ljava/io/File;->isFile()Z

    move-result v14

    .end local v14    # "it":Ljava/io/File;
    .end local v15    # "$i$a$-takeIf-SaveManager$listSaves$2$icon$1":I
    if-eqz v14, :cond_9

    goto :goto_7

    :cond_9
    move-object v13, v4

    :goto_7
    if-eqz v13, :cond_a

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    goto :goto_8

    :cond_a
    move-object v13, v4

    :goto_8
    move-object/from16 v26, v13

    .line 130
    .local v26, "icon":Ljava/lang/String;
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v12, :cond_c

    invoke-virtual {v12}, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->getLevelName()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_c

    .line 280
    move-object v15, v14

    .local v15, "it":Ljava/lang/String;
    const/16 v16, 0x0

    .line 130
    .local v16, "$i$a$-takeIf-SaveManager$listSaves$2$1":I
    move-object/from16 v17, v15

    check-cast v17, Ljava/lang/CharSequence;

    invoke-static/range {v17 .. v17}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v17

    .end local v15    # "it":Ljava/lang/String;
    .end local v16    # "$i$a$-takeIf-SaveManager$listSaves$2$1":I
    if-nez v17, :cond_b

    goto :goto_9

    :cond_b
    move-object v14, v4

    :goto_9
    if-nez v14, :cond_d

    :cond_c
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    :cond_d
    move-object/from16 v18, v14

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->getLastPlayed()Ljava/lang/Long;

    move-result-object v14

    if-eqz v14, :cond_10

    move-object v15, v14

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->longValue()J

    move-result-wide v16

    .line 280
    nop

    .local v16, "it":J
    const/4 v15, 0x0

    .line 130
    .local v15, "$i$a$-takeIf-SaveManager$listSaves$2$2":I
    const-wide/16 v19, 0x0

    cmp-long v19, v16, v19

    if-lez v19, :cond_e

    const/4 v15, 0x1

    goto :goto_a

    :cond_e
    move v15, v3

    .end local v15    # "$i$a$-takeIf-SaveManager$listSaves$2$2":I
    .end local v16    # "it":J
    :goto_a
    if-eqz v15, :cond_f

    goto :goto_b

    :cond_f
    move-object v14, v4

    :goto_b
    if-eqz v14, :cond_10

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    goto :goto_c

    :cond_10
    invoke-virtual {v10}, Ljava/io/File;->lastModified()J

    move-result-wide v14

    :goto_c
    move-wide/from16 v19, v14

    .line 131
    if-eqz v12, :cond_11

    invoke-virtual {v12}, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->getGameType()Ljava/lang/Integer;

    move-result-object v14

    move-object/from16 v21, v14

    goto :goto_d

    :cond_11
    move-object/from16 v21, v4

    :goto_d
    if-eqz v12, :cond_12

    invoke-virtual {v12}, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->getHardcore()Z

    move-result v14

    move/from16 v22, v14

    goto :goto_e

    :cond_12
    move/from16 v22, v3

    :goto_e
    if-eqz v12, :cond_13

    invoke-virtual {v12}, Lcom/pymcl/core/instance/SaveManager$LevelMeta;->getVersionName()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v23, v14

    goto :goto_f

    :cond_13
    move-object/from16 v23, v4

    :goto_f
    if-eqz p1, :cond_14

    sget-object v14, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v14, v10}, Lcom/pymcl/core/instance/SaveManager$Companion;->dirSize(Ljava/io/File;)J

    move-result-wide v14

    goto :goto_10

    :cond_14
    const-wide/16 v14, -0x1

    :goto_10
    move-wide/from16 v24, v14

    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v14

    const-string v15, "getAbsolutePath(...)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v12, :cond_15

    const/16 v28, 0x1

    goto :goto_11

    :cond_15
    move/from16 v28, v3

    .line 130
    :goto_11
    new-instance v16, Lcom/pymcl/core/instance/SaveInfo;

    move-object/from16 v17, v13

    move-object/from16 v27, v14

    invoke-direct/range {v16 .. v28}, Lcom/pymcl/core/instance/SaveInfo;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ZLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V

    .line 131
    move-object/from16 v13, v16

    .line 286
    .end local v10    # "d":Ljava/io/File;
    .end local v11    # "$i$a$-map-SaveManager$listSaves$2":I
    .end local v12    # "meta":Lcom/pymcl/core/instance/SaveManager$LevelMeta;
    .end local v26    # "icon":Ljava/lang/String;
    invoke-interface {v5, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 287
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    :cond_16
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    move-object v1, v5

    check-cast v1, Ljava/util/List;

    .line 284
    nop

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map":I
    check-cast v1, Ljava/lang/Iterable;

    .line 132
    new-instance v0, Lcom/pymcl/core/instance/SaveManager$listSaves$$inlined$compareByDescending$1;

    invoke-direct {v0}, Lcom/pymcl/core/instance/SaveManager$listSaves$$inlined$compareByDescending$1;-><init>()V

    check-cast v0, Ljava/util/Comparator;

    new-instance v2, Lcom/pymcl/core/instance/SaveManager$listSaves$$inlined$thenBy$1;

    invoke-direct {v2, v0}, Lcom/pymcl/core/instance/SaveManager$listSaves$$inlined$thenBy$1;-><init>(Ljava/util/Comparator;)V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final listTrash()Ljava/util/List;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/TrashEntry;",
            ">;"
        }
    .end annotation

    .line 260
    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/core/instance/SaveManager;->getTrashDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array v0, v1, [Ljava/io/File;

    .local v0, "$this$mapNotNull$iv":[Ljava/lang/Object;
    :cond_0
    const/4 v2, 0x0

    .line 316
    .local v2, "$i$f$mapNotNull":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$mapNotNullTo$iv$iv":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 325
    .local v5, "$i$f$mapNotNullTo":I
    move-object v6, v4

    .local v6, "$this$forEach$iv$iv$iv":[Ljava/lang/Object;
    const/4 v7, 0x0

    .line 326
    .local v7, "$i$f$forEach":I
    array-length v8, v6

    :goto_0
    if-ge v1, v8, :cond_3

    aget-object v9, v6, v1

    .local v9, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "element$iv$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 325
    .local v11, "$i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv":I
    move-object v12, v10

    .local v12, "f":Ljava/io/File;
    const/4 v13, 0x0

    .line 261
    .local v13, "$i$a$-mapNotNull-SaveManager$listTrash$1":I
    sget-object v14, Lcom/pymcl/core/instance/SaveManager;->TRASH_SUFFIX:Lkotlin/text/Regex;

    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v16, v0

    .end local v0    # "$this$mapNotNull$iv":[Ljava/lang/Object;
    .local v16, "$this$mapNotNull$iv":[Ljava/lang/Object;
    const-string v0, "getName(...)"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Ljava/lang/CharSequence;

    invoke-virtual {v14, v15}, Lkotlin/text/Regex;->matchEntire(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;

    move-result-object v14

    if-eqz v14, :cond_1

    .line 280
    .local v14, "m":Lkotlin/text/MatchResult;
    const/4 v15, 0x0

    .line 261
    .local v15, "$i$a$-let-SaveManager$listTrash$1$1":I
    new-instance v17, Lcom/pymcl/core/instance/TrashEntry;

    move/from16 v26, v1

    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v14}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    move-object/from16 v18, v1

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Ljava/lang/String;

    invoke-interface {v14}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Ljava/lang/String;

    invoke-interface {v14}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v21

    sget-object v0, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v12}, Lcom/pymcl/core/instance/SaveManager$Companion;->dirSize(Ljava/io/File;)J

    move-result-wide v23

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getAbsolutePath(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v25, v0

    invoke-direct/range {v17 .. v25}, Lcom/pymcl/core/instance/TrashEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V

    .end local v14    # "m":Lkotlin/text/MatchResult;
    .end local v15    # "$i$a$-let-SaveManager$listTrash$1$1":I
    goto :goto_1

    :cond_1
    move/from16 v26, v1

    const/16 v17, 0x0

    .line 325
    .end local v12    # "f":Ljava/io/File;
    .end local v13    # "$i$a$-mapNotNull-SaveManager$listTrash$1":I
    :goto_1
    if-eqz v17, :cond_2

    move-object/from16 v0, v17

    .line 327
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 325
    .local v1, "$i$a$-let-ArraysKt___ArraysKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 326
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v1    # "$i$a$-let-ArraysKt___ArraysKt$mapNotNullTo$1$1$iv$iv":I
    .end local v10    # "element$iv$iv":Ljava/lang/Object;
    .end local v11    # "$i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv":I
    :cond_2
    nop

    .end local v9    # "element$iv$iv$iv":Ljava/lang/Object;
    add-int/lit8 v1, v26, 0x1

    move-object/from16 v0, v16

    goto :goto_0

    .line 328
    .end local v16    # "$this$mapNotNull$iv":[Ljava/lang/Object;
    .local v0, "$this$mapNotNull$iv":[Ljava/lang/Object;
    :cond_3
    move-object/from16 v16, v0

    .line 329
    .end local v0    # "$this$mapNotNull$iv":[Ljava/lang/Object;
    .end local v6    # "$this$forEach$iv$iv$iv":[Ljava/lang/Object;
    .end local v7    # "$i$f$forEach":I
    .restart local v16    # "$this$mapNotNull$iv":[Ljava/lang/Object;
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapNotNullTo$iv$iv":[Ljava/lang/Object;
    .end local v5    # "$i$f$mapNotNullTo":I
    move-object v0, v3

    check-cast v0, Ljava/util/List;

    .line 316
    nop

    .end local v2    # "$i$f$mapNotNull":I
    .end local v16    # "$this$mapNotNull$iv":[Ljava/lang/Object;
    check-cast v0, Ljava/lang/Iterable;

    .line 262
    nop

    .local v0, "$this$sortedByDescending$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 330
    .local v1, "$i$f$sortedByDescending":I
    new-instance v2, Lcom/pymcl/core/instance/SaveManager$listTrash$$inlined$sortedByDescending$1;

    invoke-direct {v2}, Lcom/pymcl/core/instance/SaveManager$listTrash$$inlined$sortedByDescending$1;-><init>()V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 262
    .end local v0    # "$this$sortedByDescending$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$sortedByDescending":I
    return-object v0
.end method

.method public final mediaFile(Lcom/pymcl/core/instance/MediaKind;Ljava/lang/String;)Ljava/io/File;
    .locals 4
    .param p1, "kind"    # Lcom/pymcl/core/instance/MediaKind;
    .param p2, "name"    # Ljava/lang/String;

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    sget-object v0, Lcom/pymcl/core/instance/MediaKind;->CRASH_REPORTS:Lcom/pymcl/core/instance/MediaKind;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "hs_err_pid"

    const/4 v3, 0x0

    invoke-static {p2, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager;->gameDir:Ljava/io/File;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/instance/SaveManager;->gameDir:Ljava/io/File;

    invoke-virtual {p1}, Lcom/pymcl/core/instance/MediaKind;->getDir()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :goto_0
    invoke-direct {p0, v0, p2}, Lcom/pymcl/core/instance/SaveManager;->child(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 243
    .local v0, "f":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6587\u4ef6\u4e0d\u5b58\u5728: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final moveToTrash(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    .locals 13
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "f"    # Ljava/io/File;

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "f"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 251
    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getTrashDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 252
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveManager;->clock:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .local v0, "t":J
    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getTrashDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "~"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v8, v2

    .line 253
    .local v8, "dst":Ljava/io/File;
    :goto_0
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getTrashDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v8, v2

    goto :goto_0

    .line 254
    :cond_0
    invoke-virtual {p2, v8}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 255
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p2

    .end local p2    # "f":Ljava/io/File;
    .local v7, "f":Ljava/io/File;
    invoke-static/range {v7 .. v12}, Lkotlin/io/FilesKt;->copyRecursively$default(Ljava/io/File;Ljava/io/File;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_1

    .end local v7    # "f":Ljava/io/File;
    .restart local p2    # "f":Ljava/io/File;
    :cond_1
    move-object v7, p2

    .end local p2    # "f":Ljava/io/File;
    .restart local v7    # "f":Ljava/io/File;
    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .line 256
    :goto_1
    invoke-static {v7}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5220\u9664\u5931\u8d25: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p2, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 254
    .end local v7    # "f":Ljava/io/File;
    .restart local p2    # "f":Ljava/io/File;
    :cond_3
    move-object v7, p2

    .line 258
    .end local p2    # "f":Ljava/io/File;
    .restart local v7    # "f":Ljava/io/File;
    :goto_2
    return-object v8
.end method

.method public final readMedia(Lcom/pymcl/core/instance/MediaKind;Ljava/lang/String;I)Ljava/lang/String;
    .locals 2
    .param p1, "kind"    # Lcom/pymcl/core/instance/MediaKind;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "maxBytes"    # I

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    sget-object v0, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/instance/SaveManager;->mediaFile(Lcom/pymcl/core/instance/MediaKind;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1, p3}, Lcom/pymcl/core/instance/SaveManager$Companion;->readText(Ljava/io/File;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final rename(Ljava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/instance/RenameResult;
    .locals 9
    .param p1, "old"    # Ljava/lang/String;
    .param p2, "newName"    # Ljava/lang/String;
    .param p3, "updateLevelName"    # Z

    const-string v0, "old"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    invoke-virtual {p0, p1}, Lcom/pymcl/core/instance/SaveManager;->saveDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .local v0, "src":Ljava/io/File;
    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 159
    .local v1, "n":Ljava/lang/String;
    sget-object v2, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;

    invoke-virtual {v2, v1}, Lcom/pymcl/core/instance/SaveManager$Companion;->validName(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 160
    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getSavesDir()Ljava/io/File;

    move-result-object v2

    invoke-direct {p0, v2, v1}, Lcom/pymcl/core/instance/SaveManager;->child(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 161
    .local v2, "dst":Ljava/io/File;
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_4

    .line 163
    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getSavesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    invoke-static {v3, v1}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-ne v3, v5, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    if-nez v3, :cond_3

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {v1, p1, v5}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 164
    :cond_1
    invoke-virtual {v0, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 166
    new-instance v3, Ljava/io/File;

    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getSavesDir()Ljava/io/File;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ".renaming"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v3, "mid":Ljava/io/File;
    invoke-virtual {v0, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v3, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    new-instance v4, Ljava/io/IOException;

    const-string v5, "\u6539\u540d\u5931\u8d25"

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 163
    .end local v3    # "mid":Ljava/io/File;
    :cond_3
    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5df2\u6709\u540c\u540d\u5b58\u6863\u300c"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\u300d"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 167
    :cond_4
    :goto_1
    const/4 v3, 0x0

    .line 168
    .local v3, "ok":Z
    if-eqz p3, :cond_6

    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v5, p0

    check-cast v5, Lcom/pymcl/core/instance/SaveManager;

    .line 280
    .local v5, "$this$rename_u24lambda_u241":Lcom/pymcl/core/instance/SaveManager;
    const/4 v6, 0x0

    .line 168
    .local v6, "$i$a$-runCatching-SaveManager$rename$2":I
    new-instance v7, Ljava/io/File;

    const-string v8, "level.dat"

    invoke-direct {v7, v2, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v5, v7, v1}, Lcom/pymcl/core/instance/SaveManager;->setLevelName(Ljava/io/File;Ljava/lang/String;)Z

    move-result v7

    .end local v5    # "$this$rename_u24lambda_u241":Lcom/pymcl/core/instance/SaveManager;
    .end local v6    # "$i$a$-runCatching-SaveManager$rename$2":I
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v5

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v5}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :goto_2
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v5}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object v5, v4

    :cond_5
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 169
    :cond_6
    new-instance v4, Lcom/pymcl/core/instance/RenameResult;

    invoke-direct {v4, v1, v3}, Lcom/pymcl/core/instance/RenameResult;-><init>(Ljava/lang/String;Z)V

    return-object v4

    .line 280
    .end local v2    # "dst":Ljava/io/File;
    .end local v3    # "ok":Z
    :cond_7
    const/4 v2, 0x0

    .line 159
    .local v2, "$i$a$-require-SaveManager$rename$1":I
    nop

    .end local v2    # "$i$a$-require-SaveManager$rename$1":I
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a\uff0c\u4e5f\u4e0d\u80fd\u542b \\ / : * ? \" < > |"

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final restoreBackup(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 33
    .param p1, "backupName"    # Ljava/lang/String;
    .param p2, "overwrite"    # Z

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "backupName"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    invoke-virtual {v1}, Lcom/pymcl/core/instance/SaveManager;->getBackupsDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {v1, v0, v2}, Lcom/pymcl/core/instance/SaveManager;->child(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    move-object v3, v0

    .line 280
    .local v3, "it":Ljava/io/File;
    const/4 v4, 0x0

    .line 206
    .local v4, "$i$a$-also-SaveManager$restoreBackup$zip$1":I
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_13

    .end local v3    # "it":Ljava/io/File;
    .end local v4    # "$i$a$-also-SaveManager$restoreBackup$zip$1":I
    move-object v3, v0

    .line 207
    .local v3, "zip":Ljava/io/File;
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    move-object v4, v0

    .local v4, "tops":Ljava/util/LinkedHashSet;
    const/4 v5, 0x0

    .line 208
    .local v5, "hasRootFiles":Z
    new-instance v0, Ljava/util/zip/ZipInputStream;

    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    check-cast v6, Ljava/io/InputStream;

    instance-of v7, v6, Ljava/io/BufferedInputStream;

    const/16 v8, 0x2000

    if-eqz v7, :cond_0

    check-cast v6, Ljava/io/BufferedInputStream;

    goto :goto_0

    :cond_0
    new-instance v7, Ljava/io/BufferedInputStream;

    invoke-direct {v7, v6, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v6, v7

    :goto_0
    check-cast v6, Ljava/io/InputStream;

    invoke-direct {v0, v6}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v6, v0

    check-cast v6, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v6

    check-cast v0, Ljava/util/zip/ZipInputStream;

    .line 280
    .local v0, "z":Ljava/util/zip/ZipInputStream;
    const/4 v7, 0x0

    .line 208
    .local v7, "$i$a$-use-SaveManager$restoreBackup$1":I
    new-instance v9, Lcom/pymcl/core/instance/SaveManager$$ExternalSyntheticLambda0;

    invoke-direct {v9, v0}, Lcom/pymcl/core/instance/SaveManager$$ExternalSyntheticLambda0;-><init>(Ljava/util/zip/ZipInputStream;)V

    invoke-static {v9}, Lkotlin/sequences/SequencesKt;->generateSequence(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;

    move-result-object v9

    .local v9, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    const/4 v10, 0x0

    .line 302
    .local v10, "$i$f$forEach":I
    invoke-interface {v9}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_13

    :goto_1
    :try_start_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_12

    const-string v13, "getName(...)"

    const/16 v15, 0x2f

    const/4 v8, 0x1

    const/16 v18, 0x0

    if-eqz v12, :cond_3

    :try_start_2
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element$iv":Ljava/lang/Object;
    move-object/from16 v19, v12

    check-cast v19, Ljava/util/zip/ZipEntry;

    .local v19, "e":Ljava/util/zip/ZipEntry;
    const/16 v20, 0x0

    .line 209
    .local v20, "$i$a$-forEach-SaveManager$restoreBackup$1$2":I
    invoke-virtual/range {v19 .. v19}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v22, 0x5c

    const/16 v23, 0x2f

    const/16 v24, 0x0

    move-object/from16 v21, v14

    invoke-static/range {v21 .. v26}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    new-array v8, v8, [C

    aput-char v15, v8, v18
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v13, v8}, Lkotlin/text/StringsKt;->trimStart(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v8

    const/4 v13, 0x2

    const/4 v14, 0x0

    .local v8, "p":Ljava/lang/String;
    invoke-static {v8, v15, v14, v13, v14}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v21, v17

    .line 210
    .local v21, "top":Ljava/lang/String;
    move-object v13, v8

    check-cast v13, Ljava/lang/CharSequence;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-object/from16 v22, v0

    move-object/from16 v23, v4

    move/from16 v4, v18

    const/4 v0, 0x2

    .end local v0    # "z":Ljava/util/zip/ZipInputStream;
    .end local v4    # "tops":Ljava/util/LinkedHashSet;
    .local v22, "z":Ljava/util/zip/ZipInputStream;
    .local v23, "tops":Ljava/util/LinkedHashSet;
    :try_start_5
    invoke-static {v13, v15, v4, v0, v14}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual/range {v19 .. v19}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v5, 0x1

    goto :goto_3

    :cond_2
    :goto_2
    move-object/from16 v0, v23

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v4, v21

    .end local v21    # "top":Ljava/lang/String;
    .local v4, "top":Ljava/lang/String;
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 302
    .end local v4    # "top":Ljava/lang/String;
    .end local v8    # "p":Ljava/lang/String;
    .end local v19    # "e":Ljava/util/zip/ZipEntry;
    .end local v20    # "$i$a$-forEach-SaveManager$restoreBackup$1$2":I
    :goto_3
    move-object/from16 v0, v22

    move-object/from16 v4, v23

    const/16 v8, 0x2000

    .end local v12    # "element$iv":Ljava/lang/Object;
    goto :goto_1

    .line 208
    .end local v7    # "$i$a$-use-SaveManager$restoreBackup$1":I
    .end local v9    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v10    # "$i$f$forEach":I
    .end local v22    # "z":Ljava/util/zip/ZipInputStream;
    :catchall_0
    move-exception v0

    goto :goto_4

    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .local v4, "tops":Ljava/util/LinkedHashSet;
    :catchall_1
    move-exception v0

    move-object/from16 v23, v4

    .end local v4    # "tops":Ljava/util/LinkedHashSet;
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    :goto_4
    move-object v1, v0

    move-object/from16 v27, v3

    goto/16 :goto_12

    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .restart local v4    # "tops":Ljava/util/LinkedHashSet;
    :catchall_2
    move-exception v0

    move-object/from16 v23, v4

    move-object v1, v0

    move-object/from16 v27, v3

    .end local v4    # "tops":Ljava/util/LinkedHashSet;
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    goto/16 :goto_12

    .line 303
    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .restart local v0    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v4    # "tops":Ljava/util/LinkedHashSet;
    .restart local v7    # "$i$a$-use-SaveManager$restoreBackup$1":I
    .restart local v9    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v10    # "$i$f$forEach":I
    :cond_3
    move-object/from16 v22, v0

    move-object/from16 v23, v4

    .line 210
    .end local v0    # "z":Ljava/util/zip/ZipInputStream;
    .end local v4    # "tops":Ljava/util/LinkedHashSet;
    .end local v9    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v10    # "$i$f$forEach":I
    .restart local v22    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    nop

    .end local v7    # "$i$a$-use-SaveManager$restoreBackup$1":I
    .end local v22    # "z":Ljava/util/zip/ZipInputStream;
    :try_start_6
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_11

    .line 208
    const/4 v14, 0x0

    invoke-static {v6, v14}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 211
    if-nez v5, :cond_4

    invoke-virtual/range {v23 .. v23}, Ljava/util/LinkedHashSet;->size()I

    move-result v0

    if-ne v0, v8, :cond_4

    move v0, v8

    goto :goto_5

    :cond_4
    const/4 v0, 0x0

    :goto_5
    move v4, v0

    .line 212
    .local v4, "wrapped":Z
    if-eqz v4, :cond_5

    move-object/from16 v0, v23

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_6

    :cond_5
    invoke-virtual/range {p0 .. p1}, Lcom/pymcl/core/instance/SaveManager;->backupSaveName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_6
    move-object v6, v0

    .line 213
    .local v6, "name":Ljava/lang/String;
    invoke-virtual {v1}, Lcom/pymcl/core/instance/SaveManager;->getSavesDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {v1, v0, v6}, Lcom/pymcl/core/instance/SaveManager;->child(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v7

    .line 214
    .local v7, "dst":Ljava/io/File;
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_7

    if-eqz p2, :cond_6

    const-string v0, "saves"

    invoke-virtual {v1, v0, v7}, Lcom/pymcl/core/instance/SaveManager;->moveToTrash(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    goto :goto_7

    :cond_6
    new-instance v0, Ljava/io/IOException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u5df2\u6709\u540c\u540d\u5b58\u6863\u300c"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "\u300d"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 215
    :cond_7
    :goto_7
    invoke-virtual {v1}, Lcom/pymcl/core/instance/SaveManager;->getSavesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 216
    new-instance v0, Ljava/io/File;

    invoke-virtual {v1}, Lcom/pymcl/core/instance/SaveManager;->getSavesDir()Ljava/io/File;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "."

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, ".restoring"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0, v9, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v9, v0

    .line 280
    .local v9, "it":Ljava/io/File;
    const/4 v10, 0x0

    .line 216
    .local v10, "$i$a$-also-SaveManager$restoreBackup$staging$1":I
    invoke-static {v9}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    invoke-virtual {v9}, Ljava/io/File;->mkdirs()Z

    .line 217
    .end local v10    # "$i$a$-also-SaveManager$restoreBackup$staging$1":I
    .local v9, "staging":Ljava/io/File;
    nop

    .line 218
    :try_start_7
    new-instance v0, Ljava/util/zip/ZipInputStream;

    new-instance v10, Ljava/io/FileInputStream;

    invoke-direct {v10, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    check-cast v10, Ljava/io/InputStream;

    instance-of v11, v10, Ljava/io/BufferedInputStream;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_10

    if-eqz v11, :cond_8

    :try_start_8
    check-cast v10, Ljava/io/BufferedInputStream;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_8

    .line 227
    :catchall_3
    move-exception v0

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v17, v5

    goto/16 :goto_11

    .line 218
    :cond_8
    :try_start_9
    new-instance v11, Ljava/io/BufferedInputStream;

    const/16 v12, 0x2000

    invoke-direct {v11, v10, v12}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v10, v11

    :goto_8
    check-cast v10, Ljava/io/InputStream;

    invoke-direct {v0, v10}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v10, v0

    check-cast v10, Ljava/io/Closeable;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_10

    :try_start_a
    move-object v0, v10

    check-cast v0, Ljava/util/zip/ZipInputStream;

    move-object v11, v0

    .line 280
    .local v11, "z":Ljava/util/zip/ZipInputStream;
    const/4 v12, 0x0

    .line 218
    .local v12, "$i$a$-use-SaveManager$restoreBackup$2":I
    new-instance v0, Lcom/pymcl/core/instance/SaveManager$$ExternalSyntheticLambda1;

    invoke-direct {v0, v11}, Lcom/pymcl/core/instance/SaveManager$$ExternalSyntheticLambda1;-><init>(Ljava/util/zip/ZipInputStream;)V

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->generateSequence(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;

    move-result-object v0

    move-object v14, v0

    .local v14, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    const/16 v16, 0x0

    .line 304
    .local v16, "$i$f$forEach":I
    invoke-interface {v14}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .local v19, "element$iv":Ljava/lang/Object;
    move-object/from16 v20, v19

    check-cast v20, Ljava/util/zip/ZipEntry;

    .local v20, "e":Ljava/util/zip/ZipEntry;
    const/16 v21, 0x0

    .line 219
    .local v21, "$i$a$-forEach-SaveManager$restoreBackup$2$2":I
    move/from16 v22, v15

    invoke-virtual/range {v20 .. v20}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v31, 0x4

    const/16 v32, 0x0

    const/16 v28, 0x5c

    const/16 v29, 0x2f

    const/16 v30, 0x0

    move-object/from16 v27, v15

    invoke-static/range {v27 .. v32}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v15
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_d

    move-object/from16 v24, v0

    :try_start_b
    new-array v0, v8, [C

    const/16 v18, 0x0

    aput-char v22, v0, v18
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    :try_start_c
    invoke-static {v15, v0}, Lkotlin/text/StringsKt;->trimStart(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_d

    .line 220
    .local v0, "p":Ljava/lang/String;
    if-eqz v4, :cond_9

    :try_start_d
    const-string v15, ""

    move/from16 v8, v22

    invoke-static {v0, v8, v15}, Lkotlin/text/StringsKt;->substringAfter(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    move-result-object v15
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    move-object v0, v15

    goto :goto_a

    .line 218
    .end local v0    # "p":Ljava/lang/String;
    .end local v11    # "z":Ljava/util/zip/ZipInputStream;
    .end local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .end local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v16    # "$i$f$forEach":I
    .end local v19    # "element$iv":Ljava/lang/Object;
    .end local v20    # "e":Ljava/util/zip/ZipEntry;
    .end local v21    # "$i$a$-forEach-SaveManager$restoreBackup$2$2":I
    :catchall_4
    move-exception v0

    move-object v1, v0

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v17, v5

    goto/16 :goto_10

    .line 220
    .restart local v0    # "p":Ljava/lang/String;
    .restart local v11    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .restart local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v16    # "$i$f$forEach":I
    .restart local v19    # "element$iv":Ljava/lang/Object;
    .restart local v20    # "e":Ljava/util/zip/ZipEntry;
    .restart local v21    # "$i$a$-forEach-SaveManager$restoreBackup$2$2":I
    :cond_9
    move/from16 v8, v22

    move-object v15, v0

    .line 221
    .end local v0    # "p":Ljava/lang/String;
    .local v15, "p":Ljava/lang/String;
    :goto_a
    :try_start_e
    move-object v0, v15

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_a

    const/4 v0, 0x1

    goto :goto_b

    :cond_a
    const/4 v0, 0x0

    :goto_b
    if-nez v0, :cond_e

    .line 222
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v9, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    move-object/from16 v22, v0

    .line 223
    .local v22, "out":Ljava/io/File;
    invoke-virtual/range {v22 .. v22}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v8, "getPath(...)"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v8

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    move-object/from16 v27, v3

    .end local v3    # "zip":Ljava/io/File;
    .local v27, "zip":Ljava/io/File;
    :try_start_f
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    move/from16 v28, v4

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v8, 0x0

    .end local v4    # "wrapped":Z
    .local v28, "wrapped":Z
    :try_start_10
    invoke-static {v0, v1, v8, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 224
    invoke-virtual/range {v20 .. v20}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    if-eqz v0, :cond_b

    :try_start_11
    invoke-virtual/range {v22 .. v22}, Ljava/io/File;->mkdirs()Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    move/from16 v17, v5

    move-object/from16 v18, v11

    move-object/from16 v1, v22

    goto :goto_c

    .line 218
    .end local v11    # "z":Ljava/util/zip/ZipInputStream;
    .end local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .end local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v15    # "p":Ljava/lang/String;
    .end local v16    # "$i$f$forEach":I
    .end local v19    # "element$iv":Ljava/lang/Object;
    .end local v20    # "e":Ljava/util/zip/ZipEntry;
    .end local v21    # "$i$a$-forEach-SaveManager$restoreBackup$2$2":I
    .end local v22    # "out":Ljava/io/File;
    :catchall_5
    move-exception v0

    move-object v1, v0

    move/from16 v17, v5

    goto/16 :goto_10

    .line 224
    .restart local v11    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .restart local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v15    # "p":Ljava/lang/String;
    .restart local v16    # "$i$f$forEach":I
    .restart local v19    # "element$iv":Ljava/lang/Object;
    .restart local v20    # "e":Ljava/util/zip/ZipEntry;
    .restart local v21    # "$i$a$-forEach-SaveManager$restoreBackup$2$2":I
    .restart local v22    # "out":Ljava/io/File;
    :cond_b
    :try_start_12
    invoke-virtual/range {v22 .. v22}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v1, v22

    .end local v22    # "out":Ljava/io/File;
    .local v1, "out":Ljava/io/File;
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v3, v0

    check-cast v3, Ljava/io/Closeable;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    :try_start_13
    move-object v0, v3

    check-cast v0, Ljava/io/FileOutputStream;

    .line 280
    .local v0, "it":Ljava/io/FileOutputStream;
    const/4 v4, 0x0

    .line 224
    .local v4, "$i$a$-use-SaveManager$restoreBackup$2$2$1":I
    move-object v8, v11

    check-cast v8, Ljava/io/InputStream;

    move-object/from16 v22, v0

    .end local v0    # "it":Ljava/io/FileOutputStream;
    .local v22, "it":Ljava/io/FileOutputStream;
    move-object/from16 v0, v22

    check-cast v0, Ljava/io/OutputStream;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_7

    move/from16 v29, v4

    move/from16 v17, v5

    move-object/from16 v18, v11

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v11, 0x0

    .end local v4    # "$i$a$-use-SaveManager$restoreBackup$2$2$1":I
    .end local v5    # "hasRootFiles":Z
    .end local v11    # "z":Ljava/util/zip/ZipInputStream;
    .local v17, "hasRootFiles":Z
    .local v18, "z":Ljava/util/zip/ZipInputStream;
    .local v29, "$i$a$-use-SaveManager$restoreBackup$2$2$1":I
    :try_start_14
    invoke-static {v8, v0, v5, v4, v11}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .end local v22    # "it":Ljava/io/FileOutputStream;
    .end local v29    # "$i$a$-use-SaveManager$restoreBackup$2$2$1":I
    :try_start_15
    invoke-static {v3, v11}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual/range {v20 .. v20}, Ljava/util/zip/ZipEntry;->getTime()J

    move-result-wide v29

    const-wide/16 v31, 0x0

    cmp-long v0, v29, v31

    if-lez v0, :cond_c

    invoke-virtual/range {v20 .. v20}, Ljava/util/zip/ZipEntry;->getTime()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ljava/io/File;->setLastModified(J)Z
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_c

    .line 225
    :cond_c
    :goto_c
    goto :goto_e

    .line 224
    :catchall_6
    move-exception v0

    move-object v4, v0

    goto :goto_d

    .end local v17    # "hasRootFiles":Z
    .end local v18    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v5    # "hasRootFiles":Z
    .restart local v11    # "z":Ljava/util/zip/ZipInputStream;
    :catchall_7
    move-exception v0

    move/from16 v17, v5

    move-object/from16 v18, v11

    move-object v4, v0

    .end local v1    # "out":Ljava/io/File;
    .end local v5    # "hasRootFiles":Z
    .end local v6    # "name":Ljava/lang/String;
    .end local v7    # "dst":Ljava/io/File;
    .end local v9    # "staging":Ljava/io/File;
    .end local v11    # "z":Ljava/util/zip/ZipInputStream;
    .end local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .end local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v15    # "p":Ljava/lang/String;
    .end local v16    # "$i$f$forEach":I
    .end local v19    # "element$iv":Ljava/lang/Object;
    .end local v20    # "e":Ljava/util/zip/ZipEntry;
    .end local v21    # "$i$a$-forEach-SaveManager$restoreBackup$2$2":I
    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .end local p1    # "backupName":Ljava/lang/String;
    .end local p2    # "overwrite":Z
    :goto_d
    :try_start_16
    throw v4
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    .restart local v1    # "out":Ljava/io/File;
    .restart local v6    # "name":Ljava/lang/String;
    .restart local v7    # "dst":Ljava/io/File;
    .restart local v9    # "staging":Ljava/io/File;
    .restart local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .restart local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v15    # "p":Ljava/lang/String;
    .restart local v16    # "$i$f$forEach":I
    .restart local v17    # "hasRootFiles":Z
    .restart local v18    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v19    # "element$iv":Ljava/lang/Object;
    .restart local v20    # "e":Ljava/util/zip/ZipEntry;
    .restart local v21    # "$i$a$-forEach-SaveManager$restoreBackup$2$2":I
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    .restart local v27    # "zip":Ljava/io/File;
    .restart local v28    # "wrapped":Z
    .restart local p1    # "backupName":Ljava/lang/String;
    .restart local p2    # "overwrite":Z
    :catchall_8
    move-exception v0

    :try_start_17
    invoke-static {v3, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v6    # "name":Ljava/lang/String;
    .end local v7    # "dst":Ljava/io/File;
    .end local v9    # "staging":Ljava/io/File;
    .end local v17    # "hasRootFiles":Z
    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .end local p1    # "backupName":Ljava/lang/String;
    .end local p2    # "overwrite":Z
    throw v0

    .line 223
    .end local v1    # "out":Ljava/io/File;
    .end local v18    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v5    # "hasRootFiles":Z
    .restart local v6    # "name":Ljava/lang/String;
    .restart local v7    # "dst":Ljava/io/File;
    .restart local v9    # "staging":Ljava/io/File;
    .restart local v11    # "z":Ljava/util/zip/ZipInputStream;
    .local v22, "out":Ljava/io/File;
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    .restart local v27    # "zip":Ljava/io/File;
    .restart local v28    # "wrapped":Z
    .restart local p1    # "backupName":Ljava/lang/String;
    .restart local p2    # "overwrite":Z
    :cond_d
    move/from16 v17, v5

    move-object/from16 v18, v11

    move-object/from16 v1, v22

    .end local v5    # "hasRootFiles":Z
    .end local v11    # "z":Ljava/util/zip/ZipInputStream;
    .end local v22    # "out":Ljava/io/File;
    .restart local v1    # "out":Ljava/io/File;
    .restart local v17    # "hasRootFiles":Z
    .restart local v18    # "z":Ljava/util/zip/ZipInputStream;
    new-instance v0, Ljava/io/IOException;

    invoke-virtual/range {v20 .. v20}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5907\u4efd\u91cc\u6709\u8d8a\u754c\u8def\u5f84: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v6    # "name":Ljava/lang/String;
    .end local v7    # "dst":Ljava/io/File;
    .end local v9    # "staging":Ljava/io/File;
    .end local v17    # "hasRootFiles":Z
    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .end local p1    # "backupName":Ljava/lang/String;
    .end local p2    # "overwrite":Z
    throw v0

    .line 218
    .end local v1    # "out":Ljava/io/File;
    .end local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .end local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v15    # "p":Ljava/lang/String;
    .end local v16    # "$i$f$forEach":I
    .end local v18    # "z":Ljava/util/zip/ZipInputStream;
    .end local v19    # "element$iv":Ljava/lang/Object;
    .end local v20    # "e":Ljava/util/zip/ZipEntry;
    .end local v21    # "$i$a$-forEach-SaveManager$restoreBackup$2$2":I
    .restart local v5    # "hasRootFiles":Z
    .restart local v6    # "name":Ljava/lang/String;
    .restart local v7    # "dst":Ljava/io/File;
    .restart local v9    # "staging":Ljava/io/File;
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    .restart local v27    # "zip":Ljava/io/File;
    .restart local v28    # "wrapped":Z
    .restart local p1    # "backupName":Ljava/lang/String;
    .restart local p2    # "overwrite":Z
    :catchall_9
    move-exception v0

    move/from16 v17, v5

    move-object v1, v0

    .end local v5    # "hasRootFiles":Z
    .restart local v17    # "hasRootFiles":Z
    goto/16 :goto_10

    .end local v17    # "hasRootFiles":Z
    .end local v28    # "wrapped":Z
    .local v4, "wrapped":Z
    .restart local v5    # "hasRootFiles":Z
    :catchall_a
    move-exception v0

    move/from16 v28, v4

    move/from16 v17, v5

    move-object v1, v0

    .end local v4    # "wrapped":Z
    .end local v5    # "hasRootFiles":Z
    .restart local v17    # "hasRootFiles":Z
    .restart local v28    # "wrapped":Z
    goto/16 :goto_10

    .line 221
    .end local v17    # "hasRootFiles":Z
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .restart local v3    # "zip":Ljava/io/File;
    .restart local v4    # "wrapped":Z
    .restart local v5    # "hasRootFiles":Z
    .restart local v11    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .restart local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v15    # "p":Ljava/lang/String;
    .restart local v16    # "$i$f$forEach":I
    .restart local v19    # "element$iv":Ljava/lang/Object;
    .restart local v20    # "e":Ljava/util/zip/ZipEntry;
    .restart local v21    # "$i$a$-forEach-SaveManager$restoreBackup$2$2":I
    :cond_e
    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v17, v5

    move-object/from16 v18, v11

    .line 304
    .end local v3    # "zip":Ljava/io/File;
    .end local v4    # "wrapped":Z
    .end local v5    # "hasRootFiles":Z
    .end local v11    # "z":Ljava/util/zip/ZipInputStream;
    .end local v15    # "p":Ljava/lang/String;
    .end local v20    # "e":Ljava/util/zip/ZipEntry;
    .end local v21    # "$i$a$-forEach-SaveManager$restoreBackup$2$2":I
    .restart local v17    # "hasRootFiles":Z
    .restart local v18    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v27    # "zip":Ljava/io/File;
    .restart local v28    # "wrapped":Z
    :goto_e
    move-object/from16 v1, p0

    move/from16 v5, v17

    move-object/from16 v11, v18

    move-object/from16 v0, v24

    move-object/from16 v3, v27

    move/from16 v4, v28

    const/4 v8, 0x1

    const/16 v15, 0x2f

    .end local v19    # "element$iv":Ljava/lang/Object;
    goto/16 :goto_9

    .line 218
    .end local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .end local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v16    # "$i$f$forEach":I
    .end local v17    # "hasRootFiles":Z
    .end local v18    # "z":Ljava/util/zip/ZipInputStream;
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .restart local v3    # "zip":Ljava/io/File;
    .restart local v4    # "wrapped":Z
    .restart local v5    # "hasRootFiles":Z
    :catchall_b
    move-exception v0

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v17, v5

    .end local v3    # "zip":Ljava/io/File;
    .end local v4    # "wrapped":Z
    .end local v5    # "hasRootFiles":Z
    .restart local v17    # "hasRootFiles":Z
    .restart local v27    # "zip":Ljava/io/File;
    .restart local v28    # "wrapped":Z
    goto :goto_f

    .line 305
    .end local v17    # "hasRootFiles":Z
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .restart local v3    # "zip":Ljava/io/File;
    .restart local v4    # "wrapped":Z
    .restart local v5    # "hasRootFiles":Z
    .restart local v11    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .restart local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v16    # "$i$f$forEach":I
    :cond_f
    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v17, v5

    move-object/from16 v18, v11

    .line 225
    .end local v3    # "zip":Ljava/io/File;
    .end local v4    # "wrapped":Z
    .end local v5    # "hasRootFiles":Z
    .end local v11    # "z":Ljava/util/zip/ZipInputStream;
    .end local v14    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v16    # "$i$f$forEach":I
    .restart local v17    # "hasRootFiles":Z
    .restart local v18    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v27    # "zip":Ljava/io/File;
    .restart local v28    # "wrapped":Z
    nop

    .end local v12    # "$i$a$-use-SaveManager$restoreBackup$2":I
    .end local v18    # "z":Ljava/util/zip/ZipInputStream;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    .line 218
    const/4 v14, 0x0

    :try_start_18
    invoke-static {v10, v14}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 226
    invoke-virtual {v9, v7}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_f

    if-eqz v0, :cond_11

    .line 227
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {v9}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    .line 228
    :cond_10
    return-object v6

    .line 226
    :cond_11
    :try_start_19
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8fd8\u539f\u5931\u8d25\uff1a\u65e0\u6cd5\u5199\u5165 "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v6    # "name":Ljava/lang/String;
    .end local v7    # "dst":Ljava/io/File;
    .end local v9    # "staging":Ljava/io/File;
    .end local v17    # "hasRootFiles":Z
    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .end local p1    # "backupName":Ljava/lang/String;
    .end local p2    # "overwrite":Z
    throw v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_f

    .line 218
    .restart local v6    # "name":Ljava/lang/String;
    .restart local v7    # "dst":Ljava/io/File;
    .restart local v9    # "staging":Ljava/io/File;
    .restart local v17    # "hasRootFiles":Z
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    .restart local v27    # "zip":Ljava/io/File;
    .restart local v28    # "wrapped":Z
    .restart local p1    # "backupName":Ljava/lang/String;
    .restart local p2    # "overwrite":Z
    :catchall_c
    move-exception v0

    :goto_f
    move-object v1, v0

    goto :goto_10

    .end local v17    # "hasRootFiles":Z
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .restart local v3    # "zip":Ljava/io/File;
    .restart local v4    # "wrapped":Z
    .restart local v5    # "hasRootFiles":Z
    :catchall_d
    move-exception v0

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v17, v5

    move-object v1, v0

    .end local v3    # "zip":Ljava/io/File;
    .end local v4    # "wrapped":Z
    .end local v5    # "hasRootFiles":Z
    .end local v6    # "name":Ljava/lang/String;
    .end local v7    # "dst":Ljava/io/File;
    .end local v9    # "staging":Ljava/io/File;
    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .end local p1    # "backupName":Ljava/lang/String;
    .end local p2    # "overwrite":Z
    :goto_10
    :try_start_1a
    throw v1
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_e

    .restart local v6    # "name":Ljava/lang/String;
    .restart local v7    # "dst":Ljava/io/File;
    .restart local v9    # "staging":Ljava/io/File;
    .restart local v17    # "hasRootFiles":Z
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    .restart local v27    # "zip":Ljava/io/File;
    .restart local v28    # "wrapped":Z
    .restart local p1    # "backupName":Ljava/lang/String;
    .restart local p2    # "overwrite":Z
    :catchall_e
    move-exception v0

    :try_start_1b
    invoke-static {v10, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v6    # "name":Ljava/lang/String;
    .end local v7    # "dst":Ljava/io/File;
    .end local v9    # "staging":Ljava/io/File;
    .end local v17    # "hasRootFiles":Z
    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .end local p1    # "backupName":Ljava/lang/String;
    .end local p2    # "overwrite":Z
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_f

    .line 227
    .restart local v6    # "name":Ljava/lang/String;
    .restart local v7    # "dst":Ljava/io/File;
    .restart local v9    # "staging":Ljava/io/File;
    .restart local v17    # "hasRootFiles":Z
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    .restart local v27    # "zip":Ljava/io/File;
    .restart local v28    # "wrapped":Z
    .restart local p1    # "backupName":Ljava/lang/String;
    .restart local p2    # "overwrite":Z
    :catchall_f
    move-exception v0

    goto :goto_11

    .end local v17    # "hasRootFiles":Z
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .restart local v3    # "zip":Ljava/io/File;
    .restart local v4    # "wrapped":Z
    .restart local v5    # "hasRootFiles":Z
    :catchall_10
    move-exception v0

    move-object/from16 v27, v3

    move/from16 v28, v4

    move/from16 v17, v5

    .end local v3    # "zip":Ljava/io/File;
    .end local v4    # "wrapped":Z
    .end local v5    # "hasRootFiles":Z
    .restart local v17    # "hasRootFiles":Z
    .restart local v27    # "zip":Ljava/io/File;
    .restart local v28    # "wrapped":Z
    :goto_11
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-static {v9}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    :cond_12
    throw v0

    .line 208
    .end local v6    # "name":Ljava/lang/String;
    .end local v7    # "dst":Ljava/io/File;
    .end local v9    # "staging":Ljava/io/File;
    .end local v17    # "hasRootFiles":Z
    .end local v27    # "zip":Ljava/io/File;
    .end local v28    # "wrapped":Z
    .restart local v3    # "zip":Ljava/io/File;
    .restart local v5    # "hasRootFiles":Z
    :catchall_11
    move-exception v0

    move-object/from16 v27, v3

    move/from16 v17, v5

    move-object v1, v0

    .end local v3    # "zip":Ljava/io/File;
    .end local v5    # "hasRootFiles":Z
    .restart local v17    # "hasRootFiles":Z
    .restart local v27    # "zip":Ljava/io/File;
    goto :goto_12

    .end local v17    # "hasRootFiles":Z
    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .end local v27    # "zip":Ljava/io/File;
    .restart local v3    # "zip":Ljava/io/File;
    .local v4, "tops":Ljava/util/LinkedHashSet;
    .restart local v5    # "hasRootFiles":Z
    :catchall_12
    move-exception v0

    move-object/from16 v27, v3

    move-object/from16 v23, v4

    move/from16 v17, v5

    move-object v1, v0

    .end local v3    # "zip":Ljava/io/File;
    .end local v4    # "tops":Ljava/util/LinkedHashSet;
    .end local v5    # "hasRootFiles":Z
    .restart local v17    # "hasRootFiles":Z
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    .restart local v27    # "zip":Ljava/io/File;
    goto :goto_12

    .end local v17    # "hasRootFiles":Z
    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .end local v27    # "zip":Ljava/io/File;
    .restart local v3    # "zip":Ljava/io/File;
    .restart local v4    # "tops":Ljava/util/LinkedHashSet;
    .restart local v5    # "hasRootFiles":Z
    :catchall_13
    move-exception v0

    move-object/from16 v27, v3

    move-object/from16 v23, v4

    move-object v1, v0

    .end local v3    # "zip":Ljava/io/File;
    .end local v4    # "tops":Ljava/util/LinkedHashSet;
    .end local v5    # "hasRootFiles":Z
    .end local p1    # "backupName":Ljava/lang/String;
    .end local p2    # "overwrite":Z
    :goto_12
    :try_start_1c
    throw v1
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_14

    .restart local v5    # "hasRootFiles":Z
    .restart local v23    # "tops":Ljava/util/LinkedHashSet;
    .restart local v27    # "zip":Ljava/io/File;
    .restart local p1    # "backupName":Ljava/lang/String;
    .restart local p2    # "overwrite":Z
    :catchall_14
    move-exception v0

    invoke-static {v6, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    .line 206
    .end local v5    # "hasRootFiles":Z
    .end local v23    # "tops":Ljava/util/LinkedHashSet;
    .end local v27    # "zip":Ljava/io/File;
    .local v3, "it":Ljava/io/File;
    .local v4, "$i$a$-also-SaveManager$restoreBackup$zip$1":I
    :cond_13
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5907\u4efd\u4e0d\u5b58\u5728: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final restoreTrash(Ljava/lang/String;)Ljava/lang/String;
    .locals 14
    .param p1, "entryName"    # Ljava/lang/String;

    const-string v0, "entryName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getTrashDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/pymcl/core/instance/SaveManager;->child(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .local v0, "src":Ljava/io/File;
    sget-object v1, Lcom/pymcl/core/instance/SaveManager;->TRASH_SUFFIX:Lkotlin/text/Regex;

    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Lkotlin/text/Regex;->matchEntire(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 267
    .local v1, "m":Lkotlin/text/MatchResult;
    invoke-interface {v1}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .local v2, "kind":Ljava/lang/String;
    invoke-interface {v1}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x2

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 268
    .local v4, "orig":Ljava/lang/String;
    new-instance v6, Ljava/io/File;

    iget-object v7, p0, Lcom/pymcl/core/instance/SaveManager;->gameDir:Ljava/io/File;

    invoke-direct {v6, v7, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v7, v6

    .line 280
    .local v7, "it":Ljava/io/File;
    const/4 v8, 0x0

    .line 268
    .local v8, "$i$a$-also-SaveManager$restoreTrash$parent$1":I
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    .line 269
    .end local v7    # "it":Ljava/io/File;
    .end local v8    # "$i$a$-also-SaveManager$restoreTrash$parent$1":I
    .local v6, "parent":Ljava/io/File;
    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v6, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v7, "dst":Ljava/io/File;
    const/4 v8, 0x1

    .line 270
    .local v8, "i":I
    :goto_0
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_0

    move-object v9, v4

    check-cast v9, Ljava/lang/CharSequence;

    const/16 v11, 0x2e

    const/4 v12, 0x0

    invoke-static {v9, v11, v10, v5, v12}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-static {v4, v11, v12, v5, v12}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "."

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    :cond_0
    const-string v9, ""

    .line 271
    .local v9, "ext":Ljava/lang/String;
    :goto_1
    move-object v11, v9

    check-cast v11, Ljava/lang/CharSequence;

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_1

    move v10, v3

    :cond_1
    if-eqz v10, :cond_2

    move-object v10, v4

    goto :goto_2

    :cond_2
    move-object v10, v9

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v4, v10}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    .line 272
    .local v10, "stem":Ljava/lang/String;
    :goto_2
    new-instance v11, Ljava/io/File;

    new-instance v12, Ljava/lang/StringBuilder;

    if-ne v8, v3, :cond_3

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " (\u6062\u590d)"

    goto :goto_3

    :cond_3
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " (\u6062\u590d "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, ")"

    :goto_3
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v6, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v7, v11

    .end local v9    # "ext":Ljava/lang/String;
    .end local v10    # "stem":Ljava/lang/String;
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 273
    :cond_4
    invoke-virtual {v0, v7}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 274
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v5, "getName(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v3

    .line 273
    :cond_5
    new-instance v3, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u6062\u590d\u5931\u8d25: "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 266
    .end local v1    # "m":Lkotlin/text/MatchResult;
    .end local v2    # "kind":Ljava/lang/String;
    .end local v4    # "orig":Ljava/lang/String;
    .end local v6    # "parent":Ljava/io/File;
    .end local v7    # "dst":Ljava/io/File;
    .end local v8    # "i":I
    :cond_6
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0d\u662f\u56de\u6536\u6761\u76ee: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final saveDir(Ljava/lang/String;)Ljava/io/File;
    .locals 5
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    invoke-virtual {p0}, Lcom/pymcl/core/instance/SaveManager;->getSavesDir()Ljava/io/File;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/pymcl/core/instance/SaveManager;->child(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    move-object v1, v0

    .line 280
    .local v1, "it":Ljava/io/File;
    const/4 v2, 0x0

    .line 134
    .local v2, "$i$a$-also-SaveManager$saveDir$1":I
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_0

    .end local v1    # "it":Ljava/io/File;
    .end local v2    # "$i$a$-also-SaveManager$saveDir$1":I
    return-object v0

    .restart local v1    # "it":Ljava/io/File;
    .restart local v2    # "$i$a$-also-SaveManager$saveDir$1":I
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5b58\u6863\u4e0d\u5b58\u5728: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
