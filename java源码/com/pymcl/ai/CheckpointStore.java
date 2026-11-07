package com.pymcl.ai;

import com.pymcl.ai.CheckpointStore;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: Checkpoint.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002J\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002J.\u0010\u000e\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fj\u0002`\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0002J,\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\bJ*\u0010\u001f\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\rH\u0002J\u0006\u0010!\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/pymcl/ai/CheckpointStore;", "", "root", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "dir", "chat", "", "journalFile", "blobs", "loadJ", "", "Lcom/pymcl/core/util/JObj;", "entries", "", "Lcom/pymcl/core/util/JArr;", "j", "chatBytes", "", "snapshot", "Lcom/pymcl/ai/SnapshotResult;", "turnId", "tool", "paths", "", "hasEntries", "", "rollback", "Lcom/pymcl/ai/RollbackResult;", "deleteChat", "pruneBlobs", "", "gc", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckpointStore {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int KEEP_CHATS = 20;
    public static final long MAX_CHAT_BYTES = 1073741824;
    public static final int MAX_DIR_FILES = 20000;
    public static final long MAX_SNAPSHOT_BYTES = 536870912;
    private final File root;

    /* compiled from: Checkpoint.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/pymcl/ai/CheckpointStore$Companion;", "", "<init>", "()V", "MAX_DIR_FILES", "", "MAX_SNAPSHOT_BYTES", "", "MAX_CHAT_BYTES", "KEEP_CHATS", "sha256", "", "f", "Ljava/io/File;", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence sha256$lambda$1(byte it) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        public final String sha256(File f) throws NoSuchAlgorithmException {
            Intrinsics.checkNotNullParameter(f, "f");
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            FileInputStream fileInputStream = new FileInputStream(f);
            try {
                FileInputStream i = fileInputStream;
                byte[] b = new byte[65536];
                while (true) {
                    int n = i.read(b);
                    if (n < 0) {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStream, null);
                        byte[] bArrDigest = md.digest();
                        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                        return ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.pymcl.ai.CheckpointStore$Companion$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CheckpointStore.Companion.sha256$lambda$1(((Byte) obj).byteValue());
                            }
                        }, 30, (Object) null);
                    }
                    md.update(b, 0, n);
                }
            } finally {
            }
        }
    }

    public CheckpointStore(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.root = root;
    }

    private final File dir(String chat) {
        return new File(this.root, new Regex("[^A-Za-z0-9_.-]").replace(chat, "_"));
    }

    private final File journalFile(String chat) {
        return new File(dir(chat), "journal.json");
    }

    private final File blobs(String chat) {
        return new File(dir(chat), "files");
    }

    private final Map<String, Object> loadJ(String chat) {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            CheckpointStore $this$loadJ_u24lambda_u240 = this;
            objM8116constructorimpl = Result.m8116constructorimpl(FileUtil.INSTANCE.readJsonObj($this$loadJ_u24lambda_u240.journalFile(chat)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        Map<String, Object> map = (Map) objM8116constructorimpl;
        return map == null ? JsonKt.jobj(TuplesKt.to("version", 1L), TuplesKt.to("chat_id", chat), TuplesKt.to("entries", new ArrayList())) : map;
    }

    private final List<Object> entries(Map<String, Object> j) {
        List<Object> listArr = JsonKt.arr(j, "entries");
        if (listArr != null) {
            return listArr;
        }
        ArrayList arrayList = new ArrayList();
        j.put("entries", arrayList);
        return arrayList;
    }

    private final long chatBytes(String chat) {
        File[] fileArrListFiles = blobs(chat).listFiles();
        long length = 0;
        if (fileArrListFiles != null) {
            for (File it : fileArrListFiles) {
                length += it.length();
            }
        }
        return length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.ai.SnapshotResult snapshot(java.lang.String r32, java.lang.String r33, java.lang.String r34, java.util.List<? extends java.io.File> r35) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.CheckpointStore.snapshot(java.lang.String, java.lang.String, java.lang.String, java.util.List):com.pymcl.ai.SnapshotResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean snapshot$lambda$0$2(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isFile();
    }

    public final boolean hasEntries(String chat, String turnId) {
        boolean z;
        Intrinsics.checkNotNullParameter(chat, "chat");
        Intrinsics.checkNotNullParameter(turnId, "turnId");
        synchronized (this) {
            Iterable $this$any$iv = JsonKt.objs(entries(loadJ(chat)));
            z = false;
            if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
                Iterator it = $this$any$iv.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object element$iv = it.next();
                    Map it2 = (Map) element$iv;
                    if (Intrinsics.areEqual(JsonKt.str(it2, "turn_id"), turnId)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02be A[Catch: all -> 0x055e, TryCatch #12 {, blocks: (B:5:0x0012, B:6:0x0031, B:8:0x0037, B:10:0x004b, B:11:0x004f, B:28:0x00a7, B:30:0x00ab, B:31:0x00c3, B:33:0x00c9, B:35:0x00e3, B:42:0x00f3, B:44:0x00fc, B:46:0x011a, B:56:0x015e, B:57:0x016e, B:59:0x0174, B:61:0x018c, B:62:0x01bc, B:64:0x01c2, B:67:0x01e0, B:68:0x01ea, B:69:0x01fe, B:71:0x0204, B:74:0x021d, B:76:0x0236, B:78:0x023c, B:79:0x0247, B:81:0x024d, B:83:0x025f, B:85:0x026b, B:87:0x0271, B:88:0x027e, B:92:0x0294, B:94:0x029a, B:96:0x02a2, B:98:0x02a8, B:108:0x02be, B:110:0x02cb, B:122:0x0339, B:113:0x02db, B:114:0x02df, B:116:0x02e5, B:130:0x0393, B:131:0x03a2, B:133:0x03a8, B:137:0x03cf, B:142:0x03de, B:144:0x03e4, B:146:0x03ea, B:152:0x0403, B:154:0x0409, B:156:0x040d, B:165:0x042e, B:168:0x0436, B:170:0x043a, B:172:0x0445, B:174:0x045a, B:175:0x0461, B:177:0x0467, B:182:0x047a, B:184:0x047f, B:193:0x04a1, B:195:0x04a9, B:200:0x04b4, B:208:0x04cd, B:210:0x04da, B:228:0x052d, B:49:0x0129, B:50:0x012d, B:52:0x0133, B:232:0x0555, B:14:0x0061, B:16:0x0070, B:18:0x0077, B:19:0x007d, B:21:0x0083, B:23:0x0092, B:25:0x0099), top: B:262:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033d  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.ai.RollbackResult rollback(java.lang.String r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.CheckpointStore.rollback(java.lang.String, java.lang.String):com.pymcl.ai.RollbackResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rollback$lambda$0$9(long $first, Object o) {
        Long lM8043long;
        Map<String, Object> mapO = JsonKt.o(o);
        return ((mapO == null || (lM8043long = JsonKt.m8043long(mapO, "seq")) == null) ? 0L : lM8043long.longValue()) >= $first;
    }

    public final boolean deleteChat(String chat) {
        boolean zDeleteRecursively;
        Intrinsics.checkNotNullParameter(chat, "chat");
        synchronized (this) {
            zDeleteRecursively = FilesKt.deleteRecursively(dir(chat));
        }
        return zDeleteRecursively;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void pruneBlobs(java.lang.String r29, java.util.Map<java.lang.String, java.lang.Object> r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            java.util.List r2 = r0.entries(r1)
            java.util.List r2 = com.pymcl.core.util.JsonKt.objs(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L1c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L98
            java.lang.Object r8 = r7.next()
            r10 = r8
            java.util.Map r10 = (java.util.Map) r10
            r11 = 0
            java.lang.String r12 = "paths"
            java.util.List r12 = com.pymcl.core.util.JsonKt.arr(r10, r12)
            java.util.List r12 = com.pymcl.core.util.JsonKt.objs(r12)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            r13 = 0
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Collection r14 = (java.util.Collection) r14
            r15 = r12
            r16 = 0
            r17 = r15
            r18 = 0
            java.util.Iterator r19 = r17.iterator()
        L49:
            boolean r20 = r19.hasNext()
            if (r20 == 0) goto L88
            java.lang.Object r20 = r19.next()
            r21 = r20
            r22 = 0
            r9 = r21
            java.util.Map r9 = (java.util.Map) r9
            r23 = 0
            java.lang.String r0 = "sha256"
            java.lang.String r0 = com.pymcl.core.util.JsonKt.str(r9, r0)
            r24 = 0
            if (r0 == 0) goto L7d
            r25 = r0
            r26 = 0
            r27 = r25
            java.lang.CharSequence r27 = (java.lang.CharSequence) r27
            int r27 = r27.length()
            if (r27 <= 0) goto L78
            r27 = 1
            goto L7a
        L78:
            r27 = 0
        L7a:
            if (r27 == 0) goto L7d
            goto L7f
        L7d:
            r0 = r24
        L7f:
            if (r0 == 0) goto L85
            r9 = 0
            r14.add(r0)
        L85:
            r0 = r28
            goto L49
        L88:
            r0 = r14
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt.addAll(r4, r0)
            r0 = r28
            goto L1c
        L98:
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.CollectionsKt.toSet(r0)
            java.io.File r2 = r28.blobs(r29)
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto Ld5
            r3 = 0
            int r4 = r2.length
            r9 = 0
        Lb0:
            if (r9 >= r4) goto Ld4
            r5 = r2[r9]
            r6 = r5
            r7 = 0
            java.lang.String r8 = r6.getName()
            java.lang.String r10 = "getName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
            java.lang.String r10 = ".bin"
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r8 = kotlin.text.StringsKt.removeSuffix(r8, r10)
            boolean r8 = r0.contains(r8)
            if (r8 != 0) goto Ld0
            r6.delete()
        Ld0:
            int r9 = r9 + 1
            goto Lb0
        Ld4:
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.CheckpointStore.pruneBlobs(java.lang.String, java.util.Map):void");
    }

    public final void gc() {
        File[] fileArrListFiles = this.root.listFiles();
        if (fileArrListFiles != null) {
            Collection destination$iv$iv = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    destination$iv$iv.add(file);
                }
            }
            Iterable $this$sortedByDescending$iv = CollectionsKt.sortedWith((List) destination$iv$iv, new Comparator() { // from class: com.pymcl.ai.CheckpointStore$gc$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    File it = (File) t2;
                    File it2 = (File) t;
                    return ComparisonsKt.compareValues(Long.valueOf(new File(it, "journal.json").lastModified()), Long.valueOf(new File(it2, "journal.json").lastModified()));
                }
            });
            if ($this$sortedByDescending$iv == null) {
                return;
            }
            Iterable $this$forEach$iv = CollectionsKt.drop($this$sortedByDescending$iv, 20);
            for (Object element$iv : $this$forEach$iv) {
                File it = (File) element$iv;
                Intrinsics.checkNotNull(it);
                FilesKt.deleteRecursively(it);
            }
        }
    }
}
