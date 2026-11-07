package sun.awt.peer.cacio;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.peer.ChoicePeer;
import javax.swing.JComboBox;
import javax.swing.MutableComboBoxModel;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer.class */
class CacioChoicePeer extends CacioComponentPeer<Choice, JComboBox> implements ChoicePeer {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioChoicePeer$TrampolineListener.class */
    private class TrampolineListener implements ItemListener {
        private TrampolineListener() {
        }

        public void itemStateChanged(ItemEvent e) {
            ItemListener[] listeners;
            if (e.getStateChange() != 2 && (listeners = CacioChoicePeer.this.getAWTComponent().getItemListeners()) != null && listeners.length > 0) {
                JComboBox cb = CacioChoicePeer.this.getSwingComponent();
                Choice comp = CacioChoicePeer.this.getAWTComponent();
                for (ItemListener itemListener : listeners) {
                    ItemEvent ev = new ItemEvent(comp, e.getID(), cb.getSelectedItem(), e.getStateChange());
                    itemListener.itemStateChanged(ev);
                }
            }
        }
    }

    CacioChoicePeer(Choice awtComp, PlatformWindowFactory pfw) {
        super(awtComp, pfw);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JComboBox mo14613initSwingComponent() {
        JComboBox comboBox = new JComboBox();
        return comboBox;
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
        super.postInitSwingComponent();
        Choice c = getAWTComponent();
        int size = c.getItemCount();
        for (int i = 0; i < size; i++) {
            getModel().addElement(c.getItem(i));
        }
        getSwingComponent().addItemListener(new TrampolineListener());
    }

    private MutableComboBoxModel getModel() {
        MutableComboBoxModel mm = getSwingComponent().getModel();
        return mm;
    }

    public void add(String item, int index) {
        getModel().insertElementAt(item, index);
    }

    public void remove(int index) {
        getModel().removeElementAt(index);
    }

    public void removeAll() {
        MutableComboBoxModel m = getModel();
        int size = m.getSize();
        for (int item = size - 1; item >= 0; item--) {
            m.removeElementAt(item);
        }
    }

    public void select(int index) {
        getSwingComponent().setSelectedIndex(index);
    }
}
