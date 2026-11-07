package com.github.caciocavallosilano.cacio.peer;

import com.pymcl.core.auth.SkinServer;
import java.awt.Dialog;
import java.awt.event.PaintEvent;
import java.awt.peer.WindowPeer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-shared-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/peer/ProxyWindowPeer.class */
class ProxyWindowPeer implements WindowPeer {
    private ProxyWindow proxyWindow;

    ProxyWindowPeer(ProxyWindow pw) {
        this.proxyWindow = pw;
    }

    CacioComponentPeer getTarget() {
        return this.proxyWindow.getTargetPeer();
    }

    public void toFront() {
    }

    public void toBack() {
    }

    public void setAlwaysOnTop(boolean alwaysOnTop) {
    }

    public void updateAlwaysOnTopState() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void updateFocusableWindowState() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.updateFocusableWindowState():void");
    }

    public void setModalBlocked(Dialog blocker, boolean blocked) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void updateMinimumSize() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.updateMinimumSize():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void updateIconImages() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.updateIconImages():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 java.awt.Insets, still in use, count: 2, list:
          (r0v0 java.awt.Insets) from 0x000b: RETURN (r0v0 java.awt.Insets)
          (r0v0 java.awt.Insets) from 0x0008: INVOKE (r0v0 java.awt.Insets) SUPER call: com.pymcl.core.auth.DeviceCode.component2():java.lang.String A[MD:():java.lang.String (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public java.awt.Insets getInsets() {
        /*
            r7 = this;
            java.awt.Insets r0 = new java.awt.Insets
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            super/*com.pymcl.core.auth.DeviceCode*/.getUserCode()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.getInsets():java.awt.Insets");
    }

    public void beginValidate() {
    }

    public void endValidate() {
    }

    public void beginLayout() {
    }

    public void endLayout() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public boolean isObscured() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.isObscured():boolean");
    }

    public boolean canDetermineObscurity() {
        return false;
    }

    public void setVisible(boolean v) {
    }

    public void setEnabled(boolean e) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void paint(java.awt.Graphics r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.paint(java.awt.Graphics):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void print(java.awt.Graphics r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.print(java.awt.Graphics):void");
    }

    public void setBounds(int x, int y, int width, int height, int op) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 ??, still in use, count: 6, list:
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
          (r0v3 ?? I:java.lang.String) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
          (r0v3 ?? I:java.lang.String) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
          (r0v3 ?? I:boolean) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
          (r0v3 ?? I:int) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
          (r0v3 ?? I:java.lang.Object) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void handleEvent(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 ??, still in use, count: 6, list:
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
          (r0v3 ?? I:java.lang.String) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
          (r0v3 ?? I:java.lang.String) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
          (r0v3 ?? I:boolean) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
          (r0v3 ?? I:int) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
          (r0v3 ?? I:java.lang.Object) from 0x000b: INVOKE (r0v4 ?? I:com.pymcl.core.account.Account) = 
          (r0v3 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r3v0 'this' ?? I:com.pymcl.core.auth.MicrosoftAuth A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:java.lang.String)
          (r0v3 ?? I:boolean)
          (r0v3 ?? I:int)
          (r0v3 ?? I:java.lang.Object)
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.completeLogin$default(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account A[MD:(com.pymcl.core.auth.MicrosoftAuth, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.pymcl.core.account.Account (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    public void coalescePaintEvent(PaintEvent e) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.MicrosoftAuth) from 0x0004: INVOKE (r0v2 ?? I:kotlin.Pair) = 
          (r0v1 ?? I:com.pymcl.core.auth.MicrosoftAuth)
          (r2v0 'this' ?? I:java.lang.String A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
         VIRTUAL call: com.pymcl.core.auth.MicrosoftAuth.xsts(java.lang.String):kotlin.Pair A[MD:(java.lang.String):kotlin.Pair<java.lang.String, java.lang.String> (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.awt.Point getLocationOnScreen() {
        /*
            r2 = this;
            r0 = r2
            void r0 = r0.<init>(r2, r0, r0)
            kotlin.Pair r0 = r0.xsts(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.getLocationOnScreen():java.awt.Point");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public java.awt.Dimension getPreferredSize() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.getPreferredSize():java.awt.Dimension");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public java.awt.Dimension getMinimumSize() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.getMinimumSize():java.awt.Dimension");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$$ExternalSyntheticLambda1) from 0x0004: INVOKE (r0v2 ?? I:java.lang.Thread) = 
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$$ExternalSyntheticLambda1)
          (r2v0 'this' ?? I:java.lang.Runnable A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
         VIRTUAL call: com.pymcl.core.auth.SkinServer$$ExternalSyntheticLambda1.newThread(java.lang.Runnable):java.lang.Thread A[MD:(java.lang.Runnable):java.lang.Thread (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.awt.image.ColorModel getColorModel() {
        /*
            r2 = this;
            r0 = r2
            void r0 = r0.<init>(r2, r0, r0)
            java.lang.Thread r0 = r0.newThread(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.getColorModel():java.awt.image.ColorModel");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Companion$$ExternalSyntheticLambda0) from 0x0004: INVOKE (r0v2 ?? I:java.lang.Object) = 
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Companion$$ExternalSyntheticLambda0)
          (r2v0 'this' ?? I:java.lang.Object A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
         VIRTUAL call: com.pymcl.core.auth.SkinServer$Companion$$ExternalSyntheticLambda0.invoke(java.lang.Object):java.lang.Object A[MD:(java.lang.Object):java.lang.Object (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.awt.Toolkit getToolkit() {
        /*
            r2 = this;
            r0 = r2
            void r0 = r0.<init>(r2, r0, r0)
            java.lang.Object r0 = r0.invoke(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.getToolkit():java.awt.Toolkit");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Companion) from 0x0004: INVOKE (r0v2 ?? I:java.lang.String) = 
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Companion)
          (r2v0 'this' ?? I:byte[] A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
         VIRTUAL call: com.pymcl.core.auth.SkinServer.Companion.digest(byte[]):java.lang.String A[MD:(byte[]):java.lang.String (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.awt.Graphics getGraphics() {
        /*
            r2 = this;
            r0 = r2
            void r0 = r0.<init>(r2, r0, r0)
            java.lang.String r0 = r0.digest(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.getGraphics():java.awt.Graphics");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 2, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Companion) from 0x0005: INVOKE (r0v2 ?? I:int) = (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Companion), (r4v0 ?? I:byte[] A[D('font' java.awt.Font)]), (r0v1 ?? I:int) VIRTUAL call: com.pymcl.core.auth.SkinServer.Companion.isValidSkin$be(byte[], int):int A[MD:(byte[], int):int (m)]
          (r0v1 ?? I:int) from 0x0005: INVOKE (r0v2 ?? I:int) = (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Companion), (r4v0 ?? I:byte[] A[D('font' java.awt.Font)]), (r0v1 ?? I:int) VIRTUAL call: com.pymcl.core.auth.SkinServer.Companion.isValidSkin$be(byte[], int):int A[MD:(byte[], int):int (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.awt.FontMetrics getFontMetrics(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 2, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Companion) from 0x0005: INVOKE (r0v2 ?? I:int) = (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Companion), (r4v0 ?? I:byte[] A[D('font' java.awt.Font)]), (r0v1 ?? I:int) VIRTUAL call: com.pymcl.core.auth.SkinServer.Companion.isValidSkin$be(byte[], int):int A[MD:(byte[], int):int (m)]
          (r0v1 ?? I:int) from 0x0005: INVOKE (r0v2 ?? I:int) = (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Companion), (r4v0 ?? I:byte[] A[D('font' java.awt.Font)]), (r0v1 ?? I:int) VIRTUAL call: com.pymcl.core.auth.SkinServer.Companion.isValidSkin$be(byte[], int):int A[MD:(byte[], int):int (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    public void dispose() {
        ProxyWindow proxyWindow = this.proxyWindow;
        SkinServer.Profile.getCapePng();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void setForeground(java.awt.Color r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.setForeground(java.awt.Color):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void setBackground(java.awt.Color r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.setBackground(java.awt.Color):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void setFont(java.awt.Font r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.setFont(java.awt.Font):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Profile) from 0x0004: INVOKE (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Profile) VIRTUAL call: com.pymcl.core.auth.SkinServer.Profile.toString():java.lang.String A[MD:():java.lang.String (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public void updateCursorImmediately() {
        /*
            r2 = this;
            r0 = r2
            void r0 = r0.<init>(r2, r0, r0)
            r0.toString()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.updateCursorImmediately():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Response) from 0x000b: INVOKE (r0v2 ?? I:byte[]) = (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Response) VIRTUAL call: com.pymcl.core.auth.SkinServer.Response.component3():byte[] A[MD:():byte[] (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public boolean requestFocus(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Response) from 0x000b: INVOKE (r0v2 ?? I:byte[]) = (r0v1 ?? I:com.pymcl.core.auth.SkinServer$Response) VIRTUAL call: com.pymcl.core.auth.SkinServer.Response.component3():byte[] A[MD:():byte[] (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 2, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer) from 0x0004: INVOKE (r0v2 ?? I:void) = 
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer)
          (r2v0 'this' ?? I:com.pymcl.core.auth.SkinServer A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v1 ?? I:java.net.Socket)
         VIRTUAL call: com.pymcl.core.auth.SkinServer.$r8$lambda$N7YC7kW3dVKWAEKgm71W2HQL8-g(com.pymcl.core.auth.SkinServer, java.net.Socket):void A[MD:(com.pymcl.core.auth.SkinServer, java.net.Socket):void (m)]
          (r0v1 ?? I:java.net.Socket) from 0x0004: INVOKE (r0v2 ?? I:void) = 
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer)
          (r2v0 'this' ?? I:com.pymcl.core.auth.SkinServer A[D('this' com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer), IMMUTABLE_TYPE, THIS])
          (r0v1 ?? I:java.net.Socket)
         VIRTUAL call: com.pymcl.core.auth.SkinServer.$r8$lambda$N7YC7kW3dVKWAEKgm71W2HQL8-g(com.pymcl.core.auth.SkinServer, java.net.Socket):void A[MD:(com.pymcl.core.auth.SkinServer, java.net.Socket):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public boolean isFocusable() {
        /*
            r2 = this;
            r0 = r2
            void r0 = r0.<init>(r2, r0, r0)
            void r0 = r0.m8014$r8$lambda$N7YC7kW3dVKWAEKgm71W2HQL8g(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.isFocusable():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer) from 0x0006: INVOKE (r0v2 ?? I:void) = 
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer)
          (r5v0 ?? I:java.security.KeyPair A[D('width' int)])
          (r6v0 ?? I:java.lang.String A[D('height' int)])
         VIRTUAL call: com.pymcl.core.auth.SkinServer.<init>(java.security.KeyPair, java.lang.String):void A[MD:(java.security.KeyPair, java.lang.String):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.awt.Image createImage(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer) from 0x0006: INVOKE (r0v2 ?? I:void) = 
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer)
          (r5v0 ?? I:java.security.KeyPair A[D('width' int)])
          (r6v0 ?? I:java.lang.String A[D('height' int)])
         VIRTUAL call: com.pymcl.core.auth.SkinServer.<init>(java.security.KeyPair, java.lang.String):void A[MD:(java.security.KeyPair, java.lang.String):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer) from 0x0006: INVOKE (r0v2 ?? I:java.lang.String) = (r0v1 ?? I:com.pymcl.core.auth.SkinServer) VIRTUAL call: com.pymcl.core.auth.SkinServer.getApiRoot():java.lang.String A[MD:():java.lang.String (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.awt.image.VolatileImage createVolatileImage(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer) from 0x0006: INVOKE (r0v2 ?? I:java.lang.String) = (r0v1 ?? I:com.pymcl.core.auth.SkinServer) VIRTUAL call: com.pymcl.core.auth.SkinServer.getApiRoot():java.lang.String A[MD:():java.lang.String (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:com.pymcl.core.auth.SkinServer) from 0x0004: INVOKE (r0v2 ?? I:boolean) = (r0v1 ?? I:com.pymcl.core.auth.SkinServer) VIRTUAL call: com.pymcl.core.auth.SkinServer.getRunning():boolean A[MD:():boolean (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.awt.GraphicsConfiguration getGraphicsConfiguration() {
        /*
            r2 = this;
            r0 = r2
            void r0 = r0.<init>(r2, r0, r0)
            boolean r0 = r0.getRunning()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.getGraphicsConfiguration():java.awt.GraphicsConfiguration");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public boolean handlesWheelScrolling() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.handlesWheelScrolling():boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void createBuffers(int r5, java.awt.BufferCapabilities r6) throws java.awt.AWTException {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.createBuffers(int, java.awt.BufferCapabilities):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public java.awt.Image getBackBuffer() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.getBackBuffer():java.awt.Image");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void flip(int r5, int r6, int r7, int r8, java.awt.BufferCapabilities.FlipContents r9) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.flip(int, int, int, int, java.awt.BufferCapabilities$FlipContents):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void destroyBuffers() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.destroyBuffers():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void reparent(java.awt.peer.ContainerPeer r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.reparent(java.awt.peer.ContainerPeer):void");
    }

    public boolean isReparentSupported() {
        return false;
    }

    public void layout() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void applyShape(sun.java2d.pipe.Region r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.applyShape(sun.java2d.pipe.Region):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void setOpacity(float r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.setOpacity(float):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void setOpaque(boolean r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.setOpaque(boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void setZOrder(java.awt.peer.ComponentPeer r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.setZOrder(java.awt.peer.ComponentPeer):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void updateWindow() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.updateWindow():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public boolean updateGraphicsData(java.awt.GraphicsConfiguration r5) {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.updateGraphicsData(java.awt.GraphicsConfiguration):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 2, list:
          (r0v0 ?? I:java.lang.Throwable) from 0x0009: THROW (r0v0 ?? I:java.lang.Throwable)
          (r0v0 ?? I:com.pymcl.core.auth.AgentJars) from 0x0006: INVOKE (r0v1 'unused' java.lang.CharSequence A[SYNTHETIC]) = (r0v0 ?? I:com.pymcl.core.auth.AgentJars) STATIC call: com.pymcl.core.auth.AgentJars.sha256$lambda$0(byte):java.lang.CharSequence A[MD:(byte):java.lang.CharSequence (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.pymcl.core.auth.AgentJars, java.lang.Throwable, java.lang.UnsupportedOperationException] */
    public void repositionSecurityWarning() {
        /*
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not supported yet."
            super/*com.pymcl.core.auth.AgentJars*/.$r8$lambda$QG6mwePvnVHp9iD54w9EU7GsIuY(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.peer.ProxyWindowPeer.repositionSecurityWarning():void");
    }
}
