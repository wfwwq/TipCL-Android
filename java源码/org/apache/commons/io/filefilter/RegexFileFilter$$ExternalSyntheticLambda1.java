package org.apache.commons.io.filefilter;

import java.io.Serializable;
import java.nio.file.Path;
import java.util.Objects;
import java.util.function.Function;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes24.dex */
public final /* synthetic */ class RegexFileFilter$$ExternalSyntheticLambda1 implements Function, Serializable {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Objects.toString(((Path) obj).getFileName(), null);
    }
}
