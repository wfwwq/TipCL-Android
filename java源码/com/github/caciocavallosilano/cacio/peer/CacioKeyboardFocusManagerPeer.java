package com.github.caciocavallosilano.cacio.peer;

import com.bytedance.android.bytehook.ByteHook;
import com.pymcl.core.instance.Instance;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Window;
import java.awt.peer.KeyboardFocusManagerPeer;
import java.util.Map;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioKeyboardFocusManagerPeer.class */
class CacioKeyboardFocusManagerPeer implements KeyboardFocusManagerPeer {
    private static CacioKeyboardFocusManagerPeer instance;
    private Window currentFocusedWindow;
    private Component currentFocusOwner;

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 3, list:
          (r0v2 ?? I:boolean) from 0x000a: INVOKE (r0v2 ?? I:com.bytedance.android.bytehook.ByteHook$ConfigBuilder$1), (r0v2 ?? I:boolean) SUPER call: com.bytedance.android.bytehook.ByteHook.ConfigBuilder.1.setRecordable(boolean):void A[MD:(boolean):void (m)]
          (r0v2 ?? I:com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer) from 0x000d: SPUT (r0v2 ?? I:com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer) com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer.instance com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer
          (r0v2 ?? I:com.bytedance.android.bytehook.ByteHook$ConfigBuilder$1) from 0x000a: INVOKE (r0v2 ?? I:com.bytedance.android.bytehook.ByteHook$ConfigBuilder$1), (r0v2 ?? I:boolean) SUPER call: com.bytedance.android.bytehook.ByteHook.ConfigBuilder.1.setRecordable(boolean):void A[MD:(boolean):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, com.bytedance.android.bytehook.ByteHook$ConfigBuilder$1, com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer] */
    static com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer getInstance() {
        /*
            com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer.instance
            if (r0 != 0) goto L10
            com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer r0 = new com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer
            r1 = r0
            super/*com.bytedance.android.bytehook.ByteHook.ConfigBuilder.1*/.setRecordable(r0)
            com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer.instance = r0
        L10:
            com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer.instance
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer.getInstance():com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CacioKeyboardFocusManagerPeer() {
        boolean unused = ((ByteHook.ConfigBuilder) this).debug;
    }

    public Window getCurrentFocusedWindow() {
        return this.currentFocusedWindow;
    }

    public void setCurrentFocusOwner(Component comp) {
        this.currentFocusOwner = comp;
    }

    public Component getCurrentFocusOwner() {
        return this.currentFocusOwner;
    }

    public void clearGlobalFocusOwner(Window activeWindow) {
    }

    public void setCurrentFocusedWindow(Window win) {
        this.currentFocusedWindow = win;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 java.awt.event.FocusEvent, still in use, count: 2, list:
          (r0v4 java.awt.event.FocusEvent) from 0x0029: INVOKE (r0v4 java.awt.event.FocusEvent), (r2v0 com.bytedance.android.bytehook.ByteHook$RecordItem[]) SUPER call: com.bytedance.android.bytehook.ByteHook.getRecords(com.bytedance.android.bytehook.ByteHook$RecordItem[]):java.lang.String A[MD:(com.bytedance.android.bytehook.ByteHook$RecordItem[]):java.lang.String (m)]
          (r0v4 java.awt.event.FocusEvent A[D('fg' java.awt.event.FocusEvent)]) from 0x0056: INVOKE 
          (r8v0 'this' com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer A[D('this' com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer), IMMUTABLE_TYPE, THIS])
          (r0v4 java.awt.event.FocusEvent A[D('fg' java.awt.event.FocusEvent)])
         SUPER call: com.bytedance.android.bytehook.ByteHook.nativeAddIgnore(java.lang.String):int A[MD:(java.lang.String):int (m)] (LINE:125)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    boolean requestFocus(java.awt.Component r9, java.awt.Component r10, boolean r11, boolean r12, long r13, java.awt.event.FocusEvent.Cause r15) {
        /*
            r8 = this;
            r0 = r10
            if (r0 != 0) goto L6
            r0 = r9
            r10 = r0
        L6:
            r0 = r8
            com.bytedance.android.bytehook.ByteHook$RecordItem[] r0 = r0.values()
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L1c
            r0 = r16
            boolean r0 = com.bytedance.android.bytehook.ByteHook.getDebug()
            if (r0 != 0) goto L1c
            r0 = 0
            r16 = r0
        L1c:
            java.awt.event.FocusEvent r0 = new java.awt.event.FocusEvent
            r1 = r0
            r2 = r10
            r3 = 1004(0x3ec, float:1.407E-42)
            r4 = 0
            r5 = r16
            r6 = r15
            super/*com.bytedance.android.bytehook.ByteHook*/.getRecords(r2)
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r16
            if (r0 == 0) goto L48
            java.awt.event.FocusEvent r0 = new java.awt.event.FocusEvent
            r1 = r0
            r2 = r16
            r3 = 1005(0x3ed, float:1.408E-42)
            r4 = 0
            r5 = r10
            r6 = r15
            super/*com.bytedance.android.bytehook.ByteHook*/.getRecords(r2)
            r18 = r0
        L48:
            r0 = r18
            if (r0 == 0) goto L53
            r0 = r8
            r1 = r18
            super/*com.bytedance.android.bytehook.ByteHook*/.nativeAddIgnore(r1)
        L53:
            r0 = r8
            r1 = r17
            super/*com.bytedance.android.bytehook.ByteHook*/.nativeAddIgnore(r1)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioKeyboardFocusManagerPeer.requestFocus(java.awt.Component, java.awt.Component, boolean, boolean, long, java.awt.event.FocusEvent$Cause):boolean");
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0000: INVOKE (r0 I:void) = (r0 I:java.util.Map) STATIC call: com.pymcl.core.instance.Instance.create(java.util.Map):void A[MD:(java.util.Map<java.lang.String, ? extends java.lang.Object>):void (m)] (LINE:131), block:B:2:0x0000 */
    private void postEvent(AWTEvent ev) {
        Map mapCreate;
        Instance.create(mapCreate);
        Instance.getVersionsDir();
    }
}
