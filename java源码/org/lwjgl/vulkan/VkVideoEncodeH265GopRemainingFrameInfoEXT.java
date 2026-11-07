package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265GopRemainingFrameInfoEXT.class */
public class VkVideoEncodeH265GopRemainingFrameInfoEXT extends Struct<VkVideoEncodeH265GopRemainingFrameInfoEXT> implements NativeResource {
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

    protected VkVideoEncodeH265GopRemainingFrameInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265GopRemainingFrameInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(address, container);
    }

    public VkVideoEncodeH265GopRemainingFrameInfoEXT(ByteBuffer container) {
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

    public VkVideoEncodeH265GopRemainingFrameInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoEXT sType$Default() {
        return sType(1000039006);
    }

    public VkVideoEncodeH265GopRemainingFrameInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoEXT useGopRemainingFrames(@NativeType("VkBool32") boolean value) {
        nuseGopRemainingFrames(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoEXT gopRemainingI(@NativeType("uint32_t") int value) {
        ngopRemainingI(address(), value);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoEXT gopRemainingP(@NativeType("uint32_t") int value) {
        ngopRemainingP(address(), value);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoEXT gopRemainingB(@NativeType("uint32_t") int value) {
        ngopRemainingB(address(), value);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoEXT set(int sType, long pNext, boolean useGopRemainingFrames, int gopRemainingI, int gopRemainingP, int gopRemainingB) {
        sType(sType);
        pNext(pNext);
        useGopRemainingFrames(useGopRemainingFrames);
        gopRemainingI(gopRemainingI);
        gopRemainingP(gopRemainingP);
        gopRemainingB(gopRemainingB);
        return this;
    }

    public VkVideoEncodeH265GopRemainingFrameInfoEXT set(VkVideoEncodeH265GopRemainingFrameInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoEXT malloc() {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoEXT calloc() {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoEXT create(long address) {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265GopRemainingFrameInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265GopRemainingFrameInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265GopRemainingFrameInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return UNSAFE.getInt((Object) null, struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nuseGopRemainingFrames(long struct) {
        return UNSAFE.getInt((Object) null, struct + USEGOPREMAININGFRAMES);
    }

    public static int ngopRemainingI(long struct) {
        return UNSAFE.getInt((Object) null, struct + GOPREMAININGI);
    }

    public static int ngopRemainingP(long struct) {
        return UNSAFE.getInt((Object) null, struct + GOPREMAININGP);
    }

    public static int ngopRemainingB(long struct) {
        return UNSAFE.getInt((Object) null, struct + GOPREMAININGB);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nuseGopRemainingFrames(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + USEGOPREMAININGFRAMES, value);
    }

    public static void ngopRemainingI(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + GOPREMAININGI, value);
    }

    public static void ngopRemainingP(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + GOPREMAININGP, value);
    }

    public static void ngopRemainingB(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + GOPREMAININGB, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265GopRemainingFrameInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265GopRemainingFrameInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265GopRemainingFrameInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265GopRemainingFrameInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265GopRemainingFrameInfoEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkVideoEncodeH265GopRemainingFrameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265GopRemainingFrameInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265GopRemainingFrameInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useGopRemainingFrames() {
            return VkVideoEncodeH265GopRemainingFrameInfoEXT.nuseGopRemainingFrames(address()) != 0;
        }

        @NativeType("uint32_t")
        public int gopRemainingI() {
            return VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingI(address());
        }

        @NativeType("uint32_t")
        public int gopRemainingP() {
            return VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingP(address());
        }

        @NativeType("uint32_t")
        public int gopRemainingB() {
            return VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingB(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265GopRemainingFrameInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039006);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265GopRemainingFrameInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer useGopRemainingFrames(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH265GopRemainingFrameInfoEXT.nuseGopRemainingFrames(address(), value ? 1 : 0);
            return this;
        }

        public Buffer gopRemainingI(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingI(address(), value);
            return this;
        }

        public Buffer gopRemainingP(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingP(address(), value);
            return this;
        }

        public Buffer gopRemainingB(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265GopRemainingFrameInfoEXT.ngopRemainingB(address(), value);
            return this;
        }
    }
}
