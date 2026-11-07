package com.pymcl.multiplayer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Terracotta.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/multiplayer/RoomState;", "", "Idle", "Hosting", "Joined", "Failed", "Lcom/pymcl/multiplayer/RoomState$Failed;", "Lcom/pymcl/multiplayer/RoomState$Hosting;", "Lcom/pymcl/multiplayer/RoomState$Idle;", "Lcom/pymcl/multiplayer/RoomState$Joined;", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface RoomState {

    /* compiled from: Terracotta.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/pymcl/multiplayer/RoomState$Idle;", "Lcom/pymcl/multiplayer/RoomState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Idle implements RoomState {
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Idle)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -2123110386;
        }

        public String toString() {
            return "Idle";
        }

        private Idle() {
        }
    }

    /* compiled from: Terracotta.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/pymcl/multiplayer/RoomState$Hosting;", "Lcom/pymcl/multiplayer/RoomState;", "inviteCode", "", "<init>", "(Ljava/lang/String;)V", "getInviteCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Hosting implements RoomState {
        private final String inviteCode;

        public static /* synthetic */ Hosting copy$default(Hosting hosting, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hosting.inviteCode;
            }
            return hosting.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInviteCode() {
            return this.inviteCode;
        }

        public final Hosting copy(String inviteCode) {
            Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
            return new Hosting(inviteCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Hosting) && Intrinsics.areEqual(this.inviteCode, ((Hosting) other).inviteCode);
        }

        public int hashCode() {
            return this.inviteCode.hashCode();
        }

        public String toString() {
            return "Hosting(inviteCode=" + this.inviteCode + ")";
        }

        public Hosting(String inviteCode) {
            Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
            this.inviteCode = inviteCode;
        }

        public final String getInviteCode() {
            return this.inviteCode;
        }
    }

    /* compiled from: Terracotta.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/pymcl/multiplayer/RoomState$Joined;", "Lcom/pymcl/multiplayer/RoomState;", "inviteCode", "", "<init>", "(Ljava/lang/String;)V", "getInviteCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Joined implements RoomState {
        private final String inviteCode;

        public static /* synthetic */ Joined copy$default(Joined joined, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = joined.inviteCode;
            }
            return joined.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInviteCode() {
            return this.inviteCode;
        }

        public final Joined copy(String inviteCode) {
            Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
            return new Joined(inviteCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Joined) && Intrinsics.areEqual(this.inviteCode, ((Joined) other).inviteCode);
        }

        public int hashCode() {
            return this.inviteCode.hashCode();
        }

        public String toString() {
            return "Joined(inviteCode=" + this.inviteCode + ")";
        }

        public Joined(String inviteCode) {
            Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
            this.inviteCode = inviteCode;
        }

        public final String getInviteCode() {
            return this.inviteCode;
        }
    }

    /* compiled from: Terracotta.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/pymcl/multiplayer/RoomState$Failed;", "Lcom/pymcl/multiplayer/RoomState;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Failed implements RoomState {
        private final String reason;

        public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failed.reason;
            }
            return failed.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final Failed copy(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Failed(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failed) && Intrinsics.areEqual(this.reason, ((Failed) other).reason);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Failed(reason=" + this.reason + ")";
        }

        public Failed(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final String getReason() {
            return this.reason;
        }
    }
}
