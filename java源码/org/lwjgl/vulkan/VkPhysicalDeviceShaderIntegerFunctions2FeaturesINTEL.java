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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.class */
public class VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL extends Struct<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERINTEGERFUNCTIONS2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERINTEGERFUNCTIONS2 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(address, container);
    }

    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(ByteBuffer container) {
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
    public boolean shaderIntegerFunctions2() {
        return nshaderIntegerFunctions2(address()) != 0;
    }

    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL sType$Default() {
        return sType(INTELShaderIntegerFunctions2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL);
    }

    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL shaderIntegerFunctions2(@NativeType("VkBool32") boolean value) {
        nshaderIntegerFunctions2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL set(int sType, long pNext, boolean shaderIntegerFunctions2) {
        sType(sType);
        pNext(pNext);
        shaderIntegerFunctions2(shaderIntegerFunctions2);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL set(VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL malloc() {
        return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL calloc() {
        return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL create(long address) {
        return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(address, null);
    }

    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(address, null);
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

    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderIntegerFunctions2(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINTEGERFUNCTIONS2);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderIntegerFunctions2(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINTEGERFUNCTIONS2, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL ELEMENT_FACTORY = VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.SIZEOF);
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
        public VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderIntegerFunctions2() {
            return VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.nshaderIntegerFunctions2(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(INTELShaderIntegerFunctions2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_INTEGER_FUNCTIONS_2_FEATURES_INTEL);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.npNext(address(), value);
            return this;
        }

        public Buffer shaderIntegerFunctions2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL.nshaderIntegerFunctions2(address(), value ? 1 : 0);
            return this;
        }
    }
}
