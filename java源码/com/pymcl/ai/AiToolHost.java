package com.pymcl.ai;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.pymcl.runtime.process.JavaProcessService;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiToolHost.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0005JL\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\rH¦@¢\u0006\u0002\u0010\u0010J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\b\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000bH\u0016J,\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00032\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000bH\u0016¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/pymcl/ai/AiToolHost;", "", "currentInstance", "", "launcherStateSummary", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lcom/pymcl/ai/ToolOutput;", HintConstants.AUTOFILL_HINT_NAME, JavaProcessService.EXTRA_ARGS, "", "Lcom/pymcl/core/util/JObj;", NotificationCompat.CATEGORY_PROGRESS, "Lkotlin/Function2;", "", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "affectedPaths", "", "Ljava/io/File;", "describe", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AiToolHost {
    String currentInstance();

    Object execute(String str, Map<String, Object> map, Function2<? super Float, ? super String, Unit> function2, Continuation<? super ToolOutput> continuation);

    Object launcherStateSummary(Continuation<? super String> continuation);

    /* compiled from: AiToolHost.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static List<File> affectedPaths(AiToolHost $this, String name, Map<String, Object> args) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(args, "args");
            return AiToolHost.super.affectedPaths(name, args);
        }

        @Deprecated
        public static String describe(AiToolHost $this, String name, Map<String, Object> args) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(args, "args");
            return AiToolHost.super.describe(name, args);
        }
    }

    default List<File> affectedPaths(String name, Map<String, Object> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return CollectionsKt.emptyList();
    }

    default String describe(String name, Map<String, Object> args) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        return null;
    }
}
