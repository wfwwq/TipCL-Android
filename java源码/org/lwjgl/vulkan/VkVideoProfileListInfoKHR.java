package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkVideoProfileInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoProfileListInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoProfileListInfoKHR.class */
public class VkVideoProfileListInfoKHR extends Struct<VkVideoProfileListInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PROFILECOUNT;
    public static final int PPROFILES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROFILECOUNT = layout.offsetof(2);
        PPROFILES = layout.offsetof(3);
    }

    protected VkVideoProfileListInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoProfileListInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoProfileListInfoKHR(address, container);
    }

    public VkVideoProfileListInfoKHR(ByteBuffer container) {
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
    public int profileCount() {
        return nprofileCount(address());
    }

    @NativeType("VkVideoProfileInfoKHR const *")
    public VkVideoProfileInfoKHR.Buffer pProfiles() {
        return npProfiles(address());
    }

    public VkVideoProfileListInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoProfileListInfoKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR);
    }

    public VkVideoProfileListInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoProfileListInfoKHR pProfiles(@NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR.Buffer value) {
        npProfiles(address(), value);
        return this;
    }

    public VkVideoProfileListInfoKHR set(int sType, long pNext, VkVideoProfileInfoKHR.Buffer pProfiles) {
        sType(sType);
        pNext(pNext);
        pProfiles(pProfiles);
        return this;
    }

    public VkVideoProfileListInfoKHR set(VkVideoProfileListInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoProfileListInfoKHR malloc() {
        return new VkVideoProfileListInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoProfileListInfoKHR calloc() {
        return new VkVideoProfileListInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoProfileListInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoProfileListInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoProfileListInfoKHR create(long address) {
        return new VkVideoProfileListInfoKHR(address, null);
    }

    public static VkVideoProfileListInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoProfileListInfoKHR(address, null);
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

    public static VkVideoProfileListInfoKHR malloc(MemoryStack stack) {
        return new VkVideoProfileListInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoProfileListInfoKHR calloc(MemoryStack stack) {
        return new VkVideoProfileListInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nprofileCount(long struct) {
        return MemoryUtil.memGetInt(struct + PROFILECOUNT);
    }

    public static VkVideoProfileInfoKHR.Buffer npProfiles(long struct) {
        return VkVideoProfileInfoKHR.createSafe(MemoryUtil.memGetAddress(struct + PPROFILES), nprofileCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nprofileCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROFILECOUNT, value);
    }

    public static void npProfiles(long struct, VkVideoProfileInfoKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPROFILES, MemoryUtil.memAddressSafe(value));
        nprofileCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nprofileCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPROFILES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoProfileListInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoProfileListInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoProfileListInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoProfileListInfoKHR ELEMENT_FACTORY = VkVideoProfileListInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoProfileListInfoKHR.SIZEOF);
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
        public VkVideoProfileListInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoProfileListInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkVideoProfileListInfoKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int profileCount() {
            return VkVideoProfileListInfoKHR.nprofileCount(address());
        }

        @NativeType("VkVideoProfileInfoKHR const *")
        public VkVideoProfileInfoKHR.Buffer pProfiles() {
            return VkVideoProfileListInfoKHR.npProfiles(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoProfileListInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_PROFILE_LIST_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkVideoProfileListInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pProfiles(@NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR.Buffer value) {
            VkVideoProfileListInfoKHR.npProfiles(address(), value);
            return this;
        }
    }
}
