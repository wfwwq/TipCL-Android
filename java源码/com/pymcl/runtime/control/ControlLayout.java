package com.pymcl.runtime.control;

import androidx.autofill.HintConstants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pymcl.runtime.input.InputSettings;
import com.pymcl.runtime.input.Keys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: ControlLayout.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0000J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lcom/pymcl/runtime/control/ControlLayout;", "", HintConstants.AUTOFILL_HINT_NAME, "", "version", "", "author", "description", "elements", "", "Lcom/pymcl/runtime/control/ControlElement;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getVersion", "()I", "setVersion", "(I)V", "getAuthor", "setAuthor", "getDescription", "setDescription", "getElements", "()Ljava/util/List;", "setElements", "(Ljava/util/List;)V", "toJson", "deepCopy", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ControlLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int FORMAT_VERSION = 1;
    private static final Gson gson;
    private String author;
    private String description;
    private List<ControlElement> elements;
    private String name;
    private int version;

    public ControlLayout() {
        this(null, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ ControlLayout copy$default(ControlLayout controlLayout, String str, int i, String str2, String str3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = controlLayout.name;
        }
        if ((i2 & 2) != 0) {
            i = controlLayout.version;
        }
        if ((i2 & 4) != 0) {
            str2 = controlLayout.author;
        }
        if ((i2 & 8) != 0) {
            str3 = controlLayout.description;
        }
        if ((i2 & 16) != 0) {
            list = controlLayout.elements;
        }
        List list2 = list;
        String str4 = str2;
        return controlLayout.copy(str, i, str4, str3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<ControlElement> component5() {
        return this.elements;
    }

    public final ControlLayout copy(String name, int version, String author, String description, List<ControlElement> elements) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ControlLayout(name, version, author, description, elements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlLayout)) {
            return false;
        }
        ControlLayout controlLayout = (ControlLayout) other;
        return Intrinsics.areEqual(this.name, controlLayout.name) && this.version == controlLayout.version && Intrinsics.areEqual(this.author, controlLayout.author) && Intrinsics.areEqual(this.description, controlLayout.description) && Intrinsics.areEqual(this.elements, controlLayout.elements);
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + Integer.hashCode(this.version)) * 31) + this.author.hashCode()) * 31) + this.description.hashCode()) * 31) + this.elements.hashCode();
    }

    public String toString() {
        return "ControlLayout(name=" + this.name + ", version=" + this.version + ", author=" + this.author + ", description=" + this.description + ", elements=" + this.elements + ")";
    }

    public ControlLayout(String name, int version, String author, String description, List<ControlElement> elements) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.name = name;
        this.version = version;
        this.author = author;
        this.description = description;
        this.elements = elements;
    }

    public /* synthetic */ ControlLayout(String str, int i, String str2, String str3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? InputSettings.DEFAULT_LAYOUT : str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? new ArrayList() : list);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final void setAuthor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.author = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final List<ControlElement> getElements() {
        return this.elements;
    }

    public final void setElements(List<ControlElement> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.elements = list;
    }

    /* compiled from: ControlLayout.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/pymcl/runtime/control/ControlLayout$Companion;", "", "<init>", "()V", "FORMAT_VERSION", "", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "fromJson", "Lcom/pymcl/runtime/control/ControlLayout;", "json", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ControlLayout fromJson(String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            ControlLayout l = (ControlLayout) ControlLayout.gson.fromJson(json, ControlLayout.class);
            if (l == null) {
                throw new IllegalArgumentException("空布局");
            }
            if (!(l.getVersion() <= 1)) {
                throw new IllegalArgumentException(("布局格式 v" + l.getVersion() + " 比本版本支持的 v1 新").toString());
            }
            ArrayList elements = l.getElements();
            if (elements == null) {
                elements = new ArrayList();
            }
            Iterable $this$onEach$iv = CollectionsKt.filterNotNull(elements);
            int $i$f$onEach = 0;
            for (Object element$iv : $this$onEach$iv) {
                ControlElement e = (ControlElement) element$iv;
                if (e.getType() == null) {
                    e.setType(ElementType.BUTTON);
                }
                Iterable keys = e.getKeys();
                if (keys == null) {
                    keys = (List) new ArrayList();
                }
                Iterable $this$filter$iv = keys;
                Collection destination$iv$iv = new ArrayList();
                for (Object element$iv$iv : $this$filter$iv) {
                    Iterable $this$onEach$iv2 = $this$onEach$iv;
                    String it = (String) element$iv$iv;
                    int $i$f$onEach2 = $i$f$onEach;
                    if (Keys.INSTANCE.isValid(it)) {
                        destination$iv$iv.add(element$iv$iv);
                    }
                    $this$onEach$iv = $this$onEach$iv2;
                    $i$f$onEach = $i$f$onEach2;
                }
                e.setKeys(CollectionsKt.toMutableList(destination$iv$iv));
                e.setX(RangesKt.coerceIn(e.getX(), 0.0f, 1.0f));
                e.setY(RangesKt.coerceIn(e.getY(), 0.0f, 1.0f));
                e.setW(RangesKt.coerceIn(e.getW(), 0.02f, 1.0f));
                e.setH(RangesKt.coerceIn(e.getH(), 0.02f, 1.0f));
                e.setAlpha(RangesKt.coerceIn(e.getAlpha(), 0.05f, 1.0f));
                $this$onEach$iv = $this$onEach$iv;
                $i$f$onEach = $i$f$onEach;
            }
            l.setElements(CollectionsKt.toMutableList((Collection) $this$onEach$iv));
            return l;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [char, com.google.gson.GsonBuilder, java.awt.FontMetrics] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.gson.GsonBuilder, int] */
    static {
        ?? gsonBuilder = new GsonBuilder();
        gson = gsonBuilder.charWidth((char) gsonBuilder).create();
    }

    public final String toJson() {
        String json = gson.toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    public final ControlLayout deepCopy() {
        return INSTANCE.fromJson(toJson());
    }
}
