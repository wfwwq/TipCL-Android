package com.pymcl.multiplayer;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiplayerController.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \f2\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState;", "", "Uninitialized", "Unavailable", "Waiting", "HostScanning", "HostStarting", "HostOk", "GuestConnecting", "GuestStarting", "GuestOk", "Error", "Companion", "Lcom/pymcl/multiplayer/MultiplayerState$Error;", "Lcom/pymcl/multiplayer/MultiplayerState$GuestConnecting;", "Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;", "Lcom/pymcl/multiplayer/MultiplayerState$GuestStarting;", "Lcom/pymcl/multiplayer/MultiplayerState$HostOk;", "Lcom/pymcl/multiplayer/MultiplayerState$HostScanning;", "Lcom/pymcl/multiplayer/MultiplayerState$HostStarting;", "Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;", "Lcom/pymcl/multiplayer/MultiplayerState$Uninitialized;", "Lcom/pymcl/multiplayer/MultiplayerState$Waiting;", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface MultiplayerState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$Uninitialized;", "Lcom/pymcl/multiplayer/MultiplayerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Uninitialized implements MultiplayerState {
        public static final Uninitialized INSTANCE = new Uninitialized();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Uninitialized)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1178235334;
        }

        public String toString() {
            return "Uninitialized";
        }

        private Uninitialized() {
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;", "Lcom/pymcl/multiplayer/MultiplayerState;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Unavailable implements MultiplayerState {
        private final String reason;

        public static /* synthetic */ Unavailable copy$default(Unavailable unavailable, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unavailable.reason;
            }
            return unavailable.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public final Unavailable copy(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Unavailable(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unavailable) && Intrinsics.areEqual(this.reason, ((Unavailable) other).reason);
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Unavailable(reason=" + this.reason + ")";
        }

        public Unavailable(String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$Waiting;", "Lcom/pymcl/multiplayer/MultiplayerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Waiting implements MultiplayerState {
        public static final Waiting INSTANCE = new Waiting();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Waiting)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1588581816;
        }

        public String toString() {
            return "Waiting";
        }

        private Waiting() {
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$HostScanning;", "Lcom/pymcl/multiplayer/MultiplayerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class HostScanning implements MultiplayerState {
        public static final HostScanning INSTANCE = new HostScanning();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HostScanning)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 765900270;
        }

        public String toString() {
            return "HostScanning";
        }

        private HostScanning() {
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$HostStarting;", "Lcom/pymcl/multiplayer/MultiplayerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class HostStarting implements MultiplayerState {
        public static final HostStarting INSTANCE = new HostStarting();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HostStarting)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1322533507;
        }

        public String toString() {
            return "HostStarting";
        }

        private HostStarting() {
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$HostOk;", "Lcom/pymcl/multiplayer/MultiplayerState;", "room", "", "profiles", "", "Lcom/pymcl/multiplayer/TerracottaProfile;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getRoom", "()Ljava/lang/String;", "getProfiles", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class HostOk implements MultiplayerState {
        private final List<TerracottaProfile> profiles;
        private final String room;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HostOk copy$default(HostOk hostOk, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hostOk.room;
            }
            if ((i & 2) != 0) {
                list = hostOk.profiles;
            }
            return hostOk.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRoom() {
            return this.room;
        }

        public final List<TerracottaProfile> component2() {
            return this.profiles;
        }

        public final HostOk copy(String room, List<TerracottaProfile> profiles) {
            Intrinsics.checkNotNullParameter(room, "room");
            Intrinsics.checkNotNullParameter(profiles, "profiles");
            return new HostOk(room, profiles);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HostOk)) {
                return false;
            }
            HostOk hostOk = (HostOk) other;
            return Intrinsics.areEqual(this.room, hostOk.room) && Intrinsics.areEqual(this.profiles, hostOk.profiles);
        }

        public int hashCode() {
            return (this.room.hashCode() * 31) + this.profiles.hashCode();
        }

        public String toString() {
            return "HostOk(room=" + this.room + ", profiles=" + this.profiles + ")";
        }

        public HostOk(String room, List<TerracottaProfile> profiles) {
            Intrinsics.checkNotNullParameter(room, "room");
            Intrinsics.checkNotNullParameter(profiles, "profiles");
            this.room = room;
            this.profiles = profiles;
        }

        public final List<TerracottaProfile> getProfiles() {
            return this.profiles;
        }

        public final String getRoom() {
            return this.room;
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004¨\u0006\f"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$GuestConnecting;", "Lcom/pymcl/multiplayer/MultiplayerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class GuestConnecting implements MultiplayerState {
        public static final GuestConnecting INSTANCE = new GuestConnecting();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GuestConnecting)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 376225563;
        }

        public String toString() {
            return "GuestConnecting";
        }

        private GuestConnecting() {
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$GuestStarting;", "Lcom/pymcl/multiplayer/MultiplayerState;", "difficulty", "", "<init>", "(Ljava/lang/String;)V", "getDifficulty", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class GuestStarting implements MultiplayerState {
        private final String difficulty;

        public static /* synthetic */ GuestStarting copy$default(GuestStarting guestStarting, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = guestStarting.difficulty;
            }
            return guestStarting.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDifficulty() {
            return this.difficulty;
        }

        public final GuestStarting copy(String difficulty) {
            return new GuestStarting(difficulty);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GuestStarting) && Intrinsics.areEqual(this.difficulty, ((GuestStarting) other).difficulty);
        }

        public int hashCode() {
            if (this.difficulty == null) {
                return 0;
            }
            return this.difficulty.hashCode();
        }

        public String toString() {
            return "GuestStarting(difficulty=" + this.difficulty + ")";
        }

        public GuestStarting(String difficulty) {
            this.difficulty = difficulty;
        }

        public final String getDifficulty() {
            return this.difficulty;
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;", "Lcom/pymcl/multiplayer/MultiplayerState;", "url", "", "profiles", "", "Lcom/pymcl/multiplayer/TerracottaProfile;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getUrl", "()Ljava/lang/String;", "getProfiles", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class GuestOk implements MultiplayerState {
        private final List<TerracottaProfile> profiles;
        private final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GuestOk copy$default(GuestOk guestOk, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = guestOk.url;
            }
            if ((i & 2) != 0) {
                list = guestOk.profiles;
            }
            return guestOk.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final List<TerracottaProfile> component2() {
            return this.profiles;
        }

        public final GuestOk copy(String url, List<TerracottaProfile> profiles) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(profiles, "profiles");
            return new GuestOk(url, profiles);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GuestOk)) {
                return false;
            }
            GuestOk guestOk = (GuestOk) other;
            return Intrinsics.areEqual(this.url, guestOk.url) && Intrinsics.areEqual(this.profiles, guestOk.profiles);
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.profiles.hashCode();
        }

        public String toString() {
            return "GuestOk(url=" + this.url + ", profiles=" + this.profiles + ")";
        }

        public GuestOk(String url, List<TerracottaProfile> profiles) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(profiles, "profiles");
            this.url = url;
            this.profiles = profiles;
        }

        public final List<TerracottaProfile> getProfiles() {
            return this.profiles;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$Error;", "Lcom/pymcl/multiplayer/MultiplayerState;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "message", "", "<init>", "(ILjava/lang/String;)V", "getType", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Error implements MultiplayerState {
        private final String message;
        private final int type;

        public static /* synthetic */ Error copy$default(Error error, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = error.type;
            }
            if ((i2 & 2) != 0) {
                str = error.message;
            }
            return error.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Error copy(int type, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(type, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return this.type == error.type && Intrinsics.areEqual(this.message, error.message);
        }

        public int hashCode() {
            return (Integer.hashCode(this.type) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "Error(type=" + this.type + ", message=" + this.message + ")";
        }

        public Error(int type, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.type = type;
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }

        public final int getType() {
            return this.type;
        }
    }

    /* compiled from: MultiplayerController.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerState$Companion;", "", "<init>", "()V", "EXCEPTIONS", "", "", "getEXCEPTIONS", "()Ljava/util/List;", "isNewer", "", "index", "", "last", "parse", "Lkotlin/Pair;", "Lcom/pymcl/multiplayer/MultiplayerState;", "json", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final List<String> EXCEPTIONS = CollectionsKt.listOf((Object[]) new String[]{"加入房间失败：找不到房主", "房间连接断开", "加入房间失败：EasyTier 已崩溃", "创建房间失败：EasyTier 已崩溃", "房间已关闭：您已退出游戏世界", "协议错误：房主发送了错误的响应数据"});

        private Companion() {
        }

        public final List<String> getEXCEPTIONS() {
            return EXCEPTIONS;
        }

        public final boolean isNewer(int index, int last) {
            return index != last;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.Pair<java.lang.Integer, com.pymcl.multiplayer.MultiplayerState> parse(java.lang.String r9) {
            /*
                Method dump skipped, instructions count: 392
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.multiplayer.MultiplayerState.Companion.parse(java.lang.String):kotlin.Pair");
        }

        private static final List<TerracottaProfile> parse$profiles(JsonObject o) {
            ArrayList arrayList;
            String asString;
            String asString2;
            String asString3;
            Iterable asJsonArray = o.getAsJsonArray("profiles");
            if (asJsonArray != null) {
                Iterable $this$map$iv = asJsonArray;
                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
                for (Object item$iv$iv : $this$map$iv) {
                    JsonElement p = (JsonElement) item$iv$iv;
                    JsonObject it = p.getAsJsonObject();
                    JsonElement jsonElement = it.get(HintConstants.AUTOFILL_HINT_NAME);
                    String str = "";
                    if (jsonElement == null || (asString = jsonElement.getAsString()) == null) {
                        asString = "";
                    }
                    JsonElement jsonElement2 = it.get("vendor");
                    if (jsonElement2 == null || (asString2 = jsonElement2.getAsString()) == null) {
                        asString2 = "";
                    }
                    Iterable $this$map$iv2 = $this$map$iv;
                    JsonElement jsonElement3 = it.get("kind");
                    if (jsonElement3 != null && (asString3 = jsonElement3.getAsString()) != null) {
                        str = asString3;
                    }
                    destination$iv$iv.add(new TerracottaProfile(asString, asString2, str));
                    $this$map$iv = $this$map$iv2;
                }
                arrayList = (List) destination$iv$iv;
            } else {
                arrayList = null;
            }
            return arrayList == null ? CollectionsKt.emptyList() : arrayList;
        }
    }
}
