package com.pymcl.core.mods;

import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModConflicts.kt */
@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ModMetaDeep$read$1$1$1 extends FunctionReferenceImpl implements Function1<String, byte[]> {
    final /* synthetic */ ZipFile $z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModMetaDeep$read$1$1$1(ZipFile zipFile) {
        super(1, Intrinsics.Kotlin.class, "bytes", "read$lambda$0$0$bytes(Ljava/util/zip/ZipFile;Ljava/lang/String;)[B", 0);
        this.$z = zipFile;
    }

    @Override // kotlin.jvm.functions.Function1
    public final byte[] invoke(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ModMetaDeep.read$lambda$0$0$bytes(this.$z, p0);
    }
}
