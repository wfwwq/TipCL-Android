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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryLowLatencySupportNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryLowLatencySupportNV.class */
public class VkQueryLowLatencySupportNV extends Struct<VkQueryLowLatencySupportNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PQUERIEDLOWLATENCYDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PQUERIEDLOWLATENCYDATA = layout.offsetof(2);
    }

    protected VkQueryLowLatencySupportNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueryLowLatencySupportNV create(long address, ByteBuffer container) {
        return new VkQueryLowLatencySupportNV(address, container);
    }

    public VkQueryLowLatencySupportNV(ByteBuffer container) {
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

    @NativeType("void *")
    public long pQueriedLowLatencyData() {
        return npQueriedLowLatencyData(address());
    }

    public VkQueryLowLatencySupportNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueryLowLatencySupportNV sType$Default() {
        return sType(NVLowLatency.VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV);
    }

    public VkQueryLowLatencySupportNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueryLowLatencySupportNV pQueriedLowLatencyData(@NativeType("void *") long value) {
        npQueriedLowLatencyData(address(), value);
        return this;
    }

    public VkQueryLowLatencySupportNV set(int sType, long pNext, long pQueriedLowLatencyData) {
        sType(sType);
        pNext(pNext);
        pQueriedLowLatencyData(pQueriedLowLatencyData);
        return this;
    }

    public VkQueryLowLatencySupportNV set(VkQueryLowLatencySupportNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueryLowLatencySupportNV malloc() {
        return new VkQueryLowLatencySupportNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueryLowLatencySupportNV calloc() {
        return new VkQueryLowLatencySupportNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueryLowLatencySupportNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueryLowLatencySupportNV(MemoryUtil.memAddress(container), container);
    }

    public static VkQueryLowLatencySupportNV create(long address) {
        return new VkQueryLowLatencySupportNV(address, null);
    }

    public static VkQueryLowLatencySupportNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueryLowLatencySupportNV(address, null);
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

    public static VkQueryLowLatencySupportNV malloc(MemoryStack stack) {
        return new VkQueryLowLatencySupportNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueryLowLatencySupportNV calloc(MemoryStack stack) {
        return new VkQueryLowLatencySupportNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npQueriedLowLatencyData(long struct) {
        return MemoryUtil.memGetAddress(struct + PQUERIEDLOWLATENCYDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npQueriedLowLatencyData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PQUERIEDLOWLATENCYDATA, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PQUERIEDLOWLATENCYDATA));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryLowLatencySupportNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryLowLatencySupportNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueryLowLatencySupportNV, Buffer> implements NativeResource {
        private static final VkQueryLowLatencySupportNV ELEMENT_FACTORY = VkQueryLowLatencySupportNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueryLowLatencySupportNV.SIZEOF);
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
        public VkQueryLowLatencySupportNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueryLowLatencySupportNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkQueryLowLatencySupportNV.npNext(address());
        }

        @NativeType("void *")
        public long pQueriedLowLatencyData() {
            return VkQueryLowLatencySupportNV.npQueriedLowLatencyData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueryLowLatencySupportNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVLowLatency.VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkQueryLowLatencySupportNV.npNext(address(), value);
            return this;
        }

        public Buffer pQueriedLowLatencyData(@NativeType("void *") long value) {
            VkQueryLowLatencySupportNV.npQueriedLowLatencyData(address(), value);
            return this;
        }
    }
}
