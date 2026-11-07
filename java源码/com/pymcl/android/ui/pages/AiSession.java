package com.pymcl.android.ui.pages;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.pymcl.ai.AiEvent;
import com.pymcl.android.data.AiItemReducer;
import com.pymcl.android.ui.state.AiItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiPage.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R+\u0010!\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u0011\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017Ê\u0001\f\b)\u0012\b\b*\u0012\u0004\b\u0003\u0010\u0002¨\u0006("}, d2 = {"Lcom/pymcl/android/ui/pages/AiSession;", "", "<init>", "()V", "items", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/pymcl/android/ui/state/AiItem;", "getItems", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "<set-?>", "", "running", "getRunning", "()Z", "setRunning", "(Z)V", "running$delegate", "Landroidx/compose/runtime/MutableState;", "", "activeChat", "getActiveChat", "()Ljava/lang/String;", "setActiveChat", "(Ljava/lang/String;)V", "activeChat$delegate", "loaded", "getLoaded", "setLoaded", "asks", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Lcom/pymcl/ai/AiEvent$Ask;", "getAsks", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "usage", "getUsage", "setUsage", "usage$delegate", "upsert", "", "it", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class AiSession {
    public static final int $stable = 0;
    private static boolean loaded;
    public static final AiSession INSTANCE = new AiSession();
    private static final SnapshotStateList<AiItem> items = SnapshotStateKt.mutableStateListOf();

    /* renamed from: running$delegate, reason: from kotlin metadata */
    private static final MutableState running = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    /* renamed from: activeChat$delegate, reason: from kotlin metadata */
    private static final MutableState activeChat = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private static final SnapshotStateMap<String, AiEvent.Ask> asks = SnapshotStateKt.mutableStateMapOf();

    /* renamed from: usage$delegate, reason: from kotlin metadata */
    private static final MutableState usage = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    private AiSession() {
    }

    public final SnapshotStateList<AiItem> getItems() {
        return items;
    }

    public final boolean getRunning() {
        return ((Boolean) running.getValue()).booleanValue();
    }

    public final void setRunning(boolean z) {
        running.setValue(Boolean.valueOf(z));
    }

    public final String getActiveChat() {
        return (String) activeChat.getValue();
    }

    public final void setActiveChat(String str) {
        activeChat.setValue(str);
    }

    public final boolean getLoaded() {
        return loaded;
    }

    public final void setLoaded(boolean z) {
        loaded = z;
    }

    public final SnapshotStateMap<String, AiEvent.Ask> getAsks() {
        return asks;
    }

    public final String getUsage() {
        return (String) usage.getValue();
    }

    public final void setUsage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        usage.setValue(str);
    }

    public final void upsert(AiItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int idx = 0;
        Iterator<AiItem> it2 = items.iterator();
        while (true) {
            if (it2.hasNext()) {
                AiItem aiItem = (AiItem) it2.next();
                if (Intrinsics.areEqual(aiItem.getId(), it.getId()) && aiItem.getClass() == it.getClass()) {
                    break;
                } else {
                    idx++;
                }
            } else {
                idx = -1;
                break;
            }
        }
        if (AiItemReducer.INSTANCE.isDiscarded(it)) {
            if (idx >= 0) {
                items.remove(idx);
            }
        } else {
            SnapshotStateList<AiItem> snapshotStateList = items;
            if (idx >= 0) {
                snapshotStateList.set(idx, it);
            } else {
                snapshotStateList.add(it);
            }
        }
    }
}
