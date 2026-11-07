package org.apache.commons.io.monitor;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.comparator.NameFileComparator;
import org.apache.commons.io.filefilter.TrueFileFilter;

/* loaded from: classes24.dex */
public class FileAlterationObserver implements Serializable {
    private static final long serialVersionUID = 1185122225658782848L;
    private final Comparator<File> comparator;
    private final transient FileFilter fileFilter;
    private final transient List<FileAlterationListener> listeners;
    private final FileEntry rootEntry;

    public FileAlterationObserver(File directory) {
        this(directory, (FileFilter) null);
    }

    public FileAlterationObserver(File directory, FileFilter fileFilter) {
        this(directory, fileFilter, (IOCase) null);
    }

    public FileAlterationObserver(File directory, FileFilter fileFilter, IOCase ioCase) {
        this(new FileEntry(directory), fileFilter, ioCase);
    }

    protected FileAlterationObserver(FileEntry rootEntry, FileFilter fileFilter, IOCase ioCase) {
        this.listeners = new CopyOnWriteArrayList();
        Objects.requireNonNull(rootEntry, "rootEntry");
        Objects.requireNonNull(rootEntry.getFile(), "rootEntry.getFile()");
        this.rootEntry = rootEntry;
        this.fileFilter = fileFilter != null ? fileFilter : TrueFileFilter.INSTANCE;
        switch (IOCase.value(ioCase, IOCase.SYSTEM)) {
            case SYSTEM:
                this.comparator = NameFileComparator.NAME_SYSTEM_COMPARATOR;
                break;
            case INSENSITIVE:
                this.comparator = NameFileComparator.NAME_INSENSITIVE_COMPARATOR;
                break;
            default:
                this.comparator = NameFileComparator.NAME_COMPARATOR;
                break;
        }
    }

    public FileAlterationObserver(String directoryName) {
        this(new File(directoryName));
    }

    public FileAlterationObserver(String directoryName, FileFilter fileFilter) {
        this(new File(directoryName), fileFilter);
    }

    public FileAlterationObserver(String directoryName, FileFilter fileFilter, IOCase ioCase) {
        this(new File(directoryName), fileFilter, ioCase);
    }

    public void addListener(FileAlterationListener listener) {
        if (listener != null) {
            this.listeners.add(listener);
        }
    }

    public void checkAndNotify() {
        this.listeners.forEach(new Consumer() { // from class: org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.m9899x2d975733((FileAlterationListener) obj);
            }
        });
        File rootFile = this.rootEntry.getFile();
        if (rootFile.exists()) {
            checkAndNotify(this.rootEntry, this.rootEntry.getChildren(), listFiles(rootFile));
        } else if (this.rootEntry.isExists()) {
            checkAndNotify(this.rootEntry, this.rootEntry.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
        }
        this.listeners.forEach(new Consumer() { // from class: org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.m9900x47b2d5d2((FileAlterationListener) obj);
            }
        });
    }

    /* renamed from: lambda$checkAndNotify$0$org-apache-commons-io-monitor-FileAlterationObserver, reason: not valid java name */
    /* synthetic */ void m9899x2d975733(FileAlterationListener listener) {
        listener.onStart(this);
    }

    /* renamed from: lambda$checkAndNotify$1$org-apache-commons-io-monitor-FileAlterationObserver, reason: not valid java name */
    /* synthetic */ void m9900x47b2d5d2(FileAlterationListener listener) {
        listener.onStop(this);
    }

    private void checkAndNotify(FileEntry parent, FileEntry[] previous, File[] files) {
        int c = 0;
        FileEntry[] current = files.length > 0 ? new FileEntry[files.length] : FileEntry.EMPTY_FILE_ENTRY_ARRAY;
        for (FileEntry entry : previous) {
            while (c < files.length && this.comparator.compare(entry.getFile(), files[c]) > 0) {
                current[c] = createFileEntry(parent, files[c]);
                doCreate(current[c]);
                c++;
            }
            if (c < files.length && this.comparator.compare(entry.getFile(), files[c]) == 0) {
                doMatch(entry, files[c]);
                checkAndNotify(entry, entry.getChildren(), listFiles(files[c]));
                current[c] = entry;
                c++;
            } else {
                checkAndNotify(entry, entry.getChildren(), FileUtils.EMPTY_FILE_ARRAY);
                doDelete(entry);
            }
        }
        while (c < files.length) {
            current[c] = createFileEntry(parent, files[c]);
            doCreate(current[c]);
            c++;
        }
        parent.setChildren(current);
    }

    private FileEntry createFileEntry(FileEntry parent, File file) {
        FileEntry entry = parent.newChildInstance(file);
        entry.refresh(file);
        entry.setChildren(doListFiles(file, entry));
        return entry;
    }

    public void destroy() throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCreate(final FileEntry entry) {
        this.listeners.forEach(new Consumer() { // from class: org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FileAlterationObserver.lambda$doCreate$2(entry, (FileAlterationListener) obj);
            }
        });
        Stream.of((Object[]) entry.getChildren()).forEach(new Consumer() { // from class: org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.doCreate((FileEntry) obj);
            }
        });
    }

    static /* synthetic */ void lambda$doCreate$2(FileEntry entry, FileAlterationListener listener) {
        if (entry.isDirectory()) {
            listener.onDirectoryCreate(entry.getFile());
        } else {
            listener.onFileCreate(entry.getFile());
        }
    }

    private void doDelete(final FileEntry entry) {
        this.listeners.forEach(new Consumer() { // from class: org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                FileAlterationObserver.lambda$doDelete$3(entry, (FileAlterationListener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$doDelete$3(FileEntry entry, FileAlterationListener listener) {
        if (entry.isDirectory()) {
            listener.onDirectoryDelete(entry.getFile());
        } else {
            listener.onFileDelete(entry.getFile());
        }
    }

    private FileEntry[] doListFiles(File file, final FileEntry entry) {
        final File[] files = listFiles(file);
        FileEntry[] children = files.length > 0 ? new FileEntry[files.length] : FileEntry.EMPTY_FILE_ENTRY_ARRAY;
        Arrays.setAll(children, new IntFunction() { // from class: org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda3
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return this.f$0.m9901xdd7b21b3(entry, files, i);
            }
        });
        return children;
    }

    /* renamed from: lambda$doListFiles$4$org-apache-commons-io-monitor-FileAlterationObserver, reason: not valid java name */
    /* synthetic */ FileEntry m9901xdd7b21b3(FileEntry entry, File[] files, int i) {
        return createFileEntry(entry, files[i]);
    }

    private void doMatch(final FileEntry entry, final File file) {
        if (entry.refresh(file)) {
            this.listeners.forEach(new Consumer() { // from class: org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    FileAlterationObserver.lambda$doMatch$5(entry, file, (FileAlterationListener) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$doMatch$5(FileEntry entry, File file, FileAlterationListener listener) {
        if (entry.isDirectory()) {
            listener.onDirectoryChange(file);
        } else {
            listener.onFileChange(file);
        }
    }

    public File getDirectory() {
        return this.rootEntry.getFile();
    }

    public FileFilter getFileFilter() {
        return this.fileFilter;
    }

    public Iterable<FileAlterationListener> getListeners() {
        return new ArrayList(this.listeners);
    }

    public void initialize() throws Exception {
        this.rootEntry.refresh(this.rootEntry.getFile());
        this.rootEntry.setChildren(doListFiles(this.rootEntry.getFile(), this.rootEntry));
    }

    private File[] listFiles(File file) {
        File[] children = null;
        if (file.isDirectory()) {
            children = file.listFiles(this.fileFilter);
        }
        if (children == null) {
            children = FileUtils.EMPTY_FILE_ARRAY;
        }
        if (children.length > 1) {
            Arrays.sort(children, this.comparator);
        }
        return children;
    }

    public void removeListener(final FileAlterationListener listener) {
        if (listener != null) {
            List<FileAlterationListener> list = this.listeners;
            Objects.requireNonNull(listener);
            list.removeIf(new Predicate() { // from class: org.apache.commons.io.monitor.FileAlterationObserver$$ExternalSyntheticLambda0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return listener.equals((FileAlterationListener) obj);
                }
            });
        }
    }

    public String toString() {
        return getClass().getSimpleName() + "[file='" + getDirectory().getPath() + "', " + this.fileFilter.toString() + ", listeners=" + this.listeners.size() + "]";
    }
}
