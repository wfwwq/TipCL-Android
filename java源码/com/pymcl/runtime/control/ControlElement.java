package com.pymcl.runtime.control;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.multiplayer.TerracottaVpnService;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ControlLayout.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\bC\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u0010H\u001a\u00020\u000fHÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u00108J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010M\u001a\u00020\bHÆ\u0003J¤\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010OJ\u0014\u0010P\u001a\u00020\u000f2\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010R\u001a\u00020SHÖ\u0081\u0004J\n\u0010T\u001a\u00020\u0003HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R\u001a\u0010\u0011\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010;\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010\u001aR\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\"\"\u0004\b?\u0010$¨\u0006U"}, d2 = {"Lcom/pymcl/runtime/control/ControlElement;", "", "id", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/pymcl/runtime/control/ElementType;", TerracottaVpnService.EXTRA_TEXT, "x", "", "y", "w", "h", "keys", "", "toggle", "", "alpha", "cornerRadius", "showWhenGrabbed", "sprintKey", "sprintThreshold", "<init>", "(Ljava/lang/String;Lcom/pymcl/runtime/control/ElementType;Ljava/lang/String;FFFFLjava/util/List;ZFFLjava/lang/Boolean;Ljava/lang/String;F)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getType", "()Lcom/pymcl/runtime/control/ElementType;", "setType", "(Lcom/pymcl/runtime/control/ElementType;)V", "getText", "setText", "getX", "()F", "setX", "(F)V", "getY", "setY", "getW", "setW", "getH", "setH", "getKeys", "()Ljava/util/List;", "setKeys", "(Ljava/util/List;)V", "getToggle", "()Z", "setToggle", "(Z)V", "getAlpha", "setAlpha", "getCornerRadius", "setCornerRadius", "getShowWhenGrabbed", "()Ljava/lang/Boolean;", "setShowWhenGrabbed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSprintKey", "setSprintKey", "getSprintThreshold", "setSprintThreshold", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Lcom/pymcl/runtime/control/ElementType;Ljava/lang/String;FFFFLjava/util/List;ZFFLjava/lang/Boolean;Ljava/lang/String;F)Lcom/pymcl/runtime/control/ControlElement;", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ControlElement {
    private float alpha;
    private float cornerRadius;
    private float h;
    private String id;
    private List<String> keys;
    private Boolean showWhenGrabbed;
    private String sprintKey;
    private float sprintThreshold;
    private String text;
    private boolean toggle;
    private ElementType type;
    private float w;
    private float x;
    private float y;

    public ControlElement() {
        this(null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0.0f, 0.0f, null, null, 0.0f, 16383, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* renamed from: component11, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getShowWhenGrabbed() {
        return this.showWhenGrabbed;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSprintKey() {
        return this.sprintKey;
    }

    /* renamed from: component14, reason: from getter */
    public final float getSprintThreshold() {
        return this.sprintThreshold;
    }

    /* renamed from: component2, reason: from getter */
    public final ElementType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component4, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: component5, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* renamed from: component6, reason: from getter */
    public final float getW() {
        return this.w;
    }

    /* renamed from: component7, reason: from getter */
    public final float getH() {
        return this.h;
    }

    public final List<String> component8() {
        return this.keys;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getToggle() {
        return this.toggle;
    }

    public final ControlElement copy(String id, ElementType type, String text, float x, float y, float w, float h, List<String> keys, boolean toggle, float alpha, float cornerRadius, Boolean showWhenGrabbed, String sprintKey, float sprintThreshold) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(keys, "keys");
        return new ControlElement(id, type, text, x, y, w, h, keys, toggle, alpha, cornerRadius, showWhenGrabbed, sprintKey, sprintThreshold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControlElement)) {
            return false;
        }
        ControlElement controlElement = (ControlElement) other;
        return Intrinsics.areEqual(this.id, controlElement.id) && this.type == controlElement.type && Intrinsics.areEqual(this.text, controlElement.text) && Float.compare(this.x, controlElement.x) == 0 && Float.compare(this.y, controlElement.y) == 0 && Float.compare(this.w, controlElement.w) == 0 && Float.compare(this.h, controlElement.h) == 0 && Intrinsics.areEqual(this.keys, controlElement.keys) && this.toggle == controlElement.toggle && Float.compare(this.alpha, controlElement.alpha) == 0 && Float.compare(this.cornerRadius, controlElement.cornerRadius) == 0 && Intrinsics.areEqual(this.showWhenGrabbed, controlElement.showWhenGrabbed) && Intrinsics.areEqual(this.sprintKey, controlElement.sprintKey) && Float.compare(this.sprintThreshold, controlElement.sprintThreshold) == 0;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.text.hashCode()) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.w)) * 31) + Float.hashCode(this.h)) * 31) + this.keys.hashCode()) * 31) + Boolean.hashCode(this.toggle)) * 31) + Float.hashCode(this.alpha)) * 31) + Float.hashCode(this.cornerRadius)) * 31) + (this.showWhenGrabbed == null ? 0 : this.showWhenGrabbed.hashCode())) * 31) + (this.sprintKey != null ? this.sprintKey.hashCode() : 0)) * 31) + Float.hashCode(this.sprintThreshold);
    }

    public String toString() {
        return "ControlElement(id=" + this.id + ", type=" + this.type + ", text=" + this.text + ", x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + ", keys=" + this.keys + ", toggle=" + this.toggle + ", alpha=" + this.alpha + ", cornerRadius=" + this.cornerRadius + ", showWhenGrabbed=" + this.showWhenGrabbed + ", sprintKey=" + this.sprintKey + ", sprintThreshold=" + this.sprintThreshold + ")";
    }

    public ControlElement(String id, ElementType type, String text, float x, float y, float w, float h, List<String> keys, boolean toggle, float alpha, float cornerRadius, Boolean showWhenGrabbed, String sprintKey, float sprintThreshold) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(keys, "keys");
        this.id = id;
        this.type = type;
        this.text = text;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.keys = keys;
        this.toggle = toggle;
        this.alpha = alpha;
        this.cornerRadius = cornerRadius;
        this.showWhenGrabbed = showWhenGrabbed;
        this.sprintKey = sprintKey;
        this.sprintThreshold = sprintThreshold;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ControlElement(String str, ElementType elementType, String str2, float f, float f2, float f3, float f4, List list, boolean z, float f5, float f6, Boolean bool, String str3, float f7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String strTake;
        if ((i & 1) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            strTake = StringsKt.take(string, 8);
        } else {
            strTake = str;
        }
        this(strTake, (i & 2) != 0 ? ElementType.BUTTON : elementType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0.0f : f, (i & 16) == 0 ? f2 : 0.0f, (i & 32) != 0 ? 0.08f : f3, (i & 64) == 0 ? f4 : 0.08f, (i & 128) != 0 ? new ArrayList() : list, (i & 256) != 0 ? false : z, (i & 512) != 0 ? 0.6f : f5, (i & 1024) != 0 ? 0.25f : f6, (i & 2048) != 0 ? null : bool, (i & 4096) == 0 ? str3 : null, (i & 8192) != 0 ? 0.95f : f7);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final ElementType getType() {
        return this.type;
    }

    public final void setType(ElementType elementType) {
        Intrinsics.checkNotNullParameter(elementType, "<set-?>");
        this.type = elementType;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final float getX() {
        return this.x;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final float getY() {
        return this.y;
    }

    public final void setY(float f) {
        this.y = f;
    }

    public final float getW() {
        return this.w;
    }

    public final void setW(float f) {
        this.w = f;
    }

    public final float getH() {
        return this.h;
    }

    public final void setH(float f) {
        this.h = f;
    }

    public final List<String> getKeys() {
        return this.keys;
    }

    public final void setKeys(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.keys = list;
    }

    public final boolean getToggle() {
        return this.toggle;
    }

    public final void setToggle(boolean z) {
        this.toggle = z;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final void setCornerRadius(float f) {
        this.cornerRadius = f;
    }

    public final Boolean getShowWhenGrabbed() {
        return this.showWhenGrabbed;
    }

    public final void setShowWhenGrabbed(Boolean bool) {
        this.showWhenGrabbed = bool;
    }

    public final String getSprintKey() {
        return this.sprintKey;
    }

    public final void setSprintKey(String str) {
        this.sprintKey = str;
    }

    public final float getSprintThreshold() {
        return this.sprintThreshold;
    }

    public final void setSprintThreshold(float f) {
        this.sprintThreshold = f;
    }
}
