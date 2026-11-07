package org.apache.commons.compress.changes;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;
import org.apache.commons.compress.changes.Change;
import org.apache.commons.io.IOUtils;

/* loaded from: classes24.dex */
public class ChangeSetPerformer<I extends ArchiveInputStream<E>, O extends ArchiveOutputStream<E>, E extends ArchiveEntry> {
    private final Set<Change<E>> changes;

    private interface ArchiveEntryIterator<E extends ArchiveEntry> {
        InputStream getInputStream() throws IOException;

        boolean hasNext() throws IOException;

        E next();
    }

    private static final class ArchiveInputStreamIterator<E extends ArchiveEntry> implements ArchiveEntryIterator<E> {
        private final ArchiveInputStream<E> inputStream;
        private E next;

        ArchiveInputStreamIterator(ArchiveInputStream<E> inputStream) {
            this.inputStream = inputStream;
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public InputStream getInputStream() {
            return this.inputStream;
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public boolean hasNext() throws IOException {
            E e = (E) this.inputStream.getNextEntry();
            this.next = e;
            return e != null;
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public E next() {
            return this.next;
        }
    }

    private static final class ZipFileIterator implements ArchiveEntryIterator<ZipArchiveEntry> {
        private ZipArchiveEntry currentEntry;
        private final Enumeration<ZipArchiveEntry> nestedEnumeration;
        private final ZipFile zipFile;

        ZipFileIterator(ZipFile zipFile) {
            this.zipFile = zipFile;
            this.nestedEnumeration = zipFile.getEntriesInPhysicalOrder();
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public InputStream getInputStream() throws IOException {
            return this.zipFile.getInputStream(this.currentEntry);
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public boolean hasNext() {
            return this.nestedEnumeration.hasMoreElements();
        }

        @Override // org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator
        public ZipArchiveEntry next() {
            ZipArchiveEntry zipArchiveEntryNextElement = this.nestedEnumeration.nextElement();
            this.currentEntry = zipArchiveEntryNextElement;
            return zipArchiveEntryNextElement;
        }
    }

    public ChangeSetPerformer(ChangeSet<E> changeSet) {
        this.changes = changeSet.getChanges();
    }

    private void copyStream(InputStream inputStream, O outputStream, E archiveEntry) throws IOException {
        outputStream.putArchiveEntry(archiveEntry);
        IOUtils.copy(inputStream, outputStream);
        outputStream.closeArchiveEntry();
    }

    private boolean isDeletedLater(Set<Change<E>> workingSet, E entry) {
        String source = entry.getName();
        if (!workingSet.isEmpty()) {
            for (Change<E> change : workingSet) {
                Change.ChangeType type = change.getType();
                String target = change.getTargetFileName();
                if (type == Change.ChangeType.DELETE && source.equals(target)) {
                    return true;
                }
                if (type == Change.ChangeType.DELETE_DIR && source.startsWith(target + "/")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private ChangeSetResults perform(ArchiveEntryIterator<E> entryIterator, O outputStream) throws IOException {
        ChangeSetResults results = new ChangeSetResults();
        Set<Change<E>> workingSet = new LinkedHashSet<>(this.changes);
        Iterator<Change<E>> it = workingSet.iterator();
        while (it.hasNext()) {
            Change<E> change = it.next();
            if (change.getType() == Change.ChangeType.ADD && change.isReplaceMode()) {
                InputStream inputStream = change.getInputStream();
                copyStream(inputStream, outputStream, change.getEntry());
                it.remove();
                results.addedFromChangeSet(change.getEntry().getName());
            }
        }
        while (entryIterator.hasNext()) {
            ArchiveEntry next = entryIterator.next();
            boolean copy = true;
            Iterator<Change<E>> it2 = workingSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Change<E> change2 = it2.next();
                Change.ChangeType type = change2.getType();
                String name = next.getName();
                if (type == Change.ChangeType.DELETE && name != null) {
                    if (name.equals(change2.getTargetFileName())) {
                        copy = false;
                        it2.remove();
                        results.deleted(name);
                        break;
                    }
                } else if (type == Change.ChangeType.DELETE_DIR && name != null && name.startsWith(change2.getTargetFileName() + "/")) {
                    copy = false;
                    results.deleted(name);
                    break;
                }
            }
            if (copy && !isDeletedLater(workingSet, next) && !results.hasBeenAdded(next.getName())) {
                InputStream inputStream2 = entryIterator.getInputStream();
                copyStream(inputStream2, outputStream, next);
                results.addedFromStream(next.getName());
            }
        }
        Iterator<Change<E>> it3 = workingSet.iterator();
        while (it3.hasNext()) {
            Change<E> change3 = it3.next();
            if (change3.getType() == Change.ChangeType.ADD && !change3.isReplaceMode() && !results.hasBeenAdded(change3.getEntry().getName())) {
                InputStream input = change3.getInputStream();
                copyStream(input, outputStream, change3.getEntry());
                it3.remove();
                results.addedFromChangeSet(change3.getEntry().getName());
            }
        }
        outputStream.finish();
        return results;
    }

    public ChangeSetResults perform(I inputStream, O outputStream) throws IOException {
        return perform((ArchiveEntryIterator) new ArchiveInputStreamIterator(inputStream), (ArchiveInputStreamIterator) outputStream);
    }

    public ChangeSetResults perform(ZipFile zipFile, O outputStream) throws IOException {
        ArchiveEntryIterator<E> entryIterator = new ZipFileIterator(zipFile);
        return perform(entryIterator, (ArchiveEntryIterator<E>) outputStream);
    }
}
