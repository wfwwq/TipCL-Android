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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceOverrideInfoINTEL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceOverrideInfoINTEL.class */
public class VkPerformanceOverrideInfoINTEL extends Struct<VkPerformanceOverrideInfoINTEL> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int ENABLE;
    public static final int PARAMETER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        ENABLE = layout.offsetof(3);
        PARAMETER = layout.offsetof(4);
    }

    protected VkPerformanceOverrideInfoINTEL(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPerformanceOverrideInfoINTEL create(long address, ByteBuffer container) {
        return new VkPerformanceOverrideInfoINTEL(address, container);
    }

    public VkPerformanceOverrideInfoINTEL(ByteBuffer container) {
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

    @NativeType("VkPerformanceOverrideTypeINTEL")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkBool32")
    public boolean enable() {
        return nenable(address()) != 0;
    }

    @NativeType("uint64_t")
    public long parameter() {
        return nparameter(address());
    }

    public VkPerformanceOverrideInfoINTEL sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPerformanceOverrideInfoINTEL sType$Default() {
        return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL);
    }

    public VkPerformanceOverrideInfoINTEL pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPerformanceOverrideInfoINTEL type(@NativeType("VkPerformanceOverrideTypeINTEL") int value) {
        ntype(address(), value);
        return this;
    }

    public VkPerformanceOverrideInfoINTEL enable(@NativeType("VkBool32") boolean value) {
        nenable(address(), value ? 1 : 0);
        return this;
    }

    public VkPerformanceOverrideInfoINTEL parameter(@NativeType("uint64_t") long value) {
        nparameter(address(), value);
        return this;
    }

    public VkPerformanceOverrideInfoINTEL set(int sType, long pNext, int type, boolean enable, long parameter) {
        sType(sType);
        pNext(pNext);
        type(type);
        enable(enable);
        parameter(parameter);
        return this;
    }

    public VkPerformanceOverrideInfoINTEL set(VkPerformanceOverrideInfoINTEL src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPerformanceOverrideInfoINTEL malloc() {
        return new VkPerformanceOverrideInfoINTEL(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPerformanceOverrideInfoINTEL calloc() {
        return new VkPerformanceOverrideInfoINTEL(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPerformanceOverrideInfoINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceOverrideInfoINTEL(MemoryUtil.memAddress(container), container);
    }

    public static VkPerformanceOverrideInfoINTEL create(long address) {
        return new VkPerformanceOverrideInfoINTEL(address, null);
    }

    public static VkPerformanceOverrideInfoINTEL createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPerformanceOverrideInfoINTEL(address, null);
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

    public static VkPerformanceOverrideInfoINTEL malloc(MemoryStack stack) {
        return new VkPerformanceOverrideInfoINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPerformanceOverrideInfoINTEL calloc(MemoryStack stack) {
        return new VkPerformanceOverrideInfoINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nenable(long struct) {
        return MemoryUtil.memGetInt(struct + ENABLE);
    }

    public static long nparameter(long struct) {
        return MemoryUtil.memGetLong(struct + PARAMETER);
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

    public static void nenable(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENABLE, value);
    }

    public static void nparameter(long struct, long value) {
        MemoryUtil.memPutLong(struct + PARAMETER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceOverrideInfoINTEL$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPerformanceOverrideInfoINTEL$Buffer.class */
    public static class Buffer extends StructBuffer<VkPerformanceOverrideInfoINTEL, Buffer> implements NativeResource {
        private static final VkPerformanceOverrideInfoINTEL ELEMENT_FACTORY = VkPerformanceOverrideInfoINTEL.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPerformanceOverrideInfoINTEL.SIZEOF);
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
        public VkPerformanceOverrideInfoINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPerformanceOverrideInfoINTEL.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPerformanceOverrideInfoINTEL.npNext(address());
        }

        @NativeType("VkPerformanceOverrideTypeINTEL")
        public int type() {
            return VkPerformanceOverrideInfoINTEL.ntype(address());
        }

        @NativeType("VkBool32")
        public boolean enable() {
            return VkPerformanceOverrideInfoINTEL.nenable(address()) != 0;
        }

        @NativeType("uint64_t")
        public long parameter() {
            return VkPerformanceOverrideInfoINTEL.nparameter(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPerformanceOverrideInfoINTEL.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(INTELPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPerformanceOverrideInfoINTEL.npNext(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkPerformanceOverrideTypeINTEL") int value) {
            VkPerformanceOverrideInfoINTEL.ntype(address(), value);
            return this;
        }

        public Buffer enable(@NativeType("VkBool32") boolean value) {
            VkPerformanceOverrideInfoINTEL.nenable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer parameter(@NativeType("uint64_t") long value) {
            VkPerformanceOverrideInfoINTEL.nparameter(address(), value);
            return this;
        }
    }
}
