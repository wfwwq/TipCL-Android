package org.apache.commons.compress.changes;

import java.io.InputStream;
import java.util.Objects;
import org.apache.commons.compress.archivers.ArchiveEntry;

/* loaded from: classes24.dex */
final class Change<E extends ArchiveEntry> {
    private final E entry;
    private final InputStream inputStream;
    private final boolean replaceMode;
    private final String targetFileName;
    private final ChangeType type;

    enum ChangeType {
        DELETE,
        ADD,
        MOVE,
        DELETE_DIR
    }

    Change(E archiveEntry, InputStream inputStream, boolean replace) {
        this.entry = (E) Objects.requireNonNull(archiveEntry, "archiveEntry");
        this.inputStream = (InputStream) Objects.requireNonNull(inputStream, "inputStream");
        this.type = ChangeType.ADD;
        this.targetFileName = null;
        this.replaceMode = replace;
    }

    Change(String fileName, ChangeType type) {
        this.targetFileName = (String) Objects.requireNonNull(fileName, "fileName");
        this.type = type;
        this.inputStream = null;
        this.entry = null;
        this.replaceMode = true;
    }

    E getEntry() {
        return this.entry;
    }

    InputStream getInputStream() {
        return this.inputStream;
    }

    String getTargetFileName() {
        return this.targetFileName;
    }

    ChangeType getType() {
        return this.type;
    }

    boolean isReplaceMode() {
        return this.replaceMode;
    }
}
