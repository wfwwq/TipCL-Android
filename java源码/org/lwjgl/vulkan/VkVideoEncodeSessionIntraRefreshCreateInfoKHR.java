package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeSessionIntraRefreshCreateInfoKHR.class */
public class VkVideoEncodeSessionIntraRefreshCreateInfoKHR extends Struct<VkVideoEncodeSessionIntraRefreshCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INTRAREFRESHMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INTRAREFRESHMODE = layout.offsetof(2);
    }

    protected VkVideoEncodeSessionIntraRefreshCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(address, container);
    }

    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeIntraRefreshModeFlagBitsKHR")
    public int intraRefreshMode() {
        return nintraRefreshMode(address());
    }

    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR sType$Default() {
        return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR);
    }

    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR intraRefreshMode(@NativeType("VkVideoEncodeIntraRefreshModeFlagBitsKHR") int value) {
        nintraRefreshMode(address(), value);
        return this;
    }

    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR set(int sType, long pNext, int intraRefreshMode) {
        sType(sType);
        pNext(pNext);
        intraRefreshMode(intraRefreshMode);
        return this;
    }

    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR set(VkVideoEncodeSessionIntraRefreshCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR malloc() {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR calloc() {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR create(long address) {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(address, null);
    }

    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(address, null);
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

    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nintraRefreshMode(long struct) {
        return MemoryUtil.memGetInt(struct + INTRAREFRESHMODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nintraRefreshMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTRAREFRESHMODE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeSessionIntraRefreshCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeSessionIntraRefreshCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeSessionIntraRefreshCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeSessionIntraRefreshCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeSessionIntraRefreshCreateInfoKHR.SIZEOF);
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
        public VkVideoEncodeSessionIntraRefreshCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeSessionIntraRefreshCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeSessionIntraRefreshCreateInfoKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeIntraRefreshModeFlagBitsKHR")
        public int intraRefreshMode() {
            return VkVideoEncodeSessionIntraRefreshCreateInfoKHR.nintraRefreshMode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeSessionIntraRefreshCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeSessionIntraRefreshCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer intraRefreshMode(@NativeType("VkVideoEncodeIntraRefreshModeFlagBitsKHR") int value) {
            VkVideoEncodeSessionIntraRefreshCreateInfoKHR.nintraRefreshMode(address(), value);
            return this;
        }
    }
}
