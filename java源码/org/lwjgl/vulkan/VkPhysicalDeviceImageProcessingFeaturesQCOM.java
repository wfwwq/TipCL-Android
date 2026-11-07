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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessingFeaturesQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessingFeaturesQCOM.class */
public class VkPhysicalDeviceImageProcessingFeaturesQCOM extends Struct<VkPhysicalDeviceImageProcessingFeaturesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TEXTURESAMPLEWEIGHTED;
    public static final int TEXTUREBOXFILTER;
    public static final int TEXTUREBLOCKMATCH;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TEXTURESAMPLEWEIGHTED = layout.offsetof(2);
        TEXTUREBOXFILTER = layout.offsetof(3);
        TEXTUREBLOCKMATCH = layout.offsetof(4);
    }

    protected VkPhysicalDeviceImageProcessingFeaturesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceImageProcessingFeaturesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(address, container);
    }

    public VkPhysicalDeviceImageProcessingFeaturesQCOM(ByteBuffer container) {
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
    public boolean textureSampleWeighted() {
        return ntextureSampleWeighted(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean textureBoxFilter() {
        return ntextureBoxFilter(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean textureBlockMatch() {
        return ntextureBlockMatch(address()) != 0;
    }

    public VkPhysicalDeviceImageProcessingFeaturesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageProcessingFeaturesQCOM sType$Default() {
        return sType(1000440000);
    }

    public VkPhysicalDeviceImageProcessingFeaturesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureSampleWeighted(@NativeType("VkBool32") boolean value) {
        ntextureSampleWeighted(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBoxFilter(@NativeType("VkBool32") boolean value) {
        ntextureBoxFilter(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBlockMatch(@NativeType("VkBool32") boolean value) {
        ntextureBlockMatch(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceImageProcessingFeaturesQCOM set(int sType, long pNext, boolean textureSampleWeighted, boolean textureBoxFilter, boolean textureBlockMatch) {
        sType(sType);
        pNext(pNext);
        textureSampleWeighted(textureSampleWeighted);
        textureBoxFilter(textureBoxFilter);
        textureBlockMatch(textureBlockMatch);
        return this;
    }

    public VkPhysicalDeviceImageProcessingFeaturesQCOM set(VkPhysicalDeviceImageProcessingFeaturesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM malloc() {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM calloc() {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(address, null);
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(address, null);
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

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceImageProcessingFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntextureSampleWeighted(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTURESAMPLEWEIGHTED);
    }

    public static int ntextureBoxFilter(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTUREBOXFILTER);
    }

    public static int ntextureBlockMatch(long struct) {
        return MemoryUtil.memGetInt(struct + TEXTUREBLOCKMATCH);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntextureSampleWeighted(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEXTURESAMPLEWEIGHTED, value);
    }

    public static void ntextureBoxFilter(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEXTUREBOXFILTER, value);
    }

    public static void ntextureBlockMatch(long struct, int value) {
        MemoryUtil.memPutInt(struct + TEXTUREBLOCKMATCH, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessingFeaturesQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceImageProcessingFeaturesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageProcessingFeaturesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceImageProcessingFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceImageProcessingFeaturesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceImageProcessingFeaturesQCOM.SIZEOF);
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
        public VkPhysicalDeviceImageProcessingFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceImageProcessingFeaturesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceImageProcessingFeaturesQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean textureSampleWeighted() {
            return VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureSampleWeighted(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean textureBoxFilter() {
            return VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureBoxFilter(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean textureBlockMatch() {
            return VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureBlockMatch(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceImageProcessingFeaturesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000440000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceImageProcessingFeaturesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer textureSampleWeighted(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureSampleWeighted(address(), value ? 1 : 0);
            return this;
        }

        public Buffer textureBoxFilter(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureBoxFilter(address(), value ? 1 : 0);
            return this;
        }

        public Buffer textureBlockMatch(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureBlockMatch(address(), value ? 1 : 0);
            return this;
        }
    }
}
