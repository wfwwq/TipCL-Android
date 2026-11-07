package sun.awt.peer.cacio;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.peer.CheckboxPeer;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxPeer.class */
class CacioCheckboxPeer extends CacioComponentPeer<Checkbox, JPanel> implements CheckboxPeer {
    private JToggleButton toggleButton;

    public CacioCheckboxPeer(Checkbox awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JPanel mo14613initSwingComponent() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        if (getAWTComponent().getCheckboxGroup() == null) {
            this.toggleButton = new JCheckBox();
        } else {
            this.toggleButton = new JRadioButton();
        }
        panel.add(this.toggleButton);
        return panel;
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
        super.postInitSwingComponent();
        this.toggleButton.addItemListener(new SwingCheckboxListener());
        Checkbox checkbox = getAWTComponent();
        setLabel(checkbox.getLabel());
        setState(checkbox.getState());
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioCheckboxPeer$SwingCheckboxListener.class */
    class SwingCheckboxListener implements ItemListener {
        SwingCheckboxListener() {
        }

        public void itemStateChanged(ItemEvent event) {
            Checkbox awtCheckbox = CacioCheckboxPeer.this.getAWTComponent();
            if (event.getStateChange() == 2 && awtCheckbox.getCheckboxGroup() != null) {
                return;
            }
            awtCheckbox.setState(event.getStateChange() == 1);
            ItemListener[] l = awtCheckbox.getItemListeners();
            if (l.length == 0) {
                return;
            }
            ItemEvent ev = new ItemEvent(awtCheckbox, 701, awtCheckbox.getLabel(), event.getStateChange());
            for (ItemListener itemListener : l) {
                itemListener.itemStateChanged(ev);
            }
        }
    }

    public void setCheckboxGroup(CheckboxGroup group) {
        if (group == null) {
            this.toggleButton = new JCheckBox();
        } else {
            this.toggleButton = new JRadioButton();
        }
        getSwingComponent().removeAll();
        getSwingComponent().add(this.toggleButton);
        postInitSwingComponent();
    }

    public void setLabel(String label) {
        this.toggleButton.setText(label);
    }

    public void setState(boolean state) {
        this.toggleButton.setSelected(state);
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void setEnabledImpl(boolean e) {
        super.setEnabledImpl(e);
        this.toggleButton.setEnabled(e);
    }
}
