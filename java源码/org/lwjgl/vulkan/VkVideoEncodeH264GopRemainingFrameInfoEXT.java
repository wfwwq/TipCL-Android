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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264GopRemainingFrameInfoEXT.class */
public class VkVideoEncodeH264GopRemainingFrameInfoEXT extends Struct<VkVideoEncodeH264GopRemainingFrameInfoEXT> implements NativeResource {
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

    protected VkVideoEncodeH264GopRemainingFrameInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264GopRemainingFrameInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264GopRemainingFrameInfoEXT(address, container);
    }

    public VkVideoEncodeH264GopRemainingFrameInfoEXT(ByteBuffer container) {
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

    public VkVideoEncodeH264GopRemainingFrameInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264GopRemainingFrameInfoEXT sType$Default() {
        return sType(1000038006);
    }

    public VkVideoEncodeH264GopRemainingFrameInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264GopRemainingFrameInfoEXT useGopRemainingFrames(@NativeType("VkBool32") boolean value) {
        nuseGopRemainingFrames(address(), value ? 1 : 0);
        return this;
    }

    public VkVideoEncodeH264GopRemainingFrameInfoEXT gopRemainingI(@NativeType("uint32_t") int value) {
        ngopRemainingI(address(), value);
        return this;
    }

    public VkVideoEncodeH264GopRemainingFrameInfoEXT gopRemainingP(@NativeType("uint32_t") int value) {
        ngopRemainingP(address(), value);
        return this;
    }

    public VkVideoEncodeH264GopRemainingFrameInfoEXT gopRemainingB(@NativeType("uint32_t") int value) {
        ngopRemainingB(address(), value);
        return this;
    }

    public VkVideoEncodeH264GopRemainingFrameInfoEXT set(int sType, long pNext, boolean useGopRemainingFrames, int gopRemainingI, int gopRemainingP, int gopRemainingB) {
        sType(sType);
        pNext(pNext);
        useGopRemainingFrames(useGopRemainingFrames);
        gopRemainingI(gopRemainingI);
        gopRemainingP(gopRemainingP);
        gopRemainingB(gopRemainingB);
        return this;
    }

    public VkVideoEncodeH264GopRemainingFrameInfoEXT set(VkVideoEncodeH264GopRemainingFrameInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264GopRemainingFrameInfoEXT malloc() {
        return new VkVideoEncodeH264GopRemainingFrameInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264GopRemainingFrameInfoEXT calloc() {
        return new VkVideoEncodeH264GopRemainingFrameInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264GopRemainingFrameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264GopRemainingFrameInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264GopRemainingFrameInfoEXT create(long address) {
        return new VkVideoEncodeH264GopRemainingFrameInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264GopRemainingFrameInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264GopRemainingFrameInfoEXT(address, null);
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

    public static VkVideoEncodeH264GopRemainingFrameInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264GopRemainingFrameInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264GopRemainingFrameInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264GopRemainingFrameInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264GopRemainingFrameInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264GopRemainingFrameInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264GopRemainingFrameInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264GopRemainingFrameInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264GopRemainingFrameInfoEXT.SIZEOF);
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
        public VkVideoEncodeH264GopRemainingFrameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264GopRemainingFrameInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264GopRemainingFrameInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean useGopRemainingFrames() {
            return VkVideoEncodeH264GopRemainingFrameInfoEXT.nuseGopRemainingFrames(address()) != 0;
        }

        @NativeType("uint32_t")
        public int gopRemainingI() {
            return VkVideoEncodeH264GopRemainingFrameInfoEXT.ngopRemainingI(address());
        }

        @NativeType("uint32_t")
        public int gopRemainingP() {
            return VkVideoEncodeH264GopRemainingFrameInfoEXT.ngopRemainingP(address());
        }

        @NativeType("uint32_t")
        public int gopRemainingB() {
            return VkVideoEncodeH264GopRemainingFrameInfoEXT.ngopRemainingB(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264GopRemainingFrameInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038006);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264GopRemainingFrameInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer useGopRemainingFrames(@NativeType("VkBool32") boolean value) {
            VkVideoEncodeH264GopRemainingFrameInfoEXT.nuseGopRemainingFrames(address(), value ? 1 : 0);
            return this;
        }

        public Buffer gopRemainingI(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264GopRemainingFrameInfoEXT.ngopRemainingI(address(), value);
            return this;
        }

        public Buffer gopRemainingP(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264GopRemainingFrameInfoEXT.ngopRemainingP(address(), value);
            return this;
        }

        public Buffer gopRemainingB(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264GopRemainingFrameInfoEXT.ngopRemainingB(address(), value);
            return this;
        }
    }
}
