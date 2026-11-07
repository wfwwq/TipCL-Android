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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineBuiltinModelCreateInfoQCOM.class */
public class VkDataGraphPipelineBuiltinModelCreateInfoQCOM extends Struct<VkDataGraphPipelineBuiltinModelCreateInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int POPERATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        POPERATION = layout.offsetof(2);
    }

    protected VkDataGraphPipelineBuiltinModelCreateInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(address, container);
    }

    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM(ByteBuffer container) {
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

    @NativeType("VkPhysicalDeviceDataGraphOperationSupportARM const *")
    public VkPhysicalDeviceDataGraphOperationSupportARM pOperation() {
        return npOperation(address());
    }

    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM sType$Default() {
        return sType(1000629001);
    }

    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM pOperation(@NativeType("VkPhysicalDeviceDataGraphOperationSupportARM const *") VkPhysicalDeviceDataGraphOperationSupportARM value) {
        npOperation(address(), value);
        return this;
    }

    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM set(int sType, long pNext, VkPhysicalDeviceDataGraphOperationSupportARM pOperation) {
        sType(sType);
        pNext(pNext);
        pOperation(pOperation);
        return this;
    }

    public VkDataGraphPipelineBuiltinModelCreateInfoQCOM set(VkDataGraphPipelineBuiltinModelCreateInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM malloc() {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM calloc() {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM create(long address) {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(address, null);
    }

    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(address, null);
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

    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineBuiltinModelCreateInfoQCOM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineBuiltinModelCreateInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkPhysicalDeviceDataGraphOperationSupportARM npOperation(long struct) {
        return VkPhysicalDeviceDataGraphOperationSupportARM.create(MemoryUtil.memGetAddress(struct + POPERATION));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npOperation(long struct, VkPhysicalDeviceDataGraphOperationSupportARM value) {
        MemoryUtil.memPutAddress(struct + POPERATION, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + POPERATION));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineBuiltinModelCreateInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineBuiltinModelCreateInfoQCOM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineBuiltinModelCreateInfoQCOM ELEMENT_FACTORY = VkDataGraphPipelineBuiltinModelCreateInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineBuiltinModelCreateInfoQCOM.SIZEOF);
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
        public VkDataGraphPipelineBuiltinModelCreateInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineBuiltinModelCreateInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDataGraphPipelineBuiltinModelCreateInfoQCOM.npNext(address());
        }

        @NativeType("VkPhysicalDeviceDataGraphOperationSupportARM const *")
        public VkPhysicalDeviceDataGraphOperationSupportARM pOperation() {
            return VkDataGraphPipelineBuiltinModelCreateInfoQCOM.npOperation(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineBuiltinModelCreateInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000629001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDataGraphPipelineBuiltinModelCreateInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer pOperation(@NativeType("VkPhysicalDeviceDataGraphOperationSupportARM const *") VkPhysicalDeviceDataGraphOperationSupportARM value) {
            VkDataGraphPipelineBuiltinModelCreateInfoQCOM.npOperation(address(), value);
            return this;
        }
    }
}
