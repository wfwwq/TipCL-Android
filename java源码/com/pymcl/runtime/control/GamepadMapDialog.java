package com.pymcl.runtime.control;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.navigation.compose.DialogNavigator;
import com.pymcl.runtime.input.GamepadButton;
import com.pymcl.runtime.input.GamepadMapping;
import com.pymcl.runtime.input.GamepadMappingStore;
import com.pymcl.runtime.input.StickMode;
import com.tungsten.fclauncher.keycodes.FCLKeycodes;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GamepadMapDialog.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002J\b\u0010\u001b\u001a\u00020\tH\u0002J\u0006\u0010\u001c\u001a\u00020\tJ\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u0014H\u0002J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0002J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/pymcl/runtime/control/GamepadMapDialog;", "", "context", "Landroid/content/Context;", "store", "Lcom/pymcl/runtime/input/GamepadMappingStore;", "onSaved", "Lkotlin/Function1;", "Lcom/pymcl/runtime/input/GamepadMapping;", "", "<init>", "(Landroid/content/Context;Lcom/pymcl/runtime/input/GamepadMappingStore;Lkotlin/jvm/functions/Function1;)V", "working", "adapter", "Landroid/widget/ArrayAdapter;", "", DialogNavigator.NAME, "Landroid/app/AlertDialog;", "buttons", "Lkotlin/enums/EnumEntries;", "Lcom/pymcl/runtime/input/GamepadButton;", "rowCount", "", "getRowCount", "()I", "rows", "", "refresh", "show", "onRow", "pos", "pickKey", "b", "pickStick", "left", "", "allKeyNames", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GamepadMapDialog {
    private ArrayAdapter<String> adapter;
    private final EnumEntries<GamepadButton> buttons;
    private final Context context;
    private AlertDialog dialog;
    private final Function1<GamepadMapping, Unit> onSaved;
    private final GamepadMappingStore store;
    private GamepadMapping working;

    /* JADX WARN: Multi-variable type inference failed */
    public GamepadMapDialog(Context context, GamepadMappingStore store, Function1<? super GamepadMapping, Unit> onSaved) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(onSaved, "onSaved");
        this.context = context;
        this.store = store;
        this.onSaved = onSaved;
        this.working = this.store.load();
        this.buttons = GamepadButton.getEntries();
    }

    private final int getRowCount() {
        return this.buttons.size() + 3;
    }

    private final List<String> rows() {
        Iterable $this$map$iv = this.buttons;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            GamepadButton it = (GamepadButton) item$iv$iv;
            destination$iv$iv.add(it.getLabel() + "  →  " + KeyChoices.INSTANCE.label(this.working.keyFor(it)));
        }
        Collection collection = (List) destination$iv$iv;
        String[] strArr = new String[3];
        strArr[0] = "左摇杆  →  " + this.working.getLeftStick().getLabel();
        strArr[1] = "右摇杆  →  " + this.working.getRightStick().getLabel();
        strArr[2] = "视角 Y 轴反转  →  " + (this.working.getInvertY() ? "开" : "关");
        return CollectionsKt.plus(collection, (Iterable) CollectionsKt.listOf((Object[]) strArr));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    private final void refresh() {
        /*
            r4 = this;
            android.widget.ArrayAdapter<java.lang.String> r0 = r4.adapter
            r1 = 0
            java.lang.String r2 = "adapter"
            if (r0 != 0) goto Lb
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r0 = r1
        Lb:
            r0.clear()
            android.widget.ArrayAdapter<java.lang.String> r0 = r4.adapter
            if (r0 != 0) goto L16
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            r0 = r1
        L16:
            java.util.List r3 = r4.rows()
            java.util.Collection r3 = (java.util.Collection) r3
            r0.<init>(r3, r0, r0)
            android.widget.ArrayAdapter<java.lang.String> r0 = r4.adapter
            if (r0 != 0) goto L27
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
            goto L28
        L27:
            r1 = r0
        L28:
            r1.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.runtime.control.GamepadMapDialog.refresh():void");
    }

    public final void show() {
        this.adapter = new ArrayAdapter<>(this.context, R.layout.simple_list_item_1, CollectionsKt.toMutableList((Collection) rows()));
        ListView list = new ListView(this.context);
        ArrayAdapter<String> arrayAdapter = this.adapter;
        if (arrayAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            arrayAdapter = null;
        }
        list.setAdapter((ListAdapter) arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.pymcl.runtime.control.GamepadMapDialog$$ExternalSyntheticLambda0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.f$0.onRow(i);
            }
        });
        AlertDialog d = new AlertDialog.Builder(this.context).setTitle("手柄映射").setView(list).setPositiveButton("保存", new DialogInterface.OnClickListener() { // from class: com.pymcl.runtime.control.GamepadMapDialog$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GamepadMapDialog.show$lambda$2(this.f$0, dialogInterface, i);
            }
        }).setNeutralButton("恢复默认", new DialogInterface.OnClickListener() { // from class: com.pymcl.runtime.control.GamepadMapDialog$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GamepadMapDialog.show$lambda$3(this.f$0, dialogInterface, i);
            }
        }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
        d.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.pymcl.runtime.control.GamepadMapDialog$$ExternalSyntheticLambda3
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return GamepadMapDialog.show$lambda$4$0(this.f$0, dialogInterface, i, keyEvent);
            }
        });
        d.show();
        this.dialog = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$2(GamepadMapDialog this$0, DialogInterface dialogInterface, int i) {
        this$0.store.save(this$0.working);
        this$0.onSaved.invoke(this$0.working);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$3(GamepadMapDialog this$0, DialogInterface dialogInterface, int i) {
        this$0.working = this$0.store.reset();
        this$0.onSaved.invoke(this$0.working);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean show$lambda$4$0(GamepadMapDialog this$0, DialogInterface dialogInterface, int keyCode, KeyEvent e) {
        GamepadButton b = GamepadButton.INSTANCE.ofKeycode(keyCode);
        if (b == null || e.getAction() != 1 || keyCode == 97) {
            return false;
        }
        this$0.pickKey(b);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRow(int pos) {
        if (pos >= this.buttons.size()) {
            if (pos != this.buttons.size()) {
                if (pos != this.buttons.size() + 1) {
                    if (pos == getRowCount() - 1) {
                        this.working.setInvertY(true ^ this.working.getInvertY());
                        refresh();
                        return;
                    }
                    return;
                }
                pickStick(false);
                return;
            }
            pickStick(true);
            return;
        }
        pickKey(this.buttons.get(pos));
    }

    private final void pickKey(final GamepadButton b) {
        final List names = KeyChoices.INSTANCE.all(allKeyNames());
        int current = names.indexOf(this.working.keyFor(b));
        AlertDialog.Builder title = new AlertDialog.Builder(this.context).setTitle(b.getLabel() + " 映射为");
        List $this$map$iv = names;
        KeyChoices keyChoices = KeyChoices.INSTANCE;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String p0 = (String) item$iv$iv;
            destination$iv$iv.add(keyChoices.label(p0));
        }
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        title.setSingleChoiceItems((CharSequence[]) $this$toTypedArray$iv.toArray(new String[0]), current, new DialogInterface.OnClickListener() { // from class: com.pymcl.runtime.control.GamepadMapDialog$$ExternalSyntheticLambda4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GamepadMapDialog.pickKey$lambda$0(this.f$0, b, names, dialogInterface, i);
            }
        }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickKey$lambda$0(GamepadMapDialog this$0, GamepadButton $b, List $names, DialogInterface d, int i) {
        this$0.working.set($b, (String) $names.get(i));
        this$0.refresh();
        d.dismiss();
    }

    private final void pickStick(final boolean left) {
        final EnumEntries modes = StickMode.getEntries();
        GamepadMapping gamepadMapping = this.working;
        StickMode cur = left ? gamepadMapping.getLeftStick() : gamepadMapping.getRightStick();
        AlertDialog.Builder title = new AlertDialog.Builder(this.context).setTitle(left ? "左摇杆用途" : "右摇杆用途");
        EnumEntries $this$map$iv = modes;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            StickMode it = (StickMode) item$iv$iv;
            destination$iv$iv.add(it.getLabel());
        }
        Collection $this$toTypedArray$iv = (List) destination$iv$iv;
        title.setSingleChoiceItems((CharSequence[]) $this$toTypedArray$iv.toArray(new String[0]), modes.indexOf(cur), new DialogInterface.OnClickListener() { // from class: com.pymcl.runtime.control.GamepadMapDialog$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                GamepadMapDialog.pickStick$lambda$1(left, this, modes, dialogInterface, i);
            }
        }).setNegativeButton("取消", (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void pickStick$lambda$1(boolean $left, GamepadMapDialog this$0, EnumEntries $modes, DialogInterface d, int i) {
        GamepadMapping gamepadMapping = this$0.working;
        StickMode stickMode = (StickMode) $modes.get(i);
        if ($left) {
            gamepadMapping.setLeftStick(stickMode);
        } else {
            gamepadMapping.setRightStick(stickMode);
        }
        this$0.refresh();
        d.dismiss();
    }

    private final List<String> allKeyNames() throws SecurityException {
        Field[] fields = FCLKeycodes.class.getFields();
        Intrinsics.checkNotNullExpressionValue(fields, "getFields(...)");
        Collection destination$iv$iv = new ArrayList();
        for (Field field : fields) {
            Field it = field;
            String name = it.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.startsWith$default(name, "KEY_", false, 2, (Object) null) && Intrinsics.areEqual(it.getType(), Integer.TYPE)) {
                destination$iv$iv.add(field);
            }
        }
        Iterable $this$map$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            destination$iv$iv2.add(((Field) item$iv$iv).getName());
        }
        return (List) destination$iv$iv2;
    }
}
