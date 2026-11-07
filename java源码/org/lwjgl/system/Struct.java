package org.lwjgl.system;

import androidx.collection.SieveCacheKt;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.system.Pointer;
import org.lwjgl.system.Struct;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Struct.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Struct.class */
public abstract class Struct<SELF extends Struct<SELF>> extends Pointer.Default {
    protected static final int DEFAULT_PACK_ALIGNMENT;
    protected static final int DEFAULT_ALIGN_AS = 0;
    protected ByteBuffer container;

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Struct$StructValidation.class
 */
    @FunctionalInterface
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Struct$StructValidation.class */
    public interface StructValidation {
        void validate(long j);
    }

    protected abstract SELF create(long j, ByteBuffer byteBuffer);

    public abstract int sizeof();

    static {
        DEFAULT_PACK_ALIGNMENT = Platform.get() == Platform.WINDOWS ? 8 : 1073741824;
        Library.initialize();
    }

    protected Struct(long address, ByteBuffer container) {
        super(address);
        this.container = container;
    }

    public void clear() {
        MemoryUtil.memSet(address(), 0, sizeof());
    }

    public void free() {
        MemoryUtil.nmemFree(address());
    }

    public boolean isNull(int memberOffset) {
        if (Checks.DEBUG) {
            checkMemberOffset(memberOffset);
        }
        return MemoryUtil.memGetAddress(address() + ((long) memberOffset)) == 0;
    }

    private void checkMemberOffset(int memberOffset) {
        if (memberOffset < 0 || sizeof() - memberOffset < POINTER_SIZE) {
            throw new IllegalArgumentException("Invalid member offset.");
        }
    }

    protected static ByteBuffer __checkContainer(ByteBuffer container, int sizeof) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) container, sizeof);
        }
        return container;
    }

    private static long getBytes(int elements, int elementSize) {
        return (elements & 4294967295L) * elementSize;
    }

    protected static long __checkMalloc(int elements, int elementSize) {
        long bytes = (elements & 4294967295L) * elementSize;
        if (Checks.DEBUG) {
            if (elements < 0) {
                throw new IllegalArgumentException("Invalid number of elements");
            }
            if (BITS32 && 4294967295L < bytes) {
                throw new IllegalArgumentException("The request allocation is too large");
            }
        }
        return bytes;
    }

    protected static ByteBuffer __create(int elements, int elementSize) {
        APIUtil.apiCheckAllocation(elements, getBytes(elements, elementSize), SieveCacheKt.NodeLinkMask);
        return ByteBuffer.allocateDirect(elements * elementSize).order(ByteOrder.nativeOrder());
    }

    protected static <T extends Struct<T>> ByteBuffer __getContainer(T struct) {
        return struct.container;
    }

    protected static ByteBuffer __getContainer(StructBuffer<?, ?> struct) {
        return struct.container;
    }

    public static void validate(long array, int count, int SIZEOF, StructValidation validation) {
        for (int i = 0; i < count; i++) {
            validation.validate(array + (Integer.toUnsignedLong(i) * SIZEOF));
        }
    }

    public static void validate(long array, long count, int SIZEOF, StructValidation validation) {
        validate(array, (int) count, SIZEOF, validation);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Struct$Member.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Struct$Member.class */
    protected static class Member {
        final int size;
        final int alignment;
        final boolean forcedAlignment;
        int offset;

        Member(int size, int alignment, boolean forcedAlignment) {
            this.size = size;
            this.alignment = alignment;
            this.forcedAlignment = forcedAlignment;
        }

        public int getSize() {
            return this.size;
        }

        public int getAlignment() {
            return this.alignment;
        }

        public int getAlignment(int packAlignment) {
            return this.forcedAlignment ? this.alignment : Math.min(this.alignment, packAlignment);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Struct$Layout.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Struct$Layout.class */
    protected static class Layout extends Member {
        final Member[] members;

        Layout(int size, int alignment, boolean forceAlignment, Member[] members) {
            super(size, alignment, forceAlignment);
            this.members = members;
        }

        public int offsetof(int member) {
            return this.members[member].offset;
        }
    }

    protected static Member __padding(int num, boolean condition) {
        return __padding(num, 1, condition);
    }

    protected static Member __padding(int num, int size, boolean condition) {
        return __member(condition ? num * size : 0, size);
    }

    protected static Member __member(int size) {
        return __member(size, size);
    }

    protected static Member __member(int size, int alignment) {
        return __member(size, alignment, false);
    }

    protected static Member __member(int size, int alignment, boolean forceAlignment) {
        return new Member(size, alignment, forceAlignment);
    }

    protected static Member __array(int size, int length) {
        return __array(size, size, length);
    }

    protected static Member __array(int size, int alignment, int length) {
        return new Member(size * length, alignment, false);
    }

    protected static Member __array(int size, int alignment, boolean forceAlignment, int length) {
        return new Member(size * length, alignment, forceAlignment);
    }

    protected static Layout __union(Member... members) {
        return __union(DEFAULT_PACK_ALIGNMENT, 0, members);
    }

    protected static Layout __union(int packAlignment, int alignas, Member... members) {
        List<Member> union = new ArrayList<>(members.length);
        int size = 0;
        int alignment = alignas;
        for (Member m : members) {
            size = Math.max(size, m.size);
            alignment = Math.max(alignment, m.getAlignment(packAlignment));
            m.offset = 0;
            union.add(m);
            if (m instanceof Layout) {
                addNestedMembers(m, union, 0);
            }
        }
        return new Layout(size, alignment, alignas != 0, (Member[]) union.toArray(new Member[0]));
    }

    protected static Layout __struct(Member... members) {
        return __struct(DEFAULT_PACK_ALIGNMENT, 0, members);
    }

    protected static Layout __struct(int packAlignment, int alignas, Member... members) {
        List<Member> struct = new ArrayList<>(members.length);
        int size = 0;
        int alignment = alignas;
        for (Member m : members) {
            int memberAlignment = m.getAlignment(packAlignment);
            m.offset = align(size, memberAlignment);
            size = m.offset + m.size;
            alignment = Math.max(alignment, memberAlignment);
            struct.add(m);
            if (m instanceof Layout) {
                addNestedMembers(m, struct, m.offset);
            }
        }
        return new Layout(align(size, alignment), alignment, alignas != 0, (Member[]) struct.toArray(new Member[0]));
    }

    private static void addNestedMembers(Member nested, List<Member> members, int offset) {
        Layout layout = (Layout) nested;
        for (Member m : layout.members) {
            m.offset += offset;
            members.add(m);
        }
    }

    private static int align(int offset, int alignment) {
        return ((offset - 1) | (alignment - 1)) + 1;
    }
}
