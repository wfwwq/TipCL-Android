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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalFenceInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalFenceInfo.class */
public class VkPhysicalDeviceExternalFenceInfo extends Struct<VkPhysicalDeviceExternalFenceInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HANDLETYPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceExternalFenceInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExternalFenceInfo create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExternalFenceInfo(address, container);
    }

    public VkPhysicalDeviceExternalFenceInfo(ByteBuffer container) {
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

    @NativeType("VkExternalFenceHandleTypeFlagBits")
    public int handleType() {
        return nhandleType(address());
    }

    public VkPhysicalDeviceExternalFenceInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalFenceInfo sType$Default() {
        return sType(1000112000);
    }

    public VkPhysicalDeviceExternalFenceInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalFenceInfo handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) {
        nhandleType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalFenceInfo set(int sType, long pNext, int handleType) {
        sType(sType);
        pNext(pNext);
        handleType(handleType);
        return this;
    }

    public VkPhysicalDeviceExternalFenceInfo set(VkPhysicalDeviceExternalFenceInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExternalFenceInfo malloc() {
        return new VkPhysicalDeviceExternalFenceInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalFenceInfo calloc() {
        return new VkPhysicalDeviceExternalFenceInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalFenceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalFenceInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExternalFenceInfo create(long address) {
        return new VkPhysicalDeviceExternalFenceInfo(address, null);
    }

    public static VkPhysicalDeviceExternalFenceInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExternalFenceInfo(address, null);
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

    public static VkPhysicalDeviceExternalFenceInfo malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalFenceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalFenceInfo calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalFenceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nhandleType(long struct) {
        return MemoryUtil.memGetInt(struct + HANDLETYPE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nhandleType(long struct, int value) {
        MemoryUtil.memPutInt(struct + HANDLETYPE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalFenceInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalFenceInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalFenceInfo, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExternalFenceInfo ELEMENT_FACTORY = VkPhysicalDeviceExternalFenceInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExternalFenceInfo.SIZEOF);
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
        public VkPhysicalDeviceExternalFenceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExternalFenceInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPhysicalDeviceExternalFenceInfo.npNext(address());
        }

        @NativeType("VkExternalFenceHandleTypeFlagBits")
        public int handleType() {
            return VkPhysicalDeviceExternalFenceInfo.nhandleType(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExternalFenceInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000112000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceExternalFenceInfo.npNext(address(), value);
            return this;
        }

        public Buffer handleType(@NativeType("VkExternalFenceHandleTypeFlagBits") int value) {
            VkPhysicalDeviceExternalFenceInfo.nhandleType(address(), value);
            return this;
        }
    }
}
