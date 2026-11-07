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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDrawParametersFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDrawParametersFeatures.class */
public class VkPhysicalDeviceShaderDrawParametersFeatures extends Struct<VkPhysicalDeviceShaderDrawParametersFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERDRAWPARAMETERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERDRAWPARAMETERS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceShaderDrawParametersFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderDrawParametersFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderDrawParametersFeatures(address, container);
    }

    public VkPhysicalDeviceShaderDrawParametersFeatures(ByteBuffer container) {
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
    public boolean shaderDrawParameters() {
        return nshaderDrawParameters(address()) != 0;
    }

    public VkPhysicalDeviceShaderDrawParametersFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderDrawParametersFeatures sType$Default() {
        return sType(1000063000);
    }

    public VkPhysicalDeviceShaderDrawParametersFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderDrawParametersFeatures shaderDrawParameters(@NativeType("VkBool32") boolean value) {
        nshaderDrawParameters(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceShaderDrawParametersFeatures set(int sType, long pNext, boolean shaderDrawParameters) {
        sType(sType);
        pNext(pNext);
        shaderDrawParameters(shaderDrawParameters);
        return this;
    }

    public VkPhysicalDeviceShaderDrawParametersFeatures set(VkPhysicalDeviceShaderDrawParametersFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderDrawParametersFeatures malloc() {
        return new VkPhysicalDeviceShaderDrawParametersFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDrawParametersFeatures calloc() {
        return new VkPhysicalDeviceShaderDrawParametersFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDrawParametersFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderDrawParametersFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderDrawParametersFeatures create(long address) {
        return new VkPhysicalDeviceShaderDrawParametersFeatures(address, null);
    }

    public static VkPhysicalDeviceShaderDrawParametersFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderDrawParametersFeatures(address, null);
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

    public static VkPhysicalDeviceShaderDrawParametersFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderDrawParametersFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderDrawParametersFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderDrawParametersFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderDrawParameters(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDRAWPARAMETERS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderDrawParameters(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERDRAWPARAMETERS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDrawParametersFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderDrawParametersFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderDrawParametersFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderDrawParametersFeatures ELEMENT_FACTORY = VkPhysicalDeviceShaderDrawParametersFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderDrawParametersFeatures.SIZEOF);
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
        public VkPhysicalDeviceShaderDrawParametersFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderDrawParametersFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderDrawParametersFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderDrawParameters() {
            return VkPhysicalDeviceShaderDrawParametersFeatures.nshaderDrawParameters(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderDrawParametersFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000063000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderDrawParametersFeatures.npNext(address(), value);
            return this;
        }

        public Buffer shaderDrawParameters(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceShaderDrawParametersFeatures.nshaderDrawParameters(address(), value ? 1 : 0);
            return this;
        }
    }
}
