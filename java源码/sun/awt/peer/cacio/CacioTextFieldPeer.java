package sun.awt.peer.cacio;

import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.im.InputMethodRequests;
import java.awt.peer.TextFieldPeer;
import javax.swing.JPasswordField;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioTextFieldPeer.class */
class CacioTextFieldPeer extends CacioComponentPeer<TextField, JPasswordField> implements TextFieldPeer {
    CacioTextFieldPeer(TextField awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JPasswordField mo14613initSwingComponent() {
        TextField textField = getAWTComponent();
        JPasswordField swingComponent = new JPasswordField();
        swingComponent.setText(textField.getText());
        swingComponent.setColumns(textField.getColumns());
        swingComponent.setEchoChar(textField.getEchoChar());
        swingComponent.setEditable(textField.isEditable());
        swingComponent.select(textField.getSelectionStart(), textField.getSelectionEnd());
        swingComponent.addActionListener(new SwingTextFieldListener());
        return swingComponent;
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioTextFieldPeer$SwingTextFieldListener.class */
    class SwingTextFieldListener implements ActionListener {
        SwingTextFieldListener() {
        }

        public void actionPerformed(ActionEvent event) {
            TextField textField = CacioTextFieldPeer.this.getAWTComponent();
            ActionListener[] listeners = textField.getActionListeners();
            if (listeners.length == 0) {
                return;
            }
            ActionEvent ev = new ActionEvent(textField, 1001, event.getActionCommand());
            for (ActionListener listener : listeners) {
                listener.actionPerformed(ev);
            }
        }
    }

    public Dimension getMinimumSize(int columns) {
        return getSwingComponent().getMinimumSize();
    }

    public Dimension getPreferredSize(int columns) {
        return getSwingComponent().getPreferredSize();
    }

    public void setEchoChar(char echoChar) {
        getSwingComponent().setEchoChar(echoChar);
    }

    public int getCaretPosition() {
        return getSwingComponent().getCaretPosition();
    }

    public InputMethodRequests getInputMethodRequests() {
        return getSwingComponent().getInputMethodRequests();
    }

    public int getSelectionEnd() {
        return getSwingComponent().getSelectionEnd();
    }

    public int getSelectionStart() {
        return getSwingComponent().getSelectionStart();
    }

    public String getText() {
        return getSwingComponent().getText();
    }

    public void select(int selStart, int selEnd) {
        getSwingComponent().select(selStart, selEnd);
    }

    public void setCaretPosition(int pos) {
        getSwingComponent().setCaretPosition(pos);
    }

    public void setEditable(boolean editable) {
        getSwingComponent().setEditable(editable);
    }

    public void setText(String l) {
        getSwingComponent().setText(l);
    }
}
