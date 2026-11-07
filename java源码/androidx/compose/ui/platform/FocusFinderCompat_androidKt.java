package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.MutableObjectList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: FocusFinderCompat.android.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\"\u0010\u0006\u001a\u00020\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002\u001a*\u0010\u0006\u001a\u00020\u0007*\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u001e\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0005H\u0002\u001a*\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u0010H\u0002\u001a,\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f0\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0013"}, d2 = {"findViewInsideOutShouldExist", "Landroid/view/View;", "root", "start", "id", "", "addFocusableViews", "", "views", "Landroidx/collection/MutableObjectList;", "direction", "inTouchMode", "", "findUserSetNextFocus", "findViewByPredicateInsideOut", "predicate", "Lkotlin/Function1;", "findViewByPredicateTraversal", "childToSkip", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusFinderCompat_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final View findUserSetNextFocus(final View $this$findUserSetNextFocus, final View root, int direction) {
        switch (direction) {
            case 1:
                if ($this$findUserSetNextFocus.getId() != -1) {
                    break;
                }
                break;
            case 2:
                int next = $this$findUserSetNextFocus.getNextFocusForwardId();
                if (next != -1) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewInsideOutShouldExist(View root, View start, final int id) {
        return findViewByPredicateInsideOut(root, start, new Function1<View, Boolean>() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt.findViewInsideOutShouldExist.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(View it) {
                return Boolean.valueOf(it.getId() == id);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.View findViewByPredicateInsideOut(android.view.View r5, android.view.View r6, kotlin.jvm.functions.Function1<? super android.view.View, java.lang.Boolean> r7) {
        /*
            r0 = r6
            r1 = 0
        L2:
            android.view.View r2 = findViewByPredicateTraversal(r0, r7, r1)
            if (r2 != 0) goto L1e
            if (r0 != r5) goto Lc
            goto L1e
        Lc:
            android.view.ViewParent r3 = r0.getParent()
            if (r3 == 0) goto L1c
            boolean r4 = r3 instanceof android.view.View
            if (r4 != 0) goto L17
            goto L1c
        L17:
            r1 = r0
            r0 = r3
            android.view.View r0 = (android.view.View) r0
            goto L2
        L1c:
            r4 = 0
            return r4
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.FocusFinderCompat_androidKt.findViewByPredicateInsideOut(android.view.View, android.view.View, kotlin.jvm.functions.Function1):android.view.View");
    }

    private static final View findViewByPredicateTraversal(View $this$findViewByPredicateTraversal, Function1<? super View, Boolean> function1, View childToSkip) {
        View v;
        if (function1.invoke($this$findViewByPredicateTraversal).booleanValue()) {
            return $this$findViewByPredicateTraversal;
        }
        if ($this$findViewByPredicateTraversal instanceof ViewGroup) {
            int childCount = ((ViewGroup) $this$findViewByPredicateTraversal).getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = ((ViewGroup) $this$findViewByPredicateTraversal).getChildAt(i);
                if (child != childToSkip && (v = findViewByPredicateTraversal(child, function1, childToSkip)) != null) {
                    return v;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addFocusableViews(View $this$addFocusableViews, MutableObjectList<View> mutableObjectList, int direction) {
        addFocusableViews($this$addFocusableViews, mutableObjectList, direction, $this$addFocusableViews.isInTouchMode());
    }

    private static final void addFocusableViews(View $this$addFocusableViews, MutableObjectList<View> mutableObjectList, int direction, boolean inTouchMode) {
        if (($this$addFocusableViews.getVisibility() == 0) && $this$addFocusableViews.isFocusable() && $this$addFocusableViews.isEnabled() && $this$addFocusableViews.getWidth() > 0 && $this$addFocusableViews.getHeight() > 0 && (!inTouchMode || $this$addFocusableViews.isFocusableInTouchMode())) {
            mutableObjectList.add($this$addFocusableViews);
        }
        if ($this$addFocusableViews instanceof ViewGroup) {
            int childCount = ((ViewGroup) $this$addFocusableViews).getChildCount();
            for (int i = 0; i < childCount; i++) {
                addFocusableViews(((ViewGroup) $this$addFocusableViews).getChildAt(i), mutableObjectList, direction, inTouchMode);
            }
        }
    }
}
