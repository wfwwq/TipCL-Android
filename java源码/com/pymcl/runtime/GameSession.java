package com.pymcl.runtime;

import android.content.Context;
import com.tungsten.fclauncher.utils.FCLPath;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.CharUtils;

/* compiled from: GameSession.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0002'(B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u0013J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150$2\b\b\u0002\u0010%\u001a\u00020\u001c2\b\b\u0002\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\b¨\u0006)"}, d2 = {"Lcom/pymcl/runtime/GameSession;", "", "dir", "Ljava/io/File;", "logFile", "<init>", "(Ljava/io/File;Ljava/io/File;)V", "getDir", "()Ljava/io/File;", "getLogFile", "props", "getProps", "exitFile", "getExitFile", "endFile", "getEndFile", "consumedFile", "getConsumedFile", "begin", "", "instance", "", "version", "gameDir", "startMs", "", "markExit", "code", "", "endMs", "hasExited", "", "read", "Lcom/pymcl/runtime/GameSession$Info;", "consume", "logTail", "", "maxLines", "maxBytes", "Info", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GameSession {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final File dir;
    private final File logFile;

    /* compiled from: GameSession.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017JN\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\"J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\tHÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006("}, d2 = {"Lcom/pymcl/runtime/GameSession$Info;", "", "instance", "", "version", "gameDir", "startMs", "", "exitCode", "", "endMs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Long;)V", "getInstance", "()Ljava/lang/String;", "getVersion", "getGameDir", "getStartMs", "()J", "getExitCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "durationSec", "nowMs", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Long;)Lcom/pymcl/runtime/GameSession$Info;", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Info {
        private final Long endMs;
        private final Integer exitCode;
        private final String gameDir;
        private final String instance;
        private final long startMs;
        private final String version;

        public static /* synthetic */ Info copy$default(Info info, String str, String str2, String str3, long j, Integer num, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = info.instance;
            }
            if ((i & 2) != 0) {
                str2 = info.version;
            }
            if ((i & 4) != 0) {
                str3 = info.gameDir;
            }
            if ((i & 8) != 0) {
                j = info.startMs;
            }
            if ((i & 16) != 0) {
                num = info.exitCode;
            }
            if ((i & 32) != 0) {
                l = info.endMs;
            }
            long j2 = j;
            String str4 = str3;
            return info.copy(str, str2, str4, j2, num, l);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstance() {
            return this.instance;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component3, reason: from getter */
        public final String getGameDir() {
            return this.gameDir;
        }

        /* renamed from: component4, reason: from getter */
        public final long getStartMs() {
            return this.startMs;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getExitCode() {
            return this.exitCode;
        }

        /* renamed from: component6, reason: from getter */
        public final Long getEndMs() {
            return this.endMs;
        }

        public final Info copy(String instance, String version, String gameDir, long startMs, Integer exitCode, Long endMs) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(gameDir, "gameDir");
            return new Info(instance, version, gameDir, startMs, exitCode, endMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.areEqual(this.instance, info.instance) && Intrinsics.areEqual(this.version, info.version) && Intrinsics.areEqual(this.gameDir, info.gameDir) && this.startMs == info.startMs && Intrinsics.areEqual(this.exitCode, info.exitCode) && Intrinsics.areEqual(this.endMs, info.endMs);
        }

        public int hashCode() {
            return (((((((((this.instance.hashCode() * 31) + this.version.hashCode()) * 31) + this.gameDir.hashCode()) * 31) + Long.hashCode(this.startMs)) * 31) + (this.exitCode == null ? 0 : this.exitCode.hashCode())) * 31) + (this.endMs != null ? this.endMs.hashCode() : 0);
        }

        public String toString() {
            return "Info(instance=" + this.instance + ", version=" + this.version + ", gameDir=" + this.gameDir + ", startMs=" + this.startMs + ", exitCode=" + this.exitCode + ", endMs=" + this.endMs + ")";
        }

        public Info(String instance, String version, String gameDir, long startMs, Integer exitCode, Long endMs) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(gameDir, "gameDir");
            this.instance = instance;
            this.version = version;
            this.gameDir = gameDir;
            this.startMs = startMs;
            this.exitCode = exitCode;
            this.endMs = endMs;
        }

        public final String getGameDir() {
            return this.gameDir;
        }

        public final String getInstance() {
            return this.instance;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        public final String getVersion() {
            return this.version;
        }

        public final Long getEndMs() {
            return this.endMs;
        }

        public final Integer getExitCode() {
            return this.exitCode;
        }

        public static /* synthetic */ long durationSec$default(Info info, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = System.currentTimeMillis();
            }
            return info.durationSec(j);
        }

        public final long durationSec(long nowMs) {
            Long l = this.endMs;
            return RangesKt.coerceAtLeast(((l != null ? l.longValue() : nowMs) - this.startMs) / 1000, 0L);
        }
    }

    public GameSession(File dir, File logFile) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(logFile, "logFile");
        this.dir = dir;
        this.logFile = logFile;
    }

    public final File getDir() {
        return this.dir;
    }

    public final File getLogFile() {
        return this.logFile;
    }

    private final File getProps() {
        return new File(this.dir, "session.properties");
    }

    private final File getExitFile() {
        return new File(this.dir, "exit");
    }

    private final File getEndFile() {
        return new File(this.dir, "end");
    }

    private final File getConsumedFile() {
        return new File(this.dir, "consumed");
    }

    public static /* synthetic */ void begin$default(GameSession gameSession, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 8) != 0) {
            j = System.currentTimeMillis();
        }
        gameSession.begin(str, str2, str3, j);
    }

    public final void begin(String instance, String version, String gameDir, long startMs) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        this.dir.mkdirs();
        getExitFile().delete();
        getEndFile().delete();
        getConsumedFile().delete();
        final Properties $this$begin_u24lambda_u240 = new Properties();
        $this$begin_u24lambda_u240.setProperty("instance", instance);
        $this$begin_u24lambda_u240.setProperty("version", version);
        $this$begin_u24lambda_u240.setProperty("gameDir", gameDir);
        $this$begin_u24lambda_u240.setProperty("start", String.valueOf(startMs));
        INSTANCE.atomic(getProps(), new Function1() { // from class: com.pymcl.runtime.GameSession$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameSession.begin$lambda$1($this$begin_u24lambda_u240, (File) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit begin$lambda$1(Properties $p, File f) {
        Intrinsics.checkNotNullParameter(f, "f");
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        try {
            FileOutputStream it = fileOutputStream;
            $p.store(it, "PyMCL game session");
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            return Unit.INSTANCE;
        } finally {
        }
    }

    public static /* synthetic */ void markExit$default(GameSession gameSession, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = System.currentTimeMillis();
        }
        gameSession.markExit(i, j);
    }

    public final void markExit(final int code, final long endMs) {
        this.dir.mkdirs();
        INSTANCE.atomic(getEndFile(), new Function1() { // from class: com.pymcl.runtime.GameSession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameSession.markExit$lambda$0(endMs, (File) obj);
            }
        });
        INSTANCE.atomic(getExitFile(), new Function1() { // from class: com.pymcl.runtime.GameSession$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameSession.markExit$lambda$1(code, (File) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit markExit$lambda$0(long $endMs, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FilesKt.writeText$default(it, String.valueOf($endMs), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit markExit$lambda$1(int $code, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FilesKt.writeText$default(it, String.valueOf($code), null, 2, null);
        return Unit.INSTANCE;
    }

    public final boolean hasExited() {
        return getExitFile().isFile();
    }

    public final Info read() {
        Long longOrNull;
        String text$default;
        String string;
        String text$default2;
        String string2;
        Long longOrNull2 = null;
        if (!getProps().isFile() || getConsumedFile().exists()) {
            return null;
        }
        Properties p = new Properties();
        FileInputStream it = new FileInputStream(getProps());
        try {
            p.load(it);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(it, null);
            String property = p.getProperty("instance", "");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            String property2 = p.getProperty("version", "");
            Intrinsics.checkNotNullExpressionValue(property2, "getProperty(...)");
            String property3 = p.getProperty("gameDir", "");
            Intrinsics.checkNotNullExpressionValue(property3, "getProperty(...)");
            String property4 = p.getProperty("start");
            if (property4 == null || (longOrNull = StringsKt.toLongOrNull(property4)) == null) {
                return null;
            }
            long jLongValue = longOrNull.longValue();
            File it2 = getExitFile();
            if (!it2.isFile()) {
                it2 = null;
            }
            Integer intOrNull = (it2 == null || (text$default2 = FilesKt.readText$default(it2, null, 1, null)) == null || (string2 = StringsKt.trim((CharSequence) text$default2).toString()) == null) ? null : StringsKt.toIntOrNull(string2);
            File it3 = getEndFile();
            if (!it3.isFile()) {
                it3 = null;
            }
            if (it3 != null && (text$default = FilesKt.readText$default(it3, null, 1, null)) != null && (string = StringsKt.trim((CharSequence) text$default).toString()) != null) {
                longOrNull2 = StringsKt.toLongOrNull(string);
            }
            return new Info(property, property2, property3, jLongValue, intOrNull, longOrNull2);
        } finally {
        }
    }

    public final void consume() {
        this.dir.mkdirs();
        FilesKt.writeText$default(getConsumedFile(), String.valueOf(System.currentTimeMillis()), null, 2, null);
    }

    public static /* synthetic */ List logTail$default(GameSession gameSession, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 200;
        }
        if ((i3 & 2) != 0) {
            i2 = 262144;
        }
        return gameSession.logTail(i, i2);
    }

    public final List<String> logTail(int maxLines, int maxBytes) {
        return INSTANCE.tail(this.logFile, maxLines, maxBytes);
    }

    /* compiled from: GameSession.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014¨\u0006\u0015"}, d2 = {"Lcom/pymcl/runtime/GameSession$Companion;", "", "<init>", "()V", "tail", "", "", "f", "Ljava/io/File;", "maxLines", "", "maxBytes", "atomic", "", "target", "write", "Lkotlin/Function1;", "of", "Lcom/pymcl/runtime/GameSession;", "context", "Landroid/content/Context;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> tail(File f, int maxLines, int maxBytes) {
            Throwable th;
            Intrinsics.checkNotNullParameter(f, "f");
            if (!f.isFile()) {
                return CollectionsKt.emptyList();
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(f, "r");
            try {
                RandomAccessFile r = randomAccessFile;
                long len = r.length();
                try {
                    long from = RangesKt.coerceAtLeast(len - maxBytes, 0L);
                    byte[] buf = new byte[(int) (len - from)];
                    r.seek(from);
                    r.readFully(buf);
                    int i = 1;
                    try {
                        boolean z = false;
                        Iterable $this$map$iv = StringsKt.split$default((CharSequence) new String(buf, Charsets.UTF_8), new char[]{'\n'}, false, 0, 6, (Object) null);
                        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
                        for (Object item$iv$iv : $this$map$iv) {
                            String it = (String) item$iv$iv;
                            RandomAccessFile r2 = r;
                            char[] cArr = new char[i];
                            cArr[0] = CharUtils.CR;
                            destination$iv$iv.add(StringsKt.trimEnd(it, cArr));
                            r = r2;
                            i = 1;
                        }
                        List lines = (List) destination$iv$iv;
                        if (from > 0) {
                            lines = CollectionsKt.drop(lines, 1);
                        }
                        String str = (String) CollectionsKt.lastOrNull(lines);
                        if (str != null) {
                            if (str.length() == 0) {
                                z = true;
                            }
                        }
                        if (z) {
                            lines = CollectionsKt.dropLast(lines, 1);
                        }
                        try {
                            List<String> listTakeLast = CollectionsKt.takeLast(lines, maxLines);
                            CloseableKt.closeFinally(randomAccessFile, null);
                            return listTakeLast;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(randomAccessFile, th);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void atomic(File target, Function1<? super File, Unit> write) {
            File tmp = new File(target.getParentFile(), target.getName() + ".tmp");
            write.invoke(tmp);
            if (!tmp.renameTo(target)) {
                target.delete();
                tmp.renameTo(target);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final GameSession of(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            RuntimeHost.init(context);
            return new GameSession(new File((File) context.getAWTComponent(), "game_session"), new File(FCLPath.LOG_DIR, FCLPath.LATEST_GAME_LOG));
        }
    }
}
