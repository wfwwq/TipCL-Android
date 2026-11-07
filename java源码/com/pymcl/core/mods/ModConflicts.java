package com.pymcl.core.mods;

import androidx.core.os.EnvironmentCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModConflicts.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006J2\u0010\u0010\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006J2\u0010\u0013\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0016\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/pymcl/core/mods/ModConflicts;", "", "<init>", "()V", "BUILTIN", "", "", "ALIAS", "", "scanDir", "Lcom/pymcl/core/mods/ConflictReport;", "dir", "Ljava/io/File;", "mc", "loader", "loaderVersion", "scan", "jars", "", "analyze", "mods", "Lcom/pymcl/core/mods/ModMeta;", "matchesLoader", "", "id", "loaderCompatible", "modLoader", "instanceLoader", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ModConflicts {
    public static final ModConflicts INSTANCE = new ModConflicts();
    private static final Set<String> BUILTIN = SetsKt.setOf((Object[]) new String[]{"minecraft", "java", "fabricloader", "fabric-loader", "quilt_loader", "quilt_base", "forge", "neoforge", "fml", "javafml", "mixinextras"});
    private static final Map<String, String> ALIAS = MapsKt.mapOf(TuplesKt.to("fabric", "fabric-api"), TuplesKt.to("quilted_fabric_api", "fabric-api"));

    private ModConflicts() {
    }

    public static /* synthetic */ ConflictReport scanDir$default(ModConflicts modConflicts, File file, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        return modConflicts.scanDir(file, str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.mods.ConflictReport scanDir(java.io.File r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r18 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "dir"
            r4 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "mc"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "loader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "loaderVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.File[] r3 = r4.listFiles()
            if (r3 == 0) goto L80
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r3
            r8 = 0
            int r9 = r7.length
            r11 = 0
        L2e:
            if (r11 >= r9) goto L68
            r12 = r7[r11]
            r13 = r12
            r14 = 0
            boolean r15 = r13.isFile()
            if (r15 == 0) goto L54
            java.lang.String r15 = r13.getName()
            java.lang.String r10 = "getName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r10)
            r10 = 2
            r16 = r3
            r3 = 0
            java.lang.String r4 = ".jar"
            r17 = r5
            r5 = 0
            boolean r3 = kotlin.text.StringsKt.endsWith$default(r15, r4, r5, r10, r3)
            if (r3 == 0) goto L59
            r3 = 1
            goto L5a
        L54:
            r16 = r3
            r17 = r5
            r5 = 0
        L59:
            r3 = r5
        L5a:
            if (r3 == 0) goto L5f
            r6.add(r12)
        L5f:
            int r11 = r11 + 1
            r4 = r19
            r3 = r16
            r5 = r17
            goto L2e
        L68:
            r16 = r3
            r17 = r5
            r3 = r6
            java.util.List r3 = (java.util.List) r3
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            com.pymcl.core.mods.ModConflicts$scanDir$$inlined$sortedBy$1 r5 = new com.pymcl.core.mods.ModConflicts$scanDir$$inlined$sortedBy$1
            r5.<init>()
            java.util.Comparator r5 = (java.util.Comparator) r5
            java.util.List r3 = kotlin.collections.CollectionsKt.sortedWith(r3, r5)
            if (r3 != 0) goto L84
        L80:
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L84:
            r4 = r18
            com.pymcl.core.mods.ConflictReport r3 = r4.scan(r3, r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModConflicts.scanDir(java.io.File, java.lang.String, java.lang.String, java.lang.String):com.pymcl.core.mods.ConflictReport");
    }

    public static /* synthetic */ ConflictReport scan$default(ModConflicts modConflicts, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        return modConflicts.scan(list, str, str2, str3);
    }

    public final ConflictReport scan(List<? extends File> jars, String mc, String loader, String loaderVersion) {
        Intrinsics.checkNotNullParameter(jars, "jars");
        Intrinsics.checkNotNullParameter(mc, "mc");
        Intrinsics.checkNotNullParameter(loader, "loader");
        Intrinsics.checkNotNullParameter(loaderVersion, "loaderVersion");
        List<? extends File> $this$flatMap$iv = jars;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$flatMap$iv) {
            File f = (File) element$iv$iv;
            List<ModMeta> listListOf = ModMetaDeep.INSTANCE.read(f);
            if (listListOf.isEmpty()) {
                String name = f.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                listListOf = CollectionsKt.listOf(new ModMeta("", "", "", EnvironmentCompat.MEDIA_UNKNOWN, name, null, null, null, 224, null));
            }
            List<ModMeta> list$iv$iv = listListOf;
            CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
        }
        return analyze((List) destination$iv$iv, mc, loader, loaderVersion);
    }

    public static /* synthetic */ ConflictReport analyze$default(ModConflicts modConflicts, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        return modConflicts.analyze(list, str, str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.mods.ConflictReport analyze(java.util.List<com.pymcl.core.mods.ModMeta> r41, java.lang.String r42, java.lang.String r43, java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 1906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModConflicts.analyze(java.util.List, java.lang.String, java.lang.String, java.lang.String):com.pymcl.core.mods.ConflictReport");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r8.equals("forge") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r8.equals("fml") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r8.equals("fabricloader") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r8.equals("fabric-loader") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r8.equals("quilt_loader") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r8.equals("javafml") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r8.equals("neoforge") == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String analyze$builtinVersion(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            java.lang.String r1 = ""
            r2 = 0
            switch(r0) {
                case -1819863261: goto L6a;
                case -1560580731: goto L61;
                case -1040676293: goto L58;
                case -721429256: goto L4f;
                case 101509: goto L46;
                case 3254818: goto L3c;
                case 97618791: goto L33;
                case 554128932: goto L2a;
                case 695073197: goto L1e;
                case 1154621647: goto L15;
                case 1334376643: goto Lc;
                default: goto La;
            }
        La:
            goto L95
        Lc:
            java.lang.String r0 = "quilt_base"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L45
            goto La
        L15:
            java.lang.String r0 = "neoforge"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L73
            goto La
        L1e:
            java.lang.String r0 = "minecraft"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L27
            goto La
        L27:
            r1 = r5
            goto L96
        L2a:
            java.lang.String r0 = "mixinextras"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L45
            goto La
        L33:
            java.lang.String r0 = "forge"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L73
            goto La
        L3c:
            java.lang.String r0 = "java"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L45
            goto La
        L45:
            goto L96
        L46:
            java.lang.String r0 = "fml"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L73
            goto La
        L4f:
            java.lang.String r0 = "fabricloader"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L73
            goto La
        L58:
            java.lang.String r0 = "fabric-loader"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L73
            goto La
        L61:
            java.lang.String r0 = "quilt_loader"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L73
            goto La
        L6a:
            java.lang.String r0 = "javafml"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L73
            goto La
        L73:
            r0 = r6
            r3 = 0
            com.pymcl.core.mods.ModConflicts r4 = com.pymcl.core.mods.ModConflicts.INSTANCE
            boolean r0 = r4.matchesLoader(r8, r7)
            if (r0 == 0) goto L7f
            r0 = r6
            goto L80
        L7f:
            r0 = r2
        L80:
            if (r0 != 0) goto L93
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L8d
            r0 = 1
            goto L8e
        L8d:
            r0 = 0
        L8e:
            if (r0 == 0) goto L91
            goto L96
        L91:
            r1 = r2
            goto L96
        L93:
            r1 = r0
            goto L96
        L95:
            r1 = r2
        L96:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModConflicts.analyze$builtinVersion(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence analyze$lambda$7$0(ModMeta it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getFile() + "(" + it.getVersion() + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence analyze$lambda$7$1(ModMeta it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getFile();
    }

    private final boolean matchesLoader(String id, String loader) {
        switch (id.hashCode()) {
            case -1819863261:
                if (!id.equals("javafml")) {
                    return false;
                }
                return Intrinsics.areEqual(loader, "forge");
            case -1560580731:
                if (id.equals("quilt_loader")) {
                    return Intrinsics.areEqual(loader, "quilt");
                }
                return false;
            case -1040676293:
                if (!id.equals("fabric-loader")) {
                    return false;
                }
                return !Intrinsics.areEqual(loader, "fabric") || Intrinsics.areEqual(loader, "quilt");
            case -721429256:
                if (!id.equals("fabricloader")) {
                    return false;
                }
                if (Intrinsics.areEqual(loader, "fabric")) {
                    break;
                }
            case 101509:
                if (!id.equals("fml")) {
                    return false;
                }
                return Intrinsics.areEqual(loader, "forge");
            case 97618791:
                if (!id.equals("forge")) {
                    return false;
                }
                return Intrinsics.areEqual(loader, "forge");
            case 1154621647:
                if (id.equals("neoforge")) {
                    return Intrinsics.areEqual(loader, "neoforge");
                }
                return false;
            default:
                return false;
        }
    }

    public final boolean loaderCompatible(String modLoader, String instanceLoader) {
        Intrinsics.checkNotNullParameter(modLoader, "modLoader");
        Intrinsics.checkNotNullParameter(instanceLoader, "instanceLoader");
        return Intrinsics.areEqual(modLoader, EnvironmentCompat.MEDIA_UNKNOWN) || Intrinsics.areEqual(modLoader, instanceLoader) || (Intrinsics.areEqual(instanceLoader, "quilt") && Intrinsics.areEqual(modLoader, "fabric")) || (Intrinsics.areEqual(instanceLoader, "neoforge") && Intrinsics.areEqual(modLoader, "forge"));
    }
}
