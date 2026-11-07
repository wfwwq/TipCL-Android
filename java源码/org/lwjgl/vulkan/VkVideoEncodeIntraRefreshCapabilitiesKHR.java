package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeIntraRefreshCapabilitiesKHR.class */
public class VkVideoEncodeIntraRefreshCapabilitiesKHR extends Struct<VkVideoEncodeIntraRefreshCapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INTRAREFRESHMODES;
    public static final int MAXINTRAREFRESHCYCLEDURATION;
    public static final int MAXINTRAREFRESHACTIVEREFERENCEPICTURES;
    public static final int PARTITIONINDEPENDENTINTRAREFRESHREGIONS;
    public static final int NONRECTANGULARINTRAREFRESHREGIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INTRAREFRESHMODES = layout.offsetof(2);
        MAXINTRAREFRESHCYCLEDURATION = layout.offsetof(3);
        MAXINTRAREFRESHACTIVEREFERENCEPICTURES = layout.offsetof(4);
        PARTITIONINDEPENDENTINTRAREFRESHREGIONS = layout.offsetof(5);
        NONRECTANGULARINTRAREFRESHREGIONS = layout.offsetof(6);
    }

    protected VkVideoEncodeIntraRefreshCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeIntraRefreshCapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(address, container);
    }

    public VkVideoEncodeIntraRefreshCapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeIntraRefreshModeFlagsKHR")
    public int intraRefreshModes() {
        return nintraRefreshModes(address());
    }

    @NativeType("uint32_t")
    public int maxIntraRefreshCycleDuration() {
        return nmaxIntraRefreshCycleDuration(address());
    }

    @NativeType("uint32_t")
    public int maxIntraRefreshActiveReferencePictures() {
        return nmaxIntraRefreshActiveReferencePictures(address());
    }

    @NativeType("VkBool32")
    public boolean partitionIndependentIntraRefreshRegions() {
        return npartitionIndependentIntraRefreshRegions(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean nonRectangularIntraRefreshRegions() {
        return nnonRectangularIntraRefreshRegions(address()) != 0;
    }

    public VkVideoEncodeIntraRefreshCapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeIntraRefreshCapabilitiesKHR sType$Default() {
        return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR);
    }

    public VkVideoEncodeIntraRefreshCapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeIntraRefreshCapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeIntraRefreshCapabilitiesKHR set(VkVideoEncodeIntraRefreshCapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeIntraRefreshCapabilitiesKHR malloc() {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeIntraRefreshCapabilitiesKHR calloc() {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeIntraRefreshCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeIntraRefreshCapabilitiesKHR create(long address) {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(address, null);
    }

    public static VkVideoEncodeIntraRefreshCapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(address, null);
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

    public static VkVideoEncodeIntraRefreshCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeIntraRefreshCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nintraRefreshModes(long struct) {
        return MemoryUtil.memGetInt(struct + INTRAREFRESHMODES);
    }

    public static int nmaxIntraRefreshCycleDuration(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINTRAREFRESHCYCLEDURATION);
    }

    public static int nmaxIntraRefreshActiveReferencePictures(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINTRAREFRESHACTIVEREFERENCEPICTURES);
    }

    public static int npartitionIndependentIntraRefreshRegions(long struct) {
        return MemoryUtil.memGetInt(struct + PARTITIONINDEPENDENTINTRAREFRESHREGIONS);
    }

    public static int nnonRectangularIntraRefreshRegions(long struct) {
        return MemoryUtil.memGetInt(struct + NONRECTANGULARINTRAREFRESHREGIONS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeIntraRefreshCapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeIntraRefreshCapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeIntraRefreshCapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeIntraRefreshCapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeIntraRefreshCapabilitiesKHR.SIZEOF);
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
        public VkVideoEncodeIntraRefreshCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeIntraRefreshCapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeIntraRefreshCapabilitiesKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeIntraRefreshModeFlagsKHR")
        public int intraRefreshModes() {
            return VkVideoEncodeIntraRefreshCapabilitiesKHR.nintraRefreshModes(address());
        }

        @NativeType("uint32_t")
        public int maxIntraRefreshCycleDuration() {
            return VkVideoEncodeIntraRefreshCapabilitiesKHR.nmaxIntraRefreshCycleDuration(address());
        }

        @NativeType("uint32_t")
        public int maxIntraRefreshActiveReferencePictures() {
            return VkVideoEncodeIntraRefreshCapabilitiesKHR.nmaxIntraRefreshActiveReferencePictures(address());
        }

        @NativeType("VkBool32")
        public boolean partitionIndependentIntraRefreshRegions() {
            return VkVideoEncodeIntraRefreshCapabilitiesKHR.npartitionIndependentIntraRefreshRegions(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean nonRectangularIntraRefreshRegions() {
            return VkVideoEncodeIntraRefreshCapabilitiesKHR.nnonRectangularIntraRefreshRegions(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeIntraRefreshCapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeIntraRefreshCapabilitiesKHR.npNext(address(), value);
            return this;
        }
    }
}
