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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFloat16Int8Features.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFloat16Int8Features.class */
public class VkPhysicalDeviceShaderFloat16Int8Features extends Struct<VkPhysicalDeviceShaderFloat16Int8Features> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERFLOAT16;
    public static final int SHADERINT8;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERFLOAT16 = layout.offsetof(2);
        SHADERINT8 = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderFloat16Int8Features(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderFloat16Int8Features create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderFloat16Int8Features(address, container);
    }

    public VkPhysicalDeviceShaderFloat16Int8Features(ByteBuffer container) {
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
    public boolean shaderFloat16() {
        return nshaderFloat16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderInt8() {
        return nshaderInt8(address()) != 0;
    }

    public VkPhysicalDeviceShaderFloat16Int8Features sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderFloat16Int8Features sType$Default() {
        return sType(1000082000);
    }

    public VkPhysicalDeviceShaderFloat16Int8Features pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderFloat16Int8Features shaderFloat16(@NativeType("VkBool32") boolean value) {
        nshaderFloat16(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderFloat16Int8Features shaderInt8(@NativeType("VkBool32") boolean value) {
        nshaderInt8(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderFloat16Int8Features set(int sType, long pNext, boolean shaderFloat16, boolean shaderInt8) {
        sType(sType);
        pNext(pNext);
        shaderFloat16(shaderFloat16);
        shaderInt8(shaderInt8);
        return this;
    }

    public VkPhysicalDeviceShaderFloat16Int8Features set(VkPhysicalDeviceShaderFloat16Int8Features src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features malloc() {
        return new VkPhysicalDeviceShaderFloat16Int8Features(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features calloc() {
        return new VkPhysicalDeviceShaderFloat16Int8Features(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderFloat16Int8Features(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features create(long address) {
        return new VkPhysicalDeviceShaderFloat16Int8Features(address, null);
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderFloat16Int8Features(address, null);
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

    public static VkPhysicalDeviceShaderFloat16Int8Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloat16Int8Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloat16Int8Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderFloat16(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFLOAT16);
    }

    public static int nshaderInt8(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERINT8);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderFloat16(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFLOAT16, value);
    }

    public static void nshaderInt8(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERINT8, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFloat16Int8Features$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFloat16Int8Features$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderFloat16Int8Features, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderFloat16Int8Features ELEMENT_FACTORY = VkPhysicalDeviceShaderFloat16Int8Features.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderFloat16Int8Features.SIZEOF);
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
        public VkPhysicalDeviceShaderFloat16Int8Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderFloat16Int8Features.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderFloat16Int8Features.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderFloat16() {
            return VkPhysicalDeviceShaderFloat16Int8Features.nshaderFloat16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderInt8() {
            return VkPhysicalDeviceShaderFloat16Int8Features.nshaderInt8(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderFloat16Int8Features.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000082000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderFloat16Int8Features.npNext(address(), value);
            return this;
        }

        public Buffer shaderFloat16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderFloat16Int8Features.nshaderFloat16(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderInt8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderFloat16Int8Features.nshaderInt8(address(), value ? 1 : 0);
            return this;
        }
    }
}
