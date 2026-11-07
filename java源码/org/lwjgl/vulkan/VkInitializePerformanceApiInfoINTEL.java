package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInitializePerformanceApiInfoINTEL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInitializePerformanceApiInfoINTEL.class */
public class VkInitializePerformanceApiInfoINTEL extends Struct<VkInitializePerformanceApiInfoINTEL> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PUSERDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PUSERDATA = layout.offsetof(2);
    }

    protected VkInitializePerformanceApiInfoINTEL(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkInitializePerformanceApiInfoINTEL create(long address, ByteBuffer container) {
        return new VkInitializePerformanceApiInfoINTEL(address, container);
    }

    public VkInitializePerformanceApiInfoINTEL(ByteBuffer container) {
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
    public long pUserData() {
        return npUserData(address());
    }

    public VkInitializePerformanceApiInfoINTEL sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkInitializePerformanceApiInfoINTEL sType$Default() {
        return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL);
    }

    public VkInitializePerformanceApiInfoINTEL pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkInitializePerformanceApiInfoINTEL pUserData(@NativeType("void *") long value) {
        npUserData(address(), value);
        return this;
    }

    public VkInitializePerformanceApiInfoINTEL set(int sType, long pNext, long pUserData) {
        sType(sType);
        pNext(pNext);
        pUserData(pUserData);
        return this;
    }

    public VkInitializePerformanceApiInfoINTEL set(VkInitializePerformanceApiInfoINTEL src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkInitializePerformanceApiInfoINTEL malloc() {
        return new VkInitializePerformanceApiInfoINTEL(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkInitializePerformanceApiInfoINTEL calloc() {
        return new VkInitializePerformanceApiInfoINTEL(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkInitializePerformanceApiInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkInitializePerformanceApiInfoINTEL(MemoryUtil.memAddress(container), container);
    }

    public static VkInitializePerformanceApiInfoINTEL create(long address) {
        return new VkInitializePerformanceApiInfoINTEL(address, null);
    }

    public static VkInitializePerformanceApiInfoINTEL createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkInitializePerformanceApiInfoINTEL(address, null);
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

    public static VkInitializePerformanceApiInfoINTEL malloc(MemoryStack stack) {
        return new VkInitializePerformanceApiInfoINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkInitializePerformanceApiInfoINTEL calloc(MemoryStack stack) {
        return new VkInitializePerformanceApiInfoINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npUserData(long struct) {
        return MemoryUtil.memGetAddress(struct + PUSERDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npUserData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PUSERDATA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInitializePerformanceApiInfoINTEL$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInitializePerformanceApiInfoINTEL$Buffer.class */
    public static class Buffer extends StructBuffer<VkInitializePerformanceApiInfoINTEL, Buffer> implements NativeResource {
        private static final VkInitializePerformanceApiInfoINTEL ELEMENT_FACTORY = VkInitializePerformanceApiInfoINTEL.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkInitializePerformanceApiInfoINTEL.SIZEOF);
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
        public VkInitializePerformanceApiInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkInitializePerformanceApiInfoINTEL.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkInitializePerformanceApiInfoINTEL.npNext(address());
        }

        @NativeType("void *")
        public long pUserData() {
            return VkInitializePerformanceApiInfoINTEL.npUserData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkInitializePerformanceApiInfoINTEL.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_INITIALIZE_PERFORMANCE_API_INFO_INTEL);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkInitializePerformanceApiInfoINTEL.npNext(address(), value);
            return this;
        }

        public Buffer pUserData(@NativeType("void *") long value) {
            VkInitializePerformanceApiInfoINTEL.npUserData(address(), value);
            return this;
        }
    }
}
