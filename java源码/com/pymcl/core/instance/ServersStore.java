package com.pymcl.core.instance;

import androidx.autofill.HintConstants;
import com.pymcl.core.util.FileUtil;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Playtime.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/pymcl/core/instance/ServersStore;", "", "gameDir", "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "json", "getJson", "()Ljava/io/File;", "dir", "getDir", "list", "", "Lcom/pymcl/core/instance/ServerEntry;", "save", "", "l", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ServersStore {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final File gameDir;

    /* compiled from: Playtime.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/pymcl/core/instance/ServersStore$Companion;", "", "<init>", "()V", "forInstance", "Lcom/pymcl/core/instance/ServersStore;", "inst", "Lcom/pymcl/core/instance/Instance;", "versionId", "", "defaultIsolation", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ServersStore forInstance$default(Companion companion, Instance instance, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = "all";
            }
            return companion.forInstance(instance, str, str2);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.pymcl.core.instance.ServersStore forInstance(com.pymcl.core.instance.Instance r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                java.lang.String r0 = "inst"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "defaultIsolation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                r0 = 0
                if (r7 == 0) goto L1d
                r1 = r7
                r2 = 0
                r3 = r1
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r3 = kotlin.text.StringsKt.isBlank(r3)
                if (r3 != 0) goto L1a
                r1 = r7
                goto L1b
            L1a:
                r1 = r0
            L1b:
                if (r1 != 0) goto L48
            L1d:
                java.util.Map r1 = r6.meta()
                java.lang.String r2 = "mc_version"
                java.lang.String r1 = com.pymcl.core.util.JsonKt.str(r1, r2)
                if (r1 == 0) goto L35
                r2 = r1
                r3 = 0
                r4 = r2
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r4 = kotlin.text.StringsKt.isBlank(r4)
                if (r4 != 0) goto L35
                r0 = r1
            L35:
                if (r0 != 0) goto L47
                java.util.List r0 = r6.versions()
                java.lang.Object r0 = kotlin.collections.CollectionsKt.singleOrNull(r0)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L48
                java.lang.String r1 = ""
                goto L48
            L47:
                r1 = r0
            L48:
                r0 = r1
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 != 0) goto L54
                r0 = 1
                goto L55
            L54:
                r0 = 0
            L55:
                if (r0 == 0) goto L5c
                java.io.File r0 = r6.getDir()
                goto L6d
            L5c:
                com.pymcl.core.instance.VersionSettings r0 = new com.pymcl.core.instance.VersionSettings
                java.io.File r2 = r6.versionDir(r1)
                r0.<init>(r2, r8)
                java.io.File r2 = r6.getDir()
                java.io.File r0 = r0.gameDir(r2)
            L6d:
                com.pymcl.core.instance.ServersStore r2 = new com.pymcl.core.instance.ServersStore
                r2.<init>(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.instance.ServersStore.Companion.forInstance(com.pymcl.core.instance.Instance, java.lang.String, java.lang.String):com.pymcl.core.instance.ServersStore");
        }
    }

    public ServersStore(File gameDir) {
        Intrinsics.checkNotNullParameter(gameDir, "gameDir");
        this.gameDir = gameDir;
    }

    private final File getJson() {
        return new File(this.gameDir, "servers.json");
    }

    /* renamed from: getDir, reason: from getter */
    public final File getGameDir() {
        return this.gameDir;
    }

    public final List<ServerEntry> list() {
        Object objM8116constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            ServersStore $this$list_u24lambda_u240 = this;
            objM8116constructorimpl = Result.m8116constructorimpl(JsonKt.objs(JsonKt.a(Json.INSTANCE.parse(FilesKt.readText$default($this$list_u24lambda_u240.getJson(), null, 1, null)))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList;
        }
        Iterable $this$map$iv = (Iterable) objM8116constructorimpl;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Map it = (Map) item$iv$iv;
            String str = JsonKt.str(it, HintConstants.AUTOFILL_HINT_NAME);
            if (str == null) {
                str = "";
            }
            String str2 = JsonKt.str(it, "ip");
            if (str2 == null) {
                str2 = "";
            }
            String str3 = JsonKt.str(it, "port");
            if (str3 == null) {
                str3 = "";
            }
            String str4 = JsonKt.str(it, "icon");
            if (str4 == null) {
                str4 = "";
            }
            String str5 = JsonKt.str(it, "description");
            String str6 = str5 != null ? str5 : "";
            Boolean bool = JsonKt.bool(it, "hidden");
            destination$iv$iv.add(new ServerEntry(str, str2, str3, str4, str6, bool != null ? bool.booleanValue() : false));
        }
        return (List) destination$iv$iv;
    }

    public final void save(List<ServerEntry> l) {
        Intrinsics.checkNotNullParameter(l, "l");
        FileUtil fileUtil = FileUtil.INSTANCE;
        File json = getJson();
        List<ServerEntry> $this$map$iv = l;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            ServerEntry it = (ServerEntry) item$iv$iv;
            destination$iv$iv.add(JsonKt.jobj(TuplesKt.to(HintConstants.AUTOFILL_HINT_NAME, it.getName()), TuplesKt.to("ip", it.getIp()), TuplesKt.to("port", it.getPort()), TuplesKt.to("icon", it.getIcon()), TuplesKt.to("description", it.getDescription()), TuplesKt.to("hidden", Boolean.valueOf(it.getHidden()))));
        }
        fileUtil.writeJson(json, CollectionsKt.toMutableList(destination$iv$iv));
        FileUtil fileUtil2 = FileUtil.INSTANCE;
        File file = new File(this.gameDir, "servers.dat");
        Nbt nbt = Nbt.INSTANCE;
        List<ServerEntry> $this$filter$iv = l;
        Collection destination$iv$iv2 = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            if (!((ServerEntry) element$iv$iv).getHidden()) {
                destination$iv$iv2.add(element$iv$iv);
            }
        }
        fileUtil2.writeAtomic(file, nbt.serversDat((List) destination$iv$iv2));
    }
}
