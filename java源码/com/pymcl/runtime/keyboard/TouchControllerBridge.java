package com.pymcl.runtime.keyboard;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.system.Os;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import com.github.caciocavallosilano.cacio.peer.CacioComponentPeer;
import com.pymcl.runtime.keyboard.TextFieldChannel;
import java.awt.peer.ComponentPeer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import top.fifthlight.touchcontroller.proxy.client.LauncherProxyClient;
import top.fifthlight.touchcontroller.proxy.client.MessageTransport;
import top.fifthlight.touchcontroller.proxy.client.PlatformCapability;
import top.fifthlight.touchcontroller.proxy.client.android.transport.UnixSocketTransportKt;
import top.fifthlight.touchcontroller.proxy.message.FloatRect;
import top.fifthlight.touchcontroller.proxy.message.VibrateMessage;
import top.fifthlight.touchcontroller.proxy.message.input.TextInputState;
import top.fifthlight.touchcontroller.proxy.message.input.TextRange;

/* compiled from: TouchControllerBridge.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/pymcl/runtime/keyboard/TouchControllerBridge;", "Lcom/pymcl/runtime/keyboard/TextFieldChannel;", "context", "Landroid/content/Context;", "client", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;", "<init>", "(Landroid/content/Context;Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V", "width", "", "getWidth", "()I", "setWidth", "(I)V", "height", "getHeight", "setHeight", "ids", "Landroid/util/SparseIntArray;", "next", "setListener", "", "l", "Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;", "pushState", "state", "Lcom/pymcl/runtime/keyboard/TextFieldState;", "onTouch", "e", "Landroid/view/MotionEvent;", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TouchControllerBridge implements TextFieldChannel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String SOCKET = "PyMCL";
    private final LauncherProxyClient client;
    private int height;
    private final SparseIntArray ids;
    private int next;
    private int width;

    public /* synthetic */ TouchControllerBridge(Context context, LauncherProxyClient launcherProxyClient, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, launcherProxyClient);
    }

    /* compiled from: TouchControllerBridge.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;", "", "<init>", "()V", "SOCKET", "", "modPresent", "", "gameDir", "create", "Lcom/pymcl/runtime/keyboard/TouchControllerBridge;", "context", "Landroid/content/Context;", "toState", "Lcom/pymcl/runtime/keyboard/TextFieldState;", "s", "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;", "fromState", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean modPresent(java.lang.String r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "gameDir"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                java.io.File r1 = new java.io.File
                java.lang.String r2 = "mods"
                r1.<init>(r0, r2)
                java.io.File[] r1 = r1.listFiles()
                r2 = 0
                if (r1 == 0) goto L64
                r3 = 0
                int r4 = r1.length
                r5 = r2
            L18:
                r6 = 1
                if (r5 >= r4) goto L60
                r7 = r1[r5]
                r8 = r7
                r9 = 0
                boolean r10 = r8.isFile()
                if (r10 == 0) goto L58
                java.lang.String r10 = r8.getName()
                java.lang.String r11 = "getName(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
                java.util.Locale r11 = java.util.Locale.ROOT
                java.lang.String r10 = r10.toLowerCase(r11)
                java.lang.String r11 = "toLowerCase(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
                r11 = 0
                r12 = r10
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                java.lang.String r13 = "touchcontroller"
                java.lang.CharSequence r13 = (java.lang.CharSequence) r13
                r14 = 2
                r15 = 0
                boolean r12 = kotlin.text.StringsKt.contains$default(r12, r13, r2, r14, r15)
                if (r12 == 0) goto L53
                java.lang.String r12 = ".jar"
                boolean r12 = kotlin.text.StringsKt.endsWith$default(r10, r12, r2, r14, r15)
                if (r12 == 0) goto L53
                r10 = r6
                goto L54
            L53:
                r10 = r2
            L54:
                if (r10 == 0) goto L58
                r8 = r6
                goto L59
            L58:
                r8 = r2
            L59:
                if (r8 == 0) goto L5d
                r1 = r6
                goto L61
            L5d:
                int r5 = r5 + 1
                goto L18
            L60:
                r1 = r2
            L61:
                if (r1 != r6) goto L64
                r2 = r6
            L64:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.keyboard.TouchControllerBridge.Companion.modPresent(java.lang.String):boolean");
        }

        public final TouchControllerBridge create(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            DefaultConstructorMarker defaultConstructorMarker = null;
            try {
                MessageTransport transport = UnixSocketTransportKt.UnixSocketTransport("PyMCL");
                Os.setenv("TOUCH_CONTROLLER_PROXY_SOCKET", "PyMCL", true);
                LauncherProxyClient c = new LauncherProxyClient(transport, SetsKt.setOf(PlatformCapability.TEXT_STATUS));
                TouchControllerBridge touchControllerBridge = new TouchControllerBridge(context, c, defaultConstructorMarker);
                c.run();
                return touchControllerBridge;
            } catch (Throwable t) {
                Log.w("PyMCL-Game", "TouchController proxy 创建失败", t);
                return null;
            }
        }

        public final TextFieldState toState(TextInputState s) {
            Intrinsics.checkNotNullParameter(s, "s");
            return new TextFieldState(s.getText(), s.getSelection().getStart(), s.getSelection().getEnd(), s.getComposition().getLength() == 0 ? -1 : s.getComposition().getStart(), s.getComposition().getLength() != 0 ? s.getComposition().getEnd() : -1);
        }

        public final TextInputState fromState(TextFieldState s) {
            Intrinsics.checkNotNullParameter(s, "s");
            String text = s.getText();
            int composingEnd = s.getComposingEnd();
            int composingStart = s.getComposingStart();
            return new TextInputState(text, composingStart >= 0 && composingStart < composingEnd ? new TextRange(s.getComposingStart(), s.getComposingEnd() - s.getComposingStart()) : TextRange.INSTANCE.getEMPTY(), new TextRange(RangesKt.coerceAtLeast(Math.min(s.getSelectionStart(), s.getSelectionEnd()), 0), Math.abs(s.getSelectionEnd() - s.getSelectionStart())), false, 8, null);
        }
    }

    private TouchControllerBridge(Context context, LauncherProxyClient client) {
        this.client = client;
        this.width = 1;
        this.height = 1;
        this.ids = new SparseIntArray();
        this.next = 1;
        final Vibrator vib = (Vibrator) context.getSystemService(Vibrator.class);
        this.client.setVibrationHandler(new LauncherProxyClient.VibrationHandler() { // from class: com.pymcl.runtime.keyboard.TouchControllerBridge.1
            @Override // top.fifthlight.touchcontroller.proxy.client.LauncherProxyClient.VibrationHandler
            public void vibrate(VibrateMessage.Kind kind) {
                Unit unit;
                Intrinsics.checkNotNullParameter(kind, "kind");
                Vibrator vibrator = vib;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    AnonymousClass1 anonymousClass1 = this;
                    if (vibrator != null) {
                        vibrator.vibrate(VibrationEffect.createOneShot(100L, -1));
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    Result.m8116constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m8116constructorimpl(ResultKt.createFailure(th));
                }
            }
        });
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @Override // com.pymcl.runtime.keyboard.TextFieldChannel
    public void setListener(final TextFieldChannel.Listener l) {
        this.client.setInputHandler(l == null ? null : new LauncherProxyClient.InputHandler() { // from class: com.pymcl.runtime.keyboard.TouchControllerBridge.setListener.1
            @Override // top.fifthlight.touchcontroller.proxy.client.LauncherProxyClient.InputHandler
            public void updateState(TextInputState textInputState) {
                l.onState(textInputState != null ? TouchControllerBridge.INSTANCE.toState(textInputState) : null);
            }

            @Override // top.fifthlight.touchcontroller.proxy.client.LauncherProxyClient.InputHandler
            public void updateCursor(FloatRect cursorRect) {
            }

            @Override // top.fifthlight.touchcontroller.proxy.client.LauncherProxyClient.InputHandler
            public void updateArea(FloatRect inputAreaRect) {
            }
        });
    }

    @Override // com.pymcl.runtime.keyboard.TextFieldChannel
    public void pushState(TextFieldState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.client.updateTextInputState(INSTANCE.fromState(state));
    }

    private static final void onTouch$add(TouchControllerBridge this$0, MotionEvent $e, int id, int i) {
        this$0.client.addPointer(id, $e.getX(i) / this$0.width, $e.getY(i) / this$0.height);
    }

    public final void onTouch(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        switch (e.getActionMasked()) {
            case 0:
                int id = this.next;
                this.next = id + 1;
                this.ids.put(e.getPointerId(0), id);
                onTouch$add(this, e, id, 0);
                break;
            case 1:
            case 3:
                this.client.clearPointer();
                ComponentPeer cacioComponentPeer = new CacioComponentPeer(cacioComponentPeer, cacioComponentPeer);
                break;
            case 2:
                int pointerCount = e.getPointerCount();
                for (int i = 0; i < pointerCount; i++) {
                    onTouch$add(this, e, this.ids.get(e.getPointerId(i)), i);
                }
                break;
            case 5:
                int i2 = e.getActionIndex();
                int id2 = this.next;
                this.next = id2 + 1;
                this.ids.put(e.getPointerId(i2), id2);
                onTouch$add(this, e, id2, i2);
                break;
            case 6:
                int i3 = e.getActionIndex();
                int id3 = this.ids.get(e.getPointerId(i3));
                if (id3 != 0) {
                    this.ids.delete(e.getPointerId(i3));
                    this.client.removePointer(id3);
                    break;
                }
                break;
        }
    }
}
