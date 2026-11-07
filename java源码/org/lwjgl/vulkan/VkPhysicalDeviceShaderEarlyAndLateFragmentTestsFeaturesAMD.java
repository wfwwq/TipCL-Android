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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.class */
public class VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD extends Struct<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADEREARLYANDLATEFRAGMENTTESTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADEREARLYANDLATEFRAGMENTTESTS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(address, container);
    }

    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(ByteBuffer container) {
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
    public boolean shaderEarlyAndLateFragmentTests() {
        return nshaderEarlyAndLateFragmentTests(address()) != 0;
    }

    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD sType$Default() {
        return sType(AMDShaderEarlyAndLateFragmentTests.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD);
    }

    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD shaderEarlyAndLateFragmentTests(@NativeType("VkBool32") boolean value) {
        nshaderEarlyAndLateFragmentTests(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD set(int sType, long pNext, boolean shaderEarlyAndLateFragmentTests) {
        sType(sType);
        pNext(pNext);
        shaderEarlyAndLateFragmentTests(shaderEarlyAndLateFragmentTests);
        return this;
    }

    public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD set(VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD malloc() {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD calloc() {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD create(long address) {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(address, null);
    }

    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(address, null);
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

    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderEarlyAndLateFragmentTests(long struct) {
        return MemoryUtil.memGetInt(struct + SHADEREARLYANDLATEFRAGMENTTESTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderEarlyAndLateFragmentTests(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADEREARLYANDLATEFRAGMENTTESTS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD ELEMENT_FACTORY = VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.SIZEOF);
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
        public VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderEarlyAndLateFragmentTests() {
            return VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nshaderEarlyAndLateFragmentTests(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDShaderEarlyAndLateFragmentTests.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_EARLY_AND_LATE_FRAGMENT_TESTS_FEATURES_AMD);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.npNext(address(), value);
            return this;
        }

        public Buffer shaderEarlyAndLateFragmentTests(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD.nshaderEarlyAndLateFragmentTests(address(), value ? 1 : 0);
            return this;
        }
    }
}
