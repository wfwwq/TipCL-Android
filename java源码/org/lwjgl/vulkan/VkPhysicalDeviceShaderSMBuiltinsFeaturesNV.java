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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.class */
public class VkPhysicalDeviceShaderSMBuiltinsFeaturesNV extends Struct<VkPhysicalDeviceShaderSMBuiltinsFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERSMBUILTINS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSMBUILTINS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(address, container);
    }

    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean shaderSMBuiltins() {
        return nshaderSMBuiltins(address()) != 0;
    }

    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV sType$Default() {
        return sType(NVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV);
    }

    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV shaderSMBuiltins(@NativeType("VkBool32") boolean value) {
        nshaderSMBuiltins(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV set(int sType, long pNext, boolean shaderSMBuiltins) {
        sType(sType);
        pNext(pNext);
        shaderSMBuiltins(shaderSMBuiltins);
        return this;
    }

    public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV set(VkPhysicalDeviceShaderSMBuiltinsFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV malloc() {
        return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV calloc() {
        return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV create(long address) {
        return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(address, null);
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

    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderSMBuiltinsFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderSMBuiltinsFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderSMBuiltins(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSMBUILTINS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderSMBuiltins(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERSMBUILTINS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSMBuiltinsFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderSMBuiltinsFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderSMBuiltinsFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderSMBuiltinsFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceShaderSMBuiltinsFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderSMBuiltins() {
            return VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.nshaderSMBuiltins(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVShaderSmBuiltins.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SM_BUILTINS_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer shaderSMBuiltins(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderSMBuiltinsFeaturesNV.nshaderSMBuiltins(address(), value ? 1 : 0);
            return this;
        }
    }
}
