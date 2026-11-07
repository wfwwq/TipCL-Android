package org.apache.commons.compress.archivers.dump;

import java.io.IOException;

/* loaded from: classes24.dex */
public class DumpArchiveException extends IOException {
    private static final long serialVersionUID = 1;

    public DumpArchiveException() {
    }

    public DumpArchiveException(String msg) {
        super(msg);
    }

    public DumpArchiveException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public DumpArchiveException(Throwable cause) {
        super(cause);
    }
}
