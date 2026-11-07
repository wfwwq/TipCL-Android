package com.pymcl.runtime.keyboard;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pymcl.runtime.keyboard.PcKeyboardLayout;
import com.pymcl.runtime.keyboard.StickyModifiers;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PcKeyboardView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\bH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\u0016\b\u0019\u0012\u0012\b\u001a\u0012\u000e\b\fJ\u0004\b\b(\u001bJ\u0004\b\b(\u001c¨\u0006\u0018"}, d2 = {"Lcom/pymcl/runtime/keyboard/PcKeyboardView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "sink", "Lcom/pymcl/runtime/input/InputSink;", "onClose", "Lkotlin/Function0;", "", "<init>", "(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;)V", "sticky", "Lcom/pymcl/runtime/keyboard/StickyModifiers;", "getSticky", "()Lcom/pymcl/runtime/keyboard/StickyModifiers;", "modViews", "Ljava/util/HashMap;", "", "Landroid/widget/TextView;", "Lkotlin/collections/HashMap;", "keyView", "k", "Lcom/pymcl/runtime/keyboard/PcKeyboardLayout$K;", "refreshMods", "PyMCL-Android:runtime_debug", "Landroid/annotation/SuppressLint;", "value", "ViewConstructor", "ClickableViewAccessibility"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PcKeyboardView extends LinearLayout {
    private final HashMap<String, TextView> modViews;
    private final Function0<Unit> onClose;
    private final StickyModifiers sticky;

    /* compiled from: PcKeyboardView.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickyModifiers.State.values().length];
            try {
                iArr[StickyModifiers.State.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[StickyModifiers.State.ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[StickyModifiers.State.LOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 'line'  android.widget.LinearLayout, still in use, count: 4, list:
          (r2v0 'line' android.widget.LinearLayout) from 0x0050: INVOKE (r2v0 'line' android.widget.LinearLayout) DIRECT call: java.awt.TextField.getText():java.lang.String
          (r2v0 'line' android.widget.LinearLayout A[D('line' android.widget.LinearLayout)]) from 0x0083: INVOKE 
          (r2v0 'line' android.widget.LinearLayout A[D('line' android.widget.LinearLayout)])
          (r7v2 android.widget.TextView)
          (r8v1 android.widget.LinearLayout$LayoutParams)
         VIRTUAL call: android.widget.LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams):void A[MD:(android.view.View, android.view.ViewGroup$LayoutParams):void (c)]
          (r2v0 'line' android.widget.LinearLayout A[D('$this$_init__u24lambda_u240' android.widget.LinearLayout)]) from 0x0056: INVOKE (r2v0 'line' android.widget.LinearLayout A[D('$this$_init__u24lambda_u240' android.widget.LinearLayout)]), (0 int) VIRTUAL call: android.widget.LinearLayout.setOrientation(int):void A[MD:(int):void (c)] (LINE:72)
          (r2v0 'line' android.widget.LinearLayout A[D('line' android.widget.LinearLayout)]) from 0x0088: MOVE (r3v3 android.widget.LinearLayout) = (r2v0 'line' android.widget.LinearLayout A[D('line' android.widget.LinearLayout)]) (LINE:74)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public PcKeyboardView(android.content.Context r12, com.pymcl.runtime.input.InputSink r13, kotlin.jvm.functions.Function0<kotlin.Unit> r14) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onClose"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r11.getText()
            r11.onClose = r14
            com.pymcl.runtime.keyboard.StickyModifiers r0 = new com.pymcl.runtime.keyboard.StickyModifiers
            r0.<init>(r13)
            r11.sticky = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r11.modViews = r0
            r0 = 1
            r11.setOrientation(r0)
            r0 = 170(0xaa, float:2.38E-43)
            r1 = 20
            int r0 = android.graphics.Color.argb(r0, r1, r1, r1)
            r11.setBackgroundColor(r0)
            r0 = 6
            r11.setPadding(r0, r0, r0, r0)
            com.pymcl.runtime.keyboard.PcKeyboardLayout r0 = com.pymcl.runtime.keyboard.PcKeyboardLayout.INSTANCE
            java.util.List r0 = r0.getRows()
            java.util.Iterator r0 = r0.iterator()
        L42:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.getText()
            r3 = r2
            r4 = 0
            r5 = 0
            r3.setOrientation(r5)
            java.util.Iterator r3 = r1.iterator()
        L5d:
            boolean r4 = r3.hasNext()
            r6 = -1
            if (r4 == 0) goto L87
            java.lang.Object r4 = r3.next()
            com.pymcl.runtime.keyboard.PcKeyboardLayout$K r4 = (com.pymcl.runtime.keyboard.PcKeyboardLayout.K) r4
            android.widget.TextView r7 = r11.keyView(r4)
            android.view.View r7 = (android.view.View) r7
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            float r9 = r4.getWeight()
            r8.<init>(r5, r6, r9)
            r6 = r8
            r9 = 0
            r10 = 3
            r6.setMargins(r10, r10, r10, r10)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            android.view.ViewGroup$LayoutParams r8 = (android.view.ViewGroup.LayoutParams) r8
            r2.addView(r7, r8)
            goto L5d
        L87:
            r3 = r2
            android.view.View r3 = (android.view.View) r3
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r7 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r6, r5, r7)
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4
            r11.addView(r3, r4)
            goto L42
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.keyboard.PcKeyboardView.<init>(android.content.Context, com.pymcl.runtime.input.InputSink, kotlin.jvm.functions.Function0):void");
    }

    public final StickyModifiers getSticky() {
        return this.sticky;
    }

    private final TextView keyView(final PcKeyboardLayout.K k) {
        TextView $this$keyView_u24lambda_u240 = new TextView(getContext());
        k.getLabel();
        $this$keyView_u24lambda_u240.getColumns();
        $this$keyView_u24lambda_u240.setGravity(17);
        $this$keyView_u24lambda_u240.setTextColor(-1);
        $this$keyView_u24lambda_u240.setTextSize(13.0f);
        GradientDrawable $this$keyView_u24lambda_u240_u240 = new GradientDrawable();
        $this$keyView_u24lambda_u240_u240.setCornerRadius(10.0f);
        $this$keyView_u24lambda_u240_u240.setColor(Color.argb(150, 70, 70, 70));
        $this$keyView_u24lambda_u240.setBackground($this$keyView_u24lambda_u240_u240);
        if (PcKeyboardLayout.INSTANCE.getMODIFIERS().contains(k.getKey())) {
            this.modViews.put(k.getKey(), $this$keyView_u24lambda_u240);
        }
        $this$keyView_u24lambda_u240.setOnTouchListener(new View.OnTouchListener() { // from class: com.pymcl.runtime.keyboard.PcKeyboardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return PcKeyboardView.keyView$lambda$0$1(k, this, view, motionEvent);
            }
        });
        return $this$keyView_u24lambda_u240;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean keyView$lambda$0$1(PcKeyboardLayout.K $k, PcKeyboardView this$0, View view, MotionEvent e) {
        switch (e.getActionMasked()) {
            case 0:
                view.getAWTComponent();
                if (!Intrinsics.areEqual($k.getKey(), "@close")) {
                    if (PcKeyboardLayout.INSTANCE.getMODIFIERS().contains($k.getKey())) {
                        this$0.sticky.tapModifier($k.getKey());
                        this$0.refreshMods();
                    } else {
                        this$0.sticky.normal($k.getKey(), true);
                    }
                }
                return true;
            case 1:
            case 3:
                view.getAWTComponent();
                if (Intrinsics.areEqual($k.getKey(), "@close")) {
                    this$0.sticky.releaseAll();
                    this$0.refreshMods();
                    this$0.onClose.invoke();
                } else if (!PcKeyboardLayout.INSTANCE.getMODIFIERS().contains($k.getKey())) {
                    this$0.sticky.normal($k.getKey(), false);
                    this$0.refreshMods();
                }
                return true;
            case 2:
            default:
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, void] */
    private final void refreshMods() {
        int iArgb;
        HashMap<String, TextView> map = this.modViews;
        for (Map.Entry element$iv : map.entrySet()) {
            String key = (String) element$iv.getKey();
            TextView v = (TextView) element$iv.getValue();
            StickyModifiers.State st = this.sticky.getStates().get(key);
            if (st == null) {
                st = StickyModifiers.State.OFF;
            }
            ?? text = v.setText(map);
            Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            GradientDrawable gradientDrawable = (GradientDrawable) text;
            switch (WhenMappings.$EnumSwitchMapping$0[st.ordinal()]) {
                case 1:
                    iArgb = Color.argb(150, 70, 70, 70);
                    break;
                case 2:
                    iArgb = Color.argb(200, 46, 155, 107);
                    break;
                case 3:
                    iArgb = Color.argb(230, 220, 140, 30);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            gradientDrawable.setColor(iArgb);
        }
    }
}
