package org.lwjgl.system.macosx;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/CGEventTapInformation.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/CGEventTapInformation.class */
public class CGEventTapInformation extends Struct<CGEventTapInformation> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int EVENTTAPID;
    public static final int TAPPOINT;
    public static final int OPTIONS;
    public static final int EVENTSOFINTEREST;
    public static final int TAPPINGPROCESS;
    public static final int PROCESSBEINGTAPPED;
    public static final int ENABLED;
    public static final int MINUSECLATENCY;
    public static final int AVGUSECLATENCY;
    public static final int MAXUSECLATENCY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(8), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(1), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        EVENTTAPID = layout.offsetof(0);
        TAPPOINT = layout.offsetof(1);
        OPTIONS = layout.offsetof(2);
        EVENTSOFINTEREST = layout.offsetof(3);
        TAPPINGPROCESS = layout.offsetof(4);
        PROCESSBEINGTAPPED = layout.offsetof(5);
        ENABLED = layout.offsetof(6);
        MINUSECLATENCY = layout.offsetof(7);
        AVGUSECLATENCY = layout.offsetof(8);
        MAXUSECLATENCY = layout.offsetof(9);
    }

    protected CGEventTapInformation(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public CGEventTapInformation create(long address, ByteBuffer container) {
        return new CGEventTapInformation(address, container);
    }

    public CGEventTapInformation(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int eventTapID() {
        return neventTapID(address());
    }

    @NativeType("CGEventTapLocation")
    public int tapPoint() {
        return ntapPoint(address());
    }

    @NativeType("CGEventTapOptions")
    public int options() {
        return noptions(address());
    }

    @NativeType("CGEventMask")
    public long eventsOfInterest() {
        return neventsOfInterest(address());
    }

    @NativeType("pid_t")
    public long tappingProcess() {
        return ntappingProcess(address());
    }

    @NativeType("pid_t")
    public long processBeingTapped() {
        return nprocessBeingTapped(address());
    }

    @NativeType("bool")
    public boolean enabled() {
        return nenabled(address());
    }

    public float minUsecLatency() {
        return nminUsecLatency(address());
    }

    public float avgUsecLatency() {
        return navgUsecLatency(address());
    }

    public float maxUsecLatency() {
        return nmaxUsecLatency(address());
    }

    public static CGEventTapInformation malloc() {
        return new CGEventTapInformation(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static CGEventTapInformation calloc() {
        return new CGEventTapInformation(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static CGEventTapInformation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CGEventTapInformation(MemoryUtil.memAddress(container), container);
    }

    public static CGEventTapInformation create(long address) {
        return new CGEventTapInformation(address, null);
    }

    public static CGEventTapInformation createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new CGEventTapInformation(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static CGEventTapInformation malloc(MemoryStack stack) {
        return new CGEventTapInformation(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static CGEventTapInformation calloc(MemoryStack stack) {
        return new CGEventTapInformation(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int neventTapID(long struct) {
        return MemoryUtil.memGetInt(struct + EVENTTAPID);
    }

    public static int ntapPoint(long struct) {
        return MemoryUtil.memGetInt(struct + TAPPOINT);
    }

    public static int noptions(long struct) {
        return MemoryUtil.memGetInt(struct + OPTIONS);
    }

    public static long neventsOfInterest(long struct) {
        return MemoryUtil.memGetLong(struct + EVENTSOFINTEREST);
    }

    public static long ntappingProcess(long struct) {
        return MemoryUtil.memGetAddress(struct + TAPPINGPROCESS);
    }

    public static long nprocessBeingTapped(long struct) {
        return MemoryUtil.memGetAddress(struct + PROCESSBEINGTAPPED);
    }

    public static boolean nenabled(long struct) {
        return MemoryUtil.memGetByte(struct + ((long) ENABLED)) != 0;
    }

    public static float nminUsecLatency(long struct) {
        return MemoryUtil.memGetFloat(struct + MINUSECLATENCY);
    }

    public static float navgUsecLatency(long struct) {
        return MemoryUtil.memGetFloat(struct + AVGUSECLATENCY);
    }

    public static float nmaxUsecLatency(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXUSECLATENCY);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/macosx/CGEventTapInformation$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/macosx/CGEventTapInformation$Buffer.class */
    public static class Buffer extends StructBuffer<CGEventTapInformation, Buffer> implements NativeResource {
        private static final CGEventTapInformation ELEMENT_FACTORY = CGEventTapInformation.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / CGEventTapInformation.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public CGEventTapInformation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int eventTapID() {
            return CGEventTapInformation.neventTapID(address());
        }

        @NativeType("CGEventTapLocation")
        public int tapPoint() {
            return CGEventTapInformation.ntapPoint(address());
        }

        @NativeType("CGEventTapOptions")
        public int options() {
            return CGEventTapInformation.noptions(address());
        }

        @NativeType("CGEventMask")
        public long eventsOfInterest() {
            return CGEventTapInformation.neventsOfInterest(address());
        }

        @NativeType("pid_t")
        public long tappingProcess() {
            return CGEventTapInformation.ntappingProcess(address());
        }

        @NativeType("pid_t")
        public long processBeingTapped() {
            return CGEventTapInformation.nprocessBeingTapped(address());
        }

        @NativeType("bool")
        public boolean enabled() {
            return CGEventTapInformation.nenabled(address());
        }

        public float minUsecLatency() {
            return CGEventTapInformation.nminUsecLatency(address());
        }

        public float avgUsecLatency() {
            return CGEventTapInformation.navgUsecLatency(address());
        }

        public float maxUsecLatency() {
            return CGEventTapInformation.nmaxUsecLatency(address());
        }
    }
}
