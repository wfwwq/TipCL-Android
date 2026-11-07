package com.pymcl.runtime;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.github.caciocavallosilano.cacio.peer.CacioComponentPeer;
import com.pymcl.runtime.GameActivity;
import com.pymcl.runtime.control.ControlLayout;
import com.pymcl.runtime.control.ControlLayoutStore;
import com.pymcl.runtime.control.ControlOverlay;
import com.pymcl.runtime.control.GamepadMapDialog;
import com.pymcl.runtime.input.AndroidPrefIO;
import com.pymcl.runtime.input.BridgeInputSink;
import com.pymcl.runtime.input.CursorGesture;
import com.pymcl.runtime.input.CursorView;
import com.pymcl.runtime.input.GamepadMapper;
import com.pymcl.runtime.input.GamepadMapping;
import com.pymcl.runtime.input.GamepadModeController;
import com.pymcl.runtime.input.GamepadRoute;
import com.pymcl.runtime.input.InputSettings;
import com.pymcl.runtime.input.Keys;
import com.pymcl.runtime.input.LauncherPrefs;
import com.pymcl.runtime.input.LookGesture;
import com.pymcl.runtime.input.PhysicalInput;
import com.pymcl.runtime.input.RuntimeInput;
import com.pymcl.runtime.input.SdlHid;
import com.pymcl.runtime.input.TextRoute;
import com.pymcl.runtime.input.TextRoutes;
import com.pymcl.runtime.input.TextRoutingInputSink;
import com.pymcl.runtime.keyboard.GameTextSender;
import com.pymcl.runtime.keyboard.PcKeyboardView;
import com.pymcl.runtime.keyboard.QuickInputStore;
import com.pymcl.runtime.keyboard.TextFieldInputView;
import com.pymcl.runtime.keyboard.TouchCharInput;
import com.pymcl.runtime.keyboard.TouchControllerBridge;
import com.pymcl.runtime.settings.CrossProcessPrefs;
import com.tungsten.fcl.FCLApp;
import com.tungsten.fcl.game.sdl.SdlBridge;
import com.tungsten.fclauncher.bridge.FCLBridge;
import com.tungsten.fclauncher.bridge.FCLBridgeCallback;
import java.awt.Label;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.libsdl.app.SDLActivity;
import org.libsdl.app.SDLSurface;
import org.lwjgl.glfw.CallbackBridge;

/* compiled from: GameActivity.kt */
@Metadata(d1 = {"\u0000é\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014*\u0001[\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0001uB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u00102\u001a\u00020+2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u00020+H\u0002J \u00106\u001a\u00020+2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0016J \u0010<\u001a\u00020+2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010=\u001a\u00020-2\u0006\u00107\u001a\u000208H\u0016J\u0010\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020:H\u0016JU\u0010@\u001a\u00020:2\u0006\u0010A\u001a\u00020:2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020F2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020C0I2\b\u0010J\u001a\u0004\u0018\u00010FH\u0007b\u0002\bL¢\u0006\u0002\u0010KJ\u0010\u0010M\u001a\u00020+2\u0006\u00107\u001a\u000208H\u0016J\u0010\u0010N\u001a\u00020+2\u0006\u0010O\u001a\u00020-H\u0002J\b\u0010P\u001a\u00020+H\u0002J\b\u0010Q\u001a\u00020+H\u0002J\u0010\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020+H\u0002J\b\u0010V\u001a\u00020+H\u0002J\u0018\u0010W\u001a\u00020+2\u0006\u0010X\u001a\u00020:2\u0006\u0010Y\u001a\u00020:H\u0002J\u0010\u0010]\u001a\u00020-2\u0006\u0010^\u001a\u00020_H\u0002J\u0010\u0010`\u001a\u00020-2\u0006\u0010a\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020-2\u0006\u0010d\u001a\u00020_H\u0016J\b\u0010f\u001a\u00020+H\u0002J\u0010\u0010g\u001a\u00020+2\u0006\u0010h\u001a\u00020-H\u0016J-\u0010i\u001a\u00020+2\u0006\u0010j\u001a\u00020:2\u000e\u0010k\u001a\n\u0012\u0006\b\u0001\u0012\u00020C0I2\u0006\u0010l\u001a\u00020FH\u0016¢\u0006\u0002\u0010mJ\b\u0010n\u001a\u00020+H\u0014J\b\u0010o\u001a\u00020+H\u0014J\b\u0010p\u001a\u00020+H\u0014J\b\u0010q\u001a\u00020+H\u0014J\b\u0010s\u001a\u00020+H\u0014J\b\u0010t\u001a\u00020+H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Z\u001a\u00020[X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\\R\u000e\u0010e\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Lcom/pymcl/runtime/GameActivity;", "Landroid/app/Activity;", "Landroid/view/TextureView$SurfaceTextureListener;", "<init>", "()V", "bridge", "Lcom/tungsten/fclauncher/bridge/FCLBridge;", "request", "Lcom/pymcl/runtime/GameLaunchRequest;", "settings", "Lcom/pymcl/runtime/input/InputSettings;", "sink", "Lcom/pymcl/runtime/input/TextRoutingInputSink;", "handler", "Landroid/os/Handler;", "gameView", "Landroid/view/TextureView;", "overlay", "Lcom/pymcl/runtime/control/ControlOverlay;", "cursorView", "Lcom/pymcl/runtime/input/CursorView;", "pcKeyboard", "Lcom/pymcl/runtime/keyboard/PcKeyboardView;", "charInput", "Lcom/pymcl/runtime/keyboard/TouchCharInput;", "touchController", "Lcom/pymcl/runtime/keyboard/TouchControllerBridge;", "physical", "Lcom/pymcl/runtime/input/PhysicalInput;", "look", "Lcom/pymcl/runtime/input/LookGesture;", "cursor", "Lcom/pymcl/runtime/input/CursorGesture;", "textSender", "Lcom/pymcl/runtime/keyboard/GameTextSender;", "menuButton", "Landroid/widget/TextView;", "launcherPrefs", "Lcom/pymcl/runtime/input/LauncherPrefs;", "gamepadMode", "Lcom/pymcl/runtime/input/GamepadModeController;", "removePrefsListener", "Lkotlin/Function0;", "", "grabbed", "", "gameSurface", "Landroid/view/Surface;", "sdlPrepared", "mouseCaptureWanted", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "buildViews", "onSurfaceTextureAvailable", "st", "Landroid/graphics/SurfaceTexture;", "width", "", "height", "onSurfaceTextureSizeChanged", "onSurfaceTextureDestroyed", "setRequestedOrientation", "requestedOrientation", "messageboxShowMessageBox", "flags", "title", "", "message", "buttonFlags", "", "buttonIds", "buttonTexts", "", "colors", "(ILjava/lang/String;Ljava/lang/String;[I[I[Ljava/lang/String;[I)I", "Landroidx/annotation/Keep;", "onSurfaceTextureUpdated", "onGrabChanged", "g", "applyPointerCapture", "restoreGameFocus", "onAction", "a", "Lcom/pymcl/runtime/input/Keys$Action;", "showGameMenu", "showQuickInput", "writeWindowSizeOverride", "w", "h", "lookTick", "com/pymcl/runtime/GameActivity$lookTick$1", "Lcom/pymcl/runtime/GameActivity$lookTick$1;", "onBackgroundTouch", "e", "Landroid/view/MotionEvent;", "dispatchKeyEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "dispatchGenericMotionEvent", "ev", "gamepadTicking", "scheduleGamepadTick", "onWindowFocusChanged", "hasFocus", "onRequestPermissionsResult", "requestCode", "permissions", "grantResults", "(I[Ljava/lang/String;[I)V", "onResume", "onPause", "onStart", "onStop", "exited", "onDestroy", "releaseInputs", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GameActivity extends Activity implements TextureView.SurfaceTextureListener {
    public static final String EXTRA_REQUEST = "pymcl.launch_request";
    private static final String TAG = "PyMCL-Game";
    private FCLBridge bridge;
    private TouchCharInput charInput;
    private CursorGesture cursor;
    private CursorView cursorView;
    private volatile boolean exited;
    private Surface gameSurface;
    private TextureView gameView;
    private GamepadModeController gamepadMode;
    private boolean gamepadTicking;
    private volatile boolean grabbed;
    private LauncherPrefs launcherPrefs;
    private LookGesture look;
    private TextView menuButton;
    private boolean mouseCaptureWanted;
    private ControlOverlay overlay;
    private PcKeyboardView pcKeyboard;
    private PhysicalInput physical;
    private Function0<Unit> removePrefsListener;
    private GameLaunchRequest request;
    private boolean sdlPrepared;
    private InputSettings settings;
    private GameTextSender textSender;
    private TouchControllerBridge touchController;
    private final TextRoutingInputSink sink = new TextRoutingInputSink(new BridgeInputSink(new Function0() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.bridge;
        }
    }), null, null, 6, null);
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final GameActivity$lookTick$1 lookTick = new Runnable() { // from class: com.pymcl.runtime.GameActivity$lookTick$1
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [long, void] */
        @Override // java.lang.Runnable
        public void run() {
            LookGesture lookGesture = this.this$0.look;
            LookGesture lookGesture2 = null;
            LookGesture lookGesture3 = lookGesture;
            if (lookGesture == null) {
                Intrinsics.throwUninitializedPropertyAccessException("look");
                lookGesture3 = 0;
            }
            lookGesture3.checkLongPress(CacioComponentPeer.postInitSwingComponent());
            LookGesture lookGesture4 = this.this$0.look;
            if (lookGesture4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("look");
            } else {
                lookGesture2 = lookGesture4;
            }
            if (lookGesture2.getActive()) {
                this.this$0.handler.postDelayed(this, 50L);
            }
        }
    };

    /* compiled from: GameActivity.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Keys.Action.values().length];
            try {
                iArr[Keys.Action.TOGGLE_IME.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Keys.Action.PC_KEYBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Keys.Action.QUICK_INPUT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Keys.Action.TOGGLE_CURSOR.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[Keys.Action.EDIT_LAYOUT.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[Keys.Action.MENU.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[Keys.Action.GAME_MENU.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        GameLaunchRequest gameLaunchRequest;
        super.onCreate(savedInstanceState);
        RuntimeHost.init(this);
        FCLApp.setActivity(this);
        GameLaunchRequest gameLaunchRequest2 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            gameLaunchRequest = (GameLaunchRequest) getIntent().getSerializableExtra(EXTRA_REQUEST, GameLaunchRequest.class);
        } else {
            Serializable serializableExtra = getIntent().getSerializableExtra(EXTRA_REQUEST);
            gameLaunchRequest = serializableExtra instanceof GameLaunchRequest ? (GameLaunchRequest) serializableExtra : null;
        }
        if (gameLaunchRequest != null) {
            this.request = gameLaunchRequest;
            TextRoutingInputSink textRoutingInputSink = this.sink;
            TextRoutes textRoutes = TextRoutes.INSTANCE;
            GameLaunchRequest gameLaunchRequest3 = this.request;
            if (gameLaunchRequest3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("request");
                gameLaunchRequest3 = null;
            }
            textRoutingInputSink.setRoute(textRoutes.forMcVersion(gameLaunchRequest3.getMcVersion()));
            TextRoute route = this.sink.getRoute();
            GameLaunchRequest gameLaunchRequest4 = this.request;
            if (gameLaunchRequest4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("request");
                gameLaunchRequest4 = null;
            }
            Log.i(TAG, "text input route=" + route + " mc=" + gameLaunchRequest4.getMcVersion());
            getWindow().addFlags(128);
            getWindow().setSoftInputMode(50);
            this.settings = RuntimeInput.INSTANCE.loadSettings(this);
            this.launcherPrefs = AndroidPrefIO.INSTANCE.launcherPrefs(this);
            GameActivity gameActivity = this;
            LauncherPrefs launcherPrefs = this.launcherPrefs;
            if (launcherPrefs == null) {
                Intrinsics.throwUninitializedPropertyAccessException("launcherPrefs");
                launcherPrefs = null;
            }
            this.gamepadMode = new GamepadModeController(gameActivity, launcherPrefs, new Function0() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(GameActivity.onCreate$lambda$1(this.f$0));
                }
            }, new Function0() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GameActivity.onCreate$lambda$2(this.f$0);
                }
            });
            final CrossProcessPrefs xp = CrossProcessPrefs.INSTANCE.get(this);
            new Thread(new Runnable() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    xp.preload();
                }
            }, "PyMCL-prefs-preload").start();
            this.removePrefsListener = xp.addListener(new Function1() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GameActivity.onCreate$lambda$4(this.f$0, (String) obj);
                }
            });
            TouchControllerBridge.Companion companion = TouchControllerBridge.INSTANCE;
            GameLaunchRequest gameLaunchRequest5 = this.request;
            if (gameLaunchRequest5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("request");
            } else {
                gameLaunchRequest2 = gameLaunchRequest5;
            }
            if (companion.modPresent(gameLaunchRequest2.getWorkingDir())) {
                this.touchController = TouchControllerBridge.INSTANCE.create(this);
            }
            buildViews();
            SdlBridge.onGameImeTakeover = new Runnable() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    GameActivity.onCreate$lambda$5(this.f$0);
                }
            };
            return;
        }
        GameActivity $this$onCreate_u24lambda_u240 = this;
        $this$onCreate_u24lambda_u240.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$1(GameActivity this$0) {
        return this$0.sink.getRoute() == TextRoute.SDL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(GameActivity this$0) {
        PhysicalInput physicalInput = this$0.physical;
        if (physicalInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physical");
            physicalInput = null;
        }
        physicalInput.getGamepad().releaseAll();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda19] */
    public static final Unit onCreate$lambda$4(final GameActivity this$0, String key) {
        if (key == null || Intrinsics.areEqual(key, "gamepad_mode")) {
            this$0.handler.setOpaque((boolean) new Runnable() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda19
                @Override // java.lang.Runnable
                public final void run() {
                    GameActivity.onCreate$lambda$4$0(this.f$0);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4$0(GameActivity this$0) {
        if (this$0.gamepadMode == null || this$0.isDestroyed()) {
            return;
        }
        GamepadModeController gamepadModeController = this$0.gamepadMode;
        if (gamepadModeController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gamepadMode");
            gamepadModeController = null;
        }
        gamepadModeController.onPrefChangedExternally();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(final GameActivity this$0) {
        this$0.runOnUiThread(new Runnable() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.onCreate$lambda$5$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5$0(GameActivity this$0) {
        TouchCharInput touchCharInput = this$0.charInput;
        TouchCharInput touchCharInput2 = null;
        if (touchCharInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("charInput");
            touchCharInput = null;
        }
        if (touchCharInput.isShowing()) {
            TouchCharInput touchCharInput3 = this$0.charInput;
            if (touchCharInput3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("charInput");
            } else {
                touchCharInput2 = touchCharInput3;
            }
            touchCharInput2.hide();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.TextureView, com.github.caciocavallosilano.cacio.peer.CacioLabelPeer] */
    private final void buildViews() {
        InputSettings inputSettings;
        FrameLayout root = new FrameLayout(this);
        ?? textureView = new TextureView(this);
        textureView.setSurfaceTextureListener(this);
        textureView.setFocusable(true);
        textureView.setFocusableInTouchMode(true);
        new View.OnTouchListener() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda20
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return GameActivity.buildViews$lambda$0$0(this.f$0, view, motionEvent);
            }
        };
        textureView.mo7501initSwingComponent();
        textureView.setOnCapturedPointerListener(new View.OnCapturedPointerListener() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda21
            @Override // android.view.View.OnCapturedPointerListener
            public final boolean onCapturedPointer(View view, MotionEvent motionEvent) {
                return GameActivity.buildViews$lambda$0$1(this.f$0, view, motionEvent);
            }
        });
        textureView.setOnGenericMotionListener(new View.OnGenericMotionListener() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda22
            @Override // android.view.View.OnGenericMotionListener
            public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
                return GameActivity.buildViews$lambda$0$2(this.f$0, view, motionEvent);
            }
        });
        this.gameView = textureView;
        TextRoutingInputSink textRoutingInputSink = this.sink;
        InputSettings inputSettings2 = this.settings;
        TextView textView = null;
        if (inputSettings2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settings");
            inputSettings2 = null;
        }
        float lookSensitivity = inputSettings2.getLookSensitivity();
        InputSettings inputSettings3 = this.settings;
        if (inputSettings3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settings");
            inputSettings3 = null;
        }
        this.look = new LookGesture(textRoutingInputSink, lookSensitivity, inputSettings3.getLongPressMs(), 0L, 0.0f, 24, null);
        TextRoutingInputSink textRoutingInputSink2 = this.sink;
        InputSettings inputSettings4 = this.settings;
        if (inputSettings4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settings");
            inputSettings4 = null;
        }
        this.cursor = new CursorGesture(textRoutingInputSink2, inputSettings4.getVirtualMouse(), 0.0f, 0L, 0.0f, 0L, 0.0f, 124, null);
        TouchCharInput $this$buildViews_u24lambda_u242 = new TouchCharInput(this, this.sink, new Function0() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GameActivity.buildViews$lambda$1(this.f$0);
            }
        });
        InputSettings inputSettings5 = this.settings;
        if (inputSettings5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settings");
            inputSettings5 = null;
        }
        $this$buildViews_u24lambda_u242.setNoFullscreen(inputSettings5.getImeNoFullscreen());
        this.charInput = $this$buildViews_u24lambda_u242;
        this.textSender = new GameTextSender(this.sink, new Function0() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(GameActivity.buildViews$lambda$3(this.f$0));
            }
        }, null, 0, 0L, 28, null);
        PcKeyboardView $this$buildViews_u24lambda_u245 = new PcKeyboardView(this, this.sink, new Function0() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GameActivity.buildViews$lambda$4(this.f$0);
            }
        });
        $this$buildViews_u24lambda_u245.setVisibility(8);
        this.pcKeyboard = $this$buildViews_u24lambda_u245;
        GameActivity gameActivity = this;
        TextRoutingInputSink textRoutingInputSink3 = this.sink;
        ControlLayoutStore controlLayoutStoreLayoutStore = RuntimeInput.INSTANCE.layoutStore(this);
        InputSettings inputSettings6 = this.settings;
        if (inputSettings6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settings");
            inputSettings = null;
        } else {
            inputSettings = inputSettings6;
        }
        this.overlay = new ControlOverlay(gameActivity, textRoutingInputSink3, controlLayoutStoreLayoutStore, inputSettings, new AnonymousClass7(this));
        ControlOverlay controlOverlay = this.overlay;
        if (controlOverlay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlay");
            controlOverlay = null;
        }
        controlOverlay.setOnLayoutChanged(new Function1() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameActivity.buildViews$lambda$6(this.f$0, (ControlLayout) obj);
            }
        });
        CursorView $this$buildViews_u24lambda_u247 = new CursorView(this);
        $this$buildViews_u24lambda_u247.setVisibility(8);
        this.cursorView = $this$buildViews_u24lambda_u247;
        TextRoutingInputSink textRoutingInputSink4 = this.sink;
        InputSettings inputSettings7 = this.settings;
        if (inputSettings7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settings");
            inputSettings7 = null;
        }
        this.physical = new PhysicalInput(textRoutingInputSink4, inputSettings7, new PhysicalInput.Callbacks() { // from class: com.pymcl.runtime.GameActivity.buildViews.10
            @Override // com.pymcl.runtime.input.PhysicalInput.Callbacks
            public /* bridge */ boolean forwardGamepadKey(KeyEvent e) {
                return super.forwardGamepadKey(e);
            }

            @Override // com.pymcl.runtime.input.PhysicalInput.Callbacks
            public /* bridge */ boolean forwardGamepadMotion(MotionEvent e) {
                return super.forwardGamepadMotion(e);
            }

            @Override // com.pymcl.runtime.input.PhysicalInput.Callbacks
            public boolean isGrabbed() {
                return GameActivity.this.grabbed;
            }

            @Override // com.pymcl.runtime.input.PhysicalInput.Callbacks
            public void toggleIme() {
                TouchCharInput touchCharInput = GameActivity.this.charInput;
                if (touchCharInput == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("charInput");
                    touchCharInput = null;
                }
                touchCharInput.toggle();
            }

            @Override // com.pymcl.runtime.input.PhysicalInput.Callbacks
            public boolean imeShowing() {
                TouchCharInput touchCharInput = GameActivity.this.charInput;
                if (touchCharInput == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("charInput");
                    touchCharInput = null;
                }
                return touchCharInput.isShowing();
            }

            @Override // com.pymcl.runtime.input.PhysicalInput.Callbacks
            public void togglePointerCapture() {
                GameActivity.this.mouseCaptureWanted = !GameActivity.this.mouseCaptureWanted;
                GameActivity.this.applyPointerCapture();
            }

            @Override // com.pymcl.runtime.input.PhysicalInput.Callbacks
            public void onExternalMouseUsed() {
                if (!GameActivity.this.grabbed || GameActivity.this.mouseCaptureWanted) {
                    return;
                }
                GameActivity.this.mouseCaptureWanted = true;
                GameActivity.this.applyPointerCapture();
            }

            @Override // com.pymcl.runtime.input.PhysicalInput.Callbacks
            public GamepadRoute gamepadRoute() {
                GamepadModeController gamepadModeController = GameActivity.this.gamepadMode;
                if (gamepadModeController == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gamepadMode");
                    gamepadModeController = null;
                }
                return gamepadModeController.route();
            }
        });
        PhysicalInput physicalInput = this.physical;
        if (physicalInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physical");
            physicalInput = null;
        }
        physicalInput.getGamepad().setMapping(RuntimeInput.INSTANCE.gamepadMapping(this).load());
        PhysicalInput physicalInput2 = this.physical;
        if (physicalInput2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physical");
            physicalInput2 = null;
        }
        physicalInput2.getGamepad().setOnAction(new Function1() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GameActivity.buildViews$lambda$8(this.f$0, (Keys.Action) obj);
            }
        });
        TextView $this$buildViews_u24lambda_u249 = new TextView(this);
        $this$buildViews_u24lambda_u249.setText("≡");
        $this$buildViews_u24lambda_u249.setTextSize(18.0f);
        $this$buildViews_u24lambda_u249.setGravity(17);
        $this$buildViews_u24lambda_u249.setTextColor(-570425345);
        $this$buildViews_u24lambda_u249.setBackgroundColor(1426063360);
        $this$buildViews_u24lambda_u249.setAlpha(0.7f);
        $this$buildViews_u24lambda_u249.setOnClickListener(new View.OnClickListener() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.showGameMenu();
            }
        });
        this.menuButton = $this$buildViews_u24lambda_u249;
        TouchCharInput touchCharInput = this.charInput;
        if (touchCharInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("charInput");
            touchCharInput = null;
        }
        root.addView(touchCharInput, new FrameLayout.LayoutParams(1, 1));
        TouchControllerBridge tc = this.touchController;
        if (tc != null) {
            TextFieldInputView $this$buildViews_u24lambda_u2410_u240 = new TextFieldInputView(this, tc);
            InputSettings inputSettings8 = this.settings;
            if (inputSettings8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("settings");
                inputSettings8 = null;
            }
            $this$buildViews_u24lambda_u2410_u240.setNoFullscreen(inputSettings8.getImeNoFullscreen());
            root.addView($this$buildViews_u24lambda_u2410_u240, new FrameLayout.LayoutParams(1, 1));
        }
        TextureView textureView2 = this.gameView;
        if (textureView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gameView");
            textureView2 = null;
        }
        root.addView(textureView2, new FrameLayout.LayoutParams(-1, -1));
        ControlOverlay controlOverlay2 = this.overlay;
        if (controlOverlay2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlay");
            controlOverlay2 = null;
        }
        root.addView(controlOverlay2, new FrameLayout.LayoutParams(-1, -1));
        CursorView cursorView = this.cursorView;
        if (cursorView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cursorView");
            cursorView = null;
        }
        root.addView(cursorView, new FrameLayout.LayoutParams(-1, -1));
        PcKeyboardView pcKeyboardView = this.pcKeyboard;
        if (pcKeyboardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pcKeyboard");
            pcKeyboardView = null;
        }
        FrameLayout.LayoutParams $this$buildViews_u24lambda_u2411 = new FrameLayout.LayoutParams(-1, 0);
        $this$buildViews_u24lambda_u2411.gravity = 80;
        Unit unit = Unit.INSTANCE;
        root.addView(pcKeyboardView, $this$buildViews_u24lambda_u2411);
        float d = getResources().getDisplayMetrics().density;
        TextView textView2 = this.menuButton;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("menuButton");
        } else {
            textView = textView2;
        }
        FrameLayout.LayoutParams $this$buildViews_u24lambda_u2412 = new FrameLayout.LayoutParams((int) (40 * d), (int) (28 * d));
        $this$buildViews_u24lambda_u2412.gravity = 49;
        Unit unit2 = Unit.INSTANCE;
        root.addView(textView, $this$buildViews_u24lambda_u2412);
        root.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                GameActivity.buildViews$lambda$13(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        setContentView(root);
        onGrabChanged(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildViews$lambda$0$0(GameActivity this$0, View view, MotionEvent e) {
        Intrinsics.checkNotNull(e);
        return this$0.onBackgroundTouch(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildViews$lambda$0$1(GameActivity this$0, View view, MotionEvent e) {
        PhysicalInput physicalInput = this$0.physical;
        if (physicalInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physical");
            physicalInput = null;
        }
        Intrinsics.checkNotNull(e);
        return physicalInput.onCapturedPointer(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildViews$lambda$0$2(GameActivity this$0, View view, MotionEvent e) {
        PhysicalInput physicalInput = this$0.physical;
        if (physicalInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physical");
            physicalInput = null;
        }
        Intrinsics.checkNotNull(e);
        return physicalInput.onGenericMotion(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildViews$lambda$1(GameActivity this$0) {
        this$0.restoreGameFocus();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildViews$lambda$3(GameActivity this$0) {
        return !this$0.grabbed;
    }

    /* compiled from: GameActivity.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.pymcl.runtime.GameActivity$buildViews$7, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function1<Keys.Action, Unit> {
        AnonymousClass7(Object obj) {
            super(1, obj, GameActivity.class, "onAction", "onAction(Lcom/pymcl/runtime/input/Keys$Action;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Keys.Action action) throws Exception {
            invoke2(action);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Keys.Action p0) throws Exception {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((GameActivity) this.receiver).onAction(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildViews$lambda$4(GameActivity this$0) {
        PcKeyboardView pcKeyboardView = this$0.pcKeyboard;
        if (pcKeyboardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pcKeyboard");
            pcKeyboardView = null;
        }
        pcKeyboardView.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildViews$lambda$6(GameActivity this$0, ControlLayout it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        RuntimeInput runtimeInput = RuntimeInput.INSTANCE;
        GameActivity gameActivity = this$0;
        InputSettings inputSettings = this$0.settings;
        if (inputSettings == null) {
            Intrinsics.throwUninitializedPropertyAccessException("settings");
            inputSettings = null;
        }
        runtimeInput.saveSettings(gameActivity, inputSettings);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildViews$lambda$8(final GameActivity this$0, final Keys.Action a) {
        Intrinsics.checkNotNullParameter(a, "a");
        this$0.runOnUiThread(new Runnable() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() throws Exception {
                this.f$0.onAction(a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildViews$lambda$13(GameActivity this$0, View view, int i, int i2, int r, int b, int i3, int i4, int i5, int i6) {
        PcKeyboardView pcKeyboardView = this$0.pcKeyboard;
        CursorGesture cursorGesture = null;
        if (pcKeyboardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pcKeyboard");
            pcKeyboardView = null;
        }
        PcKeyboardView pcKeyboardView2 = this$0.pcKeyboard;
        if (pcKeyboardView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pcKeyboard");
            pcKeyboardView2 = null;
        }
        ViewGroup.LayoutParams layoutParams = pcKeyboardView2.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams $this$buildViews_u24lambda_u2413_u240 = (FrameLayout.LayoutParams) layoutParams;
        $this$buildViews_u24lambda_u2413_u240.height = (int) (b * 0.48f);
        pcKeyboardView.setLayoutParams($this$buildViews_u24lambda_u2413_u240);
        CursorGesture cursorGesture2 = this$0.cursor;
        if (cursorGesture2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cursor");
            cursorGesture2 = null;
        }
        cursorGesture2.setScreenW(r);
        CursorGesture cursorGesture3 = this$0.cursor;
        if (cursorGesture3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cursor");
        } else {
            cursorGesture = cursorGesture3;
        }
        cursorGesture.setScreenH(b);
        TouchControllerBridge it = this$0.touchController;
        if (it != null) {
            it.setWidth(RangesKt.coerceAtLeast(r, 1));
            it.setHeight(RangesKt.coerceAtLeast(b, 1));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v20 ??, still in use, count: 3, list:
          (r4v20 ?? I:com.github.caciocavallosilano.cacio.peer.CacioLabelPeer) from 0x0024: INVOKE (r4v20 ?? I:com.github.caciocavallosilano.cacio.peer.CacioLabelPeer) DIRECT call: com.github.caciocavallosilano.cacio.peer.CacioLabelPeer.getSwingComponent():javax.swing.JComponent A[MD:():SwingComponentType extends javax.swing.JComponent (m)]
          (r4v20 ?? I:android.view.Surface A[D('ns' android.view.Surface)]) from 0x0027: IPUT 
          (r4v20 ?? I:android.view.Surface A[D('ns' android.view.Surface)])
          (r17v0 'this' com.pymcl.runtime.GameActivity A[IMMUTABLE_TYPE, THIS])
         com.pymcl.runtime.GameActivity.gameSurface android.view.Surface
          (r4v20 ?? I:android.view.Surface A[D('ns' android.view.Surface)]) from 0x006a: INVOKE 
          (r6v21 com.pymcl.runtime.GameActivity)
          (r4v20 ?? I:android.view.Surface A[D('ns' android.view.Surface)])
          (r5v39 android.view.ViewGroup)
          (r17v0 'this' com.pymcl.runtime.GameActivity A[IMMUTABLE_TYPE, THIS])
         STATIC call: com.tungsten.fcl.game.sdl.SdlBridge.safePrepareSurface(android.app.Activity, android.view.Surface, android.view.ViewGroup, java.lang.Object):boolean A[MD:(android.app.Activity, android.view.Surface, android.view.ViewGroup, java.lang.Object):boolean (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [android.view.Surface, com.github.caciocavallosilano.cacio.peer.CacioLabelPeer] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.Surface, com.github.caciocavallosilano.cacio.peer.CacioLabelPeer] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.GameActivity.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }

    /* compiled from: GameActivity.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1", "Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;", "onCursorModeChange", "", "mode", "", "onLog", "log", "", "onExit", "code", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.pymcl.runtime.GameActivity$onSurfaceTextureAvailable$1, reason: invalid class name */
    public static final class AnonymousClass1 implements FCLBridgeCallback {
        AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onCursorModeChange$lambda$0(GameActivity this$0, int $mode) {
            this$0.onGrabChanged($mode == 0);
        }

        @Override // com.tungsten.fclauncher.bridge.FCLBridgeCallback
        public void onCursorModeChange(final int mode) {
            Log.i(GameActivity.TAG, "cursorModeChange mode=" + mode);
            GameActivity gameActivity = GameActivity.this;
            final GameActivity gameActivity2 = GameActivity.this;
            gameActivity.runOnUiThread(new Runnable() { // from class: com.pymcl.runtime.GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GameActivity.AnonymousClass1.onCursorModeChange$lambda$0(gameActivity2, mode);
                }
            });
        }

        @Override // com.tungsten.fclauncher.bridge.FCLBridgeCallback
        public void onLog(String log) {
            Intrinsics.checkNotNullParameter(log, "log");
            Log.i(GameActivity.TAG, log);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
        @Override // com.tungsten.fclauncher.bridge.FCLBridgeCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onExit(int r12) {
            /*
                r11 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "exit "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r12)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "PyMCL-Game"
                android.util.Log.i(r1, r0)
                com.pymcl.runtime.GameActivity r0 = com.pymcl.runtime.GameActivity.this
                r2 = 1
                com.pymcl.runtime.GameActivity.access$setExited$p(r0, r2)
                com.pymcl.runtime.GameActivity r0 = com.pymcl.runtime.GameActivity.this
                kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L40
                r2 = r11
                com.pymcl.runtime.GameActivity$onSurfaceTextureAvailable$1 r2 = (com.pymcl.runtime.GameActivity.AnonymousClass1) r2     // Catch: java.lang.Throwable -> L40
                r3 = 0
                com.pymcl.runtime.GameSession$Companion r4 = com.pymcl.runtime.GameSession.INSTANCE     // Catch: java.lang.Throwable -> L40
                android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L40
                com.pymcl.runtime.GameSession r5 = r4.of(r0)     // Catch: java.lang.Throwable -> L40
                r9 = 2
                r10 = 0
                r7 = 0
                r6 = r12
                com.pymcl.runtime.GameSession.markExit$default(r5, r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L3d
                kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
                java.lang.Object r12 = kotlin.Result.m8116constructorimpl(r12)     // Catch: java.lang.Throwable -> L3d
                goto L4d
            L3d:
                r0 = move-exception
                r12 = r0
                goto L43
            L40:
                r0 = move-exception
                r6 = r12
                r12 = r0
            L43:
                kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
                java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
                java.lang.Object r12 = kotlin.Result.m8116constructorimpl(r12)
            L4d:
                java.lang.Throwable r12 = kotlin.Result.m8119exceptionOrNullimpl(r12)
                if (r12 == 0) goto L59
                r0 = 0
                java.lang.String r2 = "markExit"
                java.awt.Label.getAlignment()
            L59:
                com.pymcl.runtime.GameActivity r12 = com.pymcl.runtime.GameActivity.this
                com.pymcl.runtime.GameActivity r0 = com.pymcl.runtime.GameActivity.this
                com.pymcl.runtime.GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda1 r1 = new com.pymcl.runtime.GameActivity$onSurfaceTextureAvailable$1$$ExternalSyntheticLambda1
                r1.<init>()
                r12.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.GameActivity.AnonymousClass1.onExit(int):void");
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture st, int width, int height) {
        Intrinsics.checkNotNullParameter(st, "st");
        float f = width;
        GameLaunchRequest gameLaunchRequest = this.request;
        GameLaunchRequest gameLaunchRequest2 = null;
        if (gameLaunchRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
            gameLaunchRequest = null;
        }
        int sw = RangesKt.coerceAtLeast((int) (f * gameLaunchRequest.getWindowScale()), 1);
        float f2 = height;
        GameLaunchRequest gameLaunchRequest3 = this.request;
        if (gameLaunchRequest3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("request");
        } else {
            gameLaunchRequest2 = gameLaunchRequest3;
        }
        int sh = RangesKt.coerceAtLeast((int) (f2 * gameLaunchRequest2.getWindowScale()), 1);
        st.setDefaultBufferSize(sw, sh);
        CallbackBridge.windowWidth = sw;
        CallbackBridge.windowHeight = sh;
        SdlBridge.syncResolution(sw, sh);
        FCLBridge fCLBridge = this.bridge;
        if (fCLBridge != null) {
            fCLBridge.pushEventWindow(sw, sh);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture st) {
        Object objM8116constructorimpl;
        SDLSurface sDLSurface;
        Intrinsics.checkNotNullParameter(st, "st");
        FCLBridge fCLBridge = this.bridge;
        if (fCLBridge != null) {
            fCLBridge.setSurfaceDestroyed(true);
        }
        this.gameSurface = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            GameActivity gameActivity = this;
            if (SdlBridge.getSdlEnabled() && (sDLSurface = SDLActivity.getSDLSurface()) != null) {
                sDLSurface.surfaceDestroyed();
            }
            objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8119exceptionOrNullimpl(objM8116constructorimpl) != null) {
            Label.getAlignment();
        }
        return true;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int requestedOrientation) {
        super.setRequestedOrientation(6);
    }

    public final int messageboxShowMessageBox(int flags, String title, String message, int[] buttonFlags, int[] buttonIds, String[] buttonTexts, int[] colors) {
        Intrinsics.checkNotNullParameter(buttonFlags, "buttonFlags");
        Intrinsics.checkNotNullParameter(buttonIds, "buttonIds");
        Intrinsics.checkNotNullParameter(buttonTexts, "buttonTexts");
        return SDLActivity.messageboxShowMessageBox(this, flags, title, message, buttonFlags, buttonIds, buttonTexts, colors);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture st) {
        Intrinsics.checkNotNullParameter(st, "st");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGrabChanged(boolean r8) {
        /*
            r7 = this;
            r7.grabbed = r8
            com.pymcl.runtime.input.LookGesture r0 = r7.look
            r1 = 0
            if (r0 != 0) goto Ld
            java.lang.String r0 = "look"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r1
        Ld:
            r0.cancel()
            com.pymcl.runtime.control.ControlOverlay r0 = r7.overlay
            if (r0 != 0) goto L1a
            java.lang.String r0 = "overlay"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = r1
        L1a:
            r0.setGrabbed(r8)
            com.pymcl.runtime.input.CursorView r0 = r7.cursorView
            java.lang.String r2 = "cursorView"
            if (r0 != 0) goto L27
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r0 = r1
        L27:
            java.lang.String r3 = "cursor"
            if (r8 != 0) goto L3b
            com.pymcl.runtime.input.CursorGesture r4 = r7.cursor
            if (r4 != 0) goto L33
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r4 = r1
        L33:
            boolean r4 = r4.getVirtualMouse()
            if (r4 == 0) goto L3b
            r4 = 0
            goto L3d
        L3b:
            r4 = 8
        L3d:
            r0.setVisibility(r4)
            if (r8 != 0) goto L9e
            com.pymcl.runtime.input.CursorGesture r0 = r7.cursor
            if (r0 != 0) goto L4a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r0 = r1
        L4a:
            boolean r0 = r0.getVirtualMouse()
            if (r0 == 0) goto L9e
            com.pymcl.runtime.input.CursorGesture r0 = r7.cursor
            if (r0 != 0) goto L58
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r0 = r1
        L58:
            com.pymcl.runtime.input.CursorGesture r4 = r7.cursor
            if (r4 != 0) goto L60
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r4 = r1
        L60:
            float r4 = r4.getScreenW()
            r5 = 2
            float r5 = (float) r5
            float r4 = r4 / r5
            com.pymcl.runtime.input.CursorGesture r6 = r7.cursor
            if (r6 != 0) goto L6f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r6 = r1
        L6f:
            float r6 = r6.getScreenH()
            float r6 = r6 / r5
            r0.place(r4, r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r4 = 0
            com.pymcl.runtime.input.CursorView r5 = r7.cursorView
            if (r5 != 0) goto L82
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r5 = r1
        L82:
            com.pymcl.runtime.input.CursorGesture r2 = r7.cursor
            if (r2 != 0) goto L8a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            r2 = r1
        L8a:
            float r2 = r2.getCursorX()
            com.pymcl.runtime.input.CursorGesture r6 = r7.cursor
            if (r6 != 0) goto L96
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            goto L97
        L96:
            r1 = r6
        L97:
            float r1 = r1.getCursorY()
            r5.moveTo(r2, r1)
        L9e:
            r7.applyPointerCapture()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.GameActivity.onGrabChanged(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPointerCapture() {
        TextureView textureView = null;
        if (!this.grabbed || !this.mouseCaptureWanted || !hasWindowFocus()) {
            TextureView textureView2 = this.gameView;
            if (textureView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gameView");
                textureView2 = null;
            }
            if (textureView2.hasPointerCapture()) {
                TextureView textureView3 = this.gameView;
                if (textureView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gameView");
                } else {
                    textureView = textureView3;
                }
                textureView.releasePointerCapture();
                return;
            }
            return;
        }
        TextureView textureView4 = this.gameView;
        if (textureView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gameView");
        } else {
            textureView = textureView4;
        }
        textureView.requestPointerCapture();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, javax.swing.JLabel] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    private final void restoreGameFocus() {
        TextureView textureView = this.gameView;
        ?? r0 = textureView;
        if (textureView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("gameView");
            r0 = 0;
        }
        r0.setHorizontalAlignment((int) r0);
        applyPointerCapture();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAction(Keys.Action a) throws Exception {
        TouchCharInput touchCharInput = null;
        ControlOverlay controlOverlay = null;
        InputSettings inputSettings = null;
        PcKeyboardView pcKeyboardView = null;
        switch (WhenMappings.$EnumSwitchMapping$0[a.ordinal()]) {
            case 1:
                TouchCharInput touchCharInput2 = this.charInput;
                if (touchCharInput2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("charInput");
                } else {
                    touchCharInput = touchCharInput2;
                }
                touchCharInput.toggle();
                return;
            case 2:
                PcKeyboardView pcKeyboardView2 = this.pcKeyboard;
                if (pcKeyboardView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pcKeyboard");
                    pcKeyboardView2 = null;
                }
                PcKeyboardView pcKeyboardView3 = this.pcKeyboard;
                if (pcKeyboardView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pcKeyboard");
                } else {
                    pcKeyboardView = pcKeyboardView3;
                }
                pcKeyboardView2.setVisibility(pcKeyboardView.getVisibility() == 0 ? 8 : 0);
                return;
            case 3:
                showQuickInput();
                return;
            case 4:
                CursorGesture cursorGesture = this.cursor;
                if (cursorGesture == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cursor");
                    cursorGesture = null;
                }
                CursorGesture cursorGesture2 = this.cursor;
                if (cursorGesture2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cursor");
                    cursorGesture2 = null;
                }
                cursorGesture.setVirtualMouse(true ^ cursorGesture2.getVirtualMouse());
                InputSettings inputSettings2 = this.settings;
                if (inputSettings2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("settings");
                    inputSettings2 = null;
                }
                CursorGesture cursorGesture3 = this.cursor;
                if (cursorGesture3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cursor");
                    cursorGesture3 = null;
                }
                inputSettings2.setVirtualMouse(cursorGesture3.getVirtualMouse());
                RuntimeInput runtimeInput = RuntimeInput.INSTANCE;
                GameActivity gameActivity = this;
                InputSettings inputSettings3 = this.settings;
                if (inputSettings3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("settings");
                } else {
                    inputSettings = inputSettings3;
                }
                runtimeInput.saveSettings(gameActivity, inputSettings);
                onGrabChanged(this.grabbed);
                return;
            case 5:
                ControlOverlay controlOverlay2 = this.overlay;
                if (controlOverlay2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("overlay");
                } else {
                    controlOverlay = controlOverlay2;
                }
                controlOverlay.setEditing(true);
                return;
            case 6:
                this.sink.tapKey(1);
                return;
            case 7:
                showGameMenu();
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v27 ??, still in use, count: 1, list:
          (r1v27 ?? I:android.app.AlertDialog$Builder) from 0x00b2: INVOKE (r1v28 ?? I:android.app.AlertDialog$Builder) = 
          (r1v27 ?? I:android.app.AlertDialog$Builder)
          (r3v13 ?? I:java.lang.CharSequence)
          (r2v5 ?? I:android.content.DialogInterface$OnClickListener)
         VIRTUAL call: android.app.AlertDialog.Builder.setNegativeButton(java.lang.CharSequence, android.content.DialogInterface$OnClickListener):android.app.AlertDialog$Builder A[MD:(java.lang.CharSequence, android.content.DialogInterface$OnClickListener):android.app.AlertDialog$Builder (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public final void showGameMenu() {
        /*
            r5 = this;
            r5.releaseInputs()
            r0 = 9
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "手柄映射"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "编辑控制布局"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "呼出输入法"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "PC 键盘"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "快捷输入"
            r0[r1] = r2
            com.pymcl.runtime.input.CursorGesture r1 = r5.cursor
            r2 = 0
            if (r1 != 0) goto L2b
            java.lang.String r1 = "cursor"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = r2
        L2b:
            boolean r1 = r1.getVirtualMouse()
            if (r1 == 0) goto L34
            java.lang.String r1 = "关闭虚拟鼠标"
            goto L36
        L34:
            java.lang.String r1 = "开启虚拟鼠标"
        L36:
            r3 = 5
            r0[r3] = r1
            com.pymcl.runtime.control.ControlOverlay r1 = r5.overlay
            if (r1 != 0) goto L44
            java.lang.String r1 = "overlay"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = r2
        L44:
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L4d
            java.lang.String r1 = "隐藏虚拟按键"
            goto L4f
        L4d:
            java.lang.String r1 = "显示虚拟按键"
        L4f:
            r3 = 6
            r0[r3] = r1
            com.pymcl.runtime.input.GamepadModeController r1 = r5.gamepadMode
            if (r1 != 0) goto L5d
            java.lang.String r1 = "gamepadMode"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = r2
        L5d:
            java.lang.String r1 = r1.menuLabel()
            r3 = 7
            r0[r3] = r1
            com.pymcl.runtime.input.LauncherPrefs r1 = r5.launcherPrefs
            if (r1 != 0) goto L6f
            java.lang.String r1 = "launcherPrefs"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r1 = r2
        L6f:
            boolean r1 = r1.getSdlAutoShowIme()
            if (r1 == 0) goto L78
            java.lang.String r1 = "开"
            goto L7a
        L78:
            java.lang.String r1 = "关"
        L7a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "SDL 自动弹出输入法："
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r3 = 8
            r0[r3] = r1
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r3 = r5
            android.content.Context r3 = (android.content.Context) r3
            r1.<init>(r3)
            java.lang.String r3 = "游戏菜单"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            android.app.AlertDialog$Builder r1 = r1.setTitle(r3)
            r3 = r0
            java.lang.CharSequence[] r3 = (java.lang.CharSequence[]) r3
            com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda14 r4 = new com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda14
            r4.<init>()
            void r1 = r1.<init>(r3, r4)
            java.lang.String r3 = "关闭"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r3, r2)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.GameActivity.showGameMenu():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGameMenu$lambda$0(final GameActivity gameActivity, DialogInterface dialogInterface, int i) throws Exception {
        ControlOverlay controlOverlay = null;
        LauncherPrefs launcherPrefs = null;
        GamepadModeController gamepadModeController = null;
        switch (i) {
            case 0:
                new GamepadMapDialog(gameActivity, RuntimeInput.INSTANCE.gamepadMapping(gameActivity), new Function1() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameActivity.showGameMenu$lambda$0$0(this.f$0, (GamepadMapping) obj);
                    }
                }).show();
                break;
            case 1:
                gameActivity.onAction(Keys.Action.EDIT_LAYOUT);
                break;
            case 2:
                gameActivity.onAction(Keys.Action.TOGGLE_IME);
                break;
            case 3:
                gameActivity.onAction(Keys.Action.PC_KEYBOARD);
                break;
            case 4:
                gameActivity.onAction(Keys.Action.QUICK_INPUT);
                break;
            case 5:
                gameActivity.onAction(Keys.Action.TOGGLE_CURSOR);
                break;
            case 6:
                ControlOverlay controlOverlay2 = gameActivity.overlay;
                if (controlOverlay2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("overlay");
                    controlOverlay2 = null;
                }
                ControlOverlay controlOverlay3 = gameActivity.overlay;
                if (controlOverlay3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("overlay");
                } else {
                    controlOverlay = controlOverlay3;
                }
                controlOverlay2.setVisibility(controlOverlay.getVisibility() == 0 ? 8 : 0);
                break;
            case 7:
                GameActivity gameActivity2 = gameActivity;
                GamepadModeController gamepadModeController2 = gameActivity.gamepadMode;
                if (gamepadModeController2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gamepadMode");
                } else {
                    gamepadModeController = gamepadModeController2;
                }
                Toast.makeText(gameActivity2, gamepadModeController.cyclePref().getLabel() + ((gameActivity.sink.getRoute() == TextRoute.SDL || SdlBridge.getSdlEnabled()) ? "" : "（本实例未使用 SDL，仍为映射）"), 0).show();
                break;
            case 8:
                GameActivity gameActivity3 = gameActivity;
                LauncherPrefs launcherPrefs2 = gameActivity.launcherPrefs;
                if (launcherPrefs2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("launcherPrefs");
                } else {
                    launcherPrefs = launcherPrefs2;
                }
                Toast.makeText(gameActivity3, "SDL 自动弹出输入法：" + (launcherPrefs.toggleSdlAutoShowIme() ? "开" : "关"), 0).show();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showGameMenu$lambda$0$0(GameActivity this$0, GamepadMapping m) {
        Intrinsics.checkNotNullParameter(m, "m");
        PhysicalInput physicalInput = this$0.physical;
        if (physicalInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physical");
            physicalInput = null;
        }
        physicalInput.getGamepad().setMapping(m);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v4 ??, still in use, count: 1, list:
          (r3v4 ?? I:android.app.AlertDialog$Builder) from 0x0048: INVOKE (r3v5 ?? I:android.app.AlertDialog$Builder) = 
          (r3v4 ?? I:android.app.AlertDialog$Builder)
          (r4v8 ?? I:java.lang.CharSequence)
          (r5v3 ?? I:android.content.DialogInterface$OnClickListener)
         VIRTUAL call: android.app.AlertDialog.Builder.setNeutralButton(java.lang.CharSequence, android.content.DialogInterface$OnClickListener):android.app.AlertDialog$Builder A[MD:(java.lang.CharSequence, android.content.DialogInterface$OnClickListener):android.app.AlertDialog$Builder (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private final void showQuickInput() {
        /*
            r6 = this;
            com.pymcl.runtime.input.RuntimeInput r0 = com.pymcl.runtime.input.RuntimeInput.INSTANCE
            r1 = r6
            android.content.Context r1 = (android.content.Context) r1
            com.pymcl.runtime.keyboard.QuickInputStore r0 = r0.quickInput(r1)
            java.util.List r1 = r0.load()
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r3 = "＋ 新增常用语…"
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r2, r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            r4 = r2
            r5 = 0
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.Object[] r2 = r4.toArray(r5)
            java.lang.String[] r2 = (java.lang.String[]) r2
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r4 = r6
            android.content.Context r4 = (android.content.Context) r4
            r3.<init>(r4)
            java.lang.String r4 = "快捷输入"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            android.app.AlertDialog$Builder r3 = r3.setTitle(r4)
            r4 = r2
            java.lang.CharSequence[] r4 = (java.lang.CharSequence[]) r4
            com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda17 r5 = new com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda17
            r5.<init>()
            void r3 = r3.<init>(r4, r5)
            java.lang.String r4 = "清空"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda18 r5 = new com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda18
            r5.<init>()
            android.app.AlertDialog$Builder r3 = r3.setNeutralButton(r4, r5)
            r3.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.GameActivity.showQuickInput():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showQuickInput$lambda$0(final List $items, final GameActivity this$0, final QuickInputStore $store, DialogInterface dialogInterface, int i) {
        if (i >= $items.size()) {
            final EditText et = new EditText(this$0);
            new AlertDialog.Builder(this$0).setTitle("新增常用语").setView(et).setPositiveButton("保存并发送", new DialogInterface.OnClickListener() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda15
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i2) {
                    GameActivity.showQuickInput$lambda$0$0(et, $items, $store, this$0, dialogInterface2, i2);
                }
            }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).show();
            return;
        }
        GameTextSender gameTextSender = this$0.textSender;
        if (gameTextSender == null) {
            Intrinsics.throwUninitializedPropertyAccessException("textSender");
            gameTextSender = null;
        }
        GameTextSender.send$default(gameTextSender, (String) $items.get(i), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showQuickInput$lambda$0$0(EditText $et, List $items, QuickInputStore $store, GameActivity this$0, DialogInterface dialogInterface, int i) {
        String t = $et.getText().toString();
        if (!StringsKt.isBlank(t)) {
            $items.add(t);
            $store.save($items);
            GameTextSender gameTextSender = this$0.textSender;
            if (gameTextSender == null) {
                Intrinsics.throwUninitializedPropertyAccessException("textSender");
                gameTextSender = null;
            }
            GameTextSender.send$default(gameTextSender, t, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showQuickInput$lambda$1(QuickInputStore $store, DialogInterface dialogInterface, int i) {
        $store.save(CollectionsKt.emptyList());
    }

    private final void writeWindowSizeOverride(int w, int h) {
        Object objM8116constructorimpl;
        GameActivity $this$writeWindowSizeOverride_u24lambda_u240;
        int i;
        LinkedHashMap keys;
        try {
            Result.Companion companion = Result.INSTANCE;
            GameActivity $this$writeWindowSizeOverride_u24lambda_u2402 = this;
            int i2 = 0;
            String LF = System.lineSeparator();
            GameLaunchRequest gameLaunchRequest = $this$writeWindowSizeOverride_u24lambda_u2402.request;
            if (gameLaunchRequest == null) {
                Intrinsics.throwUninitializedPropertyAccessException("request");
                gameLaunchRequest = null;
            }
            File f = new File(gameLaunchRequest.getWorkingDir(), "options.txt");
            ArrayList lines = f.isFile() ? CollectionsKt.toMutableList((Collection) FilesKt.readLines$default(f, null, 1, null)) : new ArrayList();
            LinkedHashMap keys2 = MapsKt.linkedMapOf(TuplesKt.to("fullscreen", "false"), TuplesKt.to("overrideWidth", String.valueOf(w)), TuplesKt.to("overrideHeight", String.valueOf(h)));
            for (Map.Entry entry : keys2.entrySet()) {
                String k = (String) entry.getKey();
                String v = (String) entry.getValue();
                List $this$indexOfFirst$iv = lines;
                int index$iv = 0;
                Iterator it = $this$indexOfFirst$iv.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object item$iv = it.next();
                        String it2 = (String) item$iv;
                        $this$writeWindowSizeOverride_u24lambda_u240 = $this$writeWindowSizeOverride_u24lambda_u2402;
                        keys = keys2;
                        i = i2;
                        if (StringsKt.startsWith$default(it2, k + ":", false, 2, (Object) null)) {
                            break;
                        }
                        index$iv++;
                        i2 = i;
                        $this$writeWindowSizeOverride_u24lambda_u2402 = $this$writeWindowSizeOverride_u24lambda_u240;
                        keys2 = keys;
                    } else {
                        $this$writeWindowSizeOverride_u24lambda_u240 = $this$writeWindowSizeOverride_u24lambda_u2402;
                        i = i2;
                        keys = keys2;
                        index$iv = -1;
                        break;
                    }
                }
                if (index$iv >= 0) {
                    lines.set(index$iv, k + ":" + v);
                } else {
                    lines.add(k + ":" + v);
                }
                i2 = i;
                $this$writeWindowSizeOverride_u24lambda_u2402 = $this$writeWindowSizeOverride_u24lambda_u240;
                keys2 = keys;
            }
            Intrinsics.checkNotNull(LF);
            FilesKt.writeText$default(f, CollectionsKt.joinToString$default(lines, LF, null, null, 0, null, null, 62, null) + LF, null, 2, null);
            objM8116constructorimpl = Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8119exceptionOrNullimpl(objM8116constructorimpl) != null) {
            Label.getAlignment();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.pymcl.runtime.keyboard.TouchControllerBridge, int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [long, void] */
    /* JADX WARN: Type inference failed for: r5v29, types: [float, void] */
    /* JADX WARN: Type inference failed for: r6v5, types: [float, void] */
    private final boolean onBackgroundTouch(MotionEvent e) {
        ControlOverlay controlOverlay = this.overlay;
        CursorGesture cursorGesture = null;
        LookGesture lookGesture = null;
        LookGesture lookGesture2 = 0;
        LookGesture lookGesture3 = 0;
        LookGesture lookGesture4 = 0;
        if (controlOverlay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlay");
            controlOverlay = null;
        }
        if (controlOverlay.getEditing()) {
            return true;
        }
        ?? PostInitSwingComponent = CacioComponentPeer.postInitSwingComponent();
        ?? r0 = this.touchController;
        if (this.grabbed && r0 != 0) {
            r0.onTouch(e);
            return true;
        }
        if (this.grabbed) {
            LookGesture lookGesture5 = this.look;
            if (lookGesture5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("look");
                lookGesture5 = null;
            }
            InputSettings inputSettings = this.settings;
            if (inputSettings == null) {
                Intrinsics.throwUninitializedPropertyAccessException("settings");
                inputSettings = null;
            }
            lookGesture5.setSensitivity(inputSettings.getLookSensitivity());
            LookGesture lookGesture6 = this.look;
            if (lookGesture6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("look");
                lookGesture6 = null;
            }
            InputSettings inputSettings2 = this.settings;
            if (inputSettings2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("settings");
                inputSettings2 = null;
            }
            lookGesture6.setLongPressMs(inputSettings2.getLongPressMs());
            switch (e.getActionMasked()) {
                case 0:
                    LookGesture lookGesture7 = this.look;
                    if (lookGesture7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("look");
                    } else {
                        lookGesture4 = lookGesture7;
                    }
                    lookGesture4.down(e.setAlignment(r0), e.getY(), PostInitSwingComponent);
                    this.handler.postDelayed(this.lookTick, 50L);
                    break;
                case 1:
                    LookGesture lookGesture8 = this.look;
                    if (lookGesture8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("look");
                    } else {
                        lookGesture3 = lookGesture8;
                    }
                    lookGesture3.up(PostInitSwingComponent);
                    break;
                case 2:
                    LookGesture lookGesture9 = this.look;
                    if (lookGesture9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("look");
                    } else {
                        lookGesture2 = lookGesture9;
                    }
                    lookGesture2.move(e.getX(0), e.getY(0), PostInitSwingComponent);
                    break;
                case 3:
                    LookGesture lookGesture10 = this.look;
                    if (lookGesture10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("look");
                    } else {
                        lookGesture = lookGesture10;
                    }
                    lookGesture.cancel();
                    break;
            }
        } else {
            switch (e.getActionMasked()) {
                case 0:
                    CursorGesture cursorGesture2 = this.cursor;
                    CursorGesture cursorGesture3 = cursorGesture2;
                    if (cursorGesture2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cursor");
                        cursorGesture3 = 0;
                    }
                    cursorGesture3.down(e.setAlignment(r0), e.getY(), PostInitSwingComponent);
                    break;
                case 1:
                case 3:
                    CursorGesture cursorGesture4 = this.cursor;
                    CursorGesture cursorGesture5 = cursorGesture4;
                    if (cursorGesture4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cursor");
                        cursorGesture5 = 0;
                    }
                    cursorGesture5.up(PostInitSwingComponent);
                    break;
                case 2:
                    CursorGesture cursorGesture6 = this.cursor;
                    CursorGesture cursorGesture7 = cursorGesture6;
                    if (cursorGesture6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cursor");
                        cursorGesture7 = 0;
                    }
                    cursorGesture7.move(e.getX(0), e.getY(0), PostInitSwingComponent);
                    break;
                case 5:
                    CursorGesture cursorGesture8 = this.cursor;
                    if (cursorGesture8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cursor");
                        cursorGesture8 = null;
                    }
                    cursorGesture8.secondaryTap();
                    break;
            }
            CursorGesture cursorGesture9 = this.cursor;
            if (cursorGesture9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cursor");
                cursorGesture9 = null;
            }
            if (cursorGesture9.getVirtualMouse()) {
                CursorView cursorView = this.cursorView;
                if (cursorView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cursorView");
                    cursorView = null;
                }
                CursorGesture cursorGesture10 = this.cursor;
                if (cursorGesture10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cursor");
                    cursorGesture10 = null;
                }
                float cursorX = cursorGesture10.getCursorX();
                CursorGesture cursorGesture11 = this.cursor;
                if (cursorGesture11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cursor");
                } else {
                    cursorGesture = cursorGesture11;
                }
                cursorView.moveTo(cursorX, cursorGesture.getCursorY());
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        TouchCharInput touchCharInput = this.charInput;
        PhysicalInput physicalInput = null;
        TouchCharInput touchCharInput2 = null;
        ControlOverlay controlOverlay = null;
        if (touchCharInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("charInput");
            touchCharInput = null;
        }
        if (touchCharInput.isShowing() && PhysicalInput.INSTANCE.isSoftKeyboard(event)) {
            return super.dispatchKeyEvent(event);
        }
        TouchCharInput touchCharInput3 = this.charInput;
        if (touchCharInput3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("charInput");
            touchCharInput3 = null;
        }
        if (touchCharInput3.isShowing() && event.getKeyCode() == 4 && !PhysicalInput.INSTANCE.isMouseOriginated(event)) {
            if (event.getAction() == 1) {
                TouchCharInput touchCharInput4 = this.charInput;
                if (touchCharInput4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("charInput");
                } else {
                    touchCharInput2 = touchCharInput4;
                }
                touchCharInput2.hide();
            }
            return true;
        }
        ControlOverlay controlOverlay2 = this.overlay;
        if (controlOverlay2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlay");
            controlOverlay2 = null;
        }
        if (!controlOverlay2.getEditing() || event.getKeyCode() != 4) {
            PhysicalInput physicalInput2 = this.physical;
            if (physicalInput2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("physical");
            } else {
                physicalInput = physicalInput2;
            }
            return physicalInput.onKey(event) || super.dispatchKeyEvent(event);
        }
        if (event.getAction() == 1) {
            ControlOverlay controlOverlay3 = this.overlay;
            if (controlOverlay3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("overlay");
            } else {
                controlOverlay = controlOverlay3;
            }
            controlOverlay.setEditing(false);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        PhysicalInput physicalInput = this.physical;
        InputSettings inputSettings = null;
        if (physicalInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physical");
            physicalInput = null;
        }
        boolean it = physicalInput.onGenericMotion(ev);
        if (it) {
            InputSettings inputSettings2 = this.settings;
            if (inputSettings2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("settings");
            } else {
                inputSettings = inputSettings2;
            }
            if (inputSettings.getGamepadEnabled()) {
                scheduleGamepadTick();
            }
        }
        return it || super.dispatchGenericMotionEvent(ev);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, java.lang.Runnable] */
    private final void scheduleGamepadTick() {
        if (this.gamepadTicking) {
            return;
        }
        this.gamepadTicking = true;
        this.handler.setOpaque(new Runnable() { // from class: com.pymcl.runtime.GameActivity.scheduleGamepadTick.1
            @Override // java.lang.Runnable
            public void run() {
                PhysicalInput physicalInput = GameActivity.this.physical;
                if (physicalInput == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("physical");
                    physicalInput = null;
                }
                GamepadMapper g = physicalInput.getGamepad();
                if (g.getLookX() == 0.0f) {
                    if (g.getLookY() == 0.0f) {
                        GameActivity.this.gamepadTicking = false;
                        return;
                    }
                }
                if (GameActivity.this.grabbed) {
                    g.tick();
                }
                GameActivity.this.handler.postDelayed(this, 16L);
            }
        });
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        CallbackBridge.nativeSetWindowAttrib(131073, hasFocus ? 1 : 0);
        if (hasFocus) {
            applyPointerCapture();
        } else {
            releaseInputs();
            CallbackBridge.resetInputState();
        }
        SdlHid.INSTANCE.setFrozen(!hasFocus);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        SdlHid.INSTANCE.onRequestPermissionsResult(requestCode, grantResults);
    }

    @Override // android.app.Activity
    protected void onResume() {
        CallbackBridge.nativeSetWindowAttrib(131073, 1);
        CallbackBridge.nativeSetWindowAttrib(131083, 1);
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        CallbackBridge.nativeSetWindowAttrib(131073, 0);
        CallbackBridge.nativeSetWindowAttrib(131083, 0);
        releaseInputs();
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        CallbackBridge.nativeSetWindowAttrib(131076, 1);
    }

    @Override // android.app.Activity
    protected void onStop() {
        CallbackBridge.nativeSetWindowAttrib(131076, 0);
        super.onStop();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        GamepadModeController gamepadModeController = null;
        SdlBridge.onGameImeTakeover = null;
        Function0<Unit> function0 = this.removePrefsListener;
        if (function0 != null) {
            function0.invoke();
        }
        this.removePrefsListener = null;
        if (this.gamepadMode != null) {
            GamepadModeController gamepadModeController2 = this.gamepadMode;
            if (gamepadModeController2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gamepadMode");
            } else {
                gamepadModeController = gamepadModeController2;
            }
            gamepadModeController.dismiss();
        }
        SdlHid.INSTANCE.release();
        try {
            Result.Companion companion = Result.INSTANCE;
            GameActivity $this$onDestroy_u24lambda_u240 = this;
            if ($this$onDestroy_u24lambda_u240.sdlPrepared) {
                SdlBridge.reset();
            }
            Result.m8116constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        super.onDestroy();
        if (!this.exited || !isFinishing()) {
            return;
        }
        this.handler.postDelayed(new Runnable() { // from class: com.pymcl.runtime.GameActivity$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                GameActivity.onDestroy$lambda$1();
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDestroy$lambda$1() {
        Process.killProcess(Process.myPid());
    }

    private final void releaseInputs() {
        ControlOverlay controlOverlay = this.overlay;
        PcKeyboardView pcKeyboardView = null;
        if (controlOverlay == null) {
            Intrinsics.throwUninitializedPropertyAccessException("overlay");
            controlOverlay = null;
        }
        controlOverlay.releaseAll();
        LookGesture lookGesture = this.look;
        if (lookGesture == null) {
            Intrinsics.throwUninitializedPropertyAccessException("look");
            lookGesture = null;
        }
        lookGesture.cancel();
        PhysicalInput physicalInput = this.physical;
        if (physicalInput == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physical");
            physicalInput = null;
        }
        physicalInput.reset();
        this.sink.releaseAll();
        PcKeyboardView pcKeyboardView2 = this.pcKeyboard;
        if (pcKeyboardView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pcKeyboard");
        } else {
            pcKeyboardView = pcKeyboardView2;
        }
        pcKeyboardView.getSticky().releaseAll();
    }
}
