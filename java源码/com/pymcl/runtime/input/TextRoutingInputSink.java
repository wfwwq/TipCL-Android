package com.pymcl.runtime.input;

import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;

/* compiled from: SdlTextInput.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0011H\u0016J\u0006\u0010\"\u001a\u00020\u0016J\u0019\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0096\u0001J\u0019\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0096\u0001J\u0019\u0010*\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0014H\u0096\u0001J\u0011\u0010+\u001a\u00020\u00162\u0006\u0010)\u001a\u00020,H\u0096\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/pymcl/runtime/input/TextRoutingInputSink;", "Lcom/pymcl/runtime/input/InputSink;", "base", "channel", "Lcom/pymcl/runtime/input/SdlTextChannel;", "route", "Lcom/pymcl/runtime/input/TextRoute;", "<init>", "(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/input/SdlTextChannel;Lcom/pymcl/runtime/input/TextRoute;)V", "getBase", "()Lcom/pymcl/runtime/input/InputSink;", "getRoute", "()Lcom/pymcl/runtime/input/TextRoute;", "setRoute", "(Lcom/pymcl/runtime/input/TextRoute;)V", "sdlHeld", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "sdl", "", "char", "", "c", "", TerracottaVpnService.EXTRA_TEXT, "s", "", "key", "fclKeycode", "press", "tapKey", "click", "button", "releaseAll", "cursorPos", "x", "", "y", "lookDelta", "dx", "dy", "mouseButton", "scroll", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextRoutingInputSink implements InputSink {
    private final InputSink base;
    private final SdlTextChannel channel;
    private TextRoute route;
    private final HashSet<Integer> sdlHeld;

    @Override // com.pymcl.runtime.input.InputSink
    public void cursorPos(float x, float y) {
        this.base.cursorPos(x, y);
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void lookDelta(float dx, float dy) {
        this.base.lookDelta(dx, dy);
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void mouseButton(int button, boolean press) {
        this.base.mouseButton(button, press);
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void scroll(double dy) {
        this.base.scroll(dy);
    }

    public TextRoutingInputSink(InputSink base, SdlTextChannel channel, TextRoute route) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(route, "route");
        this.base = base;
        this.channel = channel;
        this.route = route;
        this.sdlHeld = new HashSet<>();
    }

    public /* synthetic */ TextRoutingInputSink(InputSink inputSink, NativeSdlTextChannel nativeSdlTextChannel, TextRoute textRoute, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputSink, (i & 2) != 0 ? NativeSdlTextChannel.INSTANCE : nativeSdlTextChannel, (i & 4) != 0 ? TextRoute.GLFW : textRoute);
    }

    public final InputSink getBase() {
        return this.base;
    }

    public final TextRoute getRoute() {
        return this.route;
    }

    public final void setRoute(TextRoute textRoute) {
        Intrinsics.checkNotNullParameter(textRoute, "<set-?>");
        this.route = textRoute;
    }

    private final boolean sdl() {
        return this.route == TextRoute.SDL && this.channel.available();
    }

    @Override // com.pymcl.runtime.input.InputSink
    /* renamed from: char */
    public void mo8062char(char c) {
        if (sdl() && this.channel.commit(String.valueOf(c))) {
            return;
        }
        this.base.mo8062char(c);
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void text(String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        if (s.length() == 0) {
            return;
        }
        if (sdl() && this.channel.commit(s)) {
            return;
        }
        String $this$forEach$iv = s;
        InputSink inputSink = this.base;
        for (int i = 0; i < $this$forEach$iv.length(); i++) {
            char element$iv = $this$forEach$iv.charAt(i);
            inputSink.mo8062char(element$iv);
        }
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void key(int fclKeycode, boolean press) {
        char c;
        Character c2;
        if (sdl()) {
            switch (fclKeycode) {
                case 14:
                    c = '\b';
                    c2 = Character.valueOf(c);
                    break;
                case 28:
                    c = CharUtils.CR;
                    c2 = Character.valueOf(c);
                    break;
                default:
                    c2 = null;
                    break;
            }
            if (c2 != null) {
                if (press) {
                    if (this.channel.controlChar(c2.charValue())) {
                        this.sdlHeld.add(Integer.valueOf(fclKeycode));
                        return;
                    }
                } else if (this.sdlHeld.remove(Integer.valueOf(fclKeycode))) {
                    return;
                }
            }
        } else if (!press && this.sdlHeld.remove(Integer.valueOf(fclKeycode))) {
            return;
        }
        this.base.key(fclKeycode, press);
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void tapKey(int fclKeycode) {
        key(fclKeycode, true);
        key(fclKeycode, false);
    }

    @Override // com.pymcl.runtime.input.InputSink
    public void click(int button) {
        mouseButton(button, true);
        mouseButton(button, false);
    }

    public final void releaseAll() {
        InputSink inputSink = this.base;
        BridgeInputSink bridgeInputSink = inputSink instanceof BridgeInputSink ? (BridgeInputSink) inputSink : null;
        if (bridgeInputSink != null) {
            bridgeInputSink.releaseAll();
        }
    }
}
