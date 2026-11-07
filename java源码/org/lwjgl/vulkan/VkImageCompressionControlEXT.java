package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCompressionControlEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCompressionControlEXT.class */
public class VkImageCompressionControlEXT extends Struct<VkImageCompressionControlEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int COMPRESSIONCONTROLPLANECOUNT;
    public static final int PFIXEDRATEFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        COMPRESSIONCONTROLPLANECOUNT = layout.offsetof(3);
        PFIXEDRATEFLAGS = layout.offsetof(4);
    }

    protected VkImageCompressionControlEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImageCompressionControlEXT create(long address, ByteBuffer container) {
        return new VkImageCompressionControlEXT(address, container);
    }

    public VkImageCompressionControlEXT(ByteBuffer container) {
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

    @NativeType("VkImageCompressionFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int compressionControlPlaneCount() {
        return ncompressionControlPlaneCount(address());
    }

    @NativeType("VkImageCompressionFixedRateFlagsEXT *")
    public IntBuffer pFixedRateFlags() {
        return npFixedRateFlags(address());
    }

    public VkImageCompressionControlEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImageCompressionControlEXT sType$Default() {
        return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT);
    }

    public VkImageCompressionControlEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImageCompressionControlEXT flags(@NativeType("VkImageCompressionFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkImageCompressionControlEXT compressionControlPlaneCount(@NativeType("uint32_t") int value) {
        ncompressionControlPlaneCount(address(), value);
        return this;
    }

    public VkImageCompressionControlEXT pFixedRateFlags(@NativeType("VkImageCompressionFixedRateFlagsEXT *") IntBuffer value) {
        npFixedRateFlags(address(), value);
        return this;
    }

    public VkImageCompressionControlEXT set(int sType, long pNext, int flags, int compressionControlPlaneCount, IntBuffer pFixedRateFlags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        compressionControlPlaneCount(compressionControlPlaneCount);
        pFixedRateFlags(pFixedRateFlags);
        return this;
    }

    public VkImageCompressionControlEXT set(VkImageCompressionControlEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImageCompressionControlEXT malloc() {
        return new VkImageCompressionControlEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImageCompressionControlEXT calloc() {
        return new VkImageCompressionControlEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImageCompressionControlEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCompressionControlEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImageCompressionControlEXT create(long address) {
        return new VkImageCompressionControlEXT(address, null);
    }

    public static VkImageCompressionControlEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImageCompressionControlEXT(address, null);
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

    public static VkImageCompressionControlEXT malloc(MemoryStack stack) {
        return new VkImageCompressionControlEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImageCompressionControlEXT calloc(MemoryStack stack) {
        return new VkImageCompressionControlEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int ncompressionControlPlaneCount(long struct) {
        return MemoryUtil.memGetInt(struct + COMPRESSIONCONTROLPLANECOUNT);
    }

    public static IntBuffer npFixedRateFlags(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PFIXEDRATEFLAGS), ncompressionControlPlaneCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ncompressionControlPlaneCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPRESSIONCONTROLPLANECOUNT, value);
    }

    public static void npFixedRateFlags(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PFIXEDRATEFLAGS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ncompressionControlPlaneCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCompressionControlEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImageCompressionControlEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImageCompressionControlEXT, Buffer> implements NativeResource {
        private static final VkImageCompressionControlEXT ELEMENT_FACTORY = VkImageCompressionControlEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImageCompressionControlEXT.SIZEOF);
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
        public VkImageCompressionControlEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImageCompressionControlEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImageCompressionControlEXT.npNext(address());
        }

        @NativeType("VkImageCompressionFlagsEXT")
        public int flags() {
            return VkImageCompressionControlEXT.nflags(address());
        }

        @NativeType("uint32_t")
        public int compressionControlPlaneCount() {
            return VkImageCompressionControlEXT.ncompressionControlPlaneCount(address());
        }

        @NativeType("VkImageCompressionFixedRateFlagsEXT *")
        public IntBuffer pFixedRateFlags() {
            return VkImageCompressionControlEXT.npFixedRateFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImageCompressionControlEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImageCompressionControlEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkImageCompressionFlagsEXT") int value) {
            VkImageCompressionControlEXT.nflags(address(), value);
            return this;
        }

        public Buffer compressionControlPlaneCount(@NativeType("uint32_t") int value) {
            VkImageCompressionControlEXT.ncompressionControlPlaneCount(address(), value);
            return this;
        }

        public Buffer pFixedRateFlags(@NativeType("VkImageCompressionFixedRateFlagsEXT *") IntBuffer value) {
            VkImageCompressionControlEXT.npFixedRateFlags(address(), value);
            return this;
        }
    }
}
