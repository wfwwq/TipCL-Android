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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapBuildSizesInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapBuildSizesInfoEXT.class */
public class VkMicromapBuildSizesInfoEXT extends Struct<VkMicromapBuildSizesInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MICROMAPSIZE;
    public static final int BUILDSCRATCHSIZE;
    public static final int DISCARDABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MICROMAPSIZE = layout.offsetof(2);
        BUILDSCRATCHSIZE = layout.offsetof(3);
        DISCARDABLE = layout.offsetof(4);
    }

    protected VkMicromapBuildSizesInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMicromapBuildSizesInfoEXT create(long address, ByteBuffer container) {
        return new VkMicromapBuildSizesInfoEXT(address, container);
    }

    public VkMicromapBuildSizesInfoEXT(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkDeviceSize")
    public long micromapSize() {
        return nmicromapSize(address());
    }

    @NativeType("VkDeviceSize")
    public long buildScratchSize() {
        return nbuildScratchSize(address());
    }

    @NativeType("VkBool32")
    public boolean discardable() {
        return ndiscardable(address()) != 0;
    }

    public VkMicromapBuildSizesInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMicromapBuildSizesInfoEXT sType$Default() {
        return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT);
    }

    public VkMicromapBuildSizesInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMicromapBuildSizesInfoEXT micromapSize(@NativeType("VkDeviceSize") long value) {
        nmicromapSize(address(), value);
        return this;
    }

    public VkMicromapBuildSizesInfoEXT buildScratchSize(@NativeType("VkDeviceSize") long value) {
        nbuildScratchSize(address(), value);
        return this;
    }

    public VkMicromapBuildSizesInfoEXT discardable(@NativeType("VkBool32") boolean value) {
        ndiscardable(address(), value ? 1 : 0);
        return this;
    }

    public VkMicromapBuildSizesInfoEXT set(int sType, long pNext, long micromapSize, long buildScratchSize, boolean discardable) {
        sType(sType);
        pNext(pNext);
        micromapSize(micromapSize);
        buildScratchSize(buildScratchSize);
        discardable(discardable);
        return this;
    }

    public VkMicromapBuildSizesInfoEXT set(VkMicromapBuildSizesInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMicromapBuildSizesInfoEXT malloc() {
        return new VkMicromapBuildSizesInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMicromapBuildSizesInfoEXT calloc() {
        return new VkMicromapBuildSizesInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMicromapBuildSizesInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapBuildSizesInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMicromapBuildSizesInfoEXT create(long address) {
        return new VkMicromapBuildSizesInfoEXT(address, null);
    }

    public static VkMicromapBuildSizesInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMicromapBuildSizesInfoEXT(address, null);
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

    public static VkMicromapBuildSizesInfoEXT malloc(MemoryStack stack) {
        return new VkMicromapBuildSizesInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMicromapBuildSizesInfoEXT calloc(MemoryStack stack) {
        return new VkMicromapBuildSizesInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmicromapSize(long struct) {
        return MemoryUtil.memGetLong(struct + MICROMAPSIZE);
    }

    public static long nbuildScratchSize(long struct) {
        return MemoryUtil.memGetLong(struct + BUILDSCRATCHSIZE);
    }

    public static int ndiscardable(long struct) {
        return MemoryUtil.memGetInt(struct + DISCARDABLE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmicromapSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + MICROMAPSIZE, value);
    }

    public static void nbuildScratchSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUILDSCRATCHSIZE, value);
    }

    public static void ndiscardable(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISCARDABLE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapBuildSizesInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapBuildSizesInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMicromapBuildSizesInfoEXT, Buffer> implements NativeResource {
        private static final VkMicromapBuildSizesInfoEXT ELEMENT_FACTORY = VkMicromapBuildSizesInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMicromapBuildSizesInfoEXT.SIZEOF);
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
        public VkMicromapBuildSizesInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMicromapBuildSizesInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMicromapBuildSizesInfoEXT.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long micromapSize() {
            return VkMicromapBuildSizesInfoEXT.nmicromapSize(address());
        }

        @NativeType("VkDeviceSize")
        public long buildScratchSize() {
            return VkMicromapBuildSizesInfoEXT.nbuildScratchSize(address());
        }

        @NativeType("VkBool32")
        public boolean discardable() {
            return VkMicromapBuildSizesInfoEXT.ndiscardable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMicromapBuildSizesInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_BUILD_SIZES_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMicromapBuildSizesInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer micromapSize(@NativeType("VkDeviceSize") long value) {
            VkMicromapBuildSizesInfoEXT.nmicromapSize(address(), value);
            return this;
        }

        public Buffer buildScratchSize(@NativeType("VkDeviceSize") long value) {
            VkMicromapBuildSizesInfoEXT.nbuildScratchSize(address(), value);
            return this;
        }

        public Buffer discardable(@NativeType("VkBool32") boolean value) {
            VkMicromapBuildSizesInfoEXT.ndiscardable(address(), value ? 1 : 0);
            return this;
        }
    }
}
