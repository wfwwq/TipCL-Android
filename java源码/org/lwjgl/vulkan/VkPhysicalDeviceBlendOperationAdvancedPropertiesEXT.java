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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.class */
public class VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT extends Struct<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ADVANCEDBLENDMAXCOLORATTACHMENTS;
    public static final int ADVANCEDBLENDINDEPENDENTBLEND;
    public static final int ADVANCEDBLENDNONPREMULTIPLIEDSRCCOLOR;
    public static final int ADVANCEDBLENDNONPREMULTIPLIEDDSTCOLOR;
    public static final int ADVANCEDBLENDCORRELATEDOVERLAP;
    public static final int ADVANCEDBLENDALLOPERATIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADVANCEDBLENDMAXCOLORATTACHMENTS = layout.offsetof(2);
        ADVANCEDBLENDINDEPENDENTBLEND = layout.offsetof(3);
        ADVANCEDBLENDNONPREMULTIPLIEDSRCCOLOR = layout.offsetof(4);
        ADVANCEDBLENDNONPREMULTIPLIEDDSTCOLOR = layout.offsetof(5);
        ADVANCEDBLENDCORRELATEDOVERLAP = layout.offsetof(6);
        ADVANCEDBLENDALLOPERATIONS = layout.offsetof(7);
    }

    protected VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(ByteBuffer container) {
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
    public int advancedBlendMaxColorAttachments() {
        return nadvancedBlendMaxColorAttachments(address());
    }

    @NativeType("VkBool32")
    public boolean advancedBlendIndependentBlend() {
        return nadvancedBlendIndependentBlend(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean advancedBlendNonPremultipliedSrcColor() {
        return nadvancedBlendNonPremultipliedSrcColor(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean advancedBlendNonPremultipliedDstColor() {
        return nadvancedBlendNonPremultipliedDstColor(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean advancedBlendCorrelatedOverlap() {
        return nadvancedBlendCorrelatedOverlap(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean advancedBlendAllOperations() {
        return nadvancedBlendAllOperations(address()) != 0;
    }

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT sType$Default() {
        return sType(1000148001);
    }

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT set(VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT malloc() {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT calloc() {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT create(long address) {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nadvancedBlendMaxColorAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + ADVANCEDBLENDMAXCOLORATTACHMENTS);
    }

    public static int nadvancedBlendIndependentBlend(long struct) {
        return MemoryUtil.memGetInt(struct + ADVANCEDBLENDINDEPENDENTBLEND);
    }

    public static int nadvancedBlendNonPremultipliedSrcColor(long struct) {
        return MemoryUtil.memGetInt(struct + ADVANCEDBLENDNONPREMULTIPLIEDSRCCOLOR);
    }

    public static int nadvancedBlendNonPremultipliedDstColor(long struct) {
        return MemoryUtil.memGetInt(struct + ADVANCEDBLENDNONPREMULTIPLIEDDSTCOLOR);
    }

    public static int nadvancedBlendCorrelatedOverlap(long struct) {
        return MemoryUtil.memGetInt(struct + ADVANCEDBLENDCORRELATEDOVERLAP);
    }

    public static int nadvancedBlendAllOperations(long struct) {
        return MemoryUtil.memGetInt(struct + ADVANCEDBLENDALLOPERATIONS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int advancedBlendMaxColorAttachments() {
            return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendMaxColorAttachments(address());
        }

        @NativeType("VkBool32")
        public boolean advancedBlendIndependentBlend() {
            return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendIndependentBlend(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean advancedBlendNonPremultipliedSrcColor() {
            return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendNonPremultipliedSrcColor(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean advancedBlendNonPremultipliedDstColor() {
            return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendNonPremultipliedDstColor(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean advancedBlendCorrelatedOverlap() {
            return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendCorrelatedOverlap(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean advancedBlendAllOperations() {
            return VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nadvancedBlendAllOperations(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000148001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
