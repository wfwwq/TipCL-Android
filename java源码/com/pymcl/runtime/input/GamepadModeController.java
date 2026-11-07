package com.pymcl.runtime.input;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.navigation.compose.DialogNavigator;
import com.pymcl.runtime.input.GamepadModeLogic;
import com.pymcl.runtime.settings.SettingsProtocol;
import com.tungsten.fcl.game.sdl.SdlBridge;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: SdlGamepad.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\bJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/pymcl/runtime/input/GamepadModeController;", "", "activity", "Landroid/app/Activity;", SettingsProtocol.PATH, "Lcom/pymcl/runtime/input/LauncherPrefs;", "sdlCapable", "Lkotlin/Function0;", "", "onModeChanged", "", "<init>", "(Landroid/app/Activity;Lcom/pymcl/runtime/input/LauncherPrefs;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "value", "Lcom/pymcl/runtime/input/GamepadSessionMode;", "sessionChoice", "getSessionChoice", "()Lcom/pymcl/runtime/input/GamepadSessionMode;", DialogNavigator.NAME, "Landroid/app/AlertDialog;", "lastPref", "Lcom/pymcl/runtime/input/GamepadModePref;", "onPrefChangedExternally", "route", "Lcom/pymcl/runtime/input/GamepadRoute;", "cyclePref", "menuLabel", "", "showPrompt", "dismiss", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GamepadModeController {
    private final Activity activity;
    private AlertDialog dialog;
    private GamepadModePref lastPref;
    private final Function0<Unit> onModeChanged;
    private final LauncherPrefs prefs;
    private final Function0<Boolean> sdlCapable;
    private GamepadSessionMode sessionChoice;

    /* compiled from: SdlGamepad.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GamepadRoute.values().length];
            try {
                iArr[GamepadRoute.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[GamepadRoute.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GamepadModeController(Activity activity, LauncherPrefs prefs, Function0<Boolean> sdlCapable, Function0<Unit> onModeChanged) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(sdlCapable, "sdlCapable");
        Intrinsics.checkNotNullParameter(onModeChanged, "onModeChanged");
        this.activity = activity;
        this.prefs = prefs;
        this.sdlCapable = sdlCapable;
        this.onModeChanged = onModeChanged;
        this.lastPref = this.prefs.getGamepadMode();
    }

    public /* synthetic */ GamepadModeController(Activity activity, LauncherPrefs launcherPrefs, Function0 function0, Function0 function02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, launcherPrefs, function0, (i & 8) != 0 ? new Function0() { // from class: com.pymcl.runtime.input.GamepadModeController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function02);
    }

    public final GamepadSessionMode getSessionChoice() {
        return this.sessionChoice;
    }

    public final boolean onPrefChangedExternally() {
        GamepadModePref now = this.prefs.getGamepadMode();
        if (now == this.lastPref) {
            return false;
        }
        this.lastPref = now;
        this.sessionChoice = null;
        if (now == GamepadModePref.DIRECT) {
            SdlHid.INSTANCE.requestBluetoothIfNeeded(this.activity);
        }
        this.onModeChanged.invoke();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final GamepadRoute route() {
        GamepadRoute r = GamepadModeLogic.INSTANCE.route(this.prefs.getGamepadMode(), this.sessionChoice, this.sdlCapable.invoke().booleanValue(), SdlBridge.getSdlEnabled());
        switch (WhenMappings.$EnumSwitchMapping$0[r.ordinal()]) {
            case 1:
                showPrompt();
                return r;
            case 2:
                SdlHid.INSTANCE.ensureAcquired(this.activity);
                return r;
            default:
                return r;
        }
    }

    public final GamepadModePref cyclePref() {
        GamepadModePref n = GamepadModeLogic.INSTANCE.next(this.prefs.getGamepadMode());
        this.prefs.setGamepadMode(n);
        this.lastPref = n;
        this.sessionChoice = null;
        if (n == GamepadModePref.DIRECT) {
            SdlHid.INSTANCE.requestBluetoothIfNeeded(this.activity);
        }
        this.onModeChanged.invoke();
        return n;
    }

    public final String menuLabel() {
        return "手柄模式：" + this.prefs.getGamepadMode().getLabel();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.pymcl.runtime.input.GamepadSessionMode] */
    public final void showPrompt() {
        AlertDialog alertDialog = this.dialog;
        if (!(alertDialog != null && alertDialog.isShowing()) && !this.activity.isFinishing() && !this.activity.isDestroyed()) {
            final GamepadModePref pref = this.prefs.getGamepadMode();
            final Ref.ObjectRef selected = new Ref.ObjectRef();
            selected.element = GamepadModeLogic.INSTANCE.promptDefault(pref, this.sessionChoice);
            float d = this.activity.getResources().getDisplayMetrics().density;
            int pad = (int) (16 * d);
            LinearLayout $this$showPrompt_u24lambda_u240 = new LinearLayout(this.activity);
            $this$showPrompt_u24lambda_u240.setOrientation(1);
            $this$showPrompt_u24lambda_u240.setPadding(pad, pad / 2, pad, 0);
            TextView $this$showPrompt_u24lambda_u241 = new TextView(this.activity);
            $this$showPrompt_u24lambda_u241.setText("检测到手柄。请选择本实例的手柄输入方式（十字键上/下选择，A 或 Start 确认，X 切换「记住」）：");
            $this$showPrompt_u24lambda_u240.addView($this$showPrompt_u24lambda_u241);
            final RadioButton rbMap = new RadioButton(this.activity);
            rbMap.setId(2131689473);
            rbMap.setText("PyMCL 映射模式\n按「手柄映射」把按键转成键盘/鼠标，所有版本可用");
            final RadioButton rbSdl = new RadioButton(this.activity);
            rbSdl.setId(2131689474);
            rbSdl.setText("SDL 直通模式\n原始手柄交给游戏（MC 26.3+ 原生手柄 / Controlify），不使用映射");
            final RadioGroup group = new RadioGroup(this.activity);
            group.addView(rbMap);
            group.addView(rbSdl);
            final CheckBox $this$showPrompt_u24lambda_u245 = new CheckBox(this.activity);
            $this$showPrompt_u24lambda_u245.setText("记住选择（可在游戏菜单或启动器设置中更改）");
            $this$showPrompt_u24lambda_u245.setChecked(true);
            $this$showPrompt_u24lambda_u240.addView(group);
            $this$showPrompt_u24lambda_u240.addView($this$showPrompt_u24lambda_u245);
            showPrompt$sync(group, selected, rbSdl, rbMap);
            group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.pymcl.runtime.input.GamepadModeController$$ExternalSyntheticLambda1
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    GamepadModeController.showPrompt$lambda$6(selected, rbSdl, radioGroup, i);
                }
            });
            AlertDialog dlg = new AlertDialog.Builder(this.activity).setTitle("手柄输入模式").setView($this$showPrompt_u24lambda_u240).setCancelable(false).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.pymcl.runtime.input.GamepadModeController$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    GamepadModeController.showPrompt$confirm(pref, selected, $this$showPrompt_u24lambda_u245, this);
                }
            }).create();
            dlg.setCanceledOnTouchOutside(false);
            dlg.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.pymcl.runtime.input.GamepadModeController$$ExternalSyntheticLambda3
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return GamepadModeController.showPrompt$lambda$8(selected, $this$showPrompt_u24lambda_u245, group, rbSdl, rbMap, pref, this, dialogInterface, i, keyEvent);
                }
            });
            this.dialog = dlg;
            try {
                dlg.show();
            } catch (Throwable t) {
                Log.w("PyMCL-SDLPad", "prompt show", t);
                this.dialog = null;
                this.sessionChoice = GamepadSessionMode.MAPPING;
            }
        }
    }

    private static final void showPrompt$sync(RadioGroup group, Ref.ObjectRef<GamepadSessionMode> objectRef, RadioButton rbSdl, RadioButton rbMap) {
        group.check(objectRef.element == GamepadSessionMode.DIRECT ? rbSdl.getId() : rbMap.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showPrompt$lambda$6(Ref.ObjectRef objectRef, RadioButton radioButton, RadioGroup radioGroup, int i) {
        objectRef.element = i == radioButton.getId() ? GamepadSessionMode.DIRECT : GamepadSessionMode.MAPPING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPrompt$confirm(GamepadModePref pref, Ref.ObjectRef<GamepadSessionMode> objectRef, CheckBox remember, GamepadModeController this$0) {
        GamepadModePref newPref = GamepadModeLogic.INSTANCE.prefAfterPrompt(pref, objectRef.element, remember.isChecked());
        if (newPref != pref) {
            this$0.prefs.setGamepadMode(newPref);
        }
        this$0.lastPref = newPref;
        this$0.sessionChoice = objectRef.element;
        if (objectRef.element == GamepadSessionMode.DIRECT) {
            SdlHid.INSTANCE.requestBluetoothIfNeeded(this$0.activity);
        }
        Log.i("PyMCL-SDLPad", "gamepad mode chosen=" + objectRef.element + " remember=" + remember.isChecked() + " pref=" + newPref);
        AlertDialog alertDialog = this$0.dialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.dialog = null;
        this$0.onModeChanged.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, com.pymcl.runtime.input.GamepadSessionMode] */
    public static final boolean showPrompt$lambda$8(Ref.ObjectRef $selected, CheckBox $remember, RadioGroup $group, RadioButton $rbSdl, RadioButton $rbMap, GamepadModePref $pref, GamepadModeController this$0, DialogInterface dialogInterface, int keyCode, KeyEvent ev) {
        GamepadModeLogic.PromptKey k = GamepadModeLogic.INSTANCE.promptKey(keyCode);
        if (k instanceof GamepadModeLogic.PromptKey.Select) {
            if (ev.getAction() != 0) {
                return true;
            }
            $selected.element = ((GamepadModeLogic.PromptKey.Select) k).getMode();
            showPrompt$sync($group, $selected, $rbSdl, $rbMap);
            return true;
        }
        if (Intrinsics.areEqual(k, GamepadModeLogic.PromptKey.Confirm.INSTANCE)) {
            if (ev.getAction() != 1) {
                return true;
            }
            showPrompt$confirm($pref, $selected, $remember, this$0);
            return true;
        }
        if (!Intrinsics.areEqual(k, GamepadModeLogic.PromptKey.ToggleRemember.INSTANCE)) {
            if (Intrinsics.areEqual(k, GamepadModeLogic.PromptKey.Ignore.INSTANCE)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (ev.getAction() != 1) {
            return true;
        }
        $remember.setChecked(!$remember.isChecked());
        return true;
    }

    public final void dismiss() {
        try {
            AlertDialog alertDialog = this.dialog;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Throwable th) {
        }
        this.dialog = null;
    }
}
