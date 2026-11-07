package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDataGraphProcessingEngineARM.class */
public class VkPhysicalDeviceDataGraphProcessingEngineARM extends Struct<VkPhysicalDeviceDataGraphProcessingEngineARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int ISFOREIGN;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        ISFOREIGN = layout.offsetof(1);
    }

    protected VkPhysicalDeviceDataGraphProcessingEngineARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDataGraphProcessingEngineARM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(address, container);
    }

    public VkPhysicalDeviceDataGraphProcessingEngineARM(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkBool32")
    public boolean isForeign() {
        return nisForeign(address()) != 0;
    }

    public VkPhysicalDeviceDataGraphProcessingEngineARM type(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM") int value) {
        ntype(address(), value);
        return this;
    }

    public VkPhysicalDeviceDataGraphProcessingEngineARM isForeign(@NativeType("VkBool32") boolean value) {
        nisForeign(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDataGraphProcessingEngineARM set(int type, boolean isForeign) {
        type(type);
        isForeign(isForeign);
        return this;
    }

    public VkPhysicalDeviceDataGraphProcessingEngineARM set(VkPhysicalDeviceDataGraphProcessingEngineARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDataGraphProcessingEngineARM malloc() {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDataGraphProcessingEngineARM calloc() {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDataGraphProcessingEngineARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDataGraphProcessingEngineARM create(long address) {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(address, null);
    }

    public static VkPhysicalDeviceDataGraphProcessingEngineARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(address, null);
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

    public static VkPhysicalDeviceDataGraphProcessingEngineARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDataGraphProcessingEngineARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nisForeign(long struct) {
        return MemoryUtil.memGetInt(struct + ISFOREIGN);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nisForeign(long struct, int value) {
        MemoryUtil.memPutInt(struct + ISFOREIGN, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDataGraphProcessingEngineARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDataGraphProcessingEngineARM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDataGraphProcessingEngineARM ELEMENT_FACTORY = VkPhysicalDeviceDataGraphProcessingEngineARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDataGraphProcessingEngineARM.SIZEOF);
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
        public VkPhysicalDeviceDataGraphProcessingEngineARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM")
        public int type() {
            return VkPhysicalDeviceDataGraphProcessingEngineARM.ntype(address());
        }

        @NativeType("VkBool32")
        public boolean isForeign() {
            return VkPhysicalDeviceDataGraphProcessingEngineARM.nisForeign(address()) != 0;
        }

        public Buffer type(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM") int value) {
            VkPhysicalDeviceDataGraphProcessingEngineARM.ntype(address(), value);
            return this;
        }

        public Buffer isForeign(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDataGraphProcessingEngineARM.nisForeign(address(), value ? 1 : 0);
            return this;
        }
    }
}
