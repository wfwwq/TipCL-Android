package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionCreateInfoKHR.class */
public class VkVideoSessionCreateInfoKHR extends Struct<VkVideoSessionCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int QUEUEFAMILYINDEX;
    public static final int FLAGS;
    public static final int PVIDEOPROFILE;
    public static final int PICTUREFORMAT;
    public static final int MAXCODEDEXTENT;
    public static final int REFERENCEPICTUREFORMAT;
    public static final int MAXDPBSLOTS;
    public static final int MAXACTIVEREFERENCEPICTURES;
    public static final int PSTDHEADERVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUEFAMILYINDEX = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
        PVIDEOPROFILE = layout.offsetof(4);
        PICTUREFORMAT = layout.offsetof(5);
        MAXCODEDEXTENT = layout.offsetof(6);
        REFERENCEPICTUREFORMAT = layout.offsetof(7);
        MAXDPBSLOTS = layout.offsetof(8);
        MAXACTIVEREFERENCEPICTURES = layout.offsetof(9);
        PSTDHEADERVERSION = layout.offsetof(10);
    }

    protected VkVideoSessionCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoSessionCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoSessionCreateInfoKHR(address, container);
    }

    public VkVideoSessionCreateInfoKHR(ByteBuffer container) {
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
    public int queueFamilyIndex() {
        return nqueueFamilyIndex(address());
    }

    @NativeType("VkVideoSessionCreateFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkVideoProfileInfoKHR const *")
    public VkVideoProfileInfoKHR pVideoProfile() {
        return npVideoProfile(address());
    }

    @NativeType("VkFormat")
    public int pictureFormat() {
        return npictureFormat(address());
    }

    public VkExtent2D maxCodedExtent() {
        return nmaxCodedExtent(address());
    }

    @NativeType("VkFormat")
    public int referencePictureFormat() {
        return nreferencePictureFormat(address());
    }

    @NativeType("uint32_t")
    public int maxDpbSlots() {
        return nmaxDpbSlots(address());
    }

    @NativeType("uint32_t")
    public int maxActiveReferencePictures() {
        return nmaxActiveReferencePictures(address());
    }

    @NativeType("VkExtensionProperties const *")
    public VkExtensionProperties pStdHeaderVersion() {
        return npStdHeaderVersion(address());
    }

    public VkVideoSessionCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR);
    }

    public VkVideoSessionCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeAV1SessionCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeH264SessionCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeH265SessionCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeSessionIntraRefreshCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionCreateInfoKHR pNext(VkVideoEncodeSessionRgbConversionCreateInfoVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkVideoSessionCreateInfoKHR queueFamilyIndex(@NativeType("uint32_t") int value) {
        nqueueFamilyIndex(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR flags(@NativeType("VkVideoSessionCreateFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR pVideoProfile(@NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR value) {
        npVideoProfile(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR pictureFormat(@NativeType("VkFormat") int value) {
        npictureFormat(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR maxCodedExtent(VkExtent2D value) {
        nmaxCodedExtent(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR maxCodedExtent(Consumer<VkExtent2D> consumer) {
        consumer.accept(maxCodedExtent());
        return this;
    }

    public VkVideoSessionCreateInfoKHR referencePictureFormat(@NativeType("VkFormat") int value) {
        nreferencePictureFormat(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR maxDpbSlots(@NativeType("uint32_t") int value) {
        nmaxDpbSlots(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR maxActiveReferencePictures(@NativeType("uint32_t") int value) {
        nmaxActiveReferencePictures(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR pStdHeaderVersion(@NativeType("VkExtensionProperties const *") VkExtensionProperties value) {
        npStdHeaderVersion(address(), value);
        return this;
    }

    public VkVideoSessionCreateInfoKHR set(int sType, long pNext, int queueFamilyIndex, int flags, VkVideoProfileInfoKHR pVideoProfile, int pictureFormat, VkExtent2D maxCodedExtent, int referencePictureFormat, int maxDpbSlots, int maxActiveReferencePictures, VkExtensionProperties pStdHeaderVersion) {
        sType(sType);
        pNext(pNext);
        queueFamilyIndex(queueFamilyIndex);
        flags(flags);
        pVideoProfile(pVideoProfile);
        pictureFormat(pictureFormat);
        maxCodedExtent(maxCodedExtent);
        referencePictureFormat(referencePictureFormat);
        maxDpbSlots(maxDpbSlots);
        maxActiveReferencePictures(maxActiveReferencePictures);
        pStdHeaderVersion(pStdHeaderVersion);
        return this;
    }

    public VkVideoSessionCreateInfoKHR set(VkVideoSessionCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoSessionCreateInfoKHR malloc() {
        return new VkVideoSessionCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoSessionCreateInfoKHR calloc() {
        return new VkVideoSessionCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoSessionCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoSessionCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoSessionCreateInfoKHR create(long address) {
        return new VkVideoSessionCreateInfoKHR(address, null);
    }

    public static VkVideoSessionCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoSessionCreateInfoKHR(address, null);
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

    public static VkVideoSessionCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoSessionCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoSessionCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoSessionCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nqueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEFAMILYINDEX);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static VkVideoProfileInfoKHR npVideoProfile(long struct) {
        return VkVideoProfileInfoKHR.create(MemoryUtil.memGetAddress(struct + PVIDEOPROFILE));
    }

    public static int npictureFormat(long struct) {
        return MemoryUtil.memGetInt(struct + PICTUREFORMAT);
    }

    public static VkExtent2D nmaxCodedExtent(long struct) {
        return VkExtent2D.create(struct + MAXCODEDEXTENT);
    }

    public static int nreferencePictureFormat(long struct) {
        return MemoryUtil.memGetInt(struct + REFERENCEPICTUREFORMAT);
    }

    public static int nmaxDpbSlots(long struct) {
        return MemoryUtil.memGetInt(struct + MAXDPBSLOTS);
    }

    public static int nmaxActiveReferencePictures(long struct) {
        return MemoryUtil.memGetInt(struct + MAXACTIVEREFERENCEPICTURES);
    }

    public static VkExtensionProperties npStdHeaderVersion(long struct) {
        return VkExtensionProperties.create(MemoryUtil.memGetAddress(struct + PSTDHEADERVERSION));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nqueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUEFAMILYINDEX, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void npVideoProfile(long struct, VkVideoProfileInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PVIDEOPROFILE, value.address());
    }

    public static void npictureFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + PICTUREFORMAT, value);
    }

    public static void nmaxCodedExtent(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + MAXCODEDEXTENT, VkExtent2D.SIZEOF);
    }

    public static void nreferencePictureFormat(long struct, int value) {
        MemoryUtil.memPutInt(struct + REFERENCEPICTUREFORMAT, value);
    }

    public static void nmaxDpbSlots(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXDPBSLOTS, value);
    }

    public static void nmaxActiveReferencePictures(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXACTIVEREFERENCEPICTURES, value);
    }

    public static void npStdHeaderVersion(long struct, VkExtensionProperties value) {
        MemoryUtil.memPutAddress(struct + PSTDHEADERVERSION, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PVIDEOPROFILE));
        Checks.check(MemoryUtil.memGetAddress(struct + PSTDHEADERVERSION));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoSessionCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoSessionCreateInfoKHR ELEMENT_FACTORY = VkVideoSessionCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoSessionCreateInfoKHR.SIZEOF);
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
        public VkVideoSessionCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoSessionCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoSessionCreateInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndex() {
            return VkVideoSessionCreateInfoKHR.nqueueFamilyIndex(address());
        }

        @NativeType("VkVideoSessionCreateFlagsKHR")
        public int flags() {
            return VkVideoSessionCreateInfoKHR.nflags(address());
        }

        @NativeType("VkVideoProfileInfoKHR const *")
        public VkVideoProfileInfoKHR pVideoProfile() {
            return VkVideoSessionCreateInfoKHR.npVideoProfile(address());
        }

        @NativeType("VkFormat")
        public int pictureFormat() {
            return VkVideoSessionCreateInfoKHR.npictureFormat(address());
        }

        public VkExtent2D maxCodedExtent() {
            return VkVideoSessionCreateInfoKHR.nmaxCodedExtent(address());
        }

        @NativeType("VkFormat")
        public int referencePictureFormat() {
            return VkVideoSessionCreateInfoKHR.nreferencePictureFormat(address());
        }

        @NativeType("uint32_t")
        public int maxDpbSlots() {
            return VkVideoSessionCreateInfoKHR.nmaxDpbSlots(address());
        }

        @NativeType("uint32_t")
        public int maxActiveReferencePictures() {
            return VkVideoSessionCreateInfoKHR.nmaxActiveReferencePictures(address());
        }

        @NativeType("VkExtensionProperties const *")
        public VkExtensionProperties pStdHeaderVersion() {
            return VkVideoSessionCreateInfoKHR.npStdHeaderVersion(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoSessionCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoSessionCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkVideoEncodeAV1SessionCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH264SessionCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeH265SessionCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeSessionIntraRefreshCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkVideoEncodeSessionRgbConversionCreateInfoVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer queueFamilyIndex(@NativeType("uint32_t") int value) {
            VkVideoSessionCreateInfoKHR.nqueueFamilyIndex(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkVideoSessionCreateFlagsKHR") int value) {
            VkVideoSessionCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer pVideoProfile(@NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR value) {
            VkVideoSessionCreateInfoKHR.npVideoProfile(address(), value);
            return this;
        }

        public Buffer pictureFormat(@NativeType("VkFormat") int value) {
            VkVideoSessionCreateInfoKHR.npictureFormat(address(), value);
            return this;
        }

        public Buffer maxCodedExtent(VkExtent2D value) {
            VkVideoSessionCreateInfoKHR.nmaxCodedExtent(address(), value);
            return this;
        }

        public Buffer maxCodedExtent(Consumer<VkExtent2D> consumer) {
            consumer.accept(maxCodedExtent());
            return this;
        }

        public Buffer referencePictureFormat(@NativeType("VkFormat") int value) {
            VkVideoSessionCreateInfoKHR.nreferencePictureFormat(address(), value);
            return this;
        }

        public Buffer maxDpbSlots(@NativeType("uint32_t") int value) {
            VkVideoSessionCreateInfoKHR.nmaxDpbSlots(address(), value);
            return this;
        }

        public Buffer maxActiveReferencePictures(@NativeType("uint32_t") int value) {
            VkVideoSessionCreateInfoKHR.nmaxActiveReferencePictures(address(), value);
            return this;
        }

        public Buffer pStdHeaderVersion(@NativeType("VkExtensionProperties const *") VkExtensionProperties value) {
            VkVideoSessionCreateInfoKHR.npStdHeaderVersion(address(), value);
            return this;
        }
    }
}
