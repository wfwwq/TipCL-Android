package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderExpectAssumeFeatures.class */
public class VkPhysicalDeviceShaderExpectAssumeFeatures extends Struct<VkPhysicalDeviceShaderExpectAssumeFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADEREXPECTASSUME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADEREXPECTASSUME = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderExpectAssumeFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderExpectAssumeFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(address, container);
    }

    public VkPhysicalDeviceShaderExpectAssumeFeatures(ByteBuffer container) {
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
    public boolean shaderExpectAssume() {
        return nshaderExpectAssume(address()) != 0;
    }

    public VkPhysicalDeviceShaderExpectAssumeFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderExpectAssumeFeatures sType$Default() {
        return sType(1000544000);
    }

    public VkPhysicalDeviceShaderExpectAssumeFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderExpectAssumeFeatures shaderExpectAssume(@NativeType("VkBool32") boolean value) {
        nshaderExpectAssume(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderExpectAssumeFeatures set(int sType, long pNext, boolean shaderExpectAssume) {
        sType(sType);
        pNext(pNext);
        shaderExpectAssume(shaderExpectAssume);
        return this;
    }

    public VkPhysicalDeviceShaderExpectAssumeFeatures set(VkPhysicalDeviceShaderExpectAssumeFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeatures malloc() {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeatures calloc() {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeatures create(long address) {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(address, null);
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(address, null);
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

    public static VkPhysicalDeviceShaderExpectAssumeFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderExpectAssumeFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderExpectAssumeFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderExpectAssume(long struct) {
        return MemoryUtil.memGetInt(struct + SHADEREXPECTASSUME);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderExpectAssume(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADEREXPECTASSUME, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderExpectAssumeFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderExpectAssumeFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderExpectAssumeFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderExpectAssumeFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderExpectAssumeFeatures.SIZEOF);
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
        public VkPhysicalDeviceShaderExpectAssumeFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderExpectAssumeFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderExpectAssumeFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderExpectAssume() {
            return VkPhysicalDeviceShaderExpectAssumeFeatures.nshaderExpectAssume(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderExpectAssumeFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000544000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderExpectAssumeFeatures.npNext(address(), value);
            return this;
        }

        public Buffer shaderExpectAssume(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderExpectAssumeFeatures.nshaderExpectAssume(address(), value ? 1 : 0);
            return this;
        }
    }
}
