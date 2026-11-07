package com.pymcl.android.ui.state;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.pymcl.android.data.LauncherPrefs;
import com.pymcl.android.data.RepositoryUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tÊ\u0001\f\b\u000b\u0012\b\b\f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\n"}, d2 = {"Lcom/pymcl/android/ui/state/AppViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "state", "Lcom/pymcl/android/ui/state/AppState;", "getState", "()Lcom/pymcl/android/ui/state/AppState;", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AppViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final AppState state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        AppState appState = new AppState(new RepositoryUiApi(application), ViewModelKt.getViewModelScope(this));
        appState.loadInitial();
        appState.getModWatcher().attach(LauncherPrefs.INSTANCE.store(application), ViewModelKt.getViewModelScope(this));
        this.state = appState;
    }

    public final AppState getState() {
        return this.state;
    }
}
