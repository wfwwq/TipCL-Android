package sun.awt.peer.cacio;

import java.awt.FileDialog;
import java.awt.peer.FileDialogPeer;
import java.io.File;
import java.io.FilenameFilter;
import javax.swing.JFileChooser;
import javax.swing.JRootPane;
import javax.swing.filechooser.FileFilter;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFileDialogPeer.class */
class CacioFileDialogPeer extends CacioDialogPeer implements FileDialogPeer {
    private JFileChooser fileChooser;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioFileDialogPeer$ProxyFilter.class */
    private static class ProxyFilter extends FileFilter {
        private FilenameFilter target;

        ProxyFilter(FilenameFilter f) {
            this.target = f;
        }

        public boolean accept(File f) {
            return this.target.accept(f.getAbsoluteFile().getParentFile(), f.getName());
        }

        public String getDescription() {
            return "No description";
        }
    }

    CacioFileDialogPeer(FileDialog d, PlatformWindowFactory pwf) {
        super(d, pwf);
    }

    @Override // sun.awt.peer.cacio.CacioWindowPeer, sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
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
        System.err.println("setting dir: " + dir);
        this.fileChooser.setCurrentDirectory(new File(dir));
    }

    public void setFilenameFilter(FilenameFilter filter) {
        this.fileChooser.setFileFilter(new ProxyFilter(filter));
    }
}
