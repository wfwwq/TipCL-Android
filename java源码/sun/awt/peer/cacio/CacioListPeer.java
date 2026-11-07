package sun.awt.peer.cacio;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.MouseEvent;
import java.awt.peer.ListPeer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioListPeer.class */
final class CacioListPeer extends CacioComponentPeer<List, JScrollPane> implements ListPeer {
    private JList list;

    public CacioListPeer(List awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JScrollPane mo14613initSwingComponent() {
        this.list = new JList(new DefaultListModel());
        JScrollPane pane = new JScrollPane(this.list);
        return pane;
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
        super.postInitSwingComponent();
        List theList = getAWTComponent();
        int itemCount = theList.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            add(theList.getItem(i), i);
        }
        setMultipleMode(theList.isMultipleMode());
        this.list.addListSelectionListener(new SelectionListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DefaultListModel getModel() {
        DefaultListModel m = this.list.getModel();
        return m;
    }

    public void add(String item, int index) {
        if (index < 0) {
            getModel().addElement(item);
        } else {
            getModel().add(index, item);
        }
    }

    public void delItems(int start, int end) {
        getModel().removeRange(start, end);
    }

    public Dimension getMinimumSize(int rows) {
        FontMetrics fm = getFontMetrics(getAWTComponent().getFont());
        return new Dimension(20 + fm.stringWidth("0123456789abcde"), fm.getHeight() * rows);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public Dimension getMinimumSize() {
        return getMinimumSize(5);
    }

    public Dimension getPreferredSize(int rows) {
        Dimension minSize = getMinimumSize(5);
        Dimension actualSize = getSwingComponent().getPreferredSize();
        if (actualSize.width < minSize.width) {
            actualSize.width = minSize.width;
        }
        if (actualSize.height < actualSize.height) {
            actualSize.height = minSize.height;
        }
        return actualSize;
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public Dimension getPreferredSize() {
        int rows = getModel().getSize();
        return getPreferredSize(rows < 5 ? 5 : rows);
    }

    public void makeVisible(int index) {
        this.list.ensureIndexIsVisible(index);
    }

    public void select(int index) {
        this.list.setSelectedIndex(index);
    }

    public void deselect(int index) {
        this.list.removeSelectionInterval(index, index);
    }

    public void removeAll() {
        ListSelectionModel m = this.list.getSelectionModel();
        m.clearSelection();
    }

    public int[] getSelectedIndexes() {
        return this.list.getSelectedIndices();
    }

    public void setMultipleMode(boolean multiple) {
        int mode;
        if (multiple) {
            mode = 2;
        } else {
            mode = 0;
        }
        this.list.setSelectionMode(mode);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    protected void handleMouseEvent(MouseEvent e) {
        super.handleMouseEvent(e);
        if (e.getID() == 502 && e.getClickCount() == 2) {
            getToolkit().getSystemEventQueue().postEvent(new ActionEvent(getAWTComponent(), 1001, "" + getModel().getElementAt(this.list.locationToIndex(e.getPoint()))));
        }
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    public void setEnabled(boolean e) {
        super.setEnabled(e);
        this.list.setEnabled(e);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioListPeer$SelectionListener.class */
    class SelectionListener implements ListSelectionListener {
        SelectionListener() {
        }

        public void valueChanged(ListSelectionEvent e) {
            for (int index = e.getFirstIndex(); index < e.getLastIndex(); index++) {
                CacioListPeer.this.getToolkit().getSystemEventQueue().postEvent(new ItemEvent(CacioListPeer.this.getAWTComponent(), 701, CacioListPeer.this.getModel().getElementAt(index), CacioListPeer.this.list.isSelectedIndex(index) ? 1 : 2));
            }
        }
    }
}
