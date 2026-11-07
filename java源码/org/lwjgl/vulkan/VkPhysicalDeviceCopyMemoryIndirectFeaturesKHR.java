package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.class */
public class VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR extends Struct<VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INDIRECTMEMORYCOPY;
    public static final int INDIRECTMEMORYTOIMAGECOPY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDIRECTMEMORYCOPY = layout.offsetof(2);
        INDIRECTMEMORYTOIMAGECOPY = layout.offsetof(3);
    }

    protected VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(ByteBuffer container) {
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
    public boolean indirectMemoryCopy() {
        return nindirectMemoryCopy(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean indirectMemoryToImageCopy() {
        return nindirectMemoryToImageCopy(address()) != 0;
    }

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR sType$Default() {
        return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_KHR);
    }

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryCopy(@NativeType("VkBool32") boolean value) {
        nindirectMemoryCopy(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR indirectMemoryToImageCopy(@NativeType("VkBool32") boolean value) {
        nindirectMemoryToImageCopy(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR set(int sType, long pNext, boolean indirectMemoryCopy, boolean indirectMemoryToImageCopy) {
        sType(sType);
        pNext(pNext);
        indirectMemoryCopy(indirectMemoryCopy);
        indirectMemoryToImageCopy(indirectMemoryToImageCopy);
        return this;
    }

    public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR set(VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR malloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR calloc() {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR create(long address) {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nindirectMemoryCopy(long struct) {
        return MemoryUtil.memGetInt(struct + INDIRECTMEMORYCOPY);
    }

    public static int nindirectMemoryToImageCopy(long struct) {
        return MemoryUtil.memGetInt(struct + INDIRECTMEMORYTOIMAGECOPY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nindirectMemoryCopy(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDIRECTMEMORYCOPY, value);
    }

    public static void nindirectMemoryToImageCopy(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDIRECTMEMORYTOIMAGECOPY, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean indirectMemoryCopy() {
            return VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.nindirectMemoryCopy(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean indirectMemoryToImageCopy() {
            return VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.nindirectMemoryToImageCopy(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRCopyMemoryIndirect.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer indirectMemoryCopy(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.nindirectMemoryCopy(address(), value ? 1 : 0);
            return this;
        }

        public Buffer indirectMemoryToImageCopy(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCopyMemoryIndirectFeaturesKHR.nindirectMemoryToImageCopy(address(), value ? 1 : 0);
            return this;
        }
    }
}
