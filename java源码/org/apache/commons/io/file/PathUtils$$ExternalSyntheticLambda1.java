package org.apache.commons.io.file;

import java.net.URL;
import org.apache.commons.io.function.IOSupplier;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes24.dex */
public final /* synthetic */ class PathUtils$$ExternalSyntheticLambda1 implements IOSupplier {
    public final /* synthetic */ URL f$0;

    public /* synthetic */ PathUtils$$ExternalSyntheticLambda1(URL url) {
        this.f$0 = url;
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public final Object get() {
        return this.f$0.openStream();
    }
}
