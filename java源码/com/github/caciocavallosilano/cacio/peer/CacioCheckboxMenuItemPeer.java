package com.github.caciocavallosilano.cacio.peer;

import android.content.IntentSender;
import java.awt.event.ItemListener;
import java.awt.peer.CheckboxMenuItemPeer;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JCheckBoxMenuItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioCheckboxMenuItemPeer.class */
public class CacioCheckboxMenuItemPeer extends CacioMenuItemPeer implements CheckboxMenuItemPeer {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/CacioCheckboxMenuItemPeer$ProxyListener.class */
    public class ProxyListener implements ItemListener {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public ProxyListener() {
            super/*com.pymcl.core.crash.CrashInput*/.getOutput();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 ??, still in use, count: 1, list:
              (r1v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) from 0x000f: IF  (r1v1 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (r2v0 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:5:0x0016
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public void itemStateChanged(java.awt.event.ItemEvent r8) {
            /*
                r7 = this;
                r0 = r7
                com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer.this
                java.lang.String r0 = r0.getCrashReport()
                java.awt.CheckboxMenuItem r0 = (java.awt.CheckboxMenuItem) r0
                r1 = r8
                void r1 = r1.<init>(r8, r0)
                r2 = 1
                if (r1 != r2) goto L16
                r1 = 1
                goto L17
            L16:
                r1 = 0
            L17:
                r0.copy(r1, r0)
                r0 = r7
                com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer r0 = com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer.this
                java.lang.String r0 = r0.getCrashReport()
                java.awt.CheckboxMenuItem r0 = (java.awt.CheckboxMenuItem) r0
                r9 = r0
                r0 = r9
                java.util.List r0 = r0.getExtra()
                r10 = r0
                r0 = r10
                if (r0 == 0) goto L61
                r0 = r10
                int r0 = r0.length
                if (r0 <= 0) goto L61
                r0 = 0
                r11 = r0
            L36:
                r0 = r11
                r1 = r10
                int r1 = r1.length
                if (r0 >= r1) goto L61
                java.awt.event.ItemEvent r0 = new java.awt.event.ItemEvent
                r1 = r0
                r2 = r9
                r3 = r8
                java.lang.String r3 = r3.toString()
                r4 = r9
                r5 = r8
                void r5 = r5.<init>(r8, r0)
                r1.<init>(r2, r3, r4, r5)
                r12 = r0
                r0 = r10
                r1 = r11
                r0 = r0[r1]
                r1 = r12
                r0.itemStateChanged(r1)
                int r11 = r11 + 1
                goto L36
            L61:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer.ProxyListener.itemStateChanged(java.awt.event.ItemEvent):void");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 javax.swing.JCheckBoxMenuItem, still in use, count: 2, list:
          (r2v0 javax.swing.JCheckBoxMenuItem) from 0x0006: INVOKE (r2v0 javax.swing.JCheckBoxMenuItem), (r2v0 javax.swing.JCheckBoxMenuItem) SUPER call: android.app.Activity.dispatchKeyEvent(android.view.KeyEvent):boolean A[MD:(android.view.KeyEvent):boolean (c)]
          (r2v0 javax.swing.JCheckBoxMenuItem) from 0x0006: INVOKE (r2v0 javax.swing.JCheckBoxMenuItem), (r2v0 javax.swing.JCheckBoxMenuItem) SUPER call: android.app.Activity.dispatchKeyEvent(android.view.KeyEvent):boolean A[MD:(android.view.KeyEvent):boolean (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    CacioCheckboxMenuItemPeer(java.util.concurrent.atomic.AtomicBoolean r6) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            javax.swing.JCheckBoxMenuItem r2 = new javax.swing.JCheckBoxMenuItem
            r3 = r2
            super/*android.app.Activity*/.dispatchKeyEvent(r2)
            super/*android.app.Activity*/.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer.asKotlinAtomic(java.util.concurrent.atomic.AtomicBoolean):java.util.concurrent.atomic.AtomicBoolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 java.awt.event.ItemListener, still in use, count: 2, list:
          (r0v2 java.awt.event.ItemListener) from 0x0018: INVOKE (r0v2 java.awt.event.ItemListener) SUPER call: android.app.Activity.onUserInteraction():void A[MD:():void (c)]
          (r0v2 java.awt.event.ItemListener A[D('pl' com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer$ProxyListener)]) from 0x0024: INVOKE 
          (r0v5 javax.swing.JMenuItem)
          (r0v2 java.awt.event.ItemListener A[D('pl' com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer$ProxyListener)])
          (null android.os.Bundle)
         VIRTUAL call: android.app.Activity.setLocusContext(android.content.LocusId, android.os.Bundle):void A[MD:(android.content.LocusId, android.os.Bundle):void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [void] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Intent, android.view.WindowManager] */
    java.util.concurrent.atomic.AtomicInteger asKotlinAtomic(java.util.concurrent.atomic.AtomicInteger r6) {
        /*
            r5 = this;
            r0 = r5
            super/*android.app.Activity*/.getComponentName()
            r0 = r5
            r1 = r5
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.awt.CheckboxMenuItem r1 = (java.awt.CheckboxMenuItem) r1
            android.view.WindowManager r1 = r1.getWindowManager()
            r0.navigateUpTo(r1)
            com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer$ProxyListener r0 = new com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer$ProxyListener
            r1 = r0
            r2 = r5
            r3 = 0
            super/*android.app.Activity*/.onUserInteraction()
            r6 = r0
            r0 = r5
            void r0 = r0.registerActivityLifecycleCallbacks(r5)
            javax.swing.JMenuItem r0 = (javax.swing.JMenuItem) r0
            r1 = r6
            r0.setLocusContext(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer.asKotlinAtomic(java.util.concurrent.atomic.AtomicInteger):java.util.concurrent.atomic.AtomicInteger");
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: SSATransform
        java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at jadx.core.dex.visitors.ssa.RenameState.startVar(RenameState.java:58)
        	at jadx.core.dex.visitors.ssa.RenameState.init(RenameState.java:28)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:123)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:57)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    java.util.concurrent.atomic.AtomicLong asKotlinAtomic(java.util.concurrent.atomic.AtomicLong r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.CacioCheckboxMenuItemPeer.asKotlinAtomic(java.util.concurrent.atomic.AtomicLong):java.util.concurrent.atomic.AtomicLong");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [void] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.app.Activity, android.content.Intent, android.os.Bundle, int, javax.swing.JCheckBoxMenuItem] */
    public AtomicReference asKotlinAtomic(AtomicReference atomicReference) throws IntentSender.SendIntentException {
        ?? r0 = (JCheckBoxMenuItem) registerActivityLifecycleCallbacks(this);
        r0.startIntentSenderForResult(atomicReference, r0, r0, r0, r0, r0, r0);
        return;
    }
}
