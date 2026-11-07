package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineProtectedAccessFeatures.class */
public class VkPhysicalDevicePipelineProtectedAccessFeatures extends Struct<VkPhysicalDevicePipelineProtectedAccessFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEPROTECTEDACCESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEPROTECTEDACCESS = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineProtectedAccessFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePipelineProtectedAccessFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(address, container);
    }

    public VkPhysicalDevicePipelineProtectedAccessFeatures(ByteBuffer container) {
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
    public boolean pipelineProtectedAccess() {
        return npipelineProtectedAccess(address()) != 0;
    }

    public VkPhysicalDevicePipelineProtectedAccessFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineProtectedAccessFeatures sType$Default() {
        return sType(1000466000);
    }

    public VkPhysicalDevicePipelineProtectedAccessFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePipelineProtectedAccessFeatures pipelineProtectedAccess(@NativeType("VkBool32") boolean value) {
        npipelineProtectedAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePipelineProtectedAccessFeatures set(int sType, long pNext, boolean pipelineProtectedAccess) {
        sType(sType);
        pNext(pNext);
        pipelineProtectedAccess(pipelineProtectedAccess);
        return this;
    }

    public VkPhysicalDevicePipelineProtectedAccessFeatures set(VkPhysicalDevicePipelineProtectedAccessFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeatures malloc() {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeatures calloc() {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeatures create(long address) {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(address, null);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(address, null);
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

    public static VkPhysicalDevicePipelineProtectedAccessFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePipelineProtectedAccessFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineProtectedAccessFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineProtectedAccess(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEPROTECTEDACCESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipelineProtectedAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEPROTECTEDACCESS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePipelineProtectedAccessFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineProtectedAccessFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePipelineProtectedAccessFeatures ELEMENT_FACTORY = VkPhysicalDevicePipelineProtectedAccessFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePipelineProtectedAccessFeatures.SIZEOF);
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
        public VkPhysicalDevicePipelineProtectedAccessFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePipelineProtectedAccessFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePipelineProtectedAccessFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean pipelineProtectedAccess() {
            return VkPhysicalDevicePipelineProtectedAccessFeatures.npipelineProtectedAccess(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePipelineProtectedAccessFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000466000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePipelineProtectedAccessFeatures.npNext(address(), value);
            return this;
        }

        public Buffer pipelineProtectedAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePipelineProtectedAccessFeatures.npipelineProtectedAccess(address(), value ? 1 : 0);
            return this;
        }
    }
}
