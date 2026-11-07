package com.pymcl.ai;

import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* compiled from: ModelRules.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004j\u0004\u0018\u0001`\u00062\u0006\u0010\r\u001a\u00020\u0005H\u0002J0\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012R&\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/pymcl/ai/ModelRules;", "", "tables", "", "", "", "Lcom/pymcl/core/util/JObj;", "<init>", "(Ljava/util/List;)V", "apply", "Lcom/pymcl/ai/ModelCaps;", "c", "o", "tag", "resolve", "model", "endpointUrl", "overrides", "", "Companion", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ModelRules {
    private final List<Map<String, Object>> tables;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<Map<String, Object>> BUILTIN_JSON$delegate = LazyKt.lazy(new Function0() { // from class: com.pymcl.ai.ModelRules$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ModelRules.BUILTIN_JSON_delegate$lambda$0();
        }
    });

    /* compiled from: ModelRules.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0002R-\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0002`\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/pymcl/ai/ModelRules$Companion;", "", "<init>", "()V", "BUILTIN_JSON", "", "", "Lcom/pymcl/core/util/JObj;", "getBUILTIN_JSON", "()Ljava/util/Map;", "BUILTIN_JSON$delegate", "Lkotlin/Lazy;", AiMode.BUILTIN, "Lcom/pymcl/ai/ModelRules;", "load", "userFile", "Ljava/io/File;", "rx", "Lkotlin/text/Regex;", "p", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Map<String, Object> getBUILTIN_JSON() {
            return (Map) ModelRules.BUILTIN_JSON$delegate.getValue();
        }

        public final ModelRules builtin() {
            return new ModelRules(CollectionsKt.listOf(getBUILTIN_JSON()));
        }

        public final ModelRules load(File userFile) {
            Object objM8116constructorimpl;
            if (userFile != null) {
                File file = userFile.isFile() ? userFile : null;
                if (file != null) {
                    Companion companion = ModelRules.INSTANCE;
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(Json.INSTANCE.obj(FilesKt.readText$default(file, null, 1, null)));
                    } catch (Throwable th) {
                        Result.Companion companion3 = Result.INSTANCE;
                        objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
                    }
                    obj = (Map) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
                }
            }
            return new ModelRules(CollectionsKt.listOfNotNull((Object[]) new Map[]{getBUILTIN_JSON(), obj}));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Regex rx(String p) {
            Object objM8116constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                objM8116constructorimpl = Result.m8116constructorimpl(new Regex(p, RegexOption.IGNORE_CASE));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
                objM8116constructorimpl = null;
            }
            return (Regex) objM8116constructorimpl;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModelRules(List<? extends Map<String, Object>> tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.tables = tables;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map BUILTIN_JSON_delegate$lambda$0() {
        Json json = Json.INSTANCE;
        InputStream resourceAsStream = ModelRules.class.getResourceAsStream("/pymcl_ai/model_rules.json");
        Intrinsics.checkNotNull(resourceAsStream);
        InputStream inputStream = resourceAsStream;
        try {
            InputStream it = inputStream;
            String str = new String(ByteStreamsKt.readBytes(it), Charsets.UTF_8);
            CloseableKt.closeFinally(inputStream, null);
            return json.obj(str);
        } finally {
        }
    }

    private final ModelCaps apply(ModelCaps c, Map<String, Object> o, String tag) {
        if (o == null) {
            return c;
        }
        Integer numM8042int = JsonKt.m8042int(o, "contextWindow");
        int contextWindow = (numM8042int == null && (numM8042int = JsonKt.m8042int(o, "context_window")) == null) ? c.getContextWindow() : numM8042int.intValue();
        Integer numM8042int2 = JsonKt.m8042int(o, "maxOutput");
        int maxOutput = (numM8042int2 == null && (numM8042int2 = JsonKt.m8042int(o, "max_output")) == null && (numM8042int2 = JsonKt.m8042int(o, "maxTokens")) == null) ? c.getMaxOutput() : numM8042int2.intValue();
        Boolean bool = JsonKt.bool(o, "supportsTools");
        boolean supportsTools = (bool == null && (bool = JsonKt.bool(o, "tools")) == null) ? c.getSupportsTools() : bool.booleanValue();
        Boolean bool2 = JsonKt.bool(o, "supportsImages");
        boolean supportsImages = (bool2 == null && (bool2 = JsonKt.bool(o, "vision")) == null && (bool2 = JsonKt.bool(o, "images")) == null) ? c.getSupportsImages() : bool2.booleanValue();
        Boolean bool3 = JsonKt.bool(o, "supportsReasoning");
        boolean supportsReasoning = (bool3 == null && (bool3 = JsonKt.bool(o, "reasoning")) == null && (bool3 = JsonKt.bool(o, "thinking")) == null) ? c.getSupportsReasoning() : bool3.booleanValue();
        Boolean bool4 = JsonKt.bool(o, "supportsTemperature");
        return c.copy(contextWindow, maxOutput, supportsTools, supportsImages, supportsReasoning, (bool4 == null && (bool4 = JsonKt.bool(o, "temperature")) == null) ? c.getSupportsTemperature() : bool4.booleanValue(), CollectionsKt.plus((Collection<? extends String>) c.getMatched(), tag));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModelCaps resolve$default(ModelRules modelRules, String str, String str2, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        return modelRules.resolve(str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.pymcl.ai.ModelCaps resolve(java.lang.String r24, java.lang.String r25, java.util.Map<java.lang.String, ? extends java.lang.Object> r26) {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.ai.ModelRules.resolve(java.lang.String, java.lang.String, java.util.Map):com.pymcl.ai.ModelCaps");
    }
}
