package sun.awt.peer.cacio;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.TextArea;
import java.awt.im.InputMethodRequests;
import java.awt.peer.TextAreaPeer;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioTextAreaPeer.class */
class CacioTextAreaPeer extends CacioComponentPeer<TextArea, JScrollPane> implements TextAreaPeer {
    private JTextArea textArea;

    public CacioTextAreaPeer(TextArea awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // sun.awt.peer.cacio.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public JScrollPane mo14613initSwingComponent() {
        int hsp;
        int vsp;
        TextArea awtTextArea = getAWTComponent();
        this.textArea = new JTextArea();
        int sbv = awtTextArea.getScrollbarVisibility();
        if (sbv == 3) {
            hsp = 31;
            vsp = 21;
        } else if (sbv == 2) {
            hsp = 32;
            vsp = 21;
        } else if (sbv == 1) {
            hsp = 31;
            vsp = 22;
        } else {
            hsp = 32;
            vsp = 22;
        }
        JScrollPane sp = new JScrollPane(this.textArea, vsp, hsp);
        return sp;
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void postInitSwingComponent() {
        super.postInitSwingComponent();
        setText(getAWTComponent().getText());
    }

    public Dimension getMinimumSize(int rows, int columns) {
        return getPreferredSize(rows, columns);
    }

    public Dimension getPreferredSize(int rows, int columns) {
        Font f = this.textArea.getFont();
        FontMetrics fm = this.textArea.getFontMetrics(f);
        int w = fm.charWidth('m') * columns;
        int h = fm.getHeight() * rows;
        Dimension spSize = getSwingComponent().getMinimumSize();
        spSize.width += w;
        spSize.height += h;
        return spSize;
    }

    public void insert(String text, int pos) {
        getTextArea().insert(text, pos);
    }

    public void replaceRange(String text, int start, int end) {
        getTextArea().replaceRange(text, start, end);
    }

    public int getCaretPosition() {
        return getTextArea().getCaretPosition();
    }

    public InputMethodRequests getInputMethodRequests() {
        return null;
    }

    public int getSelectionEnd() {
        return getTextArea().getSelectionEnd();
    }

    public int getSelectionStart() {
        return getTextArea().getSelectionStart();
    }

    public String getText() {
        return getTextArea().getText();
    }

    public void select(int selStart, int selEnd) {
        getTextArea().select(selStart, selEnd);
    }

    public void setCaretPosition(int pos) {
        getTextArea().setCaretPosition(pos);
    }

    public void setEditable(boolean editable) {
        getTextArea().setEditable(editable);
    }

    public void setText(String text) {
        getTextArea().setText(text);
    }

    private JTextArea getTextArea() {
        return this.textArea;
    }

    @Override // sun.awt.peer.cacio.CacioComponentPeer
    void setEnabledImpl(boolean enable) {
        super.setEnabledImpl(enable);
        getTextArea().setEnabled(enable);
    }
}
