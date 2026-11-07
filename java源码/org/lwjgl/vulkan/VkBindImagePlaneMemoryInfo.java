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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImagePlaneMemoryInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImagePlaneMemoryInfo.class */
public class VkBindImagePlaneMemoryInfo extends Struct<VkBindImagePlaneMemoryInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PLANEASPECT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PLANEASPECT = layout.offsetof(2);
    }

    protected VkBindImagePlaneMemoryInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBindImagePlaneMemoryInfo create(long address, ByteBuffer container) {
        return new VkBindImagePlaneMemoryInfo(address, container);
    }

    public VkBindImagePlaneMemoryInfo(ByteBuffer container) {
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

    @NativeType("VkImageAspectFlagBits")
    public int planeAspect() {
        return nplaneAspect(address());
    }

    public VkBindImagePlaneMemoryInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBindImagePlaneMemoryInfo sType$Default() {
        return sType(1000156002);
    }

    public VkBindImagePlaneMemoryInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBindImagePlaneMemoryInfo planeAspect(@NativeType("VkImageAspectFlagBits") int value) {
        nplaneAspect(address(), value);
        return this;
    }

    public VkBindImagePlaneMemoryInfo set(int sType, long pNext, int planeAspect) {
        sType(sType);
        pNext(pNext);
        planeAspect(planeAspect);
        return this;
    }

    public VkBindImagePlaneMemoryInfo set(VkBindImagePlaneMemoryInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBindImagePlaneMemoryInfo malloc() {
        return new VkBindImagePlaneMemoryInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBindImagePlaneMemoryInfo calloc() {
        return new VkBindImagePlaneMemoryInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBindImagePlaneMemoryInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindImagePlaneMemoryInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkBindImagePlaneMemoryInfo create(long address) {
        return new VkBindImagePlaneMemoryInfo(address, null);
    }

    public static VkBindImagePlaneMemoryInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBindImagePlaneMemoryInfo(address, null);
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

    public static VkBindImagePlaneMemoryInfo malloc(MemoryStack stack) {
        return new VkBindImagePlaneMemoryInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBindImagePlaneMemoryInfo calloc(MemoryStack stack) {
        return new VkBindImagePlaneMemoryInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nplaneAspect(long struct) {
        return MemoryUtil.memGetInt(struct + PLANEASPECT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nplaneAspect(long struct, int value) {
        MemoryUtil.memPutInt(struct + PLANEASPECT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImagePlaneMemoryInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBindImagePlaneMemoryInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkBindImagePlaneMemoryInfo, Buffer> implements NativeResource {
        private static final VkBindImagePlaneMemoryInfo ELEMENT_FACTORY = VkBindImagePlaneMemoryInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBindImagePlaneMemoryInfo.SIZEOF);
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
        public VkBindImagePlaneMemoryInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBindImagePlaneMemoryInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBindImagePlaneMemoryInfo.npNext(address());
        }

        @NativeType("VkImageAspectFlagBits")
        public int planeAspect() {
            return VkBindImagePlaneMemoryInfo.nplaneAspect(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBindImagePlaneMemoryInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000156002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBindImagePlaneMemoryInfo.npNext(address(), value);
            return this;
        }

        public Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) {
            VkBindImagePlaneMemoryInfo.nplaneAspect(address(), value);
            return this;
        }
    }
}
