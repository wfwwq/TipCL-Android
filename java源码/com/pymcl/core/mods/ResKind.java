package com.pymcl.core.mods;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.lwjgl.util.spvc.Spv;

/* compiled from: ModCatalog.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/pymcl/core/mods/ResKind;", "", "key", "", "mrType", "cfClass", "", "dir", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getMrType", "getCfClass", "()I", "getDir", "MOD", "MODPACK", "DATAPACK", "RESOURCE", "SHADER", "WORLD", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public enum ResKind {
    MOD("mod", "mod", 6, "mods"),
    MODPACK("modpack", "modpack", Spv.SpvCapabilityRayQueryProvisionalKHR, ""),
    DATAPACK("datapack", "datapack", 6945, "datapacks"),
    RESOURCE("resource", "resourcepack", 12, "resourcepacks"),
    SHADER("shader", "shader", 6552, "shaderpacks"),
    WORLD("world", null, 17, "saves");

    private final int cfClass;
    private final String dir;
    private final String key;
    private final String mrType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<ResKind> getEntries() {
        return $ENTRIES;
    }

    ResKind(String key, String mrType, int cfClass, String dir) {
        this.key = key;
        this.mrType = mrType;
        this.cfClass = cfClass;
        this.dir = dir;
    }

    public final int getCfClass() {
        return this.cfClass;
    }

    public final String getDir() {
        return this.dir;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getMrType() {
        return this.mrType;
    }

    /* compiled from: ModCatalog.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0015\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pymcl/core/mods/ResKind$Companion;", "", "<init>", "()V", "of", "Lcom/pymcl/core/mods/ResKind;", "key", "", "fromCfClass", "c", "", "(Ljava/lang/Integer;)Lcom/pymcl/core/mods/ResKind;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r0.equals("resource") == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r0.equals("resourcepack") == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        
            if (r0.equals("shader") == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        
            if (r0.equals("shaderpack") == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
        
            if (r0.equals("mods") == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
        
            if (r0.equals("mod") == false) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.pymcl.core.mods.ResKind of(java.lang.String r10) {
            /*
                r9 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.util.Locale r0 = java.util.Locale.ROOT
                java.lang.String r0 = r10.toLowerCase(r0)
                java.lang.String r1 = "toLowerCase(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                int r2 = r0.hashCode()
                switch(r2) {
                    case -1310695554: goto L4b;
                    case -903579675: goto L42;
                    case -383553753: goto L36;
                    case -341064690: goto L2d;
                    case 108290: goto L21;
                    case 3357105: goto L18;
                    default: goto L17;
                }
            L17:
                goto L57
            L18:
                java.lang.String r2 = "mods"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L2a
                goto L17
            L21:
                java.lang.String r2 = "mod"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L2a
                goto L17
            L2a:
                com.pymcl.core.mods.ResKind r0 = com.pymcl.core.mods.ResKind.MOD
                goto L8c
            L2d:
                java.lang.String r2 = "resource"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L3f
                goto L17
            L36:
                java.lang.String r2 = "resourcepack"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L3f
                goto L17
            L3f:
                com.pymcl.core.mods.ResKind r0 = com.pymcl.core.mods.ResKind.RESOURCE
                goto L8c
            L42:
                java.lang.String r2 = "shader"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L54
                goto L17
            L4b:
                java.lang.String r2 = "shaderpack"
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L54
                goto L17
            L54:
                com.pymcl.core.mods.ResKind r0 = com.pymcl.core.mods.ResKind.SHADER
                goto L8c
            L57:
                kotlin.enums.EnumEntries r0 = com.pymcl.core.mods.ResKind.getEntries()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r2 = 0
                java.util.Iterator r3 = r0.iterator()
            L62:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L84
                java.lang.Object r4 = r3.next()
                r5 = r4
                com.pymcl.core.mods.ResKind r5 = (com.pymcl.core.mods.ResKind) r5
                r6 = 0
                java.lang.String r7 = r5.getKey()
                java.util.Locale r8 = java.util.Locale.ROOT
                java.lang.String r8 = r10.toLowerCase(r8)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
                if (r5 == 0) goto L62
                goto L85
            L84:
                r4 = 0
            L85:
                r0 = r4
                com.pymcl.core.mods.ResKind r0 = (com.pymcl.core.mods.ResKind) r0
                if (r0 != 0) goto L8c
                com.pymcl.core.mods.ResKind r0 = com.pymcl.core.mods.ResKind.MOD
            L8c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ResKind.Companion.of(java.lang.String):com.pymcl.core.mods.ResKind");
        }

        public final ResKind fromCfClass(Integer c) {
            Object element$iv;
            Iterable $this$firstOrNull$iv = ResKind.getEntries();
            Iterator<ResKind> it = $this$firstOrNull$iv.iterator();
            while (true) {
                if (it.hasNext()) {
                    element$iv = it.next();
                    ResKind it2 = (ResKind) element$iv;
                    if (c != null && it2.getCfClass() == c.intValue()) {
                        break;
                    }
                } else {
                    element$iv = null;
                    break;
                }
            }
            ResKind resKind = (ResKind) element$iv;
            return resKind == null ? ResKind.MOD : resKind;
        }
    }
}
