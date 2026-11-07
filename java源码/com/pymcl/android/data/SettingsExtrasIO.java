package com.pymcl.android.data;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import com.pymcl.android.data.SettingsExtrasIO;
import com.pymcl.android.data.SettingsLogic;
import com.pymcl.android.ui.state.UiSettings;
import com.pymcl.core.config.ConfigStore;
import com.pymcl.core.instance.InstanceManager;
import com.pymcl.core.instance.ServerEntry;
import com.pymcl.core.instance.ServersStore;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsExtrasIO.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J$\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0006\u001a\u00020\u0007J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u000eÊ\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0002¨\u0006#"}, d2 = {"Lcom/pymcl/android/data/SettingsExtrasIO;", "", "<init>", "()V", "repo", "Lcom/pymcl/android/data/LauncherRepository;", "ctx", "Landroid/content/Context;", "save", "", "s", "Lcom/pymcl/android/ui/state/UiSettings;", "load", "totalMemMb", "", "serverStore", "Lcom/pymcl/core/instance/ServersStore;", "instance", "", "servers", "", "Lcom/pymcl/core/instance/ServerEntry;", "saveServers", "all", "instanceNames", "sessions", "Lcom/pymcl/android/data/SettingsExtrasIO$SessionRow;", "limit", "", "clearPlaytime", "importWallpaper", "uri", "Landroid/net/Uri;", "maxBytes", "SessionRow", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class SettingsExtrasIO {
    public static final int $stable = 0;
    public static final SettingsExtrasIO INSTANCE = new SettingsExtrasIO();

    private SettingsExtrasIO() {
    }

    private final LauncherRepository repo(Context ctx) {
        return LauncherRepository.INSTANCE.get(ctx);
    }

    public final void save(Context ctx, UiSettings s) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(s, "s");
        ConfigStore c = repo(ctx).getConfig();
        c.update(SettingsLogic.Extras.INSTANCE.toConfig(s, c.snapshot()));
    }

    public final UiSettings load(Context ctx, UiSettings s) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(s, "s");
        return SettingsLogic.Extras.applyFrom$default(SettingsLogic.Extras.INSTANCE, repo(ctx).getConfig().snapshot(), s, 0, 4, null);
    }

    public final long totalMemMb(Context ctx) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            Result.Companion companion = Result.INSTANCE;
            SettingsExtrasIO settingsExtrasIO = this;
            Object systemService = ctx.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            objM8116constructorimpl = Result.m8116constructorimpl(Long.valueOf(memoryInfo.totalMem / 1048576));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = 0L;
        }
        return ((Number) objM8116constructorimpl).longValue();
    }

    private final ServersStore serverStore(Context ctx, String instance) {
        LauncherRepository r = repo(ctx);
        ServersStore.Companion companion = ServersStore.INSTANCE;
        InstanceManager instances = r.getInstances();
        String str = instance;
        if (str.length() == 0) {
            str = null;
        }
        return ServersStore.Companion.forInstance$default(companion, instances.get(str), null, r.getConfig().string(SettingsLogic.Extras.ISOLATION_KEY), 2, null);
    }

    public final List<ServerEntry> servers(Context ctx, String instance) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(instance, "instance");
        return serverStore(ctx, instance).list();
    }

    public final void saveServers(Context ctx, String instance, List<ServerEntry> all) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(all, "all");
        serverStore(ctx, instance).save(all);
    }

    public final List<String> instanceNames(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        return repo(ctx).getInstances().list();
    }

    /* compiled from: SettingsExtrasIO.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/pymcl/android/data/SettingsExtrasIO$SessionRow;", "", "version", "", "startSec", "", "durationSec", "<init>", "(Ljava/lang/String;JJ)V", "getVersion", "()Ljava/lang/String;", "getStartSec", "()J", "getDurationSec", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SessionRow {
        public static final int $stable = 0;
        private final long durationSec;
        private final long startSec;
        private final String version;

        public static /* synthetic */ SessionRow copy$default(SessionRow sessionRow, String str, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionRow.version;
            }
            if ((i & 2) != 0) {
                j = sessionRow.startSec;
            }
            if ((i & 4) != 0) {
                j2 = sessionRow.durationSec;
            }
            return sessionRow.copy(str, j, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartSec() {
            return this.startSec;
        }

        /* renamed from: component3, reason: from getter */
        public final long getDurationSec() {
            return this.durationSec;
        }

        public final SessionRow copy(String version, long startSec, long durationSec) {
            Intrinsics.checkNotNullParameter(version, "version");
            return new SessionRow(version, startSec, durationSec);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionRow)) {
                return false;
            }
            SessionRow sessionRow = (SessionRow) other;
            return Intrinsics.areEqual(this.version, sessionRow.version) && this.startSec == sessionRow.startSec && this.durationSec == sessionRow.durationSec;
        }

        public int hashCode() {
            return (((this.version.hashCode() * 31) + Long.hashCode(this.startSec)) * 31) + Long.hashCode(this.durationSec);
        }

        public String toString() {
            return "SessionRow(version=" + this.version + ", startSec=" + this.startSec + ", durationSec=" + this.durationSec + ")";
        }

        public SessionRow(String version, long startSec, long durationSec) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.version = version;
            this.startSec = startSec;
            this.durationSec = durationSec;
        }

        public final long getDurationSec() {
            return this.durationSec;
        }

        public final long getStartSec() {
            return this.startSec;
        }

        public final String getVersion() {
            return this.version;
        }
    }

    public static /* synthetic */ List sessions$default(SettingsExtrasIO settingsExtrasIO, Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 10;
        }
        return settingsExtrasIO.sessions(context, str, i);
    }

    public final List<SessionRow> sessions(Context ctx, String instance, int limit) {
        List<Object> listArr;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(instance, "instance");
        Map<String, Object> mapObj = JsonKt.obj(repo(ctx).getPlaytime().all(), instance);
        Iterable iterableObjs = (mapObj == null || (listArr = JsonKt.arr(mapObj, "sessions")) == null) ? null : JsonKt.objs(listArr);
        if (iterableObjs == null) {
            iterableObjs = CollectionsKt.emptyList();
        }
        Iterable<Map> iterable = iterableObjs;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (Map map : iterable) {
            String str = JsonKt.str(map, "version");
            if (str == null) {
                str = "";
            }
            Long lM8043long = JsonKt.m8043long(map, "start");
            long jLongValue = 0;
            long jLongValue2 = lM8043long != null ? lM8043long.longValue() : 0L;
            Long lM8043long2 = JsonKt.m8043long(map, "duration");
            if (lM8043long2 != null) {
                jLongValue = lM8043long2.longValue();
            }
            arrayList.add(new SessionRow(str, jLongValue2, jLongValue));
        }
        return CollectionsKt.take(CollectionsKt.sortedWith((List) arrayList, new Comparator() { // from class: com.pymcl.android.data.SettingsExtrasIO$sessions$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SettingsExtrasIO.SessionRow) t2).getStartSec()), Long.valueOf(((SettingsExtrasIO.SessionRow) t).getStartSec()));
            }
        }), limit);
    }

    public final void clearPlaytime(Context ctx) throws IOException {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        File f = repo(ctx).getPaths().getPlaytimeFile();
        if (f.exists()) {
            File bak = new File(f.getParentFile(), f.getName() + ".bak");
            bak.delete();
            if (f.renameTo(bak) || f.delete()) {
                return;
            }
            throw new IOException("无法清空 " + f.getName());
        }
    }

    public static /* synthetic */ String importWallpaper$default(SettingsExtrasIO settingsExtrasIO, Context context, Uri uri, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 31457280;
        }
        return settingsExtrasIO.importWallpaper(context, uri, j);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v21 ??, still in use, count: 5, list:
          (r0v21 ?? I:com.github.caciocavallosilano.cacio.peer.CacioComponentPeer) from 0x00b8: INVOKE (r0v21 ?? I:com.github.caciocavallosilano.cacio.peer.CacioComponentPeer) DIRECT call: com.github.caciocavallosilano.cacio.peer.CacioComponentPeer.postInitSwingComponent():void A[MD:():void (m)]
          (r0v21 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)]) from 0x00c4: INVOKE 
          (r1v10 java.lang.String)
          (r0v21 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)])
         STATIC call: android.graphics.BitmapFactory.decodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap A[MD:(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap (c)]
          (r0v21 ?? I:android.graphics.BitmapFactory$Options A[D('$this$importWallpaper_u24lambda_u242\4' android.graphics.BitmapFactory$Options)]) from ?: CAST (android.graphics.BitmapFactory$Options) (r0v21 ?? I:android.graphics.BitmapFactory$Options A[D('$this$importWallpaper_u24lambda_u242\4' android.graphics.BitmapFactory$Options)])
          (r0v21 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)]) from ?: CAST (android.graphics.BitmapFactory$Options) (r0v21 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)])
          (r0v21 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)]) from ?: CAST (android.graphics.BitmapFactory$Options) (r0v21 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.graphics.BitmapFactory$Options, com.github.caciocavallosilano.cacio.peer.CacioComponentPeer] */
    public final java.lang.String importWallpaper(android.content.Context r19, android.net.Uri r20, long r21) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.data.SettingsExtrasIO.importWallpaper(android.content.Context, android.net.Uri, long):java.lang.String");
    }
}
