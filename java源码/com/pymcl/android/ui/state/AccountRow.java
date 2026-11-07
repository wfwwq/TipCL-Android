package com.pymcl.android.ui.state;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/pymcl/android/ui/state/AccountRow;", "", HintConstants.AUTOFILL_HINT_NAME, "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "active", "", "uuid", "skinModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "getActive", "()Z", "getUuid", "getSkinModel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class AccountRow {
    public static final int $stable = 0;
    private final boolean active;
    private final String name;
    private final String skinModel;
    private final String type;
    private final String uuid;

    public static /* synthetic */ AccountRow copy$default(AccountRow accountRow, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountRow.name;
        }
        if ((i & 2) != 0) {
            str2 = accountRow.type;
        }
        if ((i & 4) != 0) {
            z = accountRow.active;
        }
        if ((i & 8) != 0) {
            str3 = accountRow.uuid;
        }
        if ((i & 16) != 0) {
            str4 = accountRow.skinModel;
        }
        String str5 = str4;
        boolean z2 = z;
        return accountRow.copy(str, str2, z2, str3, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSkinModel() {
        return this.skinModel;
    }

    public final AccountRow copy(String name, String type, boolean active, String uuid, String skinModel) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(skinModel, "skinModel");
        return new AccountRow(name, type, active, uuid, skinModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountRow)) {
            return false;
        }
        AccountRow accountRow = (AccountRow) other;
        return Intrinsics.areEqual(this.name, accountRow.name) && Intrinsics.areEqual(this.type, accountRow.type) && this.active == accountRow.active && Intrinsics.areEqual(this.uuid, accountRow.uuid) && Intrinsics.areEqual(this.skinModel, accountRow.skinModel);
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.active)) * 31) + this.uuid.hashCode()) * 31) + this.skinModel.hashCode();
    }

    public String toString() {
        return "AccountRow(name=" + this.name + ", type=" + this.type + ", active=" + this.active + ", uuid=" + this.uuid + ", skinModel=" + this.skinModel + ")";
    }

    public AccountRow(String name, String type, boolean active, String uuid, String skinModel) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(skinModel, "skinModel");
        this.name = name;
        this.type = type;
        this.active = active;
        this.uuid = uuid;
        this.skinModel = skinModel;
    }

    public /* synthetic */ AccountRow(String str, String str2, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "classic" : str4);
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSkinModel() {
        return this.skinModel;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }
}
