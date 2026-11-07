package com.pymcl.core.mods;

import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: ModConflicts.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ>\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/pymcl/core/mods/ModMetaDeep;", "", "<init>", "()V", "MAX_DEPTH", "", "WANT", "", "", "read", "", "Lcom/pymcl/core/mods/ModMeta;", "f", "Ljava/io/File;", "parse", "file", "nestedIn", SettingsProtocol.GET, "Lkotlin/Function1;", "", "depth", "readEntries", "", "ins", "Ljava/io/InputStream;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ModMetaDeep {
    private static final int MAX_DEPTH = 3;
    public static final ModMetaDeep INSTANCE = new ModMetaDeep();
    private static final Set<String> WANT = SetsKt.setOf((Object[]) new String[]{"fabric.mod.json", "quilt.mod.json", "META-INF/mods.toml", "META-INF/neoforge.mods.toml", "META-INF/MANIFEST.MF"});

    private ModMetaDeep() {
    }

    public final List<ModMeta> read(File f) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(f, "f");
        try {
            Result.Companion companion = Result.INSTANCE;
            ModMetaDeep $this$read_u24lambda_u240 = this;
            ZipFile zipFile = new ZipFile(f);
            try {
                ZipFile z = zipFile;
                String name = f.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                List<ModMeta> list = $this$read_u24lambda_u240.parse(name, null, new ModMetaDeep$read$1$1$1(z), 0);
                CloseableKt.closeFinally(zipFile, null);
                objM8116constructorimpl = Result.m8116constructorimpl(list);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        List listEmptyList = CollectionsKt.emptyList();
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = listEmptyList;
        }
        return (List) objM8116constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] read$lambda$0$0$bytes(ZipFile $z, String n) throws IOException {
        ZipEntry e = $z.getEntry(n);
        if (e == null) {
            return null;
        }
        InputStream inputStream = $z.getInputStream(e);
        try {
            InputStream it = inputStream;
            Intrinsics.checkNotNull(it);
            byte[] bytes = ByteStreamsKt.readBytes(it);
            CloseableKt.closeFinally(inputStream, null);
            return bytes;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStream, th);
                throw th2;
            }
        }
    }

    private static final String parse$text(Function1<? super String, byte[]> function1, String n) {
        byte[] bArrInvoke = function1.invoke(n);
        if (bArrInvoke != null) {
            return new String(bArrInvoke, Charsets.UTF_8);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.pymcl.core.mods.ModMeta> parse(java.lang.String r49, java.lang.String r50, kotlin.jvm.functions.Function1<? super java.lang.String, byte[]> r51, int r52) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModMetaDeep.parse(java.lang.String, java.lang.String, kotlin.jvm.functions.Function1, int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit parse$lambda$1$quiltDeps(java.util.List<com.pymcl.core.mods.ModDep> r16, java.util.List<java.lang.Object> r17, java.lang.String r18) {
        /*
            r5 = r18
            if (r17 == 0) goto L8c
            r8 = r17
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r9 = 0
            java.util.Iterator r10 = r8.iterator()
        Ld:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r11 = r10.next()
            r12 = r11
            r13 = 0
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "depends"
            if (r0 == 0) goto L3b
            r14 = r16
            java.util.Collection r14 = (java.util.Collection) r14
            com.pymcl.core.mods.ModDep r0 = new com.pymcl.core.mods.ModDep
            r2 = r12
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            r6 = 8
            r7 = 0
            r1 = r2
            java.lang.String r2 = "*"
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.add(r0)
            goto L84
        L3b:
            boolean r0 = r12 instanceof java.util.Map
            if (r0 == 0) goto L84
            java.util.Map r0 = com.pymcl.core.util.JsonKt.o(r12)
            if (r0 != 0) goto L46
            goto L85
        L46:
            r14 = r0
            r15 = r16
            java.util.Collection r15 = (java.util.Collection) r15
            java.lang.String r0 = "id"
            java.lang.String r0 = com.pymcl.core.util.JsonKt.str(r14, r0)
            if (r0 != 0) goto L54
            goto L85
        L54:
            java.lang.String r2 = "versions"
            java.lang.Object r2 = r14.get(r2)
            if (r2 != 0) goto L5e
            java.lang.String r2 = "*"
        L5e:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r1 == 0) goto L76
            java.lang.String r1 = "optional"
            java.lang.Boolean r1 = com.pymcl.core.util.JsonKt.bool(r14, r1)
            r3 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L76
            goto L77
        L76:
            r3 = 0
        L77:
            r1 = r0
            com.pymcl.core.mods.ModDep r0 = new com.pymcl.core.mods.ModDep
            r4 = 0
            r6 = 8
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r15.add(r0)
        L84:
        L85:
            r5 = r18
            goto Ld
        L88:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L8d
        L8c:
            r0 = 0
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.ModMetaDeep.parse$lambda$1$quiltDeps(java.util.List, java.util.List, java.lang.String):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] parse$lambda$4(Map $entries, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (byte[]) $entries.get(it);
    }

    private final Map<String, byte[]> readEntries(InputStream ins) {
        HashMap m = new HashMap();
        try {
            Result.Companion companion = Result.INSTANCE;
            ModMetaDeep modMetaDeep = this;
            ZipInputStream zipInputStream = new ZipInputStream(ins);
            try {
                ZipInputStream z = zipInputStream;
                while (true) {
                    ZipEntry e = z.getNextEntry();
                    if (e == null) {
                        break;
                    }
                    if (!e.isDirectory()) {
                        if (!WANT.contains(e.getName())) {
                            String name = e.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            if (StringsKt.endsWith$default(name, ".jar", false, 2, (Object) null) || Intrinsics.areEqual(e.getName(), "META-INF/jarjar/metadata.json")) {
                            }
                        }
                        m.put(e.getName(), ByteStreamsKt.readBytes(z));
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipInputStream, null);
                Result.m8116constructorimpl(Unit.INSTANCE);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return m;
    }
}
