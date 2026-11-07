package com.pymcl.core.mods;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.util.JsonKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModConflicts.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015j\u0002`\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006%"}, d2 = {"Lcom/pymcl/core/mods/ConflictIssue;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "file", "modId", "target", "required", "found", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getFile", "getModId", "getTarget", "getRequired", "getFound", "getDetail", "toJson", "", "Lcom/pymcl/core/util/JObj;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConflictIssue {
    private final String detail;
    private final String file;
    private final String found;
    private final String modId;
    private final String required;
    private final String target;
    private final String type;

    public static /* synthetic */ ConflictIssue copy$default(ConflictIssue conflictIssue, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conflictIssue.type;
        }
        if ((i & 2) != 0) {
            str2 = conflictIssue.file;
        }
        if ((i & 4) != 0) {
            str3 = conflictIssue.modId;
        }
        if ((i & 8) != 0) {
            str4 = conflictIssue.target;
        }
        if ((i & 16) != 0) {
            str5 = conflictIssue.required;
        }
        if ((i & 32) != 0) {
            str6 = conflictIssue.found;
        }
        if ((i & 64) != 0) {
            str7 = conflictIssue.detail;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return conflictIssue.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    /* renamed from: component3, reason: from getter */
    public final String getModId() {
        return this.modId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRequired() {
        return this.required;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFound() {
        return this.found;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    public final ConflictIssue copy(String type, String file, String modId, String target, String required, String found, String detail) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(modId, "modId");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(required, "required");
        Intrinsics.checkNotNullParameter(found, "found");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new ConflictIssue(type, file, modId, target, required, found, detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConflictIssue)) {
            return false;
        }
        ConflictIssue conflictIssue = (ConflictIssue) other;
        return Intrinsics.areEqual(this.type, conflictIssue.type) && Intrinsics.areEqual(this.file, conflictIssue.file) && Intrinsics.areEqual(this.modId, conflictIssue.modId) && Intrinsics.areEqual(this.target, conflictIssue.target) && Intrinsics.areEqual(this.required, conflictIssue.required) && Intrinsics.areEqual(this.found, conflictIssue.found) && Intrinsics.areEqual(this.detail, conflictIssue.detail);
    }

    public int hashCode() {
        return (((((((((((this.type.hashCode() * 31) + this.file.hashCode()) * 31) + this.modId.hashCode()) * 31) + this.target.hashCode()) * 31) + this.required.hashCode()) * 31) + this.found.hashCode()) * 31) + this.detail.hashCode();
    }

    public String toString() {
        return "ConflictIssue(type=" + this.type + ", file=" + this.file + ", modId=" + this.modId + ", target=" + this.target + ", required=" + this.required + ", found=" + this.found + ", detail=" + this.detail + ")";
    }

    public ConflictIssue(String type, String file, String modId, String target, String required, String found, String detail) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(modId, "modId");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(required, "required");
        Intrinsics.checkNotNullParameter(found, "found");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.type = type;
        this.file = file;
        this.modId = modId;
        this.target = target;
        this.required = required;
        this.found = found;
        this.detail = detail;
    }

    public /* synthetic */ ConflictIssue(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getFile() {
        return this.file;
    }

    public final String getFound() {
        return this.found;
    }

    public final String getModId() {
        return this.modId;
    }

    public final String getRequired() {
        return this.required;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getType() {
        return this.type;
    }

    public final Map<String, Object> toJson() {
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.to(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, this.type);
        pairArr[1] = TuplesKt.to("file", this.file);
        pairArr[2] = TuplesKt.to("mod", this.modId);
        String str = this.target;
        String str2 = null;
        if (str.length() == 0) {
            str = null;
        }
        pairArr[3] = TuplesKt.to("target", str);
        String str3 = this.required;
        if (str3.length() == 0) {
            str3 = null;
        }
        pairArr[4] = TuplesKt.to("required", str3);
        String str4 = this.found;
        if (!(str4.length() == 0)) {
            str2 = str4;
        }
        pairArr[5] = TuplesKt.to("found", str2);
        pairArr[6] = TuplesKt.to("detail", this.detail);
        Map o = JsonKt.jobj(pairArr);
        Iterable $this$filter$iv = o.keySet();
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            String it2 = o.get(it) == null ? 1 : null;
            if (it2 != null) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        Iterable $this$forEach$iv = (List) destination$iv$iv;
        for (Object element$iv : $this$forEach$iv) {
            String it3 = (String) element$iv;
            o.remove(it3);
        }
        return o;
    }
}
