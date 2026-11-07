package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyProperties.class */
public class VkPhysicalDeviceHostImageCopyProperties extends Struct<VkPhysicalDeviceHostImageCopyProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COPYSRCLAYOUTCOUNT;
    public static final int PCOPYSRCLAYOUTS;
    public static final int COPYDSTLAYOUTCOUNT;
    public static final int PCOPYDSTLAYOUTS;
    public static final int OPTIMALTILINGLAYOUTUUID;
    public static final int IDENTICALMEMORYTYPEREQUIREMENTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __array(1, 16), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COPYSRCLAYOUTCOUNT = layout.offsetof(2);
        PCOPYSRCLAYOUTS = layout.offsetof(3);
        COPYDSTLAYOUTCOUNT = layout.offsetof(4);
        PCOPYDSTLAYOUTS = layout.offsetof(5);
        OPTIMALTILINGLAYOUTUUID = layout.offsetof(6);
        IDENTICALMEMORYTYPEREQUIREMENTS = layout.offsetof(7);
    }

    protected VkPhysicalDeviceHostImageCopyProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceHostImageCopyProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceHostImageCopyProperties(address, container);
    }

    public VkPhysicalDeviceHostImageCopyProperties(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int copySrcLayoutCount() {
        return ncopySrcLayoutCount(address());
    }

    @NativeType("VkImageLayout *")
    public IntBuffer pCopySrcLayouts() {
        return npCopySrcLayouts(address());
    }

    @NativeType("uint32_t")
    public int copyDstLayoutCount() {
        return ncopyDstLayoutCount(address());
    }

    @NativeType("VkImageLayout *")
    public IntBuffer pCopyDstLayouts() {
        return npCopyDstLayouts(address());
    }

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer optimalTilingLayoutUUID() {
        return noptimalTilingLayoutUUID(address());
    }

    @NativeType("uint8_t")
    public byte optimalTilingLayoutUUID(int index) {
        return noptimalTilingLayoutUUID(address(), index);
    }

    @NativeType("VkBool32")
    public boolean identicalMemoryTypeRequirements() {
        return nidenticalMemoryTypeRequirements(address()) != 0;
    }

    public VkPhysicalDeviceHostImageCopyProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyProperties sType$Default() {
        return sType(1000270001);
    }

    public VkPhysicalDeviceHostImageCopyProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyProperties copySrcLayoutCount(@NativeType("uint32_t") int value) {
        ncopySrcLayoutCount(address(), value);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyProperties pCopySrcLayouts(@NativeType("VkImageLayout *") IntBuffer value) {
        npCopySrcLayouts(address(), value);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyProperties copyDstLayoutCount(@NativeType("uint32_t") int value) {
        ncopyDstLayoutCount(address(), value);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyProperties pCopyDstLayouts(@NativeType("VkImageLayout *") IntBuffer value) {
        npCopyDstLayouts(address(), value);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) {
        noptimalTilingLayoutUUID(address(), value);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyProperties optimalTilingLayoutUUID(int index, @NativeType("uint8_t") byte value) {
        noptimalTilingLayoutUUID(address(), index, value);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyProperties identicalMemoryTypeRequirements(@NativeType("VkBool32") boolean value) {
        nidenticalMemoryTypeRequirements(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyProperties set(int sType, long pNext, int copySrcLayoutCount, IntBuffer pCopySrcLayouts, int copyDstLayoutCount, IntBuffer pCopyDstLayouts, ByteBuffer optimalTilingLayoutUUID, boolean identicalMemoryTypeRequirements) {
        sType(sType);
        pNext(pNext);
        copySrcLayoutCount(copySrcLayoutCount);
        pCopySrcLayouts(pCopySrcLayouts);
        copyDstLayoutCount(copyDstLayoutCount);
        pCopyDstLayouts(pCopyDstLayouts);
        optimalTilingLayoutUUID(optimalTilingLayoutUUID);
        identicalMemoryTypeRequirements(identicalMemoryTypeRequirements);
        return this;
    }

    public VkPhysicalDeviceHostImageCopyProperties set(VkPhysicalDeviceHostImageCopyProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceHostImageCopyProperties malloc() {
        return new VkPhysicalDeviceHostImageCopyProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyProperties calloc() {
        return new VkPhysicalDeviceHostImageCopyProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHostImageCopyProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceHostImageCopyProperties create(long address) {
        return new VkPhysicalDeviceHostImageCopyProperties(address, null);
    }

    public static VkPhysicalDeviceHostImageCopyProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceHostImageCopyProperties(address, null);
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

    public static VkPhysicalDeviceHostImageCopyProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceHostImageCopyProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostImageCopyProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncopySrcLayoutCount(long struct) {
        return MemoryUtil.memGetInt(struct + COPYSRCLAYOUTCOUNT);
    }

    public static IntBuffer npCopySrcLayouts(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCOPYSRCLAYOUTS), ncopySrcLayoutCount(struct));
    }

    public static int ncopyDstLayoutCount(long struct) {
        return MemoryUtil.memGetInt(struct + COPYDSTLAYOUTCOUNT);
    }

    public static IntBuffer npCopyDstLayouts(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCOPYDSTLAYOUTS), ncopyDstLayoutCount(struct));
    }

    public static ByteBuffer noptimalTilingLayoutUUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + OPTIMALTILINGLAYOUTUUID, 16);
    }

    public static byte noptimalTilingLayoutUUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + OPTIMALTILINGLAYOUTUUID + (Checks.check(index, 16) * 1));
    }

    public static int nidenticalMemoryTypeRequirements(long struct) {
        return MemoryUtil.memGetInt(struct + IDENTICALMEMORYTYPEREQUIREMENTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncopySrcLayoutCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COPYSRCLAYOUTCOUNT, value);
    }

    public static void npCopySrcLayouts(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOPYSRCLAYOUTS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ncopySrcLayoutCount(struct, value.remaining());
        }
    }

    public static void ncopyDstLayoutCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COPYDSTLAYOUTCOUNT, value);
    }

    public static void npCopyDstLayouts(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOPYDSTLAYOUTS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ncopyDstLayoutCount(struct, value.remaining());
        }
    }

    public static void noptimalTilingLayoutUUID(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 16);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + OPTIMALTILINGLAYOUTUUID, value.remaining() * 1);
    }

    public static void noptimalTilingLayoutUUID(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + OPTIMALTILINGLAYOUTUUID + (Checks.check(index, 16) * 1), value);
    }

    public static void nidenticalMemoryTypeRequirements(long struct, int value) {
        MemoryUtil.memPutInt(struct + IDENTICALMEMORYTYPEREQUIREMENTS, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceHostImageCopyProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceHostImageCopyProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceHostImageCopyProperties ELEMENT_FACTORY = VkPhysicalDeviceHostImageCopyProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceHostImageCopyProperties.SIZEOF);
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
        public VkPhysicalDeviceHostImageCopyProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceHostImageCopyProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceHostImageCopyProperties.npNext(address());
        }

        @NativeType("uint32_t")
        public int copySrcLayoutCount() {
            return VkPhysicalDeviceHostImageCopyProperties.ncopySrcLayoutCount(address());
        }

        @NativeType("VkImageLayout *")
        public IntBuffer pCopySrcLayouts() {
            return VkPhysicalDeviceHostImageCopyProperties.npCopySrcLayouts(address());
        }

        @NativeType("uint32_t")
        public int copyDstLayoutCount() {
            return VkPhysicalDeviceHostImageCopyProperties.ncopyDstLayoutCount(address());
        }

        @NativeType("VkImageLayout *")
        public IntBuffer pCopyDstLayouts() {
            return VkPhysicalDeviceHostImageCopyProperties.npCopyDstLayouts(address());
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer optimalTilingLayoutUUID() {
            return VkPhysicalDeviceHostImageCopyProperties.noptimalTilingLayoutUUID(address());
        }

        @NativeType("uint8_t")
        public byte optimalTilingLayoutUUID(int index) {
            return VkPhysicalDeviceHostImageCopyProperties.noptimalTilingLayoutUUID(address(), index);
        }

        @NativeType("VkBool32")
        public boolean identicalMemoryTypeRequirements() {
            return VkPhysicalDeviceHostImageCopyProperties.nidenticalMemoryTypeRequirements(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceHostImageCopyProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000270001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceHostImageCopyProperties.npNext(address(), value);
            return this;
        }

        public Buffer copySrcLayoutCount(@NativeType("uint32_t") int value) {
            VkPhysicalDeviceHostImageCopyProperties.ncopySrcLayoutCount(address(), value);
            return this;
        }

        public Buffer pCopySrcLayouts(@NativeType("VkImageLayout *") IntBuffer value) {
            VkPhysicalDeviceHostImageCopyProperties.npCopySrcLayouts(address(), value);
            return this;
        }

        public Buffer copyDstLayoutCount(@NativeType("uint32_t") int value) {
            VkPhysicalDeviceHostImageCopyProperties.ncopyDstLayoutCount(address(), value);
            return this;
        }

        public Buffer pCopyDstLayouts(@NativeType("VkImageLayout *") IntBuffer value) {
            VkPhysicalDeviceHostImageCopyProperties.npCopyDstLayouts(address(), value);
            return this;
        }

        public Buffer optimalTilingLayoutUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) {
            VkPhysicalDeviceHostImageCopyProperties.noptimalTilingLayoutUUID(address(), value);
            return this;
        }

        public Buffer optimalTilingLayoutUUID(int index, @NativeType("uint8_t") byte value) {
            VkPhysicalDeviceHostImageCopyProperties.noptimalTilingLayoutUUID(address(), index, value);
            return this;
        }

        public Buffer identicalMemoryTypeRequirements(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceHostImageCopyProperties.nidenticalMemoryTypeRequirements(address(), value ? 1 : 0);
            return this;
        }
    }
}
