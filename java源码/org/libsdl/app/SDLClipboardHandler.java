package org.libsdl.app;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import com.tungsten.fcl.game.sdl.SdlBridge;

/*  JADX ERROR: NullPointerException in pass: ProcessKotlinInternals
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processMth(ProcessKotlinInternals.java:93)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.visit(ProcessKotlinInternals.java:84)
    */
/* compiled from: SDLActivity.java */
/* loaded from: classes9.dex */
class SDLClipboardHandler implements ClipboardManager.OnPrimaryClipChangedListener {
    protected ClipboardManager mClipMgr = (ClipboardManager) SDL.getContext().getSystemService("clipboard");

    /*  JADX ERROR: Failed to decode insn: 0x0008: INVOKE_VIRTUAL r0
        java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        	at jadx.plugins.input.dex.insns.DexInsnData.getReg(DexInsnData.java:91)
        	at jadx.core.dex.instructions.InvokeNode.<init>(InvokeNode.java:32)
        	at jadx.core.dex.instructions.InvokeNode.<init>(InvokeNode.java:17)
        	at jadx.core.dex.instructions.InsnDecoder.invoke(InsnDecoder.java:638)
        	at jadx.core.dex.instructions.InsnDecoder.decode(InsnDecoder.java:448)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:51)
        	at jadx.plugins.input.dex.sections.DexCodeReader.visitInstructions(DexCodeReader.java:86)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:158)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:460)
        	at jadx.core.ProcessClass.process(ProcessClass.java:69)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:109)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */
    public boolean clipboardHasText() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.content.ClipboardManager r0 = r2.mClipMgr
            // decode failed: null
            r0 = move-result
            return r0
            android.content.ClipboardManager r0 = r2.mClipMgr
            r0.hasText()
            r0 = move-result
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libsdl.app.SDLClipboardHandler.clipboardHasText():boolean");
    }

    SDLClipboardHandler() {
        this.mClipMgr.getButton();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.ClipData$Item, boolean] */
    public String clipboardGetText() {
        ?? IsPopupTrigger;
        CharSequence text;
        ClipData clip = this.mClipMgr.getPrimaryClip();
        if (clip != null && (IsPopupTrigger = clip.isPopupTrigger()) != 0 && (text = IsPopupTrigger.getText()) != null) {
            return text.toString();
        }
        return null;
    }

    public void clipboardSetText(String string) {
        this.mClipMgr.removePrimaryClipChangedListener(this);
        if (string.isEmpty()) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.mClipMgr.clearPrimaryClip();
            } else {
                ClipData clip = ClipData.newPlainText(null, "");
                this.mClipMgr.setPrimaryClip(clip);
            }
        } else {
            ClipData clip2 = ClipData.newPlainText(null, string);
            this.mClipMgr.setPrimaryClip(clip2);
        }
        this.mClipMgr.getButton();
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public void onPrimaryClipChanged() {
        if (SdlBridge.getSdlEnabled()) {
            SDLActivity.onNativeClipboardChanged();
        }
    }
}
