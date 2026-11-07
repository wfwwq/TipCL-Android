package com.pymcl.core.instance;

import androidx.autofill.HintConstants;
import com.pymcl.core.instance.LevelNbt;
import com.pymcl.core.instance.SaveManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: Saves.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 D2\u00020\u0001:\u0002DEB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J \u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u0019J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0003J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010)\u001a\u00020\u0014J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00162\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0014J\u000e\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0014J\u0018\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u00142\b\b\u0002\u00102\u001a\u00020\u0019J\u000e\u00103\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u0014J\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00162\u0006\u00106\u001a\u000207J\u0016\u00108\u001a\u00020\u00032\u0006\u00106\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u0014J \u00109\u001a\u00020\u00142\u0006\u00106\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u00020\u00032\u0006\u00106\u001a\u0002072\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010=\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0003J\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0016J\u000e\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u0014J\u0006\u0010C\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\n¨\u0006F"}, d2 = {"Lcom/pymcl/core/instance/SaveManager;", "", "gameDir", "Ljava/io/File;", "clock", "Lkotlin/Function0;", "", "<init>", "(Ljava/io/File;Lkotlin/jvm/functions/Function0;)V", "getGameDir", "()Ljava/io/File;", "savesDir", "getSavesDir", "backupsDir", "getBackupsDir", "trashDir", "getTrashDir", "child", "root", HintConstants.AUTOFILL_HINT_NAME, "", "listSaves", "", "Lcom/pymcl/core/instance/SaveInfo;", "withSize", "", "saveDir", "backup", "export", "", "out", "Ljava/io/OutputStream;", "deleteSave", "rename", "Lcom/pymcl/core/instance/RenameResult;", "old", "newName", "updateLevelName", "setLevelName", "levelDat", "installDatapack", "saveName", "pack", "installedDatapacks", "listBackups", "Lcom/pymcl/core/instance/SaveBackup;", "backupSaveName", "fileName", "restoreBackup", "backupName", "overwrite", "deleteBackup", "listMedia", "Lcom/pymcl/core/instance/MediaFile;", "kind", "Lcom/pymcl/core/instance/MediaKind;", "mediaFile", "readMedia", "maxBytes", "", "deleteMedia", "moveToTrash", "f", "listTrash", "Lcom/pymcl/core/instance/TrashEntry;", "restoreTrash", "entryName", "emptyTrash", "Companion", "LevelMeta", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SaveManager {
    private final Function0<Long> clock;
    private final File gameDir;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex ILLEGAL = new Regex("[\\\\/:*?\"<>|\\u0000-\\u001f]");
    private static final Regex BACKUP_SUFFIX = new Regex("-(\\d{8}-\\d{6})(-\\d+)?\\.zip$", RegexOption.IGNORE_CASE);
    private static final Regex TRASH_SUFFIX = new Regex("^(saves|backups|screenshots|crash-reports|logs)~(.+)~(\\d{13})$");
    private static final Set<String> SKIP = SetsKt.setOf("session.lock");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Saves.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.pymcl.core.instance.SaveManager$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public SaveManager(File gameDir, Function0<Long> clock) {
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.gameDir = gameDir;
        this.clock = clock;
    }

    public /* synthetic */ SaveManager(File file, AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
    }

    public final File getGameDir() {
        return this.gameDir;
    }

    public final File getSavesDir() {
        return new File(this.gameDir, "saves");
    }

    public final File getBackupsDir() {
        return new File(this.gameDir, "backups");
    }

    public final File getTrashDir() {
        return new File(this.gameDir, ".trash");
    }

    /* compiled from: Saves.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0010J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/pymcl/core/instance/SaveManager$Companion;", "", "<init>", "()V", "ILLEGAL", "Lkotlin/text/Regex;", "BACKUP_SUFFIX", "TRASH_SUFFIX", "SKIP", "", "", "stamp", "t", "", "dirSize", "f", "Ljava/io/File;", "validName", "", "n", "readLevel", "Lcom/pymcl/core/instance/SaveManager$LevelMeta;", "levelDat", "readText", "maxBytes", "", "zipDir", "", "dir", "prefix", "out", "Ljava/io/OutputStream;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String stamp(long t) {
            String str = new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.ROOT).format(new Date(t));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit dirSize$lambda$0(File file, IOException iOException) {
            Intrinsics.checkNotNullParameter(file, "<unused var>");
            Intrinsics.checkNotNullParameter(iOException, "<unused var>");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean dirSize$lambda$1(File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.isFile();
        }

        public final long dirSize(File f) {
            Intrinsics.checkNotNullParameter(f, "f");
            if (f.isFile()) {
                return f.length();
            }
            long length = 0;
            for (File it : SequencesKt.filter(FilesKt.walkTopDown(f).onFail(new Function2() { // from class: com.pymcl.core.instance.SaveManager$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SaveManager.Companion.dirSize$lambda$0((File) obj, (IOException) obj2);
                }
            }), new Function1() { // from class: com.pymcl.core.instance.SaveManager$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(SaveManager.Companion.dirSize$lambda$1((File) obj));
                }
            })) {
                length += it.length();
            }
            return length;
        }

        public final boolean validName(String n) {
            Intrinsics.checkNotNullParameter(n, "n");
            return (StringsKt.isBlank(n) || Intrinsics.areEqual(n, ".") || Intrinsics.areEqual(n, "..") || SaveManager.ILLEGAL.containsMatchIn(n) || !Intrinsics.areEqual(StringsKt.trim((CharSequence) n).toString(), n)) ? false : true;
        }

        public final LevelMeta readLevel(File levelDat) {
            Object objM8116constructorimpl;
            LevelNbt.NbtCompound data;
            Intrinsics.checkNotNullParameter(levelDat, "levelDat");
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                data = LevelNbt.INSTANCE.readFile(levelDat).getTag().compound("Data");
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (data == null) {
                return null;
            }
            String strString = data.string("LevelName");
            Long lM8028long = data.m8028long("LastPlayed");
            Integer numM8027int = data.m8027int("GameType");
            Integer numM8027int2 = data.m8027int("hardcore");
            boolean z = (numM8027int2 != null ? numM8027int2.intValue() : 0) != 0;
            LevelNbt.NbtCompound nbtCompoundCompound = data.compound("Version");
            objM8116constructorimpl = Result.m8116constructorimpl(new LevelMeta(strString, lM8028long, numM8027int, z, nbtCompoundCompound != null ? nbtCompoundCompound.string("Name") : null));
            return (LevelMeta) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
        }

        public static /* synthetic */ String readText$default(Companion companion, File file, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 524288;
            }
            return companion.readText(file, i);
        }

        public final String readText(File f, int maxBytes) {
            Throwable th;
            InputStream s;
            byte[] ring;
            long total;
            int pos;
            byte[] buf;
            byte[] bytes;
            Intrinsics.checkNotNullParameter(f, "f");
            InputStream fileInputStream = new FileInputStream(f);
            InputStream raw = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
            String name = f.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            InputStream input = StringsKt.endsWith(name, ".gz", true) ? new GZIPInputStream(raw) : raw;
            InputStream inputStream = input;
            try {
                s = inputStream;
                ring = new byte[maxBytes];
                total = 0;
                pos = 0;
                buf = new byte[16384];
            } catch (Throwable th2) {
                th = th2;
            }
            while (true) {
                int n = s.read(buf);
                if (n < 0) {
                    break;
                }
                for (int i = 0; i < n; i++) {
                    try {
                        ring[pos] = buf[i];
                        pos = (pos + 1) % maxBytes;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                total += n;
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    CloseableKt.closeFinally(inputStream, th);
                    throw th4;
                }
            }
            if (total <= maxBytes) {
                bytes = Arrays.copyOf(ring, (int) total);
                Intrinsics.checkNotNullExpressionValue(bytes, "copyOf(...)");
            } else {
                bytes = ArraysKt.plus(ArraysKt.copyOfRange(ring, pos, maxBytes), ArraysKt.copyOfRange(ring, 0, pos));
            }
            String text = new String(bytes, Charsets.UTF_8);
            if (total > maxBytes) {
                try {
                    text = "…（文件共 " + (total / 1024) + " KB，只显示最后 " + (maxBytes / 1024) + " KB）\n" + StringsKt.substringAfter$default(text, '\n', (String) null, 2, (Object) null);
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            CloseableKt.closeFinally(inputStream, null);
            return text;
        }

        public final void zipDir(File dir, String prefix, OutputStream out) {
            String str;
            Object objM8116constructorimpl;
            FileInputStream fileInputStream;
            final File dir2 = dir;
            String prefix2 = prefix;
            String str2 = "/";
            Intrinsics.checkNotNullParameter(dir2, "dir");
            Intrinsics.checkNotNullParameter(prefix2, "prefix");
            Intrinsics.checkNotNullParameter(out, "out");
            ZipOutputStream zipOutputStream = new ZipOutputStream(out instanceof BufferedOutputStream ? (BufferedOutputStream) out : new BufferedOutputStream(out, 8192));
            try {
                ZipOutputStream z = zipOutputStream;
                z.putNextEntry(new ZipEntry(prefix2 + "/"));
                z.closeEntry();
                Sequence $this$forEach$iv = SequencesKt.filter(FilesKt.walkTopDown(dir2).onFail(new Function2() { // from class: com.pymcl.core.instance.SaveManager$Companion$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SaveManager.Companion.zipDir$lambda$0$0((File) obj, (IOException) obj2);
                    }
                }), new Function1() { // from class: com.pymcl.core.instance.SaveManager$Companion$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SaveManager.Companion.zipDir$lambda$0$1(dir2, (File) obj));
                    }
                });
                for (Object element$iv : $this$forEach$iv) {
                    File f = (File) element$iv;
                    String rel = FilesKt.getInvariantSeparatorsPath(FilesKt.relativeTo(f, dir2));
                    if (f.isDirectory()) {
                        z.putNextEntry(new ZipEntry(prefix2 + str2 + rel + str2));
                        z.closeEntry();
                        str = str2;
                    } else {
                        Companion companion = SaveManager.INSTANCE;
                        try {
                            Result.Companion companion2 = Result.INSTANCE;
                            fileInputStream = new FileInputStream(f);
                        } catch (Throwable th) {
                            th = th;
                            str = str2;
                        }
                        try {
                            FileInputStream i = fileInputStream;
                            ZipEntry it = new ZipEntry(prefix2 + str2 + rel);
                            it.setTime(f.lastModified());
                            z.putNextEntry(it);
                            str = str2;
                            try {
                                ByteStreamsKt.copyTo$default(i, z, 0, 2, null);
                                z.closeEntry();
                                Unit unit = Unit.INSTANCE;
                                try {
                                    CloseableKt.closeFinally(fileInputStream, null);
                                    objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th2) {
                                    th = th2;
                                    Result.Companion companion3 = Result.INSTANCE;
                                    objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                                    Result.m8115boximpl(objM8116constructorimpl);
                                    dir2 = dir;
                                    prefix2 = prefix;
                                    str2 = str;
                                }
                                Result.m8115boximpl(objM8116constructorimpl);
                            } catch (Throwable th3) {
                                th = th3;
                                Throwable th4 = th;
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    CloseableKt.closeFinally(fileInputStream, th4);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            str = str2;
                        }
                    }
                    dir2 = dir;
                    prefix2 = prefix;
                    str2 = str;
                }
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(zipOutputStream, null);
            } finally {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit zipDir$lambda$0$0(File file, IOException iOException) {
            Intrinsics.checkNotNullParameter(file, "<unused var>");
            Intrinsics.checkNotNullParameter(iOException, "<unused var>");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean zipDir$lambda$0$1(File $dir, File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (Intrinsics.areEqual(it, $dir) || SaveManager.SKIP.contains(it.getName())) ? false : true;
        }
    }

    /* compiled from: Saves.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JH\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006#"}, d2 = {"Lcom/pymcl/core/instance/SaveManager$LevelMeta;", "", "levelName", "", "lastPlayed", "", "gameType", "", "hardcore", "", "versionName", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;)V", "getLevelName", "()Ljava/lang/String;", "getLastPlayed", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGameType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHardcore", "()Z", "getVersionName", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;)Lcom/pymcl/core/instance/SaveManager$LevelMeta;", "equals", "other", "hashCode", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LevelMeta {
        private final Integer gameType;
        private final boolean hardcore;
        private final Long lastPlayed;
        private final String levelName;
        private final String versionName;

        public static /* synthetic */ LevelMeta copy$default(LevelMeta levelMeta, String str, Long l, Integer num, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = levelMeta.levelName;
            }
            if ((i & 2) != 0) {
                l = levelMeta.lastPlayed;
            }
            if ((i & 4) != 0) {
                num = levelMeta.gameType;
            }
            if ((i & 8) != 0) {
                z = levelMeta.hardcore;
            }
            if ((i & 16) != 0) {
                str2 = levelMeta.versionName;
            }
            String str3 = str2;
            Integer num2 = num;
            return levelMeta.copy(str, l, num2, z, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLevelName() {
            return this.levelName;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getLastPlayed() {
            return this.lastPlayed;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getGameType() {
            return this.gameType;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHardcore() {
            return this.hardcore;
        }

        /* renamed from: component5, reason: from getter */
        public final String getVersionName() {
            return this.versionName;
        }

        public final LevelMeta copy(String levelName, Long lastPlayed, Integer gameType, boolean hardcore, String versionName) {
            return new LevelMeta(levelName, lastPlayed, gameType, hardcore, versionName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LevelMeta)) {
                return false;
            }
            LevelMeta levelMeta = (LevelMeta) other;
            return Intrinsics.areEqual(this.levelName, levelMeta.levelName) && Intrinsics.areEqual(this.lastPlayed, levelMeta.lastPlayed) && Intrinsics.areEqual(this.gameType, levelMeta.gameType) && this.hardcore == levelMeta.hardcore && Intrinsics.areEqual(this.versionName, levelMeta.versionName);
        }

        public int hashCode() {
            return ((((((((this.levelName == null ? 0 : this.levelName.hashCode()) * 31) + (this.lastPlayed == null ? 0 : this.lastPlayed.hashCode())) * 31) + (this.gameType == null ? 0 : this.gameType.hashCode())) * 31) + Boolean.hashCode(this.hardcore)) * 31) + (this.versionName != null ? this.versionName.hashCode() : 0);
        }

        public String toString() {
            return "LevelMeta(levelName=" + this.levelName + ", lastPlayed=" + this.lastPlayed + ", gameType=" + this.gameType + ", hardcore=" + this.hardcore + ", versionName=" + this.versionName + ")";
        }

        public LevelMeta(String levelName, Long lastPlayed, Integer gameType, boolean hardcore, String versionName) {
            this.levelName = levelName;
            this.lastPlayed = lastPlayed;
            this.gameType = gameType;
            this.hardcore = hardcore;
            this.versionName = versionName;
        }

        public final Integer getGameType() {
            return this.gameType;
        }

        public final boolean getHardcore() {
            return this.hardcore;
        }

        public final Long getLastPlayed() {
            return this.lastPlayed;
        }

        public final String getLevelName() {
            return this.levelName;
        }

        public final String getVersionName() {
            return this.versionName;
        }
    }

    private final File child(File root, String name) {
        if (!((!(name.length() > 0) || Intrinsics.areEqual(name, ".") || Intrinsics.areEqual(name, "..") || StringsKt.contains$default((CharSequence) name, IOUtils.DIR_SEPARATOR_UNIX, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) name, IOUtils.DIR_SEPARATOR_WINDOWS, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) name, (char) 0, false, 2, (Object) null)) ? false : true)) {
            throw new IllegalArgumentException(("非法名称: " + name).toString());
        }
        return new File(root, name);
    }

    public static /* synthetic */ List listSaves$default(SaveManager saveManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return saveManager.listSaves(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.pymcl.core.instance.SaveInfo> listSaves(boolean r30) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.instance.SaveManager.listSaves(boolean):java.util.List");
    }

    public final File saveDir(String name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        File it = child(getSavesDir(), name);
        if (it.isDirectory()) {
            return it;
        }
        throw new IOException("存档不存在: " + name);
    }

    public final File backup(String name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        File dir = saveDir(name);
        getBackupsDir().mkdirs();
        String base = name + "-" + INSTANCE.stamp(this.clock.invoke().longValue());
        File f = new File(getBackupsDir(), base + ".zip");
        int i = 2;
        while (f.exists()) {
            f = new File(getBackupsDir(), base + "-" + i + ".zip");
            i++;
        }
        File tmp = new File(getBackupsDir(), f.getName() + ".part");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(tmp);
            try {
                FileOutputStream it = fileOutputStream;
                INSTANCE.zipDir(dir, name, it);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                if (!tmp.renameTo(f)) {
                    throw new IOException("无法写入备份 " + f.getName());
                }
                return f;
            } finally {
            }
        } finally {
            tmp.delete();
        }
    }

    public final void export(String name, OutputStream out) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(out, "out");
        INSTANCE.zipDir(saveDir(name), name, out);
    }

    public final File deleteSave(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return moveToTrash("saves", saveDir(name));
    }

    public static /* synthetic */ RenameResult rename$default(SaveManager saveManager, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return saveManager.rename(str, str2, z);
    }

    public final RenameResult rename(String old, String newName, boolean updateLevelName) throws IOException {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(old, "old");
        Intrinsics.checkNotNullParameter(newName, "newName");
        File src = saveDir(old);
        String n = StringsKt.trim((CharSequence) newName).toString();
        if (!INSTANCE.validName(n)) {
            throw new IllegalArgumentException("名称不能为空，也不能含 \\ / : * ? \" < > |".toString());
        }
        File dst = child(getSavesDir(), n);
        if (!Intrinsics.areEqual(n, old)) {
            String[] list = getSavesDir().list();
            if ((list != null && ArraysKt.contains(list, n)) || (dst.exists() && !StringsKt.equals(n, old, true))) {
                throw new IOException("已有同名存档「" + n + "」");
            }
            if (!src.renameTo(dst)) {
                File mid = new File(getSavesDir(), "." + old + ".renaming");
                if (!src.renameTo(mid) || !mid.renameTo(dst)) {
                    throw new IOException("改名失败");
                }
            }
        }
        boolean ok = false;
        if (updateLevelName) {
            try {
                Result.Companion companion = Result.INSTANCE;
                SaveManager $this$rename_u24lambda_u241 = this;
                objM8116constructorimpl = Result.m8116constructorimpl(Boolean.valueOf($this$rename_u24lambda_u241.setLevelName(new File(dst, "level.dat"), n)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = false;
            }
            ok = ((Boolean) objM8116constructorimpl).booleanValue();
        }
        return new RenameResult(n, ok);
    }

    private final boolean setLevelName(File levelDat, String name) throws IOException {
        if (!levelDat.isFile()) {
            return false;
        }
        LevelNbt.Root root = LevelNbt.INSTANCE.readFile(levelDat);
        LevelNbt.NbtCompound data = root.getTag().compound("Data");
        if (data == null) {
            return false;
        }
        data.putString("LevelName", name);
        byte[] bytes = LevelNbt.INSTANCE.writeGzip(root);
        FilesKt.copyTo$default(levelDat, new File(levelDat.getParentFile(), "level.dat_old"), true, 0, 4, null);
        File tmp = new File(levelDat.getParentFile(), "level.dat.part");
        FilesKt.writeBytes(tmp, bytes);
        if (tmp.renameTo(levelDat)) {
            return true;
        }
        levelDat.delete();
        if (tmp.renameTo(levelDat)) {
            return true;
        }
        throw new IOException("写 level.dat 失败");
    }

    public final File installDatapack(String saveName, File pack) {
        Intrinsics.checkNotNullParameter(saveName, "saveName");
        Intrinsics.checkNotNullParameter(pack, "pack");
        File dir = new File(saveDir(saveName), "datapacks");
        dir.mkdirs();
        String name = pack.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        File dst = child(dir, name);
        if (pack.isDirectory()) {
            Boolean.valueOf(FilesKt.copyRecursively$default(pack, dst, true, null, 4, null));
        } else {
            FilesKt.copyTo$default(pack, dst, true, 0, 4, null);
        }
        return dst;
    }

    public final List<String> installedDatapacks(String saveName) {
        Intrinsics.checkNotNullParameter(saveName, "saveName");
        File[] fileArrListFiles = new File(saveDir(saveName), "datapacks").listFiles();
        if (fileArrListFiles != null) {
            Collection destination$iv$iv = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                destination$iv$iv.add(file.getName());
            }
            List<String> listSorted = CollectionsKt.sorted((List) destination$iv$iv);
            if (listSorted != null) {
                return listSorted;
            }
        }
        return CollectionsKt.emptyList();
    }

    public static /* synthetic */ List listBackups$default(SaveManager saveManager, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return saveManager.listBackups(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.pymcl.core.instance.SaveBackup> listBackups(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.instance.SaveManager.listBackups(java.lang.String):java.util.List");
    }

    public final String backupSaveName(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return StringsKt.removeSuffix(BACKUP_SUFFIX.replace(fileName, ""), (CharSequence) ".zip");
    }

    public static /* synthetic */ String restoreBackup$default(SaveManager saveManager, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return saveManager.restoreBackup(str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x033f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String restoreBackup(java.lang.String r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.instance.SaveManager.restoreBackup(java.lang.String, boolean):java.lang.String");
    }

    public final File deleteBackup(String backupName) throws IOException {
        Intrinsics.checkNotNullParameter(backupName, "backupName");
        File it = child(getBackupsDir(), backupName);
        if (!it.isFile()) {
            throw new IOException("备份不存在: " + backupName);
        }
        Unit unit = Unit.INSTANCE;
        return moveToTrash("backups", it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.pymcl.core.instance.MediaFile> listMedia(com.pymcl.core.instance.MediaKind r19) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.instance.SaveManager.listMedia(com.pymcl.core.instance.MediaKind):java.util.List");
    }

    public final File mediaFile(MediaKind kind, String name) throws IOException {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(name, "name");
        File f = child((kind == MediaKind.CRASH_REPORTS && StringsKt.startsWith$default(name, "hs_err_pid", false, 2, (Object) null)) ? this.gameDir : new File(this.gameDir, kind.getDir()), name);
        if (f.isFile()) {
            return f;
        }
        throw new IOException("文件不存在: " + name);
    }

    public static /* synthetic */ String readMedia$default(SaveManager saveManager, MediaKind mediaKind, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 524288;
        }
        return saveManager.readMedia(mediaKind, str, i);
    }

    public final String readMedia(MediaKind kind, String name, int maxBytes) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(name, "name");
        return INSTANCE.readText(mediaFile(kind, name), maxBytes);
    }

    public final File deleteMedia(MediaKind kind, String name) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(name, "name");
        return moveToTrash(kind.getDir(), mediaFile(kind, name));
    }

    public final File moveToTrash(String kind, File f) throws IOException {
        File dst;
        File f2;
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(f, "f");
        getTrashDir().mkdirs();
        long t = this.clock.invoke().longValue();
        File file = new File(getTrashDir(), kind + "~" + f.getName() + "~" + t);
        while (true) {
            dst = file;
            if (!dst.exists()) {
                break;
            }
            t++;
            file = new File(getTrashDir(), kind + "~" + f.getName() + "~" + t);
        }
        if (!f.renameTo(dst)) {
            if (f.isDirectory()) {
                f2 = f;
                Boolean.valueOf(FilesKt.copyRecursively$default(f2, dst, false, null, 4, null));
            } else {
                f2 = f;
                FilesKt.copyTo$default(f2, dst, false, 0, 6, null);
            }
            if (!FilesKt.deleteRecursively(f2)) {
                throw new IOException("删除失败: " + f2.getName());
            }
        }
        return dst;
    }

    public final List<TrashEntry> listTrash() throws NumberFormatException {
        int i;
        TrashEntry trashEntry;
        File[] fileArrListFiles = getTrashDir().listFiles();
        int i2 = 0;
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        Collection destination$iv$iv = new ArrayList();
        File[] fileArr = fileArrListFiles;
        int length = fileArr.length;
        while (i2 < length) {
            File file = fileArr[i2];
            Regex regex = TRASH_SUFFIX;
            String name = file.getName();
            File[] fileArr2 = fileArrListFiles;
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            MatchResult m = regex.matchEntire(name);
            if (m != null) {
                i = i2;
                String name2 = file.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                String str = m.getGroupValues().get(2);
                String str2 = m.getGroupValues().get(1);
                long j = Long.parseLong(m.getGroupValues().get(3));
                Companion companion = INSTANCE;
                Intrinsics.checkNotNull(file);
                long jDirSize = companion.dirSize(file);
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                trashEntry = new TrashEntry(name2, str, str2, j, jDirSize, absolutePath);
            } else {
                i = i2;
                trashEntry = null;
            }
            if (trashEntry != null) {
                destination$iv$iv.add(trashEntry);
            }
            i2 = i + 1;
            fileArrListFiles = fileArr2;
        }
        Iterable $this$sortedByDescending$iv = (List) destination$iv$iv;
        return CollectionsKt.sortedWith($this$sortedByDescending$iv, new Comparator() { // from class: com.pymcl.core.instance.SaveManager$listTrash$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                TrashEntry it = (TrashEntry) t2;
                TrashEntry it2 = (TrashEntry) t;
                return ComparisonsKt.compareValues(Long.valueOf(it.getTime()), Long.valueOf(it2.getTime()));
            }
        });
    }

    public final String restoreTrash(String entryName) throws IOException {
        StringBuilder sb;
        StringBuilder sbAppend;
        String str;
        Intrinsics.checkNotNullParameter(entryName, "entryName");
        File src = child(getTrashDir(), entryName);
        MatchResult m = TRASH_SUFFIX.matchEntire(entryName);
        if (m == null) {
            throw new IOException("不是回收条目: " + entryName);
        }
        String kind = m.getGroupValues().get(1);
        String orig = m.getGroupValues().get(2);
        File it = new File(this.gameDir, kind);
        it.mkdirs();
        File dst = new File(it, orig);
        int i = 1;
        while (dst.exists()) {
            String ext = (src.isFile() && StringsKt.contains$default((CharSequence) orig, '.', false, 2, (Object) null)) ? "." + StringsKt.substringAfterLast$default(orig, '.', (String) null, 2, (Object) null) : "";
            String stem = ext.length() == 0 ? orig : StringsKt.removeSuffix(orig, (CharSequence) ext);
            if (i == 1) {
                sb = new StringBuilder();
                sbAppend = sb.append(stem);
                str = " (恢复)";
            } else {
                sb = new StringBuilder();
                sbAppend = sb.append(stem).append(" (恢复 ").append(i);
                str = ")";
            }
            dst = new File(it, sbAppend.append(str).append(ext).toString());
            i++;
        }
        if (!src.renameTo(dst)) {
            throw new IOException("恢复失败: " + orig);
        }
        String name = dst.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public final long emptyTrash() {
        long n = INSTANCE.dirSize(getTrashDir());
        File[] fileArrListFiles = getTrashDir().listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                Intrinsics.checkNotNull(file);
                FilesKt.deleteRecursively(file);
            }
        }
        return n;
    }
}
