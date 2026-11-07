package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFloatControls2Features.class */
public class VkPhysicalDeviceShaderFloatControls2Features extends Struct<VkPhysicalDeviceShaderFloatControls2Features> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERFLOATCONTROLS2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERFLOATCONTROLS2 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderFloatControls2Features(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderFloatControls2Features create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderFloatControls2Features(address, container);
    }

    public VkPhysicalDeviceShaderFloatControls2Features(ByteBuffer container) {
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
    public boolean shaderFloatControls2() {
        return nshaderFloatControls2(address()) != 0;
    }

    public VkPhysicalDeviceShaderFloatControls2Features sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderFloatControls2Features sType$Default() {
        return sType(1000528000);
    }

    public VkPhysicalDeviceShaderFloatControls2Features pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderFloatControls2Features shaderFloatControls2(@NativeType("VkBool32") boolean value) {
        nshaderFloatControls2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderFloatControls2Features set(int sType, long pNext, boolean shaderFloatControls2) {
        sType(sType);
        pNext(pNext);
        shaderFloatControls2(shaderFloatControls2);
        return this;
    }

    public VkPhysicalDeviceShaderFloatControls2Features set(VkPhysicalDeviceShaderFloatControls2Features src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderFloatControls2Features malloc() {
        return new VkPhysicalDeviceShaderFloatControls2Features(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloatControls2Features calloc() {
        return new VkPhysicalDeviceShaderFloatControls2Features(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloatControls2Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderFloatControls2Features(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderFloatControls2Features create(long address) {
        return new VkPhysicalDeviceShaderFloatControls2Features(address, null);
    }

    public static VkPhysicalDeviceShaderFloatControls2Features createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderFloatControls2Features(address, null);
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

    public static VkPhysicalDeviceShaderFloatControls2Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloatControls2Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderFloatControls2Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderFloatControls2Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderFloatControls2(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERFLOATCONTROLS2);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderFloatControls2(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERFLOATCONTROLS2, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderFloatControls2Features$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderFloatControls2Features, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderFloatControls2Features ELEMENT_FACTORY = VkPhysicalDeviceShaderFloatControls2Features.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderFloatControls2Features.SIZEOF);
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
        public VkPhysicalDeviceShaderFloatControls2Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderFloatControls2Features.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderFloatControls2Features.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderFloatControls2() {
            return VkPhysicalDeviceShaderFloatControls2Features.nshaderFloatControls2(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderFloatControls2Features.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000528000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderFloatControls2Features.npNext(address(), value);
            return this;
        }

        public Buffer shaderFloatControls2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderFloatControls2Features.nshaderFloatControls2(address(), value ? 1 : 0);
            return this;
        }
    }
}
