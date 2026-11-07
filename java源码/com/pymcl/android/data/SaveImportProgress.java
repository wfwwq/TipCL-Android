package com.pymcl.android.data;

import com.pymcl.android.data.SaveImportProgress;
import com.pymcl.core.instance.SaveImport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.concurrent.AbstractCircuitBreaker;

/* compiled from: SaveImportProgress.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002'(B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J8\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ8\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ7\u0010 \u001a\u00020!2*\u0010\u001d\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020!0#0\"\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020!0#¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020!Ê\u0001\f\b*\u0012\b\b+\u0012\u0004\b\u0003\u0010\u0002¨\u0006)"}, d2 = {"Lcom/pymcl/android/data/SaveImportProgress;", "", "<init>", "()V", "safeTarget", "Ljava/io/File;", "staging", "rel", "", "finish", "Lcom/pymcl/core/instance/SaveImport$Result;", "savesDir", "plan", "Lcom/pymcl/core/instance/SaveImport$Plan;", "files", "", "bytes", "", "importZip", "archiveName", AbstractCircuitBreaker.PROPERTY_NAME, "Lkotlin/Function0;", "Ljava/io/InputStream;", "limits", "Lcom/pymcl/core/instance/SaveImport$Limits;", "cb", "Lcom/pymcl/android/data/SaveImportProgress$Cb;", "importTree", "folderName", "entries", "", "Lcom/pymcl/core/instance/SaveImport$TreeEntry;", "zipOf", "", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)[B", "streamOf", "data", "Cb", "Cancelled", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class SaveImportProgress {
    public static final int $stable = 0;
    public static final SaveImportProgress INSTANCE = new SaveImportProgress();

    private SaveImportProgress() {
    }

    /* compiled from: SaveImportProgress.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B9\u0012 \b\u0002\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR)\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/pymcl/android/data/SaveImportProgress$Cb;", "", "onProgress", "Lkotlin/Function3;", "", "", "", "isCancelled", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;)V", "getOnProgress", "()Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function0;", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Cb {
        public static final int $stable = 0;
        private final Function0<Boolean> isCancelled;
        private final Function3<Integer, Integer, Long, Unit> onProgress;

        /* JADX WARN: Multi-variable type inference failed */
        public Cb() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Cb(Function3<? super Integer, ? super Integer, ? super Long, Unit> onProgress, Function0<Boolean> isCancelled) {
            Intrinsics.checkNotNullParameter(onProgress, "onProgress");
            Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
            this.onProgress = onProgress;
            this.isCancelled = isCancelled;
        }

        public /* synthetic */ Cb(Function3 function3, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Function3() { // from class: com.pymcl.android.data.SaveImportProgress$Cb$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SaveImportProgress.Cb._init_$lambda$0(((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Long) obj3).longValue());
                }
            } : function3, (i & 2) != 0 ? new Function0() { // from class: com.pymcl.android.data.SaveImportProgress$Cb$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(SaveImportProgress.Cb._init_$lambda$1());
                }
            } : function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(int i, int i2, long j) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean _init_$lambda$1() {
            return false;
        }

        public final Function3<Integer, Integer, Long, Unit> getOnProgress() {
            return this.onProgress;
        }

        public final Function0<Boolean> isCancelled() {
            return this.isCancelled;
        }
    }

    /* compiled from: SaveImportProgress.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0004"}, d2 = {"Lcom/pymcl/android/data/SaveImportProgress$Cancelled;", "Ljava/util/concurrent/CancellationException;", "<init>", "()V", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Cancelled extends CancellationException {
        public static final int $stable = 8;

        public Cancelled() {
            super("已取消导入");
        }
    }

    private final File safeTarget(File staging, String rel) throws IOException {
        File out = new File(staging, rel).getCanonicalFile();
        String path = out.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        if (!StringsKt.startsWith$default(path, staging.getCanonicalPath() + File.separator, false, 2, (Object) null)) {
            throw new IOException("压缩包里有越界路径: " + rel);
        }
        Intrinsics.checkNotNull(out);
        return out;
    }

    private final SaveImport.Result finish(File savesDir, File staging, SaveImport.Plan plan, int files, long bytes) throws IOException {
        Iterable iterableEmptyList;
        if (!new File(staging, "level.dat").isFile()) {
            throw new IOException("没有找到 level.dat，不是 Minecraft 存档");
        }
        String[] list = savesDir.list();
        if (list == null || (iterableEmptyList = ArraysKt.toList(list)) == null) {
            iterableEmptyList = CollectionsKt.emptyList();
        }
        Collection arrayList = new ArrayList();
        for (Object obj : iterableEmptyList) {
            String str = (String) obj;
            Intrinsics.checkNotNull(str);
            if (!StringsKt.startsWith$default(str, ".", false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        List existing = (List) arrayList;
        String name = SaveImport.INSTANCE.uniqueName(plan.getBaseName(), existing);
        if (!staging.renameTo(new File(savesDir, name))) {
            throw new IOException("导入失败：无法写入 " + name);
        }
        return new SaveImport.Result(name, files, bytes, !Intrinsics.areEqual(name, plan.getBaseName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SaveImport.Result importZip$default(SaveImportProgress saveImportProgress, File file, String str, Function0 function0, SaveImport.Limits limits, Cb cb, int i, Object obj) {
        if ((i & 8) != 0) {
            limits = new SaveImport.Limits(0, 0L, 3, null);
        }
        if ((i & 16) != 0) {
            cb = new Cb(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return saveImportProgress.importZip(file, str, function0, limits, cb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x03ac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02d0, code lost:
    
        r29 = r7;
        r7 = r19;
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02db, code lost:
    
        kotlin.io.CloseableKt.closeFinally(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02e4, code lost:
    
        if (r25.getTime() <= 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02e6, code lost:
    
        r0.setLastModified(r25.getTime());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02ed, code lost:
    
        r1.element++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f3, code lost:
    
        r1.element++;
        r42.getOnProgress().invoke(java.lang.Integer.valueOf(r1.element), java.lang.Integer.valueOf(r6), java.lang.Long.valueOf(r5.element));
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x044b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.instance.SaveImport.Result importZip(java.io.File r38, java.lang.String r39, kotlin.jvm.functions.Function0<? extends java.io.InputStream> r40, com.pymcl.core.instance.SaveImport.Limits r41, com.pymcl.android.data.SaveImportProgress.Cb r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.SaveImportProgress.importZip(java.io.File, java.lang.String, kotlin.jvm.functions.Function0, com.pymcl.core.instance.SaveImport$Limits, com.pymcl.android.data.SaveImportProgress$Cb):com.pymcl.core.instance.SaveImport$Result");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SaveImport.Result importTree$default(SaveImportProgress saveImportProgress, File file, String str, List list, SaveImport.Limits limits, Cb cb, int i, Object obj) {
        if ((i & 8) != 0) {
            limits = new SaveImport.Limits(0, 0L, 3, null);
        }
        if ((i & 16) != 0) {
            cb = new Cb(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return saveImportProgress.importTree(file, str, list, limits, cb);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.instance.SaveImport.Result importTree(java.io.File r33, java.lang.String r34, java.util.List<com.pymcl.core.instance.SaveImport.TreeEntry> r35, com.pymcl.core.instance.SaveImport.Limits r36, com.pymcl.android.data.SaveImportProgress.Cb r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.SaveImportProgress.importTree(java.io.File, java.lang.String, java.util.List, com.pymcl.core.instance.SaveImport$Limits, com.pymcl.android.data.SaveImportProgress$Cb):com.pymcl.core.instance.SaveImport$Result");
    }

    public final byte[] zipOf(Pair<String, byte[]>... entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(b);
        try {
            ZipOutputStream zipOutputStream2 = zipOutputStream;
            for (Pair<String, byte[]> pair : entries) {
                String strComponent1 = pair.component1();
                byte[] bArrComponent2 = pair.component2();
                zipOutputStream2.putNextEntry(new ZipEntry(strComponent1));
                zipOutputStream2.write(bArrComponent2);
                zipOutputStream2.closeEntry();
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipOutputStream, null);
            byte[] byteArray = b.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return byteArray;
        } finally {
        }
    }

    public final InputStream streamOf(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new ByteArrayInputStream(data);
    }
}
