package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneInfo2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneInfo2KHR.class */
public class VkDisplayPlaneInfo2KHR extends Struct<VkDisplayPlaneInfo2KHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MODE;
    public static final int PLANEINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODE = layout.offsetof(2);
        PLANEINDEX = layout.offsetof(3);
    }

    protected VkDisplayPlaneInfo2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayPlaneInfo2KHR create(long address, ByteBuffer container) {
        return new VkDisplayPlaneInfo2KHR(address, container);
    }

    public VkDisplayPlaneInfo2KHR(ByteBuffer container) {
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

    @NativeType("VkDisplayModeKHR")
    public long mode() {
        return nmode(address());
    }

    @NativeType("uint32_t")
    public int planeIndex() {
        return nplaneIndex(address());
    }

    public VkDisplayPlaneInfo2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDisplayPlaneInfo2KHR sType$Default() {
        return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR);
    }

    public VkDisplayPlaneInfo2KHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDisplayPlaneInfo2KHR mode(@NativeType("VkDisplayModeKHR") long value) {
        nmode(address(), value);
        return this;
    }

    public VkDisplayPlaneInfo2KHR planeIndex(@NativeType("uint32_t") int value) {
        nplaneIndex(address(), value);
        return this;
    }

    public VkDisplayPlaneInfo2KHR set(int sType, long pNext, long mode, int planeIndex) {
        sType(sType);
        pNext(pNext);
        mode(mode);
        planeIndex(planeIndex);
        return this;
    }

    public VkDisplayPlaneInfo2KHR set(VkDisplayPlaneInfo2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDisplayPlaneInfo2KHR malloc() {
        return new VkDisplayPlaneInfo2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayPlaneInfo2KHR calloc() {
        return new VkDisplayPlaneInfo2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayPlaneInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPlaneInfo2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayPlaneInfo2KHR create(long address) {
        return new VkDisplayPlaneInfo2KHR(address, null);
    }

    public static VkDisplayPlaneInfo2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayPlaneInfo2KHR(address, null);
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

    public static VkDisplayPlaneInfo2KHR malloc(MemoryStack stack) {
        return new VkDisplayPlaneInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayPlaneInfo2KHR calloc(MemoryStack stack) {
        return new VkDisplayPlaneInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmode(long struct) {
        return MemoryUtil.memGetLong(struct + MODE);
    }

    public static int nplaneIndex(long struct) {
        return MemoryUtil.memGetInt(struct + PLANEINDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmode(long struct, long value) {
        MemoryUtil.memPutLong(struct + MODE, value);
    }

    public static void nplaneIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + PLANEINDEX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneInfo2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneInfo2KHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayPlaneInfo2KHR, Buffer> implements NativeResource {
        private static final VkDisplayPlaneInfo2KHR ELEMENT_FACTORY = VkDisplayPlaneInfo2KHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayPlaneInfo2KHR.SIZEOF);
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
        public VkDisplayPlaneInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDisplayPlaneInfo2KHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDisplayPlaneInfo2KHR.npNext(address());
        }

        @NativeType("VkDisplayModeKHR")
        public long mode() {
            return VkDisplayPlaneInfo2KHR.nmode(address());
        }

        @NativeType("uint32_t")
        public int planeIndex() {
            return VkDisplayPlaneInfo2KHR.nplaneIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDisplayPlaneInfo2KHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_INFO_2_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDisplayPlaneInfo2KHR.npNext(address(), value);
            return this;
        }

        public Buffer mode(@NativeType("VkDisplayModeKHR") long value) {
            VkDisplayPlaneInfo2KHR.nmode(address(), value);
            return this;
        }

        public Buffer planeIndex(@NativeType("uint32_t") int value) {
            VkDisplayPlaneInfo2KHR.nplaneIndex(address(), value);
            return this;
        }
    }
}
