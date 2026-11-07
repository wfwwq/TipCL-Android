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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRateFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRateFeaturesKHR.class */
public class VkPhysicalDeviceFragmentShadingRateFeaturesKHR extends Struct<VkPhysicalDeviceFragmentShadingRateFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEFRAGMENTSHADINGRATE;
    public static final int PRIMITIVEFRAGMENTSHADINGRATE;
    public static final int ATTACHMENTFRAGMENTSHADINGRATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEFRAGMENTSHADINGRATE = layout.offsetof(2);
        PRIMITIVEFRAGMENTSHADINGRATE = layout.offsetof(3);
        ATTACHMENTFRAGMENTSHADINGRATE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceFragmentShadingRateFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR(ByteBuffer container) {
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
    public boolean pipelineFragmentShadingRate() {
        return npipelineFragmentShadingRate(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean primitiveFragmentShadingRate() {
        return nprimitiveFragmentShadingRate(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean attachmentFragmentShadingRate() {
        return nattachmentFragmentShadingRate(address()) != 0;
    }

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR sType$Default() {
        return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR);
    }

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR pipelineFragmentShadingRate(@NativeType("VkBool32") boolean value) {
        npipelineFragmentShadingRate(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR primitiveFragmentShadingRate(@NativeType("VkBool32") boolean value) {
        nprimitiveFragmentShadingRate(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR attachmentFragmentShadingRate(@NativeType("VkBool32") boolean value) {
        nattachmentFragmentShadingRate(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR set(int sType, long pNext, boolean pipelineFragmentShadingRate, boolean primitiveFragmentShadingRate, boolean attachmentFragmentShadingRate) {
        sType(sType);
        pNext(pNext);
        pipelineFragmentShadingRate(pipelineFragmentShadingRate);
        primitiveFragmentShadingRate(primitiveFragmentShadingRate);
        attachmentFragmentShadingRate(attachmentFragmentShadingRate);
        return this;
    }

    public VkPhysicalDeviceFragmentShadingRateFeaturesKHR set(VkPhysicalDeviceFragmentShadingRateFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR malloc() {
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR calloc() {
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR create(long address) {
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceFragmentShadingRateFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentShadingRateFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npipelineFragmentShadingRate(long struct) {
        return MemoryUtil.memGetInt(struct + PIPELINEFRAGMENTSHADINGRATE);
    }

    public static int nprimitiveFragmentShadingRate(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVEFRAGMENTSHADINGRATE);
    }

    public static int nattachmentFragmentShadingRate(long struct) {
        return MemoryUtil.memGetInt(struct + ATTACHMENTFRAGMENTSHADINGRATE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npipelineFragmentShadingRate(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPELINEFRAGMENTSHADINGRATE, value);
    }

    public static void nprimitiveFragmentShadingRate(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMITIVEFRAGMENTSHADINGRATE, value);
    }

    public static void nattachmentFragmentShadingRate(long struct, int value) {
        MemoryUtil.memPutInt(struct + ATTACHMENTFRAGMENTSHADINGRATE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRateFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRateFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShadingRateFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceFragmentShadingRateFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceFragmentShadingRateFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceFragmentShadingRateFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceFragmentShadingRateFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean pipelineFragmentShadingRate() {
            return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.npipelineFragmentShadingRate(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean primitiveFragmentShadingRate() {
            return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nprimitiveFragmentShadingRate(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean attachmentFragmentShadingRate() {
            return VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nattachmentFragmentShadingRate(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRFragmentShadingRate.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceFragmentShadingRateFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer pipelineFragmentShadingRate(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentShadingRateFeaturesKHR.npipelineFragmentShadingRate(address(), value ? 1 : 0);
            return this;
        }

        public Buffer primitiveFragmentShadingRate(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nprimitiveFragmentShadingRate(address(), value ? 1 : 0);
            return this;
        }

        public Buffer attachmentFragmentShadingRate(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceFragmentShadingRateFeaturesKHR.nattachmentFragmentShadingRate(address(), value ? 1 : 0);
            return this;
        }
    }
}
