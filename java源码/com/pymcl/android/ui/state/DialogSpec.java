package com.pymcl.android.ui.state;

import com.pymcl.android.ui.state.DialogSpec;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AppState.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,À\u0006\u0003"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec;", "", "Confirm", "Prompt", "OfflineAdd", "AccountGate", "MicrosoftLogin", "AuthlibLogin", "Nide8Login", "Skin", "Mods", "GlobalMods", "Saves", "VersionSetup", "CatalogFiles", "TaskLog", "AiPermission", "FeedbackConsent", "FirstRun", "Crash", "Dependencies", "ExportModpack", "PickUpdates", "Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;", "Lcom/pymcl/android/ui/state/DialogSpec$AiPermission;", "Lcom/pymcl/android/ui/state/DialogSpec$AuthlibLogin;", "Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;", "Lcom/pymcl/android/ui/state/DialogSpec$Confirm;", "Lcom/pymcl/android/ui/state/DialogSpec$Crash;", "Lcom/pymcl/android/ui/state/DialogSpec$Dependencies;", "Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;", "Lcom/pymcl/android/ui/state/DialogSpec$FeedbackConsent;", "Lcom/pymcl/android/ui/state/DialogSpec$FirstRun;", "Lcom/pymcl/android/ui/state/DialogSpec$GlobalMods;", "Lcom/pymcl/android/ui/state/DialogSpec$MicrosoftLogin;", "Lcom/pymcl/android/ui/state/DialogSpec$Mods;", "Lcom/pymcl/android/ui/state/DialogSpec$Nide8Login;", "Lcom/pymcl/android/ui/state/DialogSpec$OfflineAdd;", "Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;", "Lcom/pymcl/android/ui/state/DialogSpec$Prompt;", "Lcom/pymcl/android/ui/state/DialogSpec$Saves;", "Lcom/pymcl/android/ui/state/DialogSpec$Skin;", "Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;", "Lcom/pymcl/android/ui/state/DialogSpec$VersionSetup;", "PyMCL-Android:app_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface DialogSpec {

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016Ê\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0002¨\u0006$"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$Confirm;", "Lcom/pymcl/android/ui/state/DialogSpec;", "title", "", "message", "okText", "danger", "", "raw", "onOk", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getOkText", "getDanger", "()Z", "getRaw", "getOnOk", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Confirm implements DialogSpec {
        public static final int $stable = 0;
        private final boolean danger;
        private final String message;
        private final String okText;
        private final Function0<Unit> onOk;
        private final boolean raw;
        private final String title;

        public static /* synthetic */ Confirm copy$default(Confirm confirm, String str, String str2, String str3, boolean z, boolean z2, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirm.title;
            }
            if ((i & 2) != 0) {
                str2 = confirm.message;
            }
            if ((i & 4) != 0) {
                str3 = confirm.okText;
            }
            if ((i & 8) != 0) {
                z = confirm.danger;
            }
            if ((i & 16) != 0) {
                z2 = confirm.raw;
            }
            if ((i & 32) != 0) {
                function0 = confirm.onOk;
            }
            boolean z3 = z2;
            Function0 function02 = function0;
            return confirm.copy(str, str2, str3, z, z3, function02);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getOkText() {
            return this.okText;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getDanger() {
            return this.danger;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getRaw() {
            return this.raw;
        }

        public final Function0<Unit> component6() {
            return this.onOk;
        }

        public final Confirm copy(String title, String message, String okText, boolean danger, boolean raw, Function0<Unit> onOk) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(okText, "okText");
            Intrinsics.checkNotNullParameter(onOk, "onOk");
            return new Confirm(title, message, okText, danger, raw, onOk);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Confirm)) {
                return false;
            }
            Confirm confirm = (Confirm) other;
            return Intrinsics.areEqual(this.title, confirm.title) && Intrinsics.areEqual(this.message, confirm.message) && Intrinsics.areEqual(this.okText, confirm.okText) && this.danger == confirm.danger && this.raw == confirm.raw && Intrinsics.areEqual(this.onOk, confirm.onOk);
        }

        public int hashCode() {
            return (((((((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.okText.hashCode()) * 31) + Boolean.hashCode(this.danger)) * 31) + Boolean.hashCode(this.raw)) * 31) + this.onOk.hashCode();
        }

        public String toString() {
            return "Confirm(title=" + this.title + ", message=" + this.message + ", okText=" + this.okText + ", danger=" + this.danger + ", raw=" + this.raw + ", onOk=" + this.onOk + ")";
        }

        public Confirm(String title, String message, String okText, boolean danger, boolean raw, Function0<Unit> onOk) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(okText, "okText");
            Intrinsics.checkNotNullParameter(onOk, "onOk");
            this.title = title;
            this.message = message;
            this.okText = okText;
            this.danger = danger;
            this.raw = raw;
            this.onOk = onOk;
        }

        public /* synthetic */ Confirm(String str, String str2, String str3, boolean z, boolean z2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "确定" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, function0);
        }

        public final boolean getDanger() {
            return this.danger;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getOkText() {
            return this.okText;
        }

        public final Function0<Unit> getOnOk() {
            return this.onOk;
        }

        public final boolean getRaw() {
            return this.raw;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003JU\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006 "}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$Prompt;", "Lcom/pymcl/android/ui/state/DialogSpec;", "title", "", "label", "initial", "validate", "Lkotlin/Function1;", "onOk", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getTitle", "()Ljava/lang/String;", "getLabel", "getInitial", "getValidate", "()Lkotlin/jvm/functions/Function1;", "getOnOk", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Prompt implements DialogSpec {
        public static final int $stable = 0;
        private final String initial;
        private final String label;
        private final Function1<String, Unit> onOk;
        private final String title;
        private final Function1<String, String> validate;

        public static /* synthetic */ Prompt copy$default(Prompt prompt, String str, String str2, String str3, Function1 function1, Function1 function12, int i, Object obj) {
            if ((i & 1) != 0) {
                str = prompt.title;
            }
            if ((i & 2) != 0) {
                str2 = prompt.label;
            }
            if ((i & 4) != 0) {
                str3 = prompt.initial;
            }
            if ((i & 8) != 0) {
                function1 = prompt.validate;
            }
            if ((i & 16) != 0) {
                function12 = prompt.onOk;
            }
            Function1 function13 = function12;
            String str4 = str3;
            return prompt.copy(str, str2, str4, function1, function13);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInitial() {
            return this.initial;
        }

        public final Function1<String, String> component4() {
            return this.validate;
        }

        public final Function1<String, Unit> component5() {
            return this.onOk;
        }

        public final Prompt copy(String title, String label, String initial, Function1<? super String, String> validate, Function1<? super String, Unit> onOk) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(initial, "initial");
            Intrinsics.checkNotNullParameter(validate, "validate");
            Intrinsics.checkNotNullParameter(onOk, "onOk");
            return new Prompt(title, label, initial, validate, onOk);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Prompt)) {
                return false;
            }
            Prompt prompt = (Prompt) other;
            return Intrinsics.areEqual(this.title, prompt.title) && Intrinsics.areEqual(this.label, prompt.label) && Intrinsics.areEqual(this.initial, prompt.initial) && Intrinsics.areEqual(this.validate, prompt.validate) && Intrinsics.areEqual(this.onOk, prompt.onOk);
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.label.hashCode()) * 31) + this.initial.hashCode()) * 31) + this.validate.hashCode()) * 31) + this.onOk.hashCode();
        }

        public String toString() {
            return "Prompt(title=" + this.title + ", label=" + this.label + ", initial=" + this.initial + ", validate=" + this.validate + ", onOk=" + this.onOk + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Prompt(String title, String label, String initial, Function1<? super String, String> validate, Function1<? super String, Unit> onOk) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(initial, "initial");
            Intrinsics.checkNotNullParameter(validate, "validate");
            Intrinsics.checkNotNullParameter(onOk, "onOk");
            this.title = title;
            this.label = label;
            this.initial = initial;
            this.validate = validate;
            this.onOk = onOk;
        }

        public /* synthetic */ Prompt(String str, String str2, String str3, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? new Function1() { // from class: com.pymcl.android.ui.state.DialogSpec$Prompt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DialogSpec.Prompt._init_$lambda$0((String) obj);
                }
            } : function1, function12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String _init_$lambda$0(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (StringsKt.isBlank(it)) {
                return "不能为空";
            }
            return null;
        }

        public final String getInitial() {
            return this.initial;
        }

        public final String getLabel() {
            return this.label;
        }

        public final Function1<String, Unit> getOnOk() {
            return this.onOk;
        }

        public final String getTitle() {
            return this.title;
        }

        public final Function1<String, String> getValidate() {
            return this.validate;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$OfflineAdd;", "Lcom/pymcl/android/ui/state/DialogSpec;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OfflineAdd implements DialogSpec {
        public static final int $stable = 0;
        public static final OfflineAdd INSTANCE = new OfflineAdd();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OfflineAdd)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 535478335;
        }

        public String toString() {
            return "OfflineAdd";
        }

        private OfflineAdd() {
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;", "Lcom/pymcl/android/ui/state/DialogSpec;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AccountGate implements DialogSpec {
        public static final int $stable = 0;
        public static final AccountGate INSTANCE = new AccountGate();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountGate)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -762953673;
        }

        public String toString() {
            return "AccountGate";
        }

        private AccountGate() {
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$MicrosoftLogin;", "Lcom/pymcl/android/ui/state/DialogSpec;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class MicrosoftLogin implements DialogSpec {
        public static final int $stable = 0;
        public static final MicrosoftLogin INSTANCE = new MicrosoftLogin();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MicrosoftLogin)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1956133092;
        }

        public String toString() {
            return "MicrosoftLogin";
        }

        private MicrosoftLogin() {
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$AuthlibLogin;", "Lcom/pymcl/android/ui/state/DialogSpec;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AuthlibLogin implements DialogSpec {
        public static final int $stable = 0;
        public static final AuthlibLogin INSTANCE = new AuthlibLogin();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthlibLogin)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1401126349;
        }

        public String toString() {
            return "AuthlibLogin";
        }

        private AuthlibLogin() {
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$Nide8Login;", "Lcom/pymcl/android/ui/state/DialogSpec;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Nide8Login implements DialogSpec {
        public static final int $stable = 0;
        public static final Nide8Login INSTANCE = new Nide8Login();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Nide8Login)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1357457678;
        }

        public String toString() {
            return "Nide8Login";
        }

        private Nide8Login() {
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0011"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$Skin;", "Lcom/pymcl/android/ui/state/DialogSpec;", "account", "", "<init>", "(Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Skin implements DialogSpec {
        public static final int $stable = 0;
        private final String account;

        public static /* synthetic */ Skin copy$default(Skin skin, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = skin.account;
            }
            return skin.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        public final Skin copy(String account) {
            Intrinsics.checkNotNullParameter(account, "account");
            return new Skin(account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Skin) && Intrinsics.areEqual(this.account, ((Skin) other).account);
        }

        public int hashCode() {
            return this.account.hashCode();
        }

        public String toString() {
            return "Skin(account=" + this.account + ")";
        }

        public Skin(String account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.account = account;
        }

        public final String getAccount() {
            return this.account;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$Mods;", "Lcom/pymcl/android/ui/state/DialogSpec;", "instance", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInstance", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Mods implements DialogSpec {
        public static final int $stable = 0;
        private final String instance;
        private final String version;

        public static /* synthetic */ Mods copy$default(Mods mods, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mods.instance;
            }
            if ((i & 2) != 0) {
                str2 = mods.version;
            }
            return mods.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstance() {
            return this.instance;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final Mods copy(String instance, String version) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            return new Mods(instance, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Mods)) {
                return false;
            }
            Mods mods = (Mods) other;
            return Intrinsics.areEqual(this.instance, mods.instance) && Intrinsics.areEqual(this.version, mods.version);
        }

        public int hashCode() {
            return (this.instance.hashCode() * 31) + this.version.hashCode();
        }

        public String toString() {
            return "Mods(instance=" + this.instance + ", version=" + this.version + ")";
        }

        public Mods(String instance, String version) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            this.instance = instance;
            this.version = version;
        }

        public final String getInstance() {
            return this.instance;
        }

        public final String getVersion() {
            return this.version;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$GlobalMods;", "Lcom/pymcl/android/ui/state/DialogSpec;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class GlobalMods implements DialogSpec {
        public static final int $stable = 0;
        public static final GlobalMods INSTANCE = new GlobalMods();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GlobalMods)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2136532085;
        }

        public String toString() {
            return "GlobalMods";
        }

        private GlobalMods() {
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$Saves;", "Lcom/pymcl/android/ui/state/DialogSpec;", "instance", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInstance", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Saves implements DialogSpec {
        public static final int $stable = 0;
        private final String instance;
        private final String version;

        public static /* synthetic */ Saves copy$default(Saves saves, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = saves.instance;
            }
            if ((i & 2) != 0) {
                str2 = saves.version;
            }
            return saves.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstance() {
            return this.instance;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final Saves copy(String instance, String version) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            return new Saves(instance, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Saves)) {
                return false;
            }
            Saves saves = (Saves) other;
            return Intrinsics.areEqual(this.instance, saves.instance) && Intrinsics.areEqual(this.version, saves.version);
        }

        public int hashCode() {
            return (this.instance.hashCode() * 31) + this.version.hashCode();
        }

        public String toString() {
            return "Saves(instance=" + this.instance + ", version=" + this.version + ")";
        }

        public Saves(String instance, String version) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            this.instance = instance;
            this.version = version;
        }

        public final String getInstance() {
            return this.instance;
        }

        public final String getVersion() {
            return this.version;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0011"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$VersionSetup;", "Lcom/pymcl/android/ui/state/DialogSpec;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class VersionSetup implements DialogSpec {
        public static final int $stable = 0;
        private final String id;

        public static /* synthetic */ VersionSetup copy$default(VersionSetup versionSetup, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = versionSetup.id;
            }
            return versionSetup.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final VersionSetup copy(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new VersionSetup(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VersionSetup) && Intrinsics.areEqual(this.id, ((VersionSetup) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "VersionSetup(id=" + this.id + ")";
        }

        public VersionSetup(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        public final String getId() {
            return this.id;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$CatalogFiles;", "Lcom/pymcl/android/ui/state/DialogSpec;", "kind", "Lcom/pymcl/android/ui/state/CatalogKind;", "hit", "Lcom/pymcl/android/ui/state/CatalogHit;", "<init>", "(Lcom/pymcl/android/ui/state/CatalogKind;Lcom/pymcl/android/ui/state/CatalogHit;)V", "getKind", "()Lcom/pymcl/android/ui/state/CatalogKind;", "getHit", "()Lcom/pymcl/android/ui/state/CatalogHit;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CatalogFiles implements DialogSpec {
        public static final int $stable = CatalogHit.$stable;
        private final CatalogHit hit;
        private final CatalogKind kind;

        public static /* synthetic */ CatalogFiles copy$default(CatalogFiles catalogFiles, CatalogKind catalogKind, CatalogHit catalogHit, int i, Object obj) {
            if ((i & 1) != 0) {
                catalogKind = catalogFiles.kind;
            }
            if ((i & 2) != 0) {
                catalogHit = catalogFiles.hit;
            }
            return catalogFiles.copy(catalogKind, catalogHit);
        }

        /* renamed from: component1, reason: from getter */
        public final CatalogKind getKind() {
            return this.kind;
        }

        /* renamed from: component2, reason: from getter */
        public final CatalogHit getHit() {
            return this.hit;
        }

        public final CatalogFiles copy(CatalogKind kind, CatalogHit hit) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(hit, "hit");
            return new CatalogFiles(kind, hit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CatalogFiles)) {
                return false;
            }
            CatalogFiles catalogFiles = (CatalogFiles) other;
            return this.kind == catalogFiles.kind && Intrinsics.areEqual(this.hit, catalogFiles.hit);
        }

        public int hashCode() {
            return (this.kind.hashCode() * 31) + this.hit.hashCode();
        }

        public String toString() {
            return "CatalogFiles(kind=" + this.kind + ", hit=" + this.hit + ")";
        }

        public CatalogFiles(CatalogKind kind, CatalogHit hit) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(hit, "hit");
            this.kind = kind;
            this.hit = hit;
        }

        public final CatalogHit getHit() {
            return this.hit;
        }

        public final CatalogKind getKind() {
            return this.kind;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0012"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$TaskLog;", "Lcom/pymcl/android/ui/state/DialogSpec;", "task", "Lcom/pymcl/android/ui/state/TaskRow;", "<init>", "(Lcom/pymcl/android/ui/state/TaskRow;)V", "getTask", "()Lcom/pymcl/android/ui/state/TaskRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class TaskLog implements DialogSpec {
        public static final int $stable = TaskRow.$stable;
        private final TaskRow task;

        public static /* synthetic */ TaskLog copy$default(TaskLog taskLog, TaskRow taskRow, int i, Object obj) {
            if ((i & 1) != 0) {
                taskRow = taskLog.task;
            }
            return taskLog.copy(taskRow);
        }

        /* renamed from: component1, reason: from getter */
        public final TaskRow getTask() {
            return this.task;
        }

        public final TaskLog copy(TaskRow task) {
            Intrinsics.checkNotNullParameter(task, "task");
            return new TaskLog(task);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TaskLog) && Intrinsics.areEqual(this.task, ((TaskLog) other).task);
        }

        public int hashCode() {
            return this.task.hashCode();
        }

        public String toString() {
            return "TaskLog(task=" + this.task + ")";
        }

        public TaskLog(TaskRow task) {
            Intrinsics.checkNotNullParameter(task, "task");
            this.task = task;
        }

        public final TaskRow getTask() {
            return this.task;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$AiPermission;", "Lcom/pymcl/android/ui/state/DialogSpec;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AiPermission implements DialogSpec {
        public static final int $stable = 0;
        public static final AiPermission INSTANCE = new AiPermission();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AiPermission)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1834795944;
        }

        public String toString() {
            return "AiPermission";
        }

        private AiPermission() {
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tÊ\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$FeedbackConsent;", "Lcom/pymcl/android/ui/state/DialogSpec;", "onDecide", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnDecide", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class FeedbackConsent implements DialogSpec {
        public static final int $stable = 0;
        private final Function1<Boolean, Unit> onDecide;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FeedbackConsent copy$default(FeedbackConsent feedbackConsent, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = feedbackConsent.onDecide;
            }
            return feedbackConsent.copy(function1);
        }

        public final Function1<Boolean, Unit> component1() {
            return this.onDecide;
        }

        public final FeedbackConsent copy(Function1<? super Boolean, Unit> onDecide) {
            Intrinsics.checkNotNullParameter(onDecide, "onDecide");
            return new FeedbackConsent(onDecide);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FeedbackConsent) && Intrinsics.areEqual(this.onDecide, ((FeedbackConsent) other).onDecide);
        }

        public int hashCode() {
            return this.onDecide.hashCode();
        }

        public String toString() {
            return "FeedbackConsent(onDecide=" + this.onDecide + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FeedbackConsent(Function1<? super Boolean, Unit> onDecide) {
            Intrinsics.checkNotNullParameter(onDecide, "onDecide");
            this.onDecide = onDecide;
        }

        public final Function1<Boolean, Unit> getOnDecide() {
            return this.onDecide;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$FirstRun;", "Lcom/pymcl/android/ui/state/DialogSpec;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class FirstRun implements DialogSpec {
        public static final int $stable = 0;
        public static final FirstRun INSTANCE = new FirstRun();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FirstRun)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -287565188;
        }

        public String toString() {
            return "FirstRun";
        }

        private FirstRun() {
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0012"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$Crash;", "Lcom/pymcl/android/ui/state/DialogSpec;", "info", "Lcom/pymcl/android/ui/state/CrashInfo;", "<init>", "(Lcom/pymcl/android/ui/state/CrashInfo;)V", "getInfo", "()Lcom/pymcl/android/ui/state/CrashInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Crash implements DialogSpec {
        public static final int $stable = CrashInfo.$stable;
        private final CrashInfo info;

        public static /* synthetic */ Crash copy$default(Crash crash, CrashInfo crashInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                crashInfo = crash.info;
            }
            return crash.copy(crashInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final CrashInfo getInfo() {
            return this.info;
        }

        public final Crash copy(CrashInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            return new Crash(info);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Crash) && Intrinsics.areEqual(this.info, ((Crash) other).info);
        }

        public int hashCode() {
            return this.info.hashCode();
        }

        public String toString() {
            return "Crash(info=" + this.info + ")";
        }

        public Crash(CrashInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.info = info;
        }

        public final CrashInfo getInfo() {
            return this.info;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001d"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$Dependencies;", "Lcom/pymcl/android/ui/state/DialogSpec;", "instance", "", "version", "modTitle", "deps", "", "Lcom/pymcl/android/ui/state/DepCandidate;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getInstance", "()Ljava/lang/String;", "getVersion", "getModTitle", "getDeps", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Dependencies implements DialogSpec {
        public static final int $stable = 8;
        private final List<DepCandidate> deps;
        private final String instance;
        private final String modTitle;
        private final String version;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dependencies copy$default(Dependencies dependencies, String str, String str2, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dependencies.instance;
            }
            if ((i & 2) != 0) {
                str2 = dependencies.version;
            }
            if ((i & 4) != 0) {
                str3 = dependencies.modTitle;
            }
            if ((i & 8) != 0) {
                list = dependencies.deps;
            }
            return dependencies.copy(str, str2, str3, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstance() {
            return this.instance;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* renamed from: component3, reason: from getter */
        public final String getModTitle() {
            return this.modTitle;
        }

        public final List<DepCandidate> component4() {
            return this.deps;
        }

        public final Dependencies copy(String instance, String version, String modTitle, List<DepCandidate> deps) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(modTitle, "modTitle");
            Intrinsics.checkNotNullParameter(deps, "deps");
            return new Dependencies(instance, version, modTitle, deps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dependencies)) {
                return false;
            }
            Dependencies dependencies = (Dependencies) other;
            return Intrinsics.areEqual(this.instance, dependencies.instance) && Intrinsics.areEqual(this.version, dependencies.version) && Intrinsics.areEqual(this.modTitle, dependencies.modTitle) && Intrinsics.areEqual(this.deps, dependencies.deps);
        }

        public int hashCode() {
            return (((((this.instance.hashCode() * 31) + this.version.hashCode()) * 31) + this.modTitle.hashCode()) * 31) + this.deps.hashCode();
        }

        public String toString() {
            return "Dependencies(instance=" + this.instance + ", version=" + this.version + ", modTitle=" + this.modTitle + ", deps=" + this.deps + ")";
        }

        public Dependencies(String instance, String version, String modTitle, List<DepCandidate> deps) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(modTitle, "modTitle");
            Intrinsics.checkNotNullParameter(deps, "deps");
            this.instance = instance;
            this.version = version;
            this.modTitle = modTitle;
            this.deps = deps;
        }

        public final List<DepCandidate> getDeps() {
            return this.deps;
        }

        public final String getInstance() {
            return this.instance;
        }

        public final String getModTitle() {
            return this.modTitle;
        }

        public final String getVersion() {
            return this.version;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;", "Lcom/pymcl/android/ui/state/DialogSpec;", "instance", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInstance", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ExportModpack implements DialogSpec {
        public static final int $stable = 0;
        private final String instance;
        private final String version;

        public static /* synthetic */ ExportModpack copy$default(ExportModpack exportModpack, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = exportModpack.instance;
            }
            if ((i & 2) != 0) {
                str2 = exportModpack.version;
            }
            return exportModpack.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstance() {
            return this.instance;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final ExportModpack copy(String instance, String version) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            return new ExportModpack(instance, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExportModpack)) {
                return false;
            }
            ExportModpack exportModpack = (ExportModpack) other;
            return Intrinsics.areEqual(this.instance, exportModpack.instance) && Intrinsics.areEqual(this.version, exportModpack.version);
        }

        public int hashCode() {
            return (this.instance.hashCode() * 31) + this.version.hashCode();
        }

        public String toString() {
            return "ExportModpack(instance=" + this.instance + ", version=" + this.version + ")";
        }

        public ExportModpack(String instance, String version) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            this.instance = instance;
            this.version = version;
        }

        public final String getInstance() {
            return this.instance;
        }

        public final String getVersion() {
            return this.version;
        }
    }

    /* compiled from: AppState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/pymcl/android/ui/state/DialogSpec$PickUpdates;", "Lcom/pymcl/android/ui/state/DialogSpec;", "instance", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInstance", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PickUpdates implements DialogSpec {
        public static final int $stable = 0;
        private final String instance;
        private final String version;

        public static /* synthetic */ PickUpdates copy$default(PickUpdates pickUpdates, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pickUpdates.instance;
            }
            if ((i & 2) != 0) {
                str2 = pickUpdates.version;
            }
            return pickUpdates.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstance() {
            return this.instance;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final PickUpdates copy(String instance, String version) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            return new PickUpdates(instance, version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickUpdates)) {
                return false;
            }
            PickUpdates pickUpdates = (PickUpdates) other;
            return Intrinsics.areEqual(this.instance, pickUpdates.instance) && Intrinsics.areEqual(this.version, pickUpdates.version);
        }

        public int hashCode() {
            return (this.instance.hashCode() * 31) + this.version.hashCode();
        }

        public String toString() {
            return "PickUpdates(instance=" + this.instance + ", version=" + this.version + ")";
        }

        public PickUpdates(String instance, String version) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(version, "version");
            this.instance = instance;
            this.version = version;
        }

        public final String getInstance() {
            return this.instance;
        }

        public final String getVersion() {
            return this.version;
        }
    }
}
