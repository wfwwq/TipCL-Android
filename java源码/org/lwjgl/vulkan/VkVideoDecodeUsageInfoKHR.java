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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeUsageInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeUsageInfoKHR.class */
public class VkVideoDecodeUsageInfoKHR extends Struct<VkVideoDecodeUsageInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VIDEOUSAGEHINTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOUSAGEHINTS = layout.offsetof(2);
    }

    protected VkVideoDecodeUsageInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoDecodeUsageInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoDecodeUsageInfoKHR(address, container);
    }

    public VkVideoDecodeUsageInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoDecodeUsageFlagsKHR")
    public int videoUsageHints() {
        return nvideoUsageHints(address());
    }

    public VkVideoDecodeUsageInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoDecodeUsageInfoKHR sType$Default() {
        return sType(1000024002);
    }

    public VkVideoDecodeUsageInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoDecodeUsageInfoKHR videoUsageHints(@NativeType("VkVideoDecodeUsageFlagsKHR") int value) {
        nvideoUsageHints(address(), value);
        return this;
    }

    public VkVideoDecodeUsageInfoKHR set(int sType, long pNext, int videoUsageHints) {
        sType(sType);
        pNext(pNext);
        videoUsageHints(videoUsageHints);
        return this;
    }

    public VkVideoDecodeUsageInfoKHR set(VkVideoDecodeUsageInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoDecodeUsageInfoKHR malloc() {
        return new VkVideoDecodeUsageInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoDecodeUsageInfoKHR calloc() {
        return new VkVideoDecodeUsageInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoDecodeUsageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeUsageInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoDecodeUsageInfoKHR create(long address) {
        return new VkVideoDecodeUsageInfoKHR(address, null);
    }

    public static VkVideoDecodeUsageInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoDecodeUsageInfoKHR(address, null);
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

    public static VkVideoDecodeUsageInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeUsageInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoDecodeUsageInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeUsageInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvideoUsageHints(long struct) {
        return MemoryUtil.memGetInt(struct + VIDEOUSAGEHINTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvideoUsageHints(long struct, int value) {
        MemoryUtil.memPutInt(struct + VIDEOUSAGEHINTS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeUsageInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoDecodeUsageInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoDecodeUsageInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoDecodeUsageInfoKHR ELEMENT_FACTORY = VkVideoDecodeUsageInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoDecodeUsageInfoKHR.SIZEOF);
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
        public VkVideoDecodeUsageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoDecodeUsageInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoDecodeUsageInfoKHR.npNext(address());
        }

        @NativeType("VkVideoDecodeUsageFlagsKHR")
        public int videoUsageHints() {
            return VkVideoDecodeUsageInfoKHR.nvideoUsageHints(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoDecodeUsageInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000024002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoDecodeUsageInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer videoUsageHints(@NativeType("VkVideoDecodeUsageFlagsKHR") int value) {
            VkVideoDecodeUsageInfoKHR.nvideoUsageHints(address(), value);
            return this;
        }
    }
}
