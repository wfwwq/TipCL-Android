package com.pymcl.ai;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModelRules.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0014\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010$\u001a\u00020\fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/pymcl/ai/ModelCaps;", "", "contextWindow", "", "maxOutput", "supportsTools", "", "supportsImages", "supportsReasoning", "supportsTemperature", "matched", "", "", "<init>", "(IIZZZZLjava/util/List;)V", "getContextWindow", "()I", "getMaxOutput", "getSupportsTools", "()Z", "getSupportsImages", "getSupportsReasoning", "getSupportsTemperature", "getMatched", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ModelCaps {
    private final int contextWindow;
    private final List<String> matched;
    private final int maxOutput;
    private final boolean supportsImages;
    private final boolean supportsReasoning;
    private final boolean supportsTemperature;
    private final boolean supportsTools;

    public ModelCaps() {
        this(0, 0, false, false, false, false, null, 127, null);
    }

    public static /* synthetic */ ModelCaps copy$default(ModelCaps modelCaps, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = modelCaps.contextWindow;
        }
        if ((i3 & 2) != 0) {
            i2 = modelCaps.maxOutput;
        }
        if ((i3 & 4) != 0) {
            z = modelCaps.supportsTools;
        }
        if ((i3 & 8) != 0) {
            z2 = modelCaps.supportsImages;
        }
        if ((i3 & 16) != 0) {
            z3 = modelCaps.supportsReasoning;
        }
        if ((i3 & 32) != 0) {
            z4 = modelCaps.supportsTemperature;
        }
        if ((i3 & 64) != 0) {
            list = modelCaps.matched;
        }
        boolean z5 = z4;
        List list2 = list;
        boolean z6 = z3;
        boolean z7 = z;
        return modelCaps.copy(i, i2, z7, z2, z6, z5, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getContextWindow() {
        return this.contextWindow;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxOutput() {
        return this.maxOutput;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getSupportsTools() {
        return this.supportsTools;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSupportsImages() {
        return this.supportsImages;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSupportsReasoning() {
        return this.supportsReasoning;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getSupportsTemperature() {
        return this.supportsTemperature;
    }

    public final List<String> component7() {
        return this.matched;
    }

    public final ModelCaps copy(int contextWindow, int maxOutput, boolean supportsTools, boolean supportsImages, boolean supportsReasoning, boolean supportsTemperature, List<String> matched) {
        Intrinsics.checkNotNullParameter(matched, "matched");
        return new ModelCaps(contextWindow, maxOutput, supportsTools, supportsImages, supportsReasoning, supportsTemperature, matched);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelCaps)) {
            return false;
        }
        ModelCaps modelCaps = (ModelCaps) other;
        return this.contextWindow == modelCaps.contextWindow && this.maxOutput == modelCaps.maxOutput && this.supportsTools == modelCaps.supportsTools && this.supportsImages == modelCaps.supportsImages && this.supportsReasoning == modelCaps.supportsReasoning && this.supportsTemperature == modelCaps.supportsTemperature && Intrinsics.areEqual(this.matched, modelCaps.matched);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.contextWindow) * 31) + Integer.hashCode(this.maxOutput)) * 31) + Boolean.hashCode(this.supportsTools)) * 31) + Boolean.hashCode(this.supportsImages)) * 31) + Boolean.hashCode(this.supportsReasoning)) * 31) + Boolean.hashCode(this.supportsTemperature)) * 31) + this.matched.hashCode();
    }

    public String toString() {
        return "ModelCaps(contextWindow=" + this.contextWindow + ", maxOutput=" + this.maxOutput + ", supportsTools=" + this.supportsTools + ", supportsImages=" + this.supportsImages + ", supportsReasoning=" + this.supportsReasoning + ", supportsTemperature=" + this.supportsTemperature + ", matched=" + this.matched + ")";
    }

    public ModelCaps(int contextWindow, int maxOutput, boolean supportsTools, boolean supportsImages, boolean supportsReasoning, boolean supportsTemperature, List<String> matched) {
        Intrinsics.checkNotNullParameter(matched, "matched");
        this.contextWindow = contextWindow;
        this.maxOutput = maxOutput;
        this.supportsTools = supportsTools;
        this.supportsImages = supportsImages;
        this.supportsReasoning = supportsReasoning;
        this.supportsTemperature = supportsTemperature;
        this.matched = matched;
    }

    public /* synthetic */ ModelCaps(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 128000 : i, (i3 & 2) != 0 ? 8192 : i2, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? true : z4, (i3 & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final int getContextWindow() {
        return this.contextWindow;
    }

    public final int getMaxOutput() {
        return this.maxOutput;
    }

    public final boolean getSupportsTools() {
        return this.supportsTools;
    }

    public final boolean getSupportsImages() {
        return this.supportsImages;
    }

    public final boolean getSupportsReasoning() {
        return this.supportsReasoning;
    }

    public final boolean getSupportsTemperature() {
        return this.supportsTemperature;
    }

    public final List<String> getMatched() {
        return this.matched;
    }
}
