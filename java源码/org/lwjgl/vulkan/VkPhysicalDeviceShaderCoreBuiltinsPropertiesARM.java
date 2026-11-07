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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.class */
public class VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM extends Struct<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERCOREMASK;
    public static final int SHADERCORECOUNT;
    public static final int SHADERWARPSPERCORE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERCOREMASK = layout.offsetof(2);
        SHADERCORECOUNT = layout.offsetof(3);
        SHADERWARPSPERCORE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(address, container);
    }

    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long shaderCoreMask() {
        return nshaderCoreMask(address());
    }

    @NativeType("uint32_t")
    public int shaderCoreCount() {
        return nshaderCoreCount(address());
    }

    @NativeType("uint32_t")
    public int shaderWarpsPerCore() {
        return nshaderWarpsPerCore(address());
    }

    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM sType$Default() {
        return sType(ARMShaderCoreBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM);
    }

    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM set(VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM malloc() {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM calloc() {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM create(long address) {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(address, null);
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(address, null);
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

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nshaderCoreMask(long struct) {
        return MemoryUtil.memGetLong(struct + SHADERCOREMASK);
    }

    public static int nshaderCoreCount(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERCORECOUNT);
    }

    public static int nshaderWarpsPerCore(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERWARPSPERCORE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM ELEMENT_FACTORY = VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.SIZEOF);
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
        public VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.npNext(address());
        }

        @NativeType("uint64_t")
        public long shaderCoreMask() {
            return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.nshaderCoreMask(address());
        }

        @NativeType("uint32_t")
        public int shaderCoreCount() {
            return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.nshaderCoreCount(address());
        }

        @NativeType("uint32_t")
        public int shaderWarpsPerCore() {
            return VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.nshaderWarpsPerCore(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMShaderCoreBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_BUILTINS_PROPERTIES_ARM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM.npNext(address(), value);
            return this;
        }
    }
}
