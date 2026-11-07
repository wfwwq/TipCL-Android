package org.tukaani.xz;

import java.io.InputStream;

/* loaded from: classes24.dex */
interface FilterDecoder extends FilterCoder {
    InputStream getInputStream(InputStream inputStream, ArrayCache arrayCache);

    int getMemoryUsage();
}
