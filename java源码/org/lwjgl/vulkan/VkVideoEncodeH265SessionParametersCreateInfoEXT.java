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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersCreateInfoEXT.class */
public class VkVideoEncodeH265SessionParametersCreateInfoEXT extends Struct<VkVideoEncodeH265SessionParametersCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXSTDVPSCOUNT;
    public static final int MAXSTDSPSCOUNT;
    public static final int MAXSTDPPSCOUNT;
    public static final int PPARAMETERSADDINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXSTDVPSCOUNT = layout.offsetof(2);
        MAXSTDSPSCOUNT = layout.offsetof(3);
        MAXSTDPPSCOUNT = layout.offsetof(4);
        PPARAMETERSADDINFO = layout.offsetof(5);
    }

    protected VkVideoEncodeH265SessionParametersCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265SessionParametersCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersCreateInfoEXT(address, container);
    }

    public VkVideoEncodeH265SessionParametersCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int maxStdVPSCount() {
        return nmaxStdVPSCount(address());
    }

    @NativeType("uint32_t")
    public int maxStdSPSCount() {
        return nmaxStdSPSCount(address());
    }

    @NativeType("uint32_t")
    public int maxStdPPSCount() {
        return nmaxStdPPSCount(address());
    }

    @Nullable
    @NativeType("VkVideoEncodeH265SessionParametersAddInfoEXT const *")
    public VkVideoEncodeH265SessionParametersAddInfoEXT pParametersAddInfo() {
        return npParametersAddInfo(address());
    }

    public VkVideoEncodeH265SessionParametersCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoEXT sType$Default() {
        return sType(1000039001);
    }

    public VkVideoEncodeH265SessionParametersCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoEXT maxStdVPSCount(@NativeType("uint32_t") int value) {
        nmaxStdVPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoEXT maxStdSPSCount(@NativeType("uint32_t") int value) {
        nmaxStdSPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoEXT maxStdPPSCount(@NativeType("uint32_t") int value) {
        nmaxStdPPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoEXT pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH265SessionParametersAddInfoEXT const *") VkVideoEncodeH265SessionParametersAddInfoEXT value) {
        npParametersAddInfo(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoEXT set(int sType, long pNext, int maxStdVPSCount, int maxStdSPSCount, int maxStdPPSCount, @Nullable VkVideoEncodeH265SessionParametersAddInfoEXT pParametersAddInfo) {
        sType(sType);
        pNext(pNext);
        maxStdVPSCount(maxStdVPSCount);
        maxStdSPSCount(maxStdSPSCount);
        maxStdPPSCount(maxStdPPSCount);
        pParametersAddInfo(pParametersAddInfo);
        return this;
    }

    public VkVideoEncodeH265SessionParametersCreateInfoEXT set(VkVideoEncodeH265SessionParametersCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoEXT malloc() {
        return new VkVideoEncodeH265SessionParametersCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoEXT calloc() {
        return new VkVideoEncodeH265SessionParametersCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoEXT create(long address) {
        return new VkVideoEncodeH265SessionParametersCreateInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265SessionParametersCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265SessionParametersCreateInfoEXT(address, null);
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

    public static VkVideoEncodeH265SessionParametersCreateInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersCreateInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxStdVPSCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXSTDVPSCOUNT);
    }

    public static int nmaxStdSPSCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXSTDSPSCOUNT);
    }

    public static int nmaxStdPPSCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXSTDPPSCOUNT);
    }

    @Nullable
    public static VkVideoEncodeH265SessionParametersAddInfoEXT npParametersAddInfo(long struct) {
        return VkVideoEncodeH265SessionParametersAddInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PPARAMETERSADDINFO));
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaxStdVPSCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + MAXSTDVPSCOUNT, value);
    }

    public static void nmaxStdSPSCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + MAXSTDSPSCOUNT, value);
    }

    public static void nmaxStdPPSCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + MAXSTDPPSCOUNT, value);
    }

    public static void npParametersAddInfo(long struct, @Nullable VkVideoEncodeH265SessionParametersAddInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PPARAMETERSADDINFO, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265SessionParametersCreateInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265SessionParametersCreateInfoEXT.SIZEOF);
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
        public VkVideoEncodeH265SessionParametersCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265SessionParametersCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH265SessionParametersCreateInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxStdVPSCount() {
            return VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxStdVPSCount(address());
        }

        @NativeType("uint32_t")
        public int maxStdSPSCount() {
            return VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxStdSPSCount(address());
        }

        @NativeType("uint32_t")
        public int maxStdPPSCount() {
            return VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxStdPPSCount(address());
        }

        @Nullable
        @NativeType("VkVideoEncodeH265SessionParametersAddInfoEXT const *")
        public VkVideoEncodeH265SessionParametersAddInfoEXT pParametersAddInfo() {
            return VkVideoEncodeH265SessionParametersCreateInfoEXT.npParametersAddInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265SessionParametersCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH265SessionParametersCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer maxStdVPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxStdVPSCount(address(), value);
            return this;
        }

        public Buffer maxStdSPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxStdSPSCount(address(), value);
            return this;
        }

        public Buffer maxStdPPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH265SessionParametersCreateInfoEXT.nmaxStdPPSCount(address(), value);
            return this;
        }

        public Buffer pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH265SessionParametersAddInfoEXT const *") VkVideoEncodeH265SessionParametersAddInfoEXT value) {
            VkVideoEncodeH265SessionParametersCreateInfoEXT.npParametersAddInfo(address(), value);
            return this;
        }
    }
}
