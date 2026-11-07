package com.pymcl.ai;

import androidx.autofill.HintConstants;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: AiAgent.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u0010R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007R#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/pymcl/ai/ToolSchemas;", "", "<init>", "()V", "ALL", "", "getALL", "()Ljava/util/List;", "ALL$delegate", "Lkotlin/Lazy;", "NAMES", "", "getNAMES", "NAMES$delegate", "subset", "pred", "Lkotlin/Function1;", "", "SUBAGENT", "getSUBAGENT", "SUBAGENT$delegate", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ToolSchemas {
    public static final ToolSchemas INSTANCE = new ToolSchemas();

    /* renamed from: ALL$delegate, reason: from kotlin metadata */
    private static final Lazy ALL = LazyKt.lazy(new Function0() { // from class: com.pymcl.ai.ToolSchemas$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToolSchemas.ALL_delegate$lambda$0();
        }
    });

    /* renamed from: NAMES$delegate, reason: from kotlin metadata */
    private static final Lazy NAMES = LazyKt.lazy(new Function0() { // from class: com.pymcl.ai.ToolSchemas$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToolSchemas.NAMES_delegate$lambda$0();
        }
    });

    /* renamed from: SUBAGENT$delegate, reason: from kotlin metadata */
    private static final Lazy SUBAGENT = LazyKt.lazy(new Function0() { // from class: com.pymcl.ai.ToolSchemas$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToolSchemas.SUBAGENT_delegate$lambda$0();
        }
    });

    private ToolSchemas() {
    }

    public final List<Object> getALL() {
        return (List) ALL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List ALL_delegate$lambda$0() {
        InputStream resourceAsStream = ToolSchemas.class.getResourceAsStream("/pymcl_ai/tool_schemas.json");
        Intrinsics.checkNotNull(resourceAsStream);
        InputStream inputStream = resourceAsStream;
        try {
            InputStream it = inputStream;
            String txt = new String(ByteStreamsKt.readBytes(it), Charsets.UTF_8);
            CloseableKt.closeFinally(inputStream, null);
            Object obj = Json.INSTANCE.parse(txt);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            return (List) obj;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List NAMES_delegate$lambda$0() {
        Iterable $this$mapNotNull$iv = INSTANCE.getALL();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv$iv : $this$mapNotNull$iv) {
            String str = JsonKt.str(JsonKt.obj(JsonKt.o(element$iv$iv$iv), "function"), HintConstants.AUTOFILL_HINT_NAME);
            if (str != null) {
                destination$iv$iv.add(str);
            }
        }
        return (List) destination$iv$iv;
    }

    public final List<String> getNAMES() {
        return (List) NAMES.getValue();
    }

    public final List<Object> subset(Function1<? super String, Boolean> pred) {
        Intrinsics.checkNotNullParameter(pred, "pred");
        Iterable $this$filter$iv = getALL();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String str = JsonKt.str(JsonKt.obj(JsonKt.o(element$iv$iv), "function"), HintConstants.AUTOFILL_HINT_NAME);
            if (str == null) {
                str = "";
            }
            if (pred.invoke(str).booleanValue()) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return (List) destination$iv$iv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List SUBAGENT_delegate$lambda$0() {
        return INSTANCE.subset(new Function1() { // from class: com.pymcl.ai.ToolSchemas$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(ToolSchemas.SUBAGENT_delegate$lambda$0$0((String) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SUBAGENT_delegate$lambda$0$0(String n) {
        Intrinsics.checkNotNullParameter(n, "n");
        return ToolMetas.INSTANCE.of(n).getReadonly() && !SetsKt.setOf((Object[]) new String[]{"ask_user", "update_plan", "dispatch_subagent"}).contains(n);
    }

    public final List<Object> getSUBAGENT() {
        return (List) SUBAGENT.getValue();
    }
}
