package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterKHR.class */
public class VkPerformanceCounterKHR extends Struct<VkPerformanceCounterKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int UNIT;
    public static final int SCOPE;
    public static final int STORAGE;
    public static final int UUID;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __array(1, 16));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        UNIT = layout.offsetof(2);
        SCOPE = layout.offsetof(3);
        STORAGE = layout.offsetof(4);
        UUID = layout.offsetof(5);
    }

    protected VkPerformanceCounterKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceCounterKHR create(long address, ByteBuffer container) {
        return new VkPerformanceCounterKHR(address, container);
    }

    public VkPerformanceCounterKHR(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkPerformanceCounterUnitKHR")
    public int unit() {
        return nunit(address());
    }

    @NativeType("VkPerformanceCounterScopeKHR")
    public int scope() {
        return nscope(address());
    }

    @NativeType("VkPerformanceCounterStorageKHR")
    public int storage() {
        return nstorage(address());
    }

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer uuid() {
        return nuuid(address());
    }

    @NativeType("uint8_t")
    public byte uuid(int index) {
        return nuuid(address(), index);
    }

    public VkPerformanceCounterKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPerformanceCounterKHR sType$Default() {
        return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR);
    }

    public VkPerformanceCounterKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPerformanceCounterKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPerformanceCounterKHR set(VkPerformanceCounterKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceCounterKHR malloc() {
        return new VkPerformanceCounterKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceCounterKHR calloc() {
        return new VkPerformanceCounterKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceCounterKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceCounterKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceCounterKHR create(long address) {
        return new VkPerformanceCounterKHR(address, null);
    }

    public static VkPerformanceCounterKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceCounterKHR(address, null);
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

    public static VkPerformanceCounterKHR malloc(MemoryStack stack) {
        return new VkPerformanceCounterKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceCounterKHR calloc(MemoryStack stack) {
        return new VkPerformanceCounterKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nunit(long struct) {
        return MemoryUtil.memGetInt(struct + UNIT);
    }

    public static int nscope(long struct) {
        return MemoryUtil.memGetInt(struct + SCOPE);
    }

    public static int nstorage(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGE);
    }

    public static ByteBuffer nuuid(long struct) {
        return MemoryUtil.memByteBuffer(struct + UUID, 16);
    }

    public static byte nuuid(long struct, int index) {
        return MemoryUtil.memGetByte(struct + UUID + (Checks.check(index, 16) * 1));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceCounterKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceCounterKHR, Buffer> implements NativeResource {
        private static final VkPerformanceCounterKHR ELEMENT_FACTORY = VkPerformanceCounterKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceCounterKHR.SIZEOF);
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
        public VkPerformanceCounterKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPerformanceCounterKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPerformanceCounterKHR.npNext(address());
        }

        @NativeType("VkPerformanceCounterUnitKHR")
        public int unit() {
            return VkPerformanceCounterKHR.nunit(address());
        }

        @NativeType("VkPerformanceCounterScopeKHR")
        public int scope() {
            return VkPerformanceCounterKHR.nscope(address());
        }

        @NativeType("VkPerformanceCounterStorageKHR")
        public int storage() {
            return VkPerformanceCounterKHR.nstorage(address());
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer uuid() {
            return VkPerformanceCounterKHR.nuuid(address());
        }

        @NativeType("uint8_t")
        public byte uuid(int index) {
            return VkPerformanceCounterKHR.nuuid(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPerformanceCounterKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPerformanceCounterKHR.npNext(address(), value);
            return this;
        }
    }
}
