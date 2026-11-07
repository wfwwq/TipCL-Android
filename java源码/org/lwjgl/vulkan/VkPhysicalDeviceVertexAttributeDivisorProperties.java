package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorProperties.class */
public class VkPhysicalDeviceVertexAttributeDivisorProperties extends Struct<VkPhysicalDeviceVertexAttributeDivisorProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXVERTEXATTRIBDIVISOR;
    public static final int SUPPORTSNONZEROFIRSTINSTANCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXVERTEXATTRIBDIVISOR = layout.offsetof(2);
        SUPPORTSNONZEROFIRSTINSTANCE = layout.offsetof(3);
    }

    protected VkPhysicalDeviceVertexAttributeDivisorProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVertexAttributeDivisorProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVertexAttributeDivisorProperties(address, container);
    }

    public VkPhysicalDeviceVertexAttributeDivisorProperties(ByteBuffer container) {
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
    public int maxVertexAttribDivisor() {
        return nmaxVertexAttribDivisor(address());
    }

    @NativeType("VkBool32")
    public boolean supportsNonZeroFirstInstance() {
        return nsupportsNonZeroFirstInstance(address()) != 0;
    }

    public VkPhysicalDeviceVertexAttributeDivisorProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorProperties sType$Default() {
        return sType(1000525000);
    }

    public VkPhysicalDeviceVertexAttributeDivisorProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceVertexAttributeDivisorProperties set(VkPhysicalDeviceVertexAttributeDivisorProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorProperties malloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorProperties calloc() {
        return new VkPhysicalDeviceVertexAttributeDivisorProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVertexAttributeDivisorProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorProperties create(long address) {
        return new VkPhysicalDeviceVertexAttributeDivisorProperties(address, null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVertexAttributeDivisorProperties(address, null);
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

    public static VkPhysicalDeviceVertexAttributeDivisorProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVertexAttributeDivisorProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVertexAttributeDivisorProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxVertexAttribDivisor(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVERTEXATTRIBDIVISOR);
    }

    public static int nsupportsNonZeroFirstInstance(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTSNONZEROFIRSTINSTANCE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVertexAttributeDivisorProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVertexAttributeDivisorProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVertexAttributeDivisorProperties ELEMENT_FACTORY = VkPhysicalDeviceVertexAttributeDivisorProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVertexAttributeDivisorProperties.SIZEOF);
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
        public VkPhysicalDeviceVertexAttributeDivisorProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVertexAttributeDivisorProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVertexAttributeDivisorProperties.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxVertexAttribDivisor() {
            return VkPhysicalDeviceVertexAttributeDivisorProperties.nmaxVertexAttribDivisor(address());
        }

        @NativeType("VkBool32")
        public boolean supportsNonZeroFirstInstance() {
            return VkPhysicalDeviceVertexAttributeDivisorProperties.nsupportsNonZeroFirstInstance(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVertexAttributeDivisorProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000525000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVertexAttributeDivisorProperties.npNext(address(), value);
            return this;
        }
    }
}
