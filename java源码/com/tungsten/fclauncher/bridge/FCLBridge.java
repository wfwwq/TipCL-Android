package com.tungsten.fclauncher.bridge;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tungsten.fcl.FCLApp;
import com.tungsten.fcl.setting.MenuSetting;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.glfw.CallbackBridge;
import org.lwjgl.util.freetype.FreeType;

/* loaded from: classes14.dex */
public class FCLBridge {
    public static final int Button1 = 0;
    public static final int Button2 = 1;
    public static final int Button3 = 2;
    public static final int Button4 = 3;
    public static final int Button5 = 4;
    public static final int Button6 = 5;
    public static final int Button7 = 6;
    public static final int ButtonPress = 4;
    public static final int ButtonRelease = 5;
    public static final int ConfigureNotify = 22;
    public static final int CursorDisabled = 0;
    public static final int CursorEnabled = 1;
    public static final int DEFAULT_HEIGHT = 720;
    public static final int DEFAULT_WIDTH = 1280;
    public static final int FCLMessage = 37;
    public static final int KeyChar = 7;
    public static final int KeyPress = 2;
    public static final int KeyRelease = 3;
    public static final int MotionNotify = 6;
    private FCLBridgeCallback callback;
    private String gameDir;
    private Handler handler;
    private String java;
    private String logPath;
    private String modSummary;
    private String renderer;
    private Surface surface;
    private boolean surfaceDestroyed;
    private SurfaceTexture surfaceTexture;
    private Thread thread;
    public static boolean FORCE_RESOLUTION = false;
    public static float FORCE_RESOLUTION_SCALE = -1.0f;
    public static int FORCE_RESOLUTION_WIDTH = 1920;
    public static int FORCE_RESOLUTION_HEIGHT = FreeType.TT_MS_LANGID_FAEROESE_FAEROE_ISLANDS;
    public static int FORCE_RESOLUTION_START_SIZE = -1;
    private double scaleFactor = 1.0d;
    private String controller = "Default";
    private boolean hasTouchController = false;
    private volatile boolean cleanroomActive = false;

    public static native long getJavaVMPointer();

    public static native void initializeHooks();

    public static native String jObjectToString(Object obj);

    public static native void nativeClipboardReceived(String str, String str2);

    public native int chdir(String str);

    public native long dlopen(String str);

    public native void nativeMoveWindow(int i, int i2);

    public native void nativeSendData(int i, int i2, int i3, int i4, int i5);

    public native int redirectStdio(String str);

    public native int[] renderAWTScreenFrame();

    public native void setLdLibraryPath(String str);

    public native void setenv(String str, String str2);

    public native void setupExitTrap(FCLBridge fCLBridge);

    static {
        System.loadLibrary("fcl");
        System.loadLibrary("pojavexec_awt");
    }

    public void setCleanroomActive(boolean cleanroomActive) {
        this.cleanroomActive = cleanroomActive;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public Thread getThread() {
        return this.thread;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        this.surfaceTexture = surfaceTexture;
    }

    public FCLBridgeCallback getCallback() {
        return this.callback;
    }

    public void execute(Surface surface, FCLBridgeCallback callback) {
        this.handler = new Handler(Looper.getMainLooper());
        this.callback = callback;
        this.surface = surface;
        CallbackBridge.setFCLBridge(this);
        CallbackBridge.setCleanroomActive(this.cleanroomActive);
        receiveLog("==================== Before Start ====================\n");
        receiveLog("invoke redirectStdio\n");
        int errorCode = redirectStdio(getLogPath());
        if (errorCode != 0) {
            receiveLog("Can't exec redirectStdio! Error code: " + errorCode + StringUtils.LF);
        }
        receiveLog("invoke setLogPipeReady\n");
        if (surface != null) {
            handleWindow();
        }
        receiveLog("invoke setEventPipe\n");
        if (this.thread != null) {
            this.thread.start();
        }
    }

    public void pushEventMouseButton(int button, boolean press) {
        switch (button) {
            case 3:
                if (press) {
                    CallbackBridge.sendScroll(0.0d, 1.0d);
                    break;
                }
                break;
            case 4:
                if (press) {
                    CallbackBridge.sendScroll(0.0d, -1.0d);
                    break;
                }
                break;
            default:
                CallbackBridge.sendMouseButton(button, press);
                break;
        }
    }

    public void pushEventPointer(float x, float y) {
        float x2;
        float y2;
        if (FORCE_RESOLUTION) {
            x2 = (x - FORCE_RESOLUTION_START_SIZE) / FORCE_RESOLUTION_SCALE;
            y2 = y / FORCE_RESOLUTION_SCALE;
        } else {
            x2 = ((float) this.scaleFactor) * x;
            y2 = y * ((float) this.scaleFactor);
        }
        CallbackBridge.sendCursorPos(x2, y2);
    }

    public static void pushEventLookDelta(float x, float y) {
        if (FORCE_RESOLUTION) {
            x /= FORCE_RESOLUTION_SCALE;
            y /= FORCE_RESOLUTION_SCALE;
        }
        CallbackBridge.sendCursorDelta(x, y);
    }

    public static void initForceResolution(MenuSetting menuSetting) {
        FORCE_RESOLUTION = menuSetting != null && menuSetting.isForceResolution();
        FORCE_RESOLUTION_WIDTH = menuSetting != null ? menuSetting.getForceResolutionWidth() : 1920;
        FORCE_RESOLUTION_HEIGHT = menuSetting != null ? menuSetting.getForceResolutionHeight() : FreeType.TT_MS_LANGID_FAEROESE_FAEROE_ISLANDS;
    }

    public void pushEventKey(int keyCode, int keyChar, boolean press) {
        CallbackBridge.sendKeycode(keyCode, (char) keyChar, 0, CallbackBridge.getCurrentMods(), press);
    }

    public void pushEventChar(char keyChar) {
        CallbackBridge.sendChar(keyChar, 0);
    }

    public void pushEventWindow(int width, int height) {
        CallbackBridge.sendUpdateWindowSize(width, height);
    }

    public void onExit(int code) {
        if (this.callback != null) {
            this.callback.onLog("\nOpenJDK exited with code : " + code + StringUtils.LF);
            this.callback.onExit(code);
        }
    }

    public void setCursorMode(int mode) {
        if (this.callback != null) {
            this.callback.onCursorModeChange(mode);
        }
    }

    public void setPrimaryClipString(String string) {
        ClipboardManager clipboard = (ClipboardManager) FCLApp.getAppContext().getSystemService("clipboard");
        ClipData clip = ClipData.newPlainText("FCL Clipboard", string);
        clipboard.setPrimaryClip(clip);
    }

    public String getPrimaryClipString() {
        ClipboardManager clipboard = (ClipboardManager) FCLApp.getAppContext().getSystemService("clipboard");
        if (!clipboard.hasPrimaryClip()) {
            return null;
        }
        ClipData.Item item = clipboard.getPrimaryClip().getItemAt(0);
        return item.getText().toString();
    }

    public static void openLink(final String link) {
        final Activity activity = FCLApp.getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.tungsten.fclauncher.bridge.FCLBridge$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                FCLBridge.lambda$openLink$0(link, activity);
            }
        });
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:161)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    static /* synthetic */ void lambda$openLink$0(
    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:161)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
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

    public static void querySystemClipboard() {
        Activity activity = FCLApp.getActivity();
        if (activity == null) {
            return;
        }
        final ClipboardManager clipboard = (ClipboardManager) FCLApp.getAppContext().getSystemService("clipboard");
        activity.runOnUiThread(new Runnable() { // from class: com.tungsten.fclauncher.bridge.FCLBridge$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                FCLBridge.lambda$querySystemClipboard$1(clipboard);
            }
        });
    }

    static /* synthetic */ void lambda$querySystemClipboard$1(ClipboardManager clipboard) {
        ClipData clipData = clipboard.getPrimaryClip();
        if (clipData == null) {
            nativeClipboardReceived(null, null);
            return;
        }
        ClipData.Item firstClipItem = clipData.getItemAt(0);
        CharSequence clipItemText = firstClipItem.getText();
        if (clipItemText == null) {
            nativeClipboardReceived(null, null);
        } else {
            nativeClipboardReceived(clipItemText.toString(), "plain");
        }
    }

    public static void putClipboardData(final String data, final String mimeType) {
        final Activity activity = FCLApp.getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.tungsten.fclauncher.bridge.FCLBridge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FCLBridge.lambda$putClipboardData$2(activity, mimeType, data);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ void lambda$putClipboardData$2(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "clipboard"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            r1 = 0
            int r2 = r5.hashCode()
            switch(r2) {
                case -1082243251: goto L1b;
                case 817335912: goto L11;
                default: goto L10;
            }
        L10:
            goto L25
        L11:
            java.lang.String r2 = "text/plain"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L10
            r2 = 0
            goto L26
        L1b:
            java.lang.String r2 = "text/html"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L26
        L25:
            r2 = -1
        L26:
            java.lang.String r3 = "AWT Paste"
            switch(r2) {
                case 0: goto L31;
                case 1: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L36
        L2c:
            android.content.ClipData r1 = android.content.ClipData.newHtmlText(r3, r6, r6)
            goto L36
        L31:
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r3, r6)
        L36:
            if (r1 == 0) goto L3b
            r0.setPrimaryClip(r1)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tungsten.fclauncher.bridge.FCLBridge.lambda$putClipboardData$2(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    public void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }

    public double getScaleFactor() {
        return this.scaleFactor;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getController() {
        return this.controller;
    }

    public void setGameDir(String gameDir) {
        this.gameDir = gameDir;
    }

    public String getGameDir() {
        return this.gameDir;
    }

    public void setRenderer(String renderer) {
        this.renderer = renderer;
    }

    public String getRenderer() {
        return this.renderer;
    }

    public void setJava(String java) {
        this.java = java;
    }

    public String getJava() {
        return this.java;
    }

    public void setSurfaceDestroyed(boolean surfaceDestroyed) {
        this.surfaceDestroyed = surfaceDestroyed;
    }

    public boolean isSurfaceDestroyed() {
        return this.surfaceDestroyed;
    }

    public String getLogPath() {
        return this.logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public void receiveLog(String log) {
        if (this.callback != null) {
            this.callback.onLog(log);
        }
    }

    private void handleWindow() {
        if (this.gameDir != null) {
            receiveLog("invoke setFCLNativeWindow\n");
            CallbackBridge.setupBridgeWindow(this.surface);
        } else {
            receiveLog("start Android AWT Renderer thread\n");
            Thread canvasThread = new Thread(new Runnable() { // from class: com.tungsten.fclauncher.bridge.FCLBridge$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$handleWindow$4();
                }
            }, "AndroidAWTRenderer");
            canvasThread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleWindow$4() {
        Bitmap rgbArrayBitmap = Bitmap.createBitmap(1280, DEFAULT_HEIGHT, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        while (!this.surfaceDestroyed && this.surface.isValid()) {
            try {
                Canvas canvas = this.surface.lockCanvas(null);
                canvas.drawRGB(0, 0, 0);
                int[] rgbArray = renderAWTScreenFrame();
                if (rgbArray != null) {
                    canvas.save();
                    rgbArrayBitmap.setPixels(rgbArray, 0, 1280, 0, 0, 1280, DEFAULT_HEIGHT);
                    canvas.drawBitmap(rgbArrayBitmap, 0.0f, 0.0f, paint);
                    canvas.restore();
                }
                this.surface.unlockCanvasAndPost(canvas);
            } catch (Throwable throwable) {
                this.handler.post(new Runnable() { // from class: com.tungsten.fclauncher.bridge.FCLBridge$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$handleWindow$3(throwable);
                    }
                });
            }
        }
        rgbArrayBitmap.recycle();
        this.surface.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleWindow$3(Throwable throwable) {
        receiveLog(throwable + StringUtils.LF);
    }

    public static int getFps() {
        return CallbackBridge.getFps();
    }

    public String getModSummary() {
        return this.modSummary;
    }

    public void setModSummary(String modSummary) {
        this.modSummary = modSummary;
    }

    public boolean hasTouchController() {
        return this.hasTouchController;
    }

    public void setHasTouchController(boolean hasTouchController) {
        this.hasTouchController = hasTouchController;
    }
}
