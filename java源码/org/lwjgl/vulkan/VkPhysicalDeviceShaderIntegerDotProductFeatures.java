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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductFeatures.class */
public class VkPhysicalDeviceShaderIntegerDotProductFeatures extends Struct<VkPhysicalDeviceShaderIntegerDotProductFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERINTEGERDOTPRODUCT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERINTEGERDOTPRODUCT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderIntegerDotProductFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderIntegerDotProductFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderIntegerDotProductFeatures(address, container);
    }

    public VkPhysicalDeviceShaderIntegerDotProductFeatures(ByteBuffer container) {
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
    public boolean shaderIntegerDotProduct() {
        return nshaderIntegerDotProduct(address()) != 0;
    }

    public VkPhysicalDeviceShaderIntegerDotProductFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerDotProductFeatures sType$Default() {
        return sType(1000280000);
    }

    public VkPhysicalDeviceShaderIntegerDotProductFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerDotProductFeatures shaderIntegerDotProduct(@NativeType("VkBool32") boolean value) {
        nshaderIntegerDotProduct(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerDotProductFeatures set(int sType, long pNext, boolean shaderIntegerDotProduct) {
        sType(sType);
        pNext(pNext);
        shaderIntegerDotProduct(shaderIntegerDotProduct);
        return this;
    }

    public VkPhysicalDeviceShaderIntegerDotProductFeatures set(VkPhysicalDeviceShaderIntegerDotProductFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderIntegerDotProductFeatures malloc() {
        return new VkPhysicalDeviceShaderIntegerDotProductFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductFeatures calloc() {
        return new VkPhysicalDeviceShaderIntegerDotProductFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderIntegerDotProductFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductFeatures create(long address) {
        return new VkPhysicalDeviceShaderIntegerDotProductFeatures(address, null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderIntegerDotProductFeatures(address, null);
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

    public static VkPhysicalDeviceShaderIntegerDotProductFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerDotProductFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderIntegerDotProductFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderIntegerDotProductFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderIntegerDotProduct(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINTEGERDOTPRODUCT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderIntegerDotProduct(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINTEGERDOTPRODUCT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderIntegerDotProductFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderIntegerDotProductFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderIntegerDotProductFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderIntegerDotProductFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderIntegerDotProductFeatures.SIZEOF);
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
        public VkPhysicalDeviceShaderIntegerDotProductFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderIntegerDotProductFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderIntegerDotProductFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderIntegerDotProduct() {
            return VkPhysicalDeviceShaderIntegerDotProductFeatures.nshaderIntegerDotProduct(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderIntegerDotProductFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000280000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderIntegerDotProductFeatures.npNext(address(), value);
            return this;
        }

        public Buffer shaderIntegerDotProduct(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderIntegerDotProductFeatures.nshaderIntegerDotProduct(address(), value ? 1 : 0);
            return this;
        }
    }
}
