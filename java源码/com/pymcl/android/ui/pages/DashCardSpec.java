package com.pymcl.android.ui.pages;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.compressors.CompressorStreamFactory;

/* compiled from: LaunchPage.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017Ê\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0002¨\u0006%"}, d2 = {"Lcom/pymcl/android/ui/pages/DashCardSpec;", "", "id", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "x", "", "y", "w", "h", CompressorStreamFactory.Z, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;FFFFI)V", "getId", "()Ljava/lang/String;", "getType", "getX", "()F", "getY", "getW", "getH", "getZ", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final /* data */ class DashCardSpec {
    public static final int $stable = 0;
    private final float h;
    private final String id;
    private final String type;
    private final float w;
    private final float x;
    private final float y;
    private final int z;

    public static /* synthetic */ DashCardSpec copy$default(DashCardSpec dashCardSpec, String str, String str2, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dashCardSpec.id;
        }
        if ((i2 & 2) != 0) {
            str2 = dashCardSpec.type;
        }
        if ((i2 & 4) != 0) {
            f = dashCardSpec.x;
        }
        if ((i2 & 8) != 0) {
            f2 = dashCardSpec.y;
        }
        if ((i2 & 16) != 0) {
            f3 = dashCardSpec.w;
        }
        if ((i2 & 32) != 0) {
            f4 = dashCardSpec.h;
        }
        if ((i2 & 64) != 0) {
            i = dashCardSpec.z;
        }
        float f5 = f4;
        int i3 = i;
        float f6 = f3;
        float f7 = f;
        return dashCardSpec.copy(str, str2, f7, f2, f6, f5, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component4, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component5, reason: from getter */
    public final float getW() {
        return this.w;
    }

    /* renamed from: component6, reason: from getter */
    public final float getH() {
        return this.h;
    }

    /* renamed from: component7, reason: from getter */
    public final int getZ() {
        return this.z;
    }

    public final DashCardSpec copy(String id, String type, float x, float y, float w, float h, int z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new DashCardSpec(id, type, x, y, w, h, z);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashCardSpec)) {
            return false;
        }
        DashCardSpec dashCardSpec = (DashCardSpec) other;
        return Intrinsics.areEqual(this.id, dashCardSpec.id) && Intrinsics.areEqual(this.type, dashCardSpec.type) && Float.compare(this.x, dashCardSpec.x) == 0 && Float.compare(this.y, dashCardSpec.y) == 0 && Float.compare(this.w, dashCardSpec.w) == 0 && Float.compare(this.h, dashCardSpec.h) == 0 && this.z == dashCardSpec.z;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.w)) * 31) + Float.hashCode(this.h)) * 31) + Integer.hashCode(this.z);
    }

    public String toString() {
        return "DashCardSpec(id=" + this.id + ", type=" + this.type + ", x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + ", z=" + this.z + ")";
    }

    public DashCardSpec(String id, String type, float x, float y, float w, float h, int z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.type = type;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.z = z;
    }

    public final float getH() {
        return this.h;
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final float getW() {
        return this.w;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final int getZ() {
        return this.z;
    }
}
