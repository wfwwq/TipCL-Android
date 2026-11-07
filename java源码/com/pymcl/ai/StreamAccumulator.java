package com.pymcl.ai;

import androidx.autofill.HintConstants;
import com.pymcl.runtime.process.JavaProcessService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sse.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001)B3\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0004J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0004R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nj\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\nj\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0019@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u001e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018¨\u0006*"}, d2 = {"Lcom/pymcl/ai/StreamAccumulator;", "", "onContent", "Lkotlin/Function1;", "", "", "onReasoning", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "content", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "reasoning", "calls", "Ljava/util/SortedMap;", "", "Lcom/pymcl/ai/StreamAccumulator$Partial;", "value", "Lcom/pymcl/ai/Usage;", "usage", "getUsage", "()Lcom/pymcl/ai/Usage;", "finishReason", "getFinishReason", "()Ljava/lang/String;", "", "done", "getDone", "()Z", "error", "getError", "model", "getModel", "accept", "data", "toolCalls", "", "Lcom/pymcl/ai/ToolCall;", "result", "Lcom/pymcl/ai/AssistantTurn;", "requestModel", "Partial", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StreamAccumulator {
    private final SortedMap<Integer, Partial> calls;
    private final StringBuilder content;
    private boolean done;
    private String error;
    private String finishReason;
    private String model;
    private final Function1<String, Unit> onContent;
    private final Function1<String, Unit> onReasoning;
    private final StringBuilder reasoning;
    private Usage usage;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamAccumulator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreamAccumulator(Function1<? super String, Unit> onContent, Function1<? super String, Unit> onReasoning) {
        Intrinsics.checkNotNullParameter(onContent, "onContent");
        Intrinsics.checkNotNullParameter(onReasoning, "onReasoning");
        this.onContent = onContent;
        this.onReasoning = onReasoning;
        this.content = new StringBuilder();
        this.reasoning = new StringBuilder();
        this.calls = MapsKt.sortedMapOf(new Pair[0]);
        this.model = "";
    }

    public /* synthetic */ StreamAccumulator(Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function1() { // from class: com.pymcl.ai.StreamAccumulator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamAccumulator._init_$lambda$0((String) obj);
            }
        } : function1, (i & 2) != 0 ? new Function1() { // from class: com.pymcl.ai.StreamAccumulator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StreamAccumulator._init_$lambda$1((String) obj);
            }
        } : function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* compiled from: Sse.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\f\b\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/pymcl/ai/StreamAccumulator$Partial;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, JavaProcessService.EXTRA_ARGS, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getArgs", "()Ljava/lang/StringBuilder;", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    private static final class Partial {
        private final StringBuilder args;
        private String id;
        private String name;

        public Partial() {
            this(null, null, null, 7, null);
        }

        public Partial(String id, String name, StringBuilder args) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(args, "args");
            this.id = id;
            this.name = name;
            this.args = args;
        }

        public /* synthetic */ Partial(String str, String str2, StringBuilder sb, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new StringBuilder() : sb);
        }

        public final StringBuilder getArgs() {
            return this.args;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        public final void setName(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.name = str;
        }
    }

    public final Usage getUsage() {
        return this.usage;
    }

    public final String getFinishReason() {
        return this.finishReason;
    }

    public final boolean getDone() {
        return this.done;
    }

    public final String getError() {
        return this.error;
    }

    public final String getModel() {
        return this.model;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x023f A[LOOP:2: B:122:0x0213->B:133:0x023f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0246 A[EDGE_INSN: B:209:0x0246->B:135:0x0246 BREAK  A[LOOP:2: B:122:0x0213->B:133:0x023f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0162  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.StreamAccumulator.accept(java.lang.String):void");
    }

    public final List<ToolCall> toolCalls() {
        Iterable iterableEntrySet = this.calls.entrySet();
        Intrinsics.checkNotNullExpressionValue(iterableEntrySet, "<get-entries>(...)");
        Iterable $this$filter$iv = iterableEntrySet;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            Map.Entry it = (Map.Entry) element$iv$iv;
            if (((Partial) it.getValue()).getName().length() > 0) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$map$iv = (List) destination$iv$iv;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            Map.Entry entry = (Map.Entry) item$iv$iv;
            Intrinsics.checkNotNull(entry);
            Integer i = (Integer) entry.getKey();
            Partial p = (Partial) entry.getValue();
            String id = p.getId();
            if (id.length() == 0) {
                id = "call_" + i + "_" + p.getName();
            }
            String name = p.getName();
            String string = p.getArgs().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            destination$iv$iv2.add(new ToolCall(id, name, string));
        }
        return (List) destination$iv$iv2;
    }

    public final AssistantTurn result(String requestModel) {
        Intrinsics.checkNotNullParameter(requestModel, "requestModel");
        String string = this.content.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = this.reasoning.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        List<ToolCall> list = toolCalls();
        Usage usage = this.usage;
        String str = this.finishReason;
        String str2 = this.model;
        if (str2.length() == 0) {
            str2 = requestModel;
        }
        return new AssistantTurn(string, string2, list, usage, str, str2);
    }
}
