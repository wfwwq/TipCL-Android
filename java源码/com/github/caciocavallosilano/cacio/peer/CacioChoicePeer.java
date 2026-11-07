package com.github.caciocavallosilano.cacio.peer;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.peer.ChoicePeer;
import javax.swing.JComboBox;
import javax.swing.MutableComboBoxModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioChoicePeer.class */
public class CacioChoicePeer extends CacioComponentPeer<Choice, JComboBox> implements ChoicePeer {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioChoicePeer$TrampolineListener.class */
    public class TrampolineListener implements ItemListener {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public CacioChoicePeer(Choice awtComp, PlatformWindowFactory pfw) {
        super(awtComp, pfw);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JComboBox mo7501initSwingComponent() {
        JComboBox comboBox = new JComboBox();
        return comboBox;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    public void postInitSwingComponent() {
        super.postInitSwingComponent();
        Choice c = getAWTComponent();
        int size = c.getItemCount();
        for (int i = 0; i < size; i++) {
            getModel().addElement(c.getItem(i));
        }
        getSwingComponent().addItemListener(new TrampolineListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MutableComboBoxModel getModel() {
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
