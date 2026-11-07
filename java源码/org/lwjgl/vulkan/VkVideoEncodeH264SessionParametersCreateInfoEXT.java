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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersCreateInfoEXT.class */
public class VkVideoEncodeH264SessionParametersCreateInfoEXT extends Struct<VkVideoEncodeH264SessionParametersCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXSTDSPSCOUNT;
    public static final int MAXSTDPPSCOUNT;
    public static final int PPARAMETERSADDINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXSTDSPSCOUNT = layout.offsetof(2);
        MAXSTDPPSCOUNT = layout.offsetof(3);
        PPARAMETERSADDINFO = layout.offsetof(4);
    }

    protected VkVideoEncodeH264SessionParametersCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH264SessionParametersCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH264SessionParametersCreateInfoEXT(address, container);
    }

    public VkVideoEncodeH264SessionParametersCreateInfoEXT(ByteBuffer container) {
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
    public int maxStdSPSCount() {
        return nmaxStdSPSCount(address());
    }

    @NativeType("uint32_t")
    public int maxStdPPSCount() {
        return nmaxStdPPSCount(address());
    }

    @Nullable
    @NativeType("VkVideoEncodeH264SessionParametersAddInfoEXT const *")
    public VkVideoEncodeH264SessionParametersAddInfoEXT pParametersAddInfo() {
        return npParametersAddInfo(address());
    }

    public VkVideoEncodeH264SessionParametersCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersCreateInfoEXT sType$Default() {
        return sType(1000038001);
    }

    public VkVideoEncodeH264SessionParametersCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersCreateInfoEXT maxStdSPSCount(@NativeType("uint32_t") int value) {
        nmaxStdSPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersCreateInfoEXT maxStdPPSCount(@NativeType("uint32_t") int value) {
        nmaxStdPPSCount(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersCreateInfoEXT pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH264SessionParametersAddInfoEXT const *") VkVideoEncodeH264SessionParametersAddInfoEXT value) {
        npParametersAddInfo(address(), value);
        return this;
    }

    public VkVideoEncodeH264SessionParametersCreateInfoEXT set(int sType, long pNext, int maxStdSPSCount, int maxStdPPSCount, @Nullable VkVideoEncodeH264SessionParametersAddInfoEXT pParametersAddInfo) {
        sType(sType);
        pNext(pNext);
        maxStdSPSCount(maxStdSPSCount);
        maxStdPPSCount(maxStdPPSCount);
        pParametersAddInfo(pParametersAddInfo);
        return this;
    }

    public VkVideoEncodeH264SessionParametersCreateInfoEXT set(VkVideoEncodeH264SessionParametersCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH264SessionParametersCreateInfoEXT malloc() {
        return new VkVideoEncodeH264SessionParametersCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersCreateInfoEXT calloc() {
        return new VkVideoEncodeH264SessionParametersCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH264SessionParametersCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH264SessionParametersCreateInfoEXT create(long address) {
        return new VkVideoEncodeH264SessionParametersCreateInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH264SessionParametersCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH264SessionParametersCreateInfoEXT(address, null);
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

    public static VkVideoEncodeH264SessionParametersCreateInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH264SessionParametersCreateInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH264SessionParametersCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxStdSPSCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXSTDSPSCOUNT);
    }

    public static int nmaxStdPPSCount(long struct) {
        return UNSAFE.getInt((Object) null, struct + MAXSTDPPSCOUNT);
    }

    @Nullable
    public static VkVideoEncodeH264SessionParametersAddInfoEXT npParametersAddInfo(long struct) {
        return VkVideoEncodeH264SessionParametersAddInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PPARAMETERSADDINFO));
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaxStdSPSCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + MAXSTDSPSCOUNT, value);
    }

    public static void nmaxStdPPSCount(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + MAXSTDPPSCOUNT, value);
    }

    public static void npParametersAddInfo(long struct, @Nullable VkVideoEncodeH264SessionParametersAddInfoEXT value) {
        MemoryUtil.memPutAddress(struct + PPARAMETERSADDINFO, MemoryUtil.memAddressSafe(value));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH264SessionParametersCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH264SessionParametersCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH264SessionParametersCreateInfoEXT ELEMENT_FACTORY = VkVideoEncodeH264SessionParametersCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH264SessionParametersCreateInfoEXT.SIZEOF);
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
        public VkVideoEncodeH264SessionParametersCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH264SessionParametersCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoEncodeH264SessionParametersCreateInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxStdSPSCount() {
            return VkVideoEncodeH264SessionParametersCreateInfoEXT.nmaxStdSPSCount(address());
        }

        @NativeType("uint32_t")
        public int maxStdPPSCount() {
            return VkVideoEncodeH264SessionParametersCreateInfoEXT.nmaxStdPPSCount(address());
        }

        @Nullable
        @NativeType("VkVideoEncodeH264SessionParametersAddInfoEXT const *")
        public VkVideoEncodeH264SessionParametersAddInfoEXT pParametersAddInfo() {
            return VkVideoEncodeH264SessionParametersCreateInfoEXT.npParametersAddInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH264SessionParametersCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000038001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoEncodeH264SessionParametersCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer maxStdSPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264SessionParametersCreateInfoEXT.nmaxStdSPSCount(address(), value);
            return this;
        }

        public Buffer maxStdPPSCount(@NativeType("uint32_t") int value) {
            VkVideoEncodeH264SessionParametersCreateInfoEXT.nmaxStdPPSCount(address(), value);
            return this;
        }

        public Buffer pParametersAddInfo(@Nullable @NativeType("VkVideoEncodeH264SessionParametersAddInfoEXT const *") VkVideoEncodeH264SessionParametersAddInfoEXT value) {
            VkVideoEncodeH264SessionParametersCreateInfoEXT.npParametersAddInfo(address(), value);
            return this;
        }
    }
}
