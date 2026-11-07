package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.class */
public class VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT extends Struct<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RAYTRACINGINVOCATIONREORDERREORDERINGHINT;
    public static final int MAXSHADERBINDINGTABLERECORDINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RAYTRACINGINVOCATIONREORDERREORDERINGHINT = layout.offsetof(2);
        MAXSHADERBINDINGTABLERECORDINDEX = layout.offsetof(3);
    }

    protected VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(ByteBuffer container) {
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

    @NativeType("VkRayTracingInvocationReorderModeEXT")
    public int rayTracingInvocationReorderReorderingHint() {
        return nrayTracingInvocationReorderReorderingHint(address());
    }

    @NativeType("uint32_t")
    public int maxShaderBindingTableRecordIndex() {
        return nmaxShaderBindingTableRecordIndex(address());
    }

    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT sType$Default() {
        return sType(EXTRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT set(VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT malloc() {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT calloc() {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT create(long address) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrayTracingInvocationReorderReorderingHint(long struct) {
        return MemoryUtil.memGetInt(struct + RAYTRACINGINVOCATIONREORDERREORDERINGHINT);
    }

    public static int nmaxShaderBindingTableRecordIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSHADERBINDINGTABLERECORDINDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.npNext(address());
        }

        @NativeType("VkRayTracingInvocationReorderModeEXT")
        public int rayTracingInvocationReorderReorderingHint() {
            return VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.nrayTracingInvocationReorderReorderingHint(address());
        }

        @NativeType("uint32_t")
        public int maxShaderBindingTableRecordIndex() {
            return VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.nmaxShaderBindingTableRecordIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTRayTracingInvocationReorder.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceRayTracingInvocationReorderPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
