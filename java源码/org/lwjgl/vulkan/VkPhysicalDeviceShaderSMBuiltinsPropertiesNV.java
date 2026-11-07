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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.class */
public class VkPhysicalDeviceShaderSMBuiltinsPropertiesNV extends Struct<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERSMCOUNT;
    public static final int SHADERWARPSPERSM;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSMCOUNT = layout.offsetof(2);
        SHADERWARPSPERSM = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(address, container);
    }

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int shaderSMCount() {
        return nshaderSMCount(address());
    }

    @NativeType("uint32_t")
    public int shaderWarpsPerSM() {
        return nshaderWarpsPerSM(address());
    }

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV sType$Default() {
        return sType(NVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV);
    }

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV set(VkPhysicalDeviceShaderSMBuiltinsPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV malloc() {
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV calloc() {
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV create(long address) {
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(address, null);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(address, null);
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

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSMBuiltinsPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderSMCount(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSMCOUNT);
    }

    public static int nshaderWarpsPerSM(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERWARPSPERSM);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSMBuiltinsPropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSMBuiltinsPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSMBuiltinsPropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderSMBuiltinsPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceShaderSMBuiltinsPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int shaderSMCount() {
            return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.nshaderSMCount(address());
        }

        @NativeType("uint32_t")
        public int shaderWarpsPerSM() {
            return VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.nshaderWarpsPerSM(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderSMBuiltinsPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
