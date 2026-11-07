package com.pymcl.core.instance;

import androidx.autofill.HintConstants;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LevelNbt.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004*+,-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\"\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u0014J\"\u0010'\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020(2\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/pymcl/core/instance/LevelNbt;", "", "<init>", "()V", "END", "", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE_ARRAY", "STRING", "LIST", "COMPOUND", "INT_ARRAY", "LONG_ARRAY", "MAX_DEPTH", "read", "Lcom/pymcl/core/instance/LevelNbt$Root;", "input", "Ljava/io/InputStream;", "readFile", "f", "Ljava/io/File;", "readPayload", "d", "Ljava/io/DataInputStream;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "depth", "len", "write", "", "root", "out", "Ljava/io/OutputStream;", "writeGzip", "", "writePayload", "Ljava/io/DataOutputStream;", SettingsProtocol.EXTRA_VALUE, "Tag", "NbtList", "NbtCompound", "Root", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LevelNbt {
    public static final int BYTE = 1;
    public static final int BYTE_ARRAY = 7;
    public static final int COMPOUND = 10;
    public static final int DOUBLE = 6;
    public static final int END = 0;
    public static final int FLOAT = 5;
    public static final LevelNbt INSTANCE = new LevelNbt();
    public static final int INT = 3;
    public static final int INT_ARRAY = 11;
    public static final int LIST = 9;
    public static final int LONG = 4;
    public static final int LONG_ARRAY = 12;
    private static final int MAX_DEPTH = 512;
    public static final int SHORT = 2;
    public static final int STRING = 8;

    private LevelNbt() {
    }

    /* compiled from: LevelNbt.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/pymcl/core/instance/LevelNbt$Tag;", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "value", "<init>", "(ILjava/lang/Object;)V", "getType", "()I", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Tag {
        private final int type;
        private final Object value;

        public static /* synthetic */ Tag copy$default(Tag tag, int i, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = tag.type;
            }
            if ((i2 & 2) != 0) {
                obj = tag.value;
            }
            return tag.copy(i, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public final Tag copy(int type, Object value) {
            return new Tag(type, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) other;
            return this.type == tag.type && Intrinsics.areEqual(this.value, tag.value);
        }

        public int hashCode() {
            return (Integer.hashCode(this.type) * 31) + (this.value == null ? 0 : this.value.hashCode());
        }

        public String toString() {
            return "Tag(type=" + this.type + ", value=" + this.value + ")";
        }

        public Tag(int type, Object value) {
            this.type = type;
            this.value = value;
        }

        public final int getType() {
            return this.type;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    /* compiled from: LevelNbt.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pymcl/core/instance/LevelNbt$NbtList;", "", "elemType", "", "items", "", "Lcom/pymcl/core/instance/LevelNbt$Tag;", "<init>", "(ILjava/util/List;)V", "getElemType", "()I", "getItems", "()Ljava/util/List;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class NbtList {
        private final int elemType;
        private final List<Tag> items;

        public NbtList(int elemType, List<Tag> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.elemType = elemType;
            this.items = items;
        }

        public /* synthetic */ NbtList(int i, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? new ArrayList() : arrayList);
        }

        public final int getElemType() {
            return this.elemType;
        }

        public final List<Tag> getItems() {
            return this.items;
        }
    }

    /* compiled from: LevelNbt.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u0004H\u0086\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00002\u0006\u0010\f\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004J\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004R-\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/pymcl/core/instance/LevelNbt$NbtCompound;", "", "map", "Ljava/util/LinkedHashMap;", "", "Lcom/pymcl/core/instance/LevelNbt$Tag;", "Lkotlin/collections/LinkedHashMap;", "<init>", "(Ljava/util/LinkedHashMap;)V", "getMap", "()Ljava/util/LinkedHashMap;", SettingsProtocol.GET, "k", "compound", "string", "long", "", "(Ljava/lang/String;)Ljava/lang/Long;", "int", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "putString", "", SettingsProtocol.EXTRA_VALUE, "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class NbtCompound {
        private final LinkedHashMap<String, Tag> map;

        /* JADX WARN: Multi-variable type inference failed */
        public NbtCompound() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public NbtCompound(LinkedHashMap<String, Tag> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            this.map = map;
        }

        public /* synthetic */ NbtCompound(LinkedHashMap linkedHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap);
        }

        public final LinkedHashMap<String, Tag> getMap() {
            return this.map;
        }

        public final Tag get(String k) {
            Intrinsics.checkNotNullParameter(k, "k");
            return this.map.get(k);
        }

        public final NbtCompound compound(String k) {
            Intrinsics.checkNotNullParameter(k, "k");
            Tag tag = this.map.get(k);
            Object value = tag != null ? tag.getValue() : null;
            if (value instanceof NbtCompound) {
                return (NbtCompound) value;
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String string(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.String r0 = "k"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.util.LinkedHashMap<java.lang.String, com.pymcl.core.instance.LevelNbt$Tag> r0 = r6.map
                java.lang.Object r0 = r0.get(r7)
                com.pymcl.core.instance.LevelNbt$Tag r0 = (com.pymcl.core.instance.LevelNbt.Tag) r0
                r1 = 0
                if (r0 == 0) goto L28
                r2 = r0
                r3 = 0
                int r4 = r2.getType()
                r5 = 8
                if (r4 != r5) goto L1c
                r4 = 1
                goto L1d
            L1c:
                r4 = 0
            L1d:
                if (r4 == 0) goto L20
                goto L21
            L20:
                r0 = r1
            L21:
                if (r0 == 0) goto L28
                java.lang.Object r0 = r0.getValue()
                goto L29
            L28:
                r0 = r1
            L29:
                boolean r2 = r0 instanceof java.lang.String
                if (r2 == 0) goto L30
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
            L30:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.instance.LevelNbt.NbtCompound.string(java.lang.String):java.lang.String");
        }

        /* renamed from: long, reason: not valid java name */
        public final Long m8028long(String k) {
            Intrinsics.checkNotNullParameter(k, "k");
            Tag tag = this.map.get(k);
            Object value = tag != null ? tag.getValue() : null;
            Number number = value instanceof Number ? (Number) value : null;
            if (number == null) {
                return null;
            }
            Tag tag2 = this.map.get(k);
            Intrinsics.checkNotNull(tag2);
            int type = tag2.getType();
            boolean z = false;
            if (1 <= type && type < 7) {
                z = true;
            }
            if (!z) {
                number = null;
            }
            if (number != null) {
                return Long.valueOf(number.longValue());
            }
            return null;
        }

        /* renamed from: int, reason: not valid java name */
        public final Integer m8027int(String k) {
            Intrinsics.checkNotNullParameter(k, "k");
            Long lM8028long = m8028long(k);
            if (lM8028long != null) {
                return Integer.valueOf((int) lM8028long.longValue());
            }
            return null;
        }

        public final void putString(String k, String v) {
            Intrinsics.checkNotNullParameter(k, "k");
            Intrinsics.checkNotNullParameter(v, "v");
            this.map.put(k, new Tag(8, v));
        }
    }

    /* compiled from: LevelNbt.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/pymcl/core/instance/LevelNbt$Root;", "", HintConstants.AUTOFILL_HINT_NAME, "", "tag", "Lcom/pymcl/core/instance/LevelNbt$NbtCompound;", "<init>", "(Ljava/lang/String;Lcom/pymcl/core/instance/LevelNbt$NbtCompound;)V", "getName", "()Ljava/lang/String;", "getTag", "()Lcom/pymcl/core/instance/LevelNbt$NbtCompound;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Root {
        private final String name;
        private final NbtCompound tag;

        public static /* synthetic */ Root copy$default(Root root, String str, NbtCompound nbtCompound, int i, Object obj) {
            if ((i & 1) != 0) {
                str = root.name;
            }
            if ((i & 2) != 0) {
                nbtCompound = root.tag;
            }
            return root.copy(str, nbtCompound);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final NbtCompound getTag() {
            return this.tag;
        }

        public final Root copy(String name, NbtCompound tag) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new Root(name, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Root)) {
                return false;
            }
            Root root = (Root) other;
            return Intrinsics.areEqual(this.name, root.name) && Intrinsics.areEqual(this.tag, root.tag);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Root(name=" + this.name + ", tag=" + this.tag + ")";
        }

        public Root(String name, NbtCompound tag) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.name = name;
            this.tag = tag;
        }

        public final String getName() {
            return this.name;
        }

        public final NbtCompound getTag() {
            return this.tag;
        }
    }

    public final Root read(InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        DataInputStream d = new DataInputStream(new BufferedInputStream(input));
        int t = d.readUnsignedByte();
        if (t != 10) {
            throw new IOException("NBT 根不是复合标签（type=" + t + "）");
        }
        String name = d.readUTF();
        Intrinsics.checkNotNull(name);
        Object payload = readPayload(d, 10, 0);
        Intrinsics.checkNotNull(payload, "null cannot be cast to non-null type com.pymcl.core.instance.LevelNbt.NbtCompound");
        return new Root(name, (NbtCompound) payload);
    }

    public final Root readFile(File f) {
        LevelNbt levelNbt;
        BufferedInputStream gZIPInputStream;
        Intrinsics.checkNotNullParameter(f, "f");
        InputStream fileInputStream = new FileInputStream(f);
        BufferedInputStream bufferedInputStream = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
        try {
            BufferedInputStream s = bufferedInputStream;
            s.mark(2);
            int b0 = s.read();
            int b1 = s.read();
            s.reset();
            if (b0 == 31 && b1 == 139) {
                levelNbt = INSTANCE;
                gZIPInputStream = new GZIPInputStream(s);
            } else {
                levelNbt = INSTANCE;
                gZIPInputStream = s;
            }
            Root root = levelNbt.read(gZIPInputStream);
            CloseableKt.closeFinally(bufferedInputStream, null);
            return root;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object readPayload(DataInputStream d, int type, int depth) throws IOException {
        if (depth > 512) {
            throw new IOException("NBT 嵌套过深");
        }
        int i = 0;
        LinkedHashMap linkedHashMap = null;
        Object[] objArr = 0;
        switch (type) {
            case 0:
                return null;
            case 1:
                return Byte.valueOf(d.readByte());
            case 2:
                return Short.valueOf(d.readShort());
            case 3:
                return Integer.valueOf(d.readInt());
            case 4:
                return Long.valueOf(d.readLong());
            case 5:
                return Float.valueOf(d.readFloat());
            case 6:
                return Double.valueOf(d.readDouble());
            case 7:
                byte[] bArr = new byte[len(d)];
                d.readFully(bArr);
                return bArr;
            case 8:
                return d.readUTF();
            case 9:
                int unsignedByte = d.readUnsignedByte();
                int iLen = len(d);
                ArrayList arrayList = new ArrayList(iLen);
                while (i < iLen) {
                    arrayList.add(new Tag(unsignedByte, INSTANCE.readPayload(d, unsignedByte, depth + 1)));
                    i++;
                }
                return new NbtList(unsignedByte, arrayList);
            case 10:
                NbtCompound nbtCompound = new NbtCompound(linkedHashMap, 1, objArr == true ? 1 : 0);
                while (true) {
                    int unsignedByte2 = d.readUnsignedByte();
                    if (unsignedByte2 == 0) {
                        return nbtCompound;
                    }
                    if (unsignedByte2 > 12) {
                        throw new IOException("未知 NBT 类型 " + unsignedByte2);
                    }
                    nbtCompound.getMap().put(d.readUTF(), new Tag(unsignedByte2, readPayload(d, unsignedByte2, depth + 1)));
                }
            case 11:
                int iLen2 = len(d);
                int[] iArr = new int[iLen2];
                while (i < iLen2) {
                    iArr[i] = d.readInt();
                    i++;
                }
                return iArr;
            case 12:
                int iLen3 = len(d);
                long[] jArr = new long[iLen3];
                while (i < iLen3) {
                    jArr[i] = d.readLong();
                    i++;
                }
                return jArr;
            default:
                throw new IOException("未知 NBT 类型 " + type);
        }
    }

    private final int len(DataInputStream d) throws IOException {
        int it = d.readInt();
        if (it < 0 || it > 67108864) {
            throw new IOException("NBT 长度异常: " + it);
        }
        return it;
    }

    public final void write(Root root, OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(out, "out");
        DataOutputStream d = new DataOutputStream(out);
        d.writeByte(10);
        d.writeUTF(root.getName());
        writePayload(d, 10, root.getTag());
        d.flush();
    }

    public final byte[] writeGzip(Root root) {
        Intrinsics.checkNotNullParameter(root, "root");
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(bo);
        try {
            GZIPOutputStream it = gZIPOutputStream;
            INSTANCE.write(root, it);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(gZIPOutputStream, null);
            byte[] byteArray = bo.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return byteArray;
        } finally {
        }
    }

    private final void writePayload(DataOutputStream d, int type, Object v) throws IOException {
        int i = 0;
        switch (type) {
            case 0:
                return;
            case 1:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.Number");
                d.writeByte(((Number) v).intValue());
                return;
            case 2:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.Number");
                d.writeShort(((Number) v).intValue());
                return;
            case 3:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.Number");
                d.writeInt(((Number) v).intValue());
                return;
            case 4:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.Number");
                d.writeLong(((Number) v).longValue());
                return;
            case 5:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.Number");
                d.writeFloat(((Number) v).floatValue());
                return;
            case 6:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.Number");
                d.writeDouble(((Number) v).doubleValue());
                return;
            case 7:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.ByteArray");
                byte[] a = (byte[]) v;
                d.writeInt(a.length);
                d.write(a);
                return;
            case 8:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.String");
                d.writeUTF((String) v);
                return;
            case 9:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type com.pymcl.core.instance.LevelNbt.NbtList");
                NbtList l = (NbtList) v;
                d.writeByte(l.getElemType());
                d.writeInt(l.getItems().size());
                Iterable<Tag> $this$forEach$iv = l.getItems();
                for (Tag it : $this$forEach$iv) {
                    INSTANCE.writePayload(d, l.getElemType(), it.getValue());
                }
                return;
            case 10:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type com.pymcl.core.instance.LevelNbt.NbtCompound");
                Map $this$forEach$iv2 = ((NbtCompound) v).getMap();
                for (Map.Entry element$iv : $this$forEach$iv2.entrySet()) {
                    String k = element$iv.getKey();
                    Tag t = element$iv.getValue();
                    d.writeByte(t.getType());
                    d.writeUTF(k);
                    INSTANCE.writePayload(d, t.getType(), t.getValue());
                }
                d.writeByte(0);
                return;
            case 11:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.IntArray");
                int[] a2 = (int[]) v;
                d.writeInt(a2.length);
                int length = a2.length;
                while (i < length) {
                    d.writeInt(a2[i]);
                    i++;
                }
                return;
            case 12:
                Intrinsics.checkNotNull(v, "null cannot be cast to non-null type kotlin.LongArray");
                long[] a3 = (long[]) v;
                d.writeInt(a3.length);
                int length2 = a3.length;
                while (i < length2) {
                    d.writeLong(a3[i]);
                    i++;
                }
                return;
            default:
                throw new IOException("未知 NBT 类型 " + type);
        }
    }
}
