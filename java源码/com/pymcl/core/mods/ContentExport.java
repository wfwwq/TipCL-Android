package com.pymcl.core.mods;

import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

/* compiled from: ContentExport.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ@\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0015J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/pymcl/core/mods/ContentExport;", "", "<init>", "()V", "BAD", "Lkotlin/text/Regex;", "defaultName", "", "kind", "instance", "version", "nowMs", "", "exportZip", "Lcom/pymcl/core/mods/ContentExport$Result;", "dir", "Ljava/io/File;", "names", "", "out", "onProgress", "Lkotlin/Function2;", "", "", "summary", "r", "Result", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ContentExport {
    public static final ContentExport INSTANCE = new ContentExport();
    private static final Regex BAD = new Regex("[\\\\/:*?\"<>|\\s]+");

    /* compiled from: ContentExport.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b0\u0005HÆ\u0003J?\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b0\u0005HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/pymcl/core/mods/ContentExport$Result;", "", "out", "Ljava/io/File;", SettingsProtocol.EXTRA_OK, "", "", "failed", "Lkotlin/Pair;", "<init>", "(Ljava/io/File;Ljava/util/List;Ljava/util/List;)V", "getOut", "()Ljava/io/File;", "getOk", "()Ljava/util/List;", "getFailed", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Result {
        private final List<Pair<String, String>> failed;
        private final List<String> ok;
        private final File out;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, File file, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                file = result.out;
            }
            if ((i & 2) != 0) {
                list = result.ok;
            }
            if ((i & 4) != 0) {
                list2 = result.failed;
            }
            return result.copy(file, list, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final File getOut() {
            return this.out;
        }

        public final List<String> component2() {
            return this.ok;
        }

        public final List<Pair<String, String>> component3() {
            return this.failed;
        }

        public final Result copy(File out, List<String> ok, List<Pair<String, String>> failed) {
            Intrinsics.checkNotNullParameter(out, "out");
            Intrinsics.checkNotNullParameter(ok, "ok");
            Intrinsics.checkNotNullParameter(failed, "failed");
            return new Result(out, ok, failed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.out, result.out) && Intrinsics.areEqual(this.ok, result.ok) && Intrinsics.areEqual(this.failed, result.failed);
        }

        public int hashCode() {
            return (((this.out.hashCode() * 31) + this.ok.hashCode()) * 31) + this.failed.hashCode();
        }

        public String toString() {
            return "Result(out=" + this.out + ", ok=" + this.ok + ", failed=" + this.failed + ")";
        }

        public Result(File out, List<String> ok, List<Pair<String, String>> failed) {
            Intrinsics.checkNotNullParameter(out, "out");
            Intrinsics.checkNotNullParameter(ok, "ok");
            Intrinsics.checkNotNullParameter(failed, "failed");
            this.out = out;
            this.ok = ok;
            this.failed = failed;
        }

        public final List<Pair<String, String>> getFailed() {
            return this.failed;
        }

        public final List<String> getOk() {
            return this.ok;
        }

        public final File getOut() {
            return this.out;
        }
    }

    private ContentExport() {
    }

    public final String defaultName(String kind, String instance, String version, long nowMs) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(version, "version");
        String ts = new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.ROOT).format(new Date(nowMs));
        Iterable $this$filter$iv = CollectionsKt.listOf((Object[]) new String[]{kind, instance, version});
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            if (!StringsKt.isBlank(it)) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default((List) destination$iv$iv, "-", null, null, 0, null, new Function1() { // from class: com.pymcl.core.mods.ContentExport$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContentExport.defaultName$lambda$1((String) obj);
            }
        }, 30, null);
        if (strJoinToString$default.length() == 0) {
            strJoinToString$default = "export";
        }
        return ((Object) strJoinToString$default) + "-" + ts + ".zip";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence defaultName$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.trim(BAD.replace(it, "_"), '_');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Result exportZip$default(ContentExport contentExport, File file, List list, File file2, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = new Function2() { // from class: com.pymcl.core.mods.ContentExport$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ContentExport.exportZip$lambda$0(((Float) obj2).floatValue(), (String) obj3);
                }
            };
        }
        return contentExport.exportZip(file, list, file2, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit exportZip$lambda$0(float f, String str) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0290 A[Catch: all -> 0x02ee, TryCatch #3 {all -> 0x02ee, blocks: (B:60:0x01e3, B:91:0x0287, B:93:0x0290, B:94:0x0294, B:70:0x0208, B:71:0x020b, B:73:0x021e, B:75:0x0228, B:77:0x022e, B:78:0x024a, B:79:0x0251, B:80:0x025c, B:81:0x025d, B:82:0x026b, B:96:0x02ae), top: B:115:0x01e3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.mods.ContentExport.Result exportZip(java.io.File r33, java.util.List<java.lang.String> r34, java.io.File r35, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.String, kotlin.Unit> r36) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ContentExport.exportZip(java.io.File, java.util.List, java.io.File, kotlin.jvm.functions.Function2):com.pymcl.core.mods.ContentExport$Result");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean exportZip$lambda$1$0$1(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isFile();
    }

    public final String summary(Result r) {
        Intrinsics.checkNotNullParameter(r, "r");
        if (r.getFailed().isEmpty()) {
            return r.getOk().size() + " 个 → " + r.getOut().getName();
        }
        return "成功 " + r.getOk().size() + " 个，失败 " + r.getFailed().size() + " 个：\n\n" + CollectionsKt.joinToString$default(r.getFailed(), StringUtils.LF, null, null, 0, null, new Function1() { // from class: com.pymcl.core.mods.ContentExport$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContentExport.summary$lambda$0((Pair) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence summary$lambda$0(Pair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getFirst() + "：" + it.getSecond();
    }
}
