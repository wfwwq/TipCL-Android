package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindMemoryStatus.class */
public class VkBindMemoryStatus extends Struct<VkBindMemoryStatus> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRESULT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESULT = layout.offsetof(2);
    }

    protected VkBindMemoryStatus(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindMemoryStatus create(long address, ByteBuffer container) {
        return new VkBindMemoryStatus(address, container);
    }

    public VkBindMemoryStatus(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkResult *")
    public IntBuffer pResult(int capacity) {
        return npResult(address(), capacity);
    }

    public VkBindMemoryStatus sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindMemoryStatus sType$Default() {
        return sType(1000545002);
    }

    public VkBindMemoryStatus pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindMemoryStatus pResult(@NativeType("VkResult *") IntBuffer value) {
        npResult(address(), value);
        return this;
    }

    public VkBindMemoryStatus set(int sType, long pNext, IntBuffer pResult) {
        sType(sType);
        pNext(pNext);
        pResult(pResult);
        return this;
    }

    public VkBindMemoryStatus set(VkBindMemoryStatus src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindMemoryStatus malloc() {
        return new VkBindMemoryStatus(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindMemoryStatus calloc() {
        return new VkBindMemoryStatus(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindMemoryStatus create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindMemoryStatus(MemoryUtil.memAddress(container), container);
    }

    public static VkBindMemoryStatus create(long address) {
        return new VkBindMemoryStatus(address, null);
    }

    public static VkBindMemoryStatus createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindMemoryStatus(address, null);
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

    public static VkBindMemoryStatus malloc(MemoryStack stack) {
        return new VkBindMemoryStatus(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindMemoryStatus calloc(MemoryStack stack) {
        return new VkBindMemoryStatus(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static IntBuffer npResult(long struct, int capacity) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PRESULT), capacity);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npResult(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PRESULT, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PRESULT));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindMemoryStatus$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindMemoryStatus, Buffer> implements NativeResource {
        private static final VkBindMemoryStatus ELEMENT_FACTORY = VkBindMemoryStatus.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindMemoryStatus.SIZEOF);
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
        public VkBindMemoryStatus getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindMemoryStatus.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindMemoryStatus.npNext(address());
        }

        @NativeType("VkResult *")
        public IntBuffer pResult(int capacity) {
            return VkBindMemoryStatus.npResult(address(), capacity);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindMemoryStatus.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000545002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindMemoryStatus.npNext(address(), value);
            return this;
        }

        public Buffer pResult(@NativeType("VkResult *") IntBuffer value) {
            VkBindMemoryStatus.npResult(address(), value);
            return this;
        }
    }
}
