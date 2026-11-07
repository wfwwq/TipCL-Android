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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpticalFlowPropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpticalFlowPropertiesNV.class */
public class VkPhysicalDeviceOpticalFlowPropertiesNV extends Struct<VkPhysicalDeviceOpticalFlowPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUPPORTEDOUTPUTGRIDSIZES;
    public static final int SUPPORTEDHINTGRIDSIZES;
    public static final int HINTSUPPORTED;
    public static final int COSTSUPPORTED;
    public static final int BIDIRECTIONALFLOWSUPPORTED;
    public static final int GLOBALFLOWSUPPORTED;
    public static final int MINWIDTH;
    public static final int MINHEIGHT;
    public static final int MAXWIDTH;
    public static final int MAXHEIGHT;
    public static final int MAXNUMREGIONSOFINTEREST;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTEDOUTPUTGRIDSIZES = layout.offsetof(2);
        SUPPORTEDHINTGRIDSIZES = layout.offsetof(3);
        HINTSUPPORTED = layout.offsetof(4);
        COSTSUPPORTED = layout.offsetof(5);
        BIDIRECTIONALFLOWSUPPORTED = layout.offsetof(6);
        GLOBALFLOWSUPPORTED = layout.offsetof(7);
        MINWIDTH = layout.offsetof(8);
        MINHEIGHT = layout.offsetof(9);
        MAXWIDTH = layout.offsetof(10);
        MAXHEIGHT = layout.offsetof(11);
        MAXNUMREGIONSOFINTEREST = layout.offsetof(12);
    }

    protected VkPhysicalDeviceOpticalFlowPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceOpticalFlowPropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(address, container);
    }

    public VkPhysicalDeviceOpticalFlowPropertiesNV(ByteBuffer container) {
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

    @NativeType("VkOpticalFlowGridSizeFlagsNV")
    public int supportedOutputGridSizes() {
        return nsupportedOutputGridSizes(address());
    }

    @NativeType("VkOpticalFlowGridSizeFlagsNV")
    public int supportedHintGridSizes() {
        return nsupportedHintGridSizes(address());
    }

    @NativeType("VkBool32")
    public boolean hintSupported() {
        return nhintSupported(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean costSupported() {
        return ncostSupported(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean bidirectionalFlowSupported() {
        return nbidirectionalFlowSupported(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean globalFlowSupported() {
        return nglobalFlowSupported(address()) != 0;
    }

    @NativeType("uint32_t")
    public int minWidth() {
        return nminWidth(address());
    }

    @NativeType("uint32_t")
    public int minHeight() {
        return nminHeight(address());
    }

    @NativeType("uint32_t")
    public int maxWidth() {
        return nmaxWidth(address());
    }

    @NativeType("uint32_t")
    public int maxHeight() {
        return nmaxHeight(address());
    }

    @NativeType("uint32_t")
    public int maxNumRegionsOfInterest() {
        return nmaxNumRegionsOfInterest(address());
    }

    public VkPhysicalDeviceOpticalFlowPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceOpticalFlowPropertiesNV sType$Default() {
        return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV);
    }

    public VkPhysicalDeviceOpticalFlowPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceOpticalFlowPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceOpticalFlowPropertiesNV set(VkPhysicalDeviceOpticalFlowPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceOpticalFlowPropertiesNV malloc() {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceOpticalFlowPropertiesNV calloc() {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceOpticalFlowPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceOpticalFlowPropertiesNV create(long address) {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(address, null);
    }

    public static VkPhysicalDeviceOpticalFlowPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(address, null);
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

    public static VkPhysicalDeviceOpticalFlowPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceOpticalFlowPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsupportedOutputGridSizes(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDOUTPUTGRIDSIZES);
    }

    public static int nsupportedHintGridSizes(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDHINTGRIDSIZES);
    }

    public static int nhintSupported(long struct) {
        return MemoryUtil.memGetInt(struct + HINTSUPPORTED);
    }

    public static int ncostSupported(long struct) {
        return MemoryUtil.memGetInt(struct + COSTSUPPORTED);
    }

    public static int nbidirectionalFlowSupported(long struct) {
        return MemoryUtil.memGetInt(struct + BIDIRECTIONALFLOWSUPPORTED);
    }

    public static int nglobalFlowSupported(long struct) {
        return MemoryUtil.memGetInt(struct + GLOBALFLOWSUPPORTED);
    }

    public static int nminWidth(long struct) {
        return MemoryUtil.memGetInt(struct + MINWIDTH);
    }

    public static int nminHeight(long struct) {
        return MemoryUtil.memGetInt(struct + MINHEIGHT);
    }

    public static int nmaxWidth(long struct) {
        return MemoryUtil.memGetInt(struct + MAXWIDTH);
    }

    public static int nmaxHeight(long struct) {
        return MemoryUtil.memGetInt(struct + MAXHEIGHT);
    }

    public static int nmaxNumRegionsOfInterest(long struct) {
        return MemoryUtil.memGetInt(struct + MAXNUMREGIONSOFINTEREST);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpticalFlowPropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpticalFlowPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceOpticalFlowPropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceOpticalFlowPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceOpticalFlowPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceOpticalFlowPropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceOpticalFlowPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.npNext(address());
        }

        @NativeType("VkOpticalFlowGridSizeFlagsNV")
        public int supportedOutputGridSizes() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nsupportedOutputGridSizes(address());
        }

        @NativeType("VkOpticalFlowGridSizeFlagsNV")
        public int supportedHintGridSizes() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nsupportedHintGridSizes(address());
        }

        @NativeType("VkBool32")
        public boolean hintSupported() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nhintSupported(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean costSupported() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.ncostSupported(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bidirectionalFlowSupported() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nbidirectionalFlowSupported(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean globalFlowSupported() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nglobalFlowSupported(address()) != 0;
        }

        @NativeType("uint32_t")
        public int minWidth() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nminWidth(address());
        }

        @NativeType("uint32_t")
        public int minHeight() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nminHeight(address());
        }

        @NativeType("uint32_t")
        public int maxWidth() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nmaxWidth(address());
        }

        @NativeType("uint32_t")
        public int maxHeight() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nmaxHeight(address());
        }

        @NativeType("uint32_t")
        public int maxNumRegionsOfInterest() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.nmaxNumRegionsOfInterest(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceOpticalFlowPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceOpticalFlowPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
