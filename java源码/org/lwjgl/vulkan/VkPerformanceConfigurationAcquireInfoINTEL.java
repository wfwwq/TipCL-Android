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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceConfigurationAcquireInfoINTEL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceConfigurationAcquireInfoINTEL.class */
public class VkPerformanceConfigurationAcquireInfoINTEL extends Struct<VkPerformanceConfigurationAcquireInfoINTEL> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
    }

    protected VkPerformanceConfigurationAcquireInfoINTEL(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceConfigurationAcquireInfoINTEL create(long address, ByteBuffer container) {
        return new VkPerformanceConfigurationAcquireInfoINTEL(address, container);
    }

    public VkPerformanceConfigurationAcquireInfoINTEL(ByteBuffer container) {
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

    @NativeType("VkPerformanceConfigurationTypeINTEL")
    public int type() {
        return ntype(address());
    }

    public VkPerformanceConfigurationAcquireInfoINTEL sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPerformanceConfigurationAcquireInfoINTEL sType$Default() {
        return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL);
    }

    public VkPerformanceConfigurationAcquireInfoINTEL pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPerformanceConfigurationAcquireInfoINTEL type(@NativeType("VkPerformanceConfigurationTypeINTEL") int value) {
        ntype(address(), value);
        return this;
    }

    public VkPerformanceConfigurationAcquireInfoINTEL set(int sType, long pNext, int type) {
        sType(sType);
        pNext(pNext);
        type(type);
        return this;
    }

    public VkPerformanceConfigurationAcquireInfoINTEL set(VkPerformanceConfigurationAcquireInfoINTEL src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceConfigurationAcquireInfoINTEL malloc() {
        return new VkPerformanceConfigurationAcquireInfoINTEL(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceConfigurationAcquireInfoINTEL calloc() {
        return new VkPerformanceConfigurationAcquireInfoINTEL(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceConfigurationAcquireInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceConfigurationAcquireInfoINTEL(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceConfigurationAcquireInfoINTEL create(long address) {
        return new VkPerformanceConfigurationAcquireInfoINTEL(address, null);
    }

    public static VkPerformanceConfigurationAcquireInfoINTEL createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceConfigurationAcquireInfoINTEL(address, null);
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

    public static VkPerformanceConfigurationAcquireInfoINTEL malloc(MemoryStack stack) {
        return new VkPerformanceConfigurationAcquireInfoINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceConfigurationAcquireInfoINTEL calloc(MemoryStack stack) {
        return new VkPerformanceConfigurationAcquireInfoINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceConfigurationAcquireInfoINTEL$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceConfigurationAcquireInfoINTEL$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceConfigurationAcquireInfoINTEL, Buffer> implements NativeResource {
        private static final VkPerformanceConfigurationAcquireInfoINTEL ELEMENT_FACTORY = VkPerformanceConfigurationAcquireInfoINTEL.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceConfigurationAcquireInfoINTEL.SIZEOF);
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
        public VkPerformanceConfigurationAcquireInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPerformanceConfigurationAcquireInfoINTEL.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPerformanceConfigurationAcquireInfoINTEL.npNext(address());
        }

        @NativeType("VkPerformanceConfigurationTypeINTEL")
        public int type() {
            return VkPerformanceConfigurationAcquireInfoINTEL.ntype(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPerformanceConfigurationAcquireInfoINTEL.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_CONFIGURATION_ACQUIRE_INFO_INTEL);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPerformanceConfigurationAcquireInfoINTEL.npNext(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkPerformanceConfigurationTypeINTEL") int value) {
            VkPerformanceConfigurationAcquireInfoINTEL.ntype(address(), value);
            return this;
        }
    }
}
