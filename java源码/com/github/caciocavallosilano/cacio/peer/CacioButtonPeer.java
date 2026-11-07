package com.github.caciocavallosilano.cacio.peer;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.peer.ButtonPeer;
import javax.swing.JButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioButtonPeer.class */
public class CacioButtonPeer extends CacioComponentPeer<Button, JButton> implements ButtonPeer {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioButtonPeer$SwingButtonListener.class */
    class SwingButtonListener implements ActionListener {
        SwingButtonListener() {
        }

        public void actionPerformed(ActionEvent event) {
            Button b = CacioButtonPeer.this.getAWTComponent();
            b.getActionListeners();
            CacioButtonPeer.this.handlePeerEvent(new ActionEvent(b, 1001, b.getActionCommand()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CacioButtonPeer(Button theButton, PlatformWindowFactory pwf) {
        super/*com.pymcl.core.util.FileUtil*/.lockFor(theButton);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 12, list:
          (r0v0 ?? I:java.lang.String) from 0x0004: INVOKE (r0v0 ?? I:com.pymcl.core.util.Json$Parser), (r0v0 ?? I:java.lang.String), (r0v0 ?? I:java.lang.Object) SUPER call: com.pymcl.core.util.Json.Parser.lit(java.lang.String, java.lang.Object):java.lang.Object A[MD:(java.lang.String, java.lang.Object):java.lang.Object (m)]
          (r0v0 ?? I:java.lang.Object) from 0x0004: INVOKE (r0v0 ?? I:com.pymcl.core.util.Json$Parser), (r0v0 ?? I:java.lang.String), (r0v0 ?? I:java.lang.Object) SUPER call: com.pymcl.core.util.Json.Parser.lit(java.lang.String, java.lang.Object):java.lang.Object A[MD:(java.lang.String, java.lang.Object):java.lang.Object (m)]
          (r0v0 ?? I:com.pymcl.core.util.Json$Parser) from 0x0004: INVOKE (r0v0 ?? I:com.pymcl.core.util.Json$Parser), (r0v0 ?? I:java.lang.String), (r0v0 ?? I:java.lang.Object) SUPER call: com.pymcl.core.util.Json.Parser.lit(java.lang.String, java.lang.Object):java.lang.Object A[MD:(java.lang.String, java.lang.Object):java.lang.Object (m)]
          (r0v0 ?? I:java.lang.String A[D('jbutton' javax.swing.JButton)]) from 0x0012: INVOKE (r1v2 ?? I:void) = 
          (r0v3 java.awt.Button A[D('theButton' java.awt.Button)])
          (r0v3 java.awt.Button A[D('theButton' java.awt.Button)])
          (r0v0 ?? I:java.lang.String A[D('jbutton' javax.swing.JButton)])
         VIRTUAL call: com.pymcl.core.util.Json.str(java.lang.StringBuilder, java.lang.String):void A[MD:(java.lang.StringBuilder, java.lang.String):void (m)] (LINE:79)
          (r0v0 ?? I:com.pymcl.core.util.Json A[D('jbutton' javax.swing.JButton)]) from 0x0015: INVOKE 
          (r0v0 ?? I:com.pymcl.core.util.Json A[D('jbutton' javax.swing.JButton)])
          (r1v2 ?? I:int)
          (r0v0 ?? I:java.lang.StringBuilder A[D('jbutton' javax.swing.JButton)])
          (r0v0 ?? I:int A[D('jbutton' javax.swing.JButton)])
         VIRTUAL call: com.pymcl.core.util.Json.write$nl(int, java.lang.StringBuilder, int):void A[MD:(int, java.lang.StringBuilder, int):void (m)] (LINE:79)
          (r0v0 ?? I:java.lang.StringBuilder A[D('jbutton' javax.swing.JButton)]) from 0x0015: INVOKE 
          (r0v0 ?? I:com.pymcl.core.util.Json A[D('jbutton' javax.swing.JButton)])
          (r1v2 ?? I:int)
          (r0v0 ?? I:java.lang.StringBuilder A[D('jbutton' javax.swing.JButton)])
          (r0v0 ?? I:int A[D('jbutton' javax.swing.JButton)])
         VIRTUAL call: com.pymcl.core.util.Json.write$nl(int, java.lang.StringBuilder, int):void A[MD:(int, java.lang.StringBuilder, int):void (m)] (LINE:79)
          (r0v0 ?? I:int A[D('jbutton' javax.swing.JButton)]) from 0x0015: INVOKE 
          (r0v0 ?? I:com.pymcl.core.util.Json A[D('jbutton' javax.swing.JButton)])
          (r1v2 ?? I:int)
          (r0v0 ?? I:java.lang.StringBuilder A[D('jbutton' javax.swing.JButton)])
          (r0v0 ?? I:int A[D('jbutton' javax.swing.JButton)])
         VIRTUAL call: com.pymcl.core.util.Json.write$nl(int, java.lang.StringBuilder, int):void A[MD:(int, java.lang.StringBuilder, int):void (m)] (LINE:79)
          (r0v0 ?? I:java.lang.String A[D('jbutton' javax.swing.JButton)]) from 0x001e: INVOKE 
          (r1v3 java.awt.event.ActionListener)
          (r8v0 'this' com.github.caciocavallosilano.cacio.peer.CacioButtonPeer A[D('this' com.github.caciocavallosilano.cacio.peer.CacioButtonPeer), IMMUTABLE_TYPE, THIS])
          (r0v0 ?? I:java.lang.String A[D('jbutton' javax.swing.JButton)])
         SUPER call: com.pymcl.core.util.JsonKt.bool(java.util.Map, java.lang.String):java.lang.Boolean A[MD:(java.util.Map<java.lang.String, java.lang.Object>, java.lang.String):java.lang.Boolean (m)] (LINE:80)
          (r0v0 ?? I:com.pymcl.core.util.JsonKt A[D('jbutton' javax.swing.JButton)]) from 0x0021: INVOKE 
          (r0v0 ?? I:com.pymcl.core.util.JsonKt A[D('jbutton' javax.swing.JButton)])
          (r1v3 java.awt.event.ActionListener)
          (r0v0 ?? I:java.lang.String A[D('jbutton' javax.swing.JButton)])
         VIRTUAL call: com.pymcl.core.util.JsonKt.long(java.util.Map, java.lang.String):java.lang.Long A[MD:(java.util.Map<java.lang.String, java.lang.Object>, java.lang.String):java.lang.Long (m)] (LINE:80)
          (r0v0 ?? I:java.lang.String A[D('jbutton' javax.swing.JButton)]) from 0x0021: INVOKE 
          (r0v0 ?? I:com.pymcl.core.util.JsonKt A[D('jbutton' javax.swing.JButton)])
          (r1v3 java.awt.event.ActionListener)
          (r0v0 ?? I:java.lang.String A[D('jbutton' javax.swing.JButton)])
         VIRTUAL call: com.pymcl.core.util.JsonKt.long(java.util.Map, java.lang.String):java.lang.Long A[MD:(java.util.Map<java.lang.String, java.lang.Object>, java.lang.String):java.lang.Long (m)] (LINE:80)
          (r0v0 ?? I:com.tungsten.fclauncher.utils.Architecture A[D('jbutton' javax.swing.JButton)]) from 0x0030: INVOKE (r0v0 ?? I:com.tungsten.fclauncher.utils.Architecture A[D('jbutton' javax.swing.JButton)]) VIRTUAL call: com.tungsten.fclauncher.utils.Architecture.getDeviceArchitecture():int A[MD:():int (m)] (LINE:81)
          (r0v0 ?? I:javax.swing.JButton A[D('jbutton' javax.swing.JButton)]) from 0x0034: RETURN (r0v0 ?? I:javax.swing.JButton A[D('jbutton' javax.swing.JButton)]) (LINE:82)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.util.Json, com.pymcl.core.util.Json$Parser, com.pymcl.core.util.JsonKt, com.tungsten.fclauncher.utils.Architecture, int, java.lang.Object, java.lang.String, java.lang.StringBuilder, javax.swing.JButton] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, void] */
    @Override // com.github.caciocavallosilano.cacio.peer.CacioComponentPeer
    /* renamed from: initSwingComponent, reason: merged with bridge method [inline-methods] */
    public javax.swing.JButton mo7501initSwingComponent() {
        /*
            r8 = this;
            javax.swing.JButton r0 = new javax.swing.JButton
            r1 = r0
            super/*com.pymcl.core.util.Json.Parser*/.lit(r0, r0)
            r9 = r0
            r0 = r8
            java.lang.Object r0 = r0.value()
            java.awt.Button r0 = (java.awt.Button) r0
            r10 = r0
            r0 = r9
            r1 = r10
            void r1 = r1.str(r10, r0)
            r0.write$nl(r1, r0, r0)
            r0 = r9
            com.github.caciocavallosilano.cacio.peer.CacioButtonPeer$SwingButtonListener r1 = new com.github.caciocavallosilano.cacio.peer.CacioButtonPeer$SwingButtonListener
            r2 = r1
            r3 = r8
            super/*com.pymcl.core.util.JsonKt*/.bool(r3, r0)
            r0.m8043long(r1, r0)
            r0 = r9
            java.awt.Insets r1 = new java.awt.Insets
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2.<init>()
            r0.getDeviceArchitecture()
            r0 = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioButtonPeer.mo7501initSwingComponent():javax.swing.JButton");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.pymcl.core.util.Json, int, java.lang.StringBuilder, javax.swing.JButton] */
    public void setLabel(String str) {
        ?? r0 = (JButton) getLatestGameLog();
        r0.write$nl(str, r0, r0);
    }
}
