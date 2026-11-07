package com.pymcl.ai;

import com.pymcl.core.util.Json;
import com.pymcl.runtime.process.JavaProcessService;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: Hooks.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\u000e0\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/pymcl/ai/AuditLog;", "", "file", "Ljava/io/File;", "maxBytes", "", "<init>", "(Ljava/io/File;J)V", "append", "Lkotlin/Result;", "", "entry", "", "", "Lcom/pymcl/core/util/JObj;", "append-IoAF18A", "(Ljava/util/Map;)Ljava/lang/Object;", "read", "", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AuditLog {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex SECRET_KEY = new Regex("(?i)(key|token|password|passwd|secret|authorization|cookie)");
    private final File file;
    private final long maxBytes;

    /* compiled from: Hooks.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0006\u001a\u00020\u00072\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/pymcl/ai/AuditLog$Companion;", "", "<init>", "()V", "SECRET_KEY", "Lkotlin/text/Regex;", "summarizeArgs", "", JavaProcessService.EXTRA_ARGS, "", "Lcom/pymcl/core/util/JObj;", "limit", "", "isoNow", "now", "", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ String summarizeArgs$default(Companion companion, Map map, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 300;
            }
            return companion.summarizeArgs(map, i);
        }

        public final String summarizeArgs(Map<String, Object> args, int limit) {
            if (args == null) {
                return "";
            }
            String s = Json.stringify$default(Json.INSTANCE, summarizeArgs$mask(args), false, 2, null);
            if (s.length() <= limit) {
                return s;
            }
            return StringsKt.take(s, limit) + "…";
        }

        private static final Object summarizeArgs$mask(Object v) {
            if (v instanceof Map) {
                LinkedHashMap m = new LinkedHashMap();
                Map $this$forEach$iv = (Map) v;
                for (Map.Entry element$iv : $this$forEach$iv.entrySet()) {
                    Object k = element$iv.getKey();
                    Object x = element$iv.getValue();
                    m.put(String.valueOf(k), AuditLog.SECRET_KEY.containsMatchIn(String.valueOf(k)) ? "***" : summarizeArgs$mask(x));
                }
                return m;
            }
            if (!(v instanceof List)) {
                if (!(v instanceof String)) {
                    return v;
                }
                if (((String) v).length() > 120) {
                    return StringsKt.take((String) v, 120) + "…";
                }
                return (String) v;
            }
            Iterable $this$map$iv = (Iterable) v;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                Object p0 = summarizeArgs$mask(item$iv$iv);
                destination$iv$iv.add(p0);
            }
            return CollectionsKt.toMutableList(destination$iv$iv);
        }

        public static /* synthetic */ String isoNow$default(Companion companion, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = System.currentTimeMillis();
            }
            return companion.isoNow(j);
        }

        public final String isoNow(long now) {
            SimpleDateFormat $this$isoNow_u24lambda_u240 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.ROOT);
            $this$isoNow_u24lambda_u240.setTimeZone(TimeZone.getDefault());
            String str = $this$isoNow_u24lambda_u240.format(new Date(now));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
    }

    public AuditLog(File file, long maxBytes) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.maxBytes = maxBytes;
    }

    public /* synthetic */ AuditLog(File file, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? 5242880L : j);
    }

    /* renamed from: append-IoAF18A, reason: not valid java name */
    public final Object m7523appendIoAF18A(Map<String, Object> entry) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(entry, "entry");
        synchronized (this) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AuditLog $this$append_IoAF18A_u24lambda_u240_u240 = this;
                File parentFile = $this$append_IoAF18A_u24lambda_u240_u240.file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                if ($this$append_IoAF18A_u24lambda_u240_u240.file.length() > $this$append_IoAF18A_u24lambda_u240_u240.maxBytes) {
                    File old = new File($this$append_IoAF18A_u24lambda_u240_u240.file.getParentFile(), "audit.1.jsonl");
                    old.delete();
                    $this$append_IoAF18A_u24lambda_u240_u240.file.renameTo(old);
                }
                long now = System.currentTimeMillis();
                LinkedHashMap line = new LinkedHashMap();
                line.put("ts", INSTANCE.isoNow(now));
                line.put("time", Long.valueOf(now / 1000));
                line.putAll(entry);
                FilesKt.appendText$default($this$append_IoAF18A_u24lambda_u240_u240.file, Json.stringify$default(Json.INSTANCE, line, false, 2, null) + StringUtils.LF, null, 2, null);
                objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
        return objM8116constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: all -> 0x00a1, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000c, B:8:0x0014, B:9:0x0030, B:11:0x0036, B:26:0x0080, B:29:0x0087, B:32:0x008f, B:25:0x0076, B:34:0x0097), top: B:43:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> read() {
        /*
            r21 = this;
            r1 = r21
            monitor-enter(r21)
            r2 = 0
            java.io.File r0 = r1.file     // Catch: java.lang.Throwable -> La1
            boolean r0 = r0.isFile()     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L14
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> La1
            r20 = r2
            goto L9e
        L14:
            java.io.File r0 = r1.file     // Catch: java.lang.Throwable -> La1
            r3 = 1
            r4 = 0
            java.util.List r0 = kotlin.io.FilesKt.readLines$default(r0, r4, r3, r4)     // Catch: java.lang.Throwable -> La1
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> La1
            r3 = r0
            r5 = 0
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La1
            r0.<init>()     // Catch: java.lang.Throwable -> La1
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> La1
            r6 = r0
            r7 = r3
            r8 = 0
            r9 = r7
            r10 = 0
            java.util.Iterator r11 = r9.iterator()     // Catch: java.lang.Throwable -> La1
        L30:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L97
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Throwable -> La1
            r12 = r0
            r13 = r12
            r14 = 0
            r0 = r13
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La1
            r15 = r0
            r16 = 0
            r17 = 0
            r18 = r0
            java.lang.CharSequence r18 = (java.lang.CharSequence) r18     // Catch: java.lang.Throwable -> La1
            boolean r18 = kotlin.text.StringsKt.isBlank(r18)     // Catch: java.lang.Throwable -> La1
            if (r18 != 0) goto L52
            r0 = r15
            goto L53
        L52:
            r0 = r4
        L53:
            if (r0 == 0) goto L8a
            r17 = r0
            r18 = 0
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L71
            r0 = r1
            com.pymcl.ai.AuditLog r0 = (com.pymcl.ai.AuditLog) r0     // Catch: java.lang.Throwable -> L71
            r19 = 0
            com.pymcl.core.util.Json r4 = com.pymcl.core.util.Json.INSTANCE     // Catch: java.lang.Throwable -> L71
            r20 = r2
            r2 = r17
            java.util.Map r4 = r4.obj(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = kotlin.Result.m8116constructorimpl(r4)     // Catch: java.lang.Throwable -> L6f
            goto L80
        L6f:
            r0 = move-exception
            goto L76
        L71:
            r0 = move-exception
            r20 = r2
            r2 = r17
        L76:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = kotlin.Result.m8116constructorimpl(r0)     // Catch: java.lang.Throwable -> La1
        L80:
            boolean r4 = kotlin.Result.m8122isFailureimpl(r0)     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L87
            r0 = 0
        L87:
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Throwable -> La1
            goto L8d
        L8a:
            r20 = r2
            r0 = 0
        L8d:
            if (r0 == 0) goto L93
            r2 = 0
            r6.add(r0)     // Catch: java.lang.Throwable -> La1
        L93:
            r2 = r20
            r4 = 0
            goto L30
        L97:
            r20 = r2
            r0 = r6
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> La1
        L9e:
            monitor-exit(r21)
            return r0
        La1:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.AuditLog.read():java.util.List");
    }
}
