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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties3.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties3.class */
public class VkFormatProperties3 extends Struct<VkFormatProperties3> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LINEARTILINGFEATURES;
    public static final int OPTIMALTILINGFEATURES;
    public static final int BUFFERFEATURES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LINEARTILINGFEATURES = layout.offsetof(2);
        OPTIMALTILINGFEATURES = layout.offsetof(3);
        BUFFERFEATURES = layout.offsetof(4);
    }

    protected VkFormatProperties3(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkFormatProperties3 create(long address, ByteBuffer container) {
        return new VkFormatProperties3(address, container);
    }

    public VkFormatProperties3(ByteBuffer container) {
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

    @NativeType("VkFormatFeatureFlags2")
    public long linearTilingFeatures() {
        return nlinearTilingFeatures(address());
    }

    @NativeType("VkFormatFeatureFlags2")
    public long optimalTilingFeatures() {
        return noptimalTilingFeatures(address());
    }

    @NativeType("VkFormatFeatureFlags2")
    public long bufferFeatures() {
        return nbufferFeatures(address());
    }

    public VkFormatProperties3 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkFormatProperties3 sType$Default() {
        return sType(1000360000);
    }

    public VkFormatProperties3 pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkFormatProperties3 set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkFormatProperties3 set(VkFormatProperties3 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFormatProperties3 malloc() {
        return new VkFormatProperties3(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFormatProperties3 calloc() {
        return new VkFormatProperties3(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFormatProperties3 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFormatProperties3(MemoryUtil.memAddress(container), container);
    }

    public static VkFormatProperties3 create(long address) {
        return new VkFormatProperties3(address, null);
    }

    public static VkFormatProperties3 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFormatProperties3(address, null);
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

    public static VkFormatProperties3 malloc(MemoryStack stack) {
        return new VkFormatProperties3(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFormatProperties3 calloc(MemoryStack stack) {
        return new VkFormatProperties3(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nlinearTilingFeatures(long struct) {
        return MemoryUtil.memGetLong(struct + LINEARTILINGFEATURES);
    }

    public static long noptimalTilingFeatures(long struct) {
        return MemoryUtil.memGetLong(struct + OPTIMALTILINGFEATURES);
    }

    public static long nbufferFeatures(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFERFEATURES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties3$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFormatProperties3$Buffer.class */
    public static class Buffer extends StructBuffer<VkFormatProperties3, Buffer> implements NativeResource {
        private static final VkFormatProperties3 ELEMENT_FACTORY = VkFormatProperties3.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkFormatProperties3.SIZEOF);
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
        public VkFormatProperties3 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkFormatProperties3.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkFormatProperties3.npNext(address());
        }

        @NativeType("VkFormatFeatureFlags2")
        public long linearTilingFeatures() {
            return VkFormatProperties3.nlinearTilingFeatures(address());
        }

        @NativeType("VkFormatFeatureFlags2")
        public long optimalTilingFeatures() {
            return VkFormatProperties3.noptimalTilingFeatures(address());
        }

        @NativeType("VkFormatFeatureFlags2")
        public long bufferFeatures() {
            return VkFormatProperties3.nbufferFeatures(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFormatProperties3.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000360000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkFormatProperties3.npNext(address(), value);
            return this;
        }
    }
}
