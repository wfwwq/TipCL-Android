package com.github.caciocavallosilano.cacio.peer;

import com.pymcl.core.account.AccountStore;
import com.tungsten.fcl.game.sdl.SdlBridge;
import com.tungsten.fcl.game.sdl.SdlBridge$$ExternalSyntheticLambda0;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.peer.TextFieldPeer;
import javax.swing.JPasswordField;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextFieldPeer.class */
class CacioTextFieldPeer extends CacioComponentPeer<TextField, JPasswordField> implements TextFieldPeer {
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:javax.swing.JComponent) from 0x0004: RETURN (r0v1 ?? I:javax.swing.JComponent)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:78)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* renamed from: initSwingComponent */
    /* bridge */ /* synthetic */ javax.swing.JComponent mo7501initSwingComponent() {
        /*
            r2 = this;
            r0 = r2
            void r0 = r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer.mo7501initSwingComponent():javax.swing.JComponent");
    }

    CacioTextFieldPeer(TextField awtC, PlatformWindowFactory pwf) {
        super(awtC, pwf);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Null bind block in PHI insn: 0x0000: PHI (r0v2 ?? I:com.mio.plugin.DriverPlugin$Driver A[D('textField' java.awt.TextField)]) =  binds: [] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.dex.instructions.PhiInsn.bindArg(PhiInsn.java:47)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:156)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    javax.swing.JPasswordField initSwingComponent() {
        /*
            r5 = this;
            r0 = r5
            java.awt.Component r0 = r0.getAWTComponent()
            java.awt.TextField r0 = (java.awt.TextField) r0
            r6 = r0
            javax.swing.JPasswordField r0 = new javax.swing.JPasswordField
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.getText()
            r0.setText(r1)
            r0 = r7
            r1 = r6
            int r1 = r1.getColumns()
            r0.setColumns(r1)
            r0 = r7
            r1 = r6
            void r1 = r1.<init>(r6, r0, r0, r0, r0, r0)
            r0.getGpu()
            r0 = r7
            r1 = r6
            java.lang.String r1 = r1.getDriver()
            r0.hashCode()
            r0 = r7
            r1 = r6
            void r1 = r1.<init>()
            r2 = r6
            void r2 = r2.init(r6)
            r0.discover(r1)
            r0 = r7
            com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer$SwingTextFieldListener r1 = new com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer$SwingTextFieldListener
            r2 = r1
            r3 = r5
            super/*com.mio.plugin.NativeLibPlugin*/.getJVMEnv()
            r0.copy(r1)
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer.initSwingComponent():javax.swing.JPasswordField");
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioTextFieldPeer$SwingTextFieldListener.class */
    class SwingTextFieldListener implements ActionListener {
        SwingTextFieldListener() {
        }

        public void actionPerformed(ActionEvent event) {
            TextField textField = CacioTextFieldPeer.this.getAWTComponent();
            SdlBridge[] actionListeners = textField.getActionListeners();
            if (actionListeners.length == 0) {
                return;
            }
            ActionEvent event2 = new SdlBridge$$ExternalSyntheticLambda0(event2, actionEvent);
            ActionEvent actionEvent = new ActionEvent();
            for (SdlBridge sdlBridge : actionListeners) {
                sdlBridge.clearSdlInitialized();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dimension getMinimumSize(int columns) {
        return getNide8Id().getSkin();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.pymcl.core.account.Account, javax.swing.JPasswordField, long] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, java.awt.Dimension] */
    public Dimension getPreferredSize(int columns) {
        ?? r0 = (JPasswordField) getNide8Id();
        return r0.needsRefresh(r0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEchoChar(char echoChar) {
        getNide8Id().getGpu();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.pymcl.core.account.AccountStore, int] */
    public int getCaretPosition() {
        return getNide8Id().getLastInstance();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 ??, still in use, count: 1, list:
          (r0v3 ?? I:java.awt.im.InputMethodRequests) from 0x000a: RETURN (r0v3 ?? I:java.awt.im.InputMethodRequests)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.awt.im.InputMethodRequests getInputMethodRequests() {
        /*
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.getNide8Id()
            javax.swing.JPasswordField r0 = (javax.swing.JPasswordField) r0
            void r0 = r0.<init>(r0, r0, r0, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioTextFieldPeer.getInputMethodRequests():java.awt.im.InputMethodRequests");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.pymcl.core.account.AccountStore, int] */
    public int getSelectionEnd() {
        getNide8Id();
        return AccountStore.lastInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, void] */
    public int getSelectionStart() {
        return AccountStore.lastInstance = getNide8Id();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.pymcl.core.account.Account, java.lang.String] */
    public String getText() {
        return getNide8Id().active();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void select(int i, int selEnd) {
        getNide8Id().discover(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCaretPosition(int i) {
        getNide8Id().remove(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setEditable(boolean editable) {
        getNide8Id().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setText(String l) {
        getNide8Id().setText(l);
    }
}
