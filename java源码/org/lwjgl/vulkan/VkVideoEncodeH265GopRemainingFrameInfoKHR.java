package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265GopRemainingFrameInfoKHR.class */
public class VkVideoEncodeH265GopRemainingFrameInfoKHR extends Struct<VkVideoEncodeH265GopRemainingFrameInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int USEGOPREMAININGFRAMES;
    public static final int GOPREMAININGI;
    public static final int GOPREMAININGP;
    public static final int GOPREMAININGB;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        USEGOPREMAININGFRAMES = layout.offsetof(2);
        GOPREMAININGI = layout.offsetof(3);
        GOPREMAININGP = layout.offsetof(4);
        GOPREMAININGB = layout.offsetof(5);
    }

    protected VkVideoEncodeH265GopRemainingFrameInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265GopRemainingFrameInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(address, container);
    }

    public VkVideoEncodeH265GopRemainingFrameInfoKHR(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean useGopRemainingFrames() {
        return nuseGopRemainingFrames(address()) != 0;
    }

    @NativeType("uint32_t")
    public int gopRemainingI() {
        return ngopRemainingI(address());
    }

    @NativeType("uint32_t")
    public int gopRemainingP() {
        return ngopRemainingP(address());
    }

    @NativeType("uint32_t")
    public int gopRemainingB() {
        return ngopRemainingB(address());
    }

    public VkVideoEncodeH265GopRemainingFrameInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoKHR sType$Default() {
        return sType(1000039006);
    }

    public VkVideoEncodeH265GopRemainingFrameInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoKHR useGopRemainingFrames(@NativeType("VkBool32") boolean value) {
        nuseGopRemainingFrames(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingI(@NativeType("uint32_t") int value) {
        ngopRemainingI(address(), value);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingP(@NativeType("uint32_t") int value) {
        ngopRemainingP(address(), value);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoKHR gopRemainingB(@NativeType("uint32_t") int value) {
        ngopRemainingB(address(), value);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoKHR set(int sType, long pNext, boolean useGopRemainingFrames, int gopRemainingI, int gopRemainingP, int gopRemainingB) {
        sType(sType);
        pNext(pNext);
        useGopRemainingFrames(useGopRemainingFrames);
        gopRemainingI(gopRemainingI);
        gopRemainingP(gopRemainingP);
        gopRemainingB(gopRemainingB);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoKHR set(VkVideoEncodeH265GopRemainingFrameInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR malloc() {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR calloc() {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR create(long address) {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(address, null);
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(address, null);
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

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265GopRemainingFrameInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nuseGopRemainingFrames(long struct) {
        return MemoryUtil.memGetInt(struct + USEGOPREMAININGFRAMES);
    }

    public static int ngopRemainingI(long struct) {
        return MemoryUtil.memGetInt(struct + GOPREMAININGI);
    }

    public static int ngopRemainingP(long struct) {
        return MemoryUtil.memGetInt(struct + GOPREMAININGP);
    }

    public static int ngopRemainingB(long struct) {
        return MemoryUtil.memGetInt(struct + GOPREMAININGB);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nuseGopRemainingFrames(long struct, int value) {
        MemoryUtil.memPutInt(struct + USEGOPREMAININGFRAMES, value);
    }

    public static void ngopRemainingI(long struct, int value) {
        MemoryUtil.memPutInt(struct + GOPREMAININGI, value);
    }

    public static void ngopRemainingP(long struct, int value) {
        MemoryUtil.memPutInt(struct + GOPREMAININGP, value);
    }

    public static void ngopRemainingB(long struct, int value) {
        MemoryUtil.memPutInt(struct + GOPREMAININGB, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265GopRemainingFrameInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265GopRemainingFrameInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265GopRemainingFrameInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265GopRemainingFrameInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265GopRemainingFrameInfoKHR.SIZEOF);
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
        public VkVideoEncodeH265GopRemainingFrameInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265GopRemainingFrameInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265GopRemainingFrameInfoKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useGopRemainingFrames() {
            return VkVideoEncodeH265GopRemainingFrameInfoKHR.nuseGopRemainingFrames(address()) != 0;
        }

        @NativeType("uint32_t")
        public int gopRemainingI() {
            return VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingI(address());
        }

        @NativeType("uint32_t")
        public int gopRemainingP() {
            return VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingP(address());
        }

        @NativeType("uint32_t")
        public int gopRemainingB() {
            return VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingB(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265GopRemainingFrameInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039006);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265GopRemainingFrameInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer useGopRemainingFrames(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265GopRemainingFrameInfoKHR.nuseGopRemainingFrames(address(), value ? 1 : 0);
            return this;
        }

        public Buffer gopRemainingI(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingI(address(), value);
            return this;
        }

        public Buffer gopRemainingP(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingP(address(), value);
            return this;
        }

        public Buffer gopRemainingB(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265GopRemainingFrameInfoKHR.ngopRemainingB(address(), value);
            return this;
        }
    }
}
