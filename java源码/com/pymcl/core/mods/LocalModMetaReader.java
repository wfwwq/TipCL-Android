package com.pymcl.core.mods;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ModTools.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/pymcl/core/mods/LocalModMetaReader;", "", "<init>", "()V", "read", "Lcom/pymcl/core/mods/LocalModMeta;", "f", "Ljava/io/File;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LocalModMetaReader {
    public static final LocalModMetaReader INSTANCE = new LocalModMetaReader();

    private LocalModMetaReader() {
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.core.mods.LocalModMeta read(java.io.File r18) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.mods.LocalModMetaReader.read(java.io.File):com.pymcl.core.mods.LocalModMeta");
    }

    private static final String read$lambda$0$0$text(ZipFile $z, String n) throws IOException {
        ZipEntry it = $z.getEntry(n);
        if (it == null) {
            return null;
        }
        InputStream inputStream = $z.getInputStream(it);
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return new String(ByteStreamsKt.readBytes(inputStream), Charsets.UTF_8);
    }

    private static final String read$lambda$0$0$3$v(String $t, String k) {
        List<String> groupValues;
        String str;
        MatchResult matchResultFind$default = Regex.find$default(new Regex("(?m)^\\s*" + k + "\\s*=\\s*[\"']([^\"']*)[\"']"), StringsKt.substringAfter($t, "[[mods]]", $t), 0, 2, null);
        return (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null || (str = groupValues.get(1)) == null) ? "" : str;
    }
}
