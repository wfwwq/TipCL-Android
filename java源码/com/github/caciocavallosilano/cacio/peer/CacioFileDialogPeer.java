package com.github.caciocavallosilano.cacio.peer;

import java.awt.FileDialog;
import java.awt.peer.FileDialogPeer;
import java.io.File;
import java.io.FilenameFilter;
import javax.swing.JFileChooser;
import javax.swing.JRootPane;
import javax.swing.filechooser.FileFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioFileDialogPeer.class */
public class CacioFileDialogPeer extends CacioDialogPeer implements FileDialogPeer {
    private JFileChooser fileChooser;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioFileDialogPeer$ProxyFilter.class */
    public static class ProxyFilter extends FileFilter {
        private FilenameFilter target;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ProxyFilter(FilenameFilter f) {
            this.target = f;
        }

        public boolean accept(File f) {
            return this.target.accept(f.getAbsoluteFile().getParentFile(), f.getName());
        }

        public String getDescription() {
            return "No description";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CacioFileDialogPeer(FileDialog d, PlatformWindowFactory pwf) {
        super(d, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioWindowPeer, com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void postInitSwingComponent() {
        super.postInitSwingComponent();
        this.fileChooser = new JFileChooser();
        ((JRootPane) getSwingComponent()).getContentPane().add(this.fileChooser);
        ((JRootPane) getSwingComponent()).layout();
        FileDialog fd = (FileDialog) getAWTComponent();
        setFile(fd.getFile());
        setDirectory(fd.getDirectory());
        setFilenameFilter(fd.getFilenameFilter());
    }

    public void setFile(String file) {
        this.fileChooser.setSelectedFile(new File(file));
    }

    public void setDirectory(String dir) {
        System.err.println("setting dir: " + ((Object) dir));
        this.fileChooser.setCurrentDirectory(new File(dir));
    }

    public void setFilenameFilter(FilenameFilter filter) {
        this.fileChooser.setFileFilter(new ProxyFilter(filter));
    }
}
