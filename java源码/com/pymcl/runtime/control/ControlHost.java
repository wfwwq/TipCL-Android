package com.pymcl.runtime.control;

import com.pymcl.runtime.input.InputSink;
import com.pymcl.runtime.input.Keys;
import kotlin.Metadata;

/* compiled from: ControlViews.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/pymcl/runtime/control/ControlHost;", "", "sink", "Lcom/pymcl/runtime/input/InputSink;", "getSink", "()Lcom/pymcl/runtime/input/InputSink;", "editing", "", "getEditing", "()Z", "onAction", "", "action", "Lcom/pymcl/runtime/input/Keys$Action;", "lookSensitivity", "", "longPressMs", "", "onElementEdited", "view", "Lcom/pymcl/runtime/control/ControlElementView;", "onElementSelected", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ControlHost {
    boolean getEditing();

    InputSink getSink();

    long longPressMs();

    float lookSensitivity();

    void onAction(Keys.Action action);

    void onElementEdited(ControlElementView view);

    void onElementSelected(ControlElementView view);
}
