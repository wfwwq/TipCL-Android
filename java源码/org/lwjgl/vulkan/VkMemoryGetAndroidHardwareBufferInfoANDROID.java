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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryGetAndroidHardwareBufferInfoANDROID.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryGetAndroidHardwareBufferInfoANDROID.class */
public class VkMemoryGetAndroidHardwareBufferInfoANDROID extends Struct<VkMemoryGetAndroidHardwareBufferInfoANDROID> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORY = layout.offsetof(2);
    }

    protected VkMemoryGetAndroidHardwareBufferInfoANDROID(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryGetAndroidHardwareBufferInfoANDROID create(long address, ByteBuffer container) {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(address, container);
    }

    public VkMemoryGetAndroidHardwareBufferInfoANDROID(ByteBuffer container) {
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

    @NativeType("VkDeviceMemory")
    public long memory() {
        return nmemory(address());
    }

    public VkMemoryGetAndroidHardwareBufferInfoANDROID sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryGetAndroidHardwareBufferInfoANDROID sType$Default() {
        return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID);
    }

    public VkMemoryGetAndroidHardwareBufferInfoANDROID pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryGetAndroidHardwareBufferInfoANDROID memory(@NativeType("VkDeviceMemory") long value) {
        nmemory(address(), value);
        return this;
    }

    public VkMemoryGetAndroidHardwareBufferInfoANDROID set(int sType, long pNext, long memory) {
        sType(sType);
        pNext(pNext);
        memory(memory);
        return this;
    }

    public VkMemoryGetAndroidHardwareBufferInfoANDROID set(VkMemoryGetAndroidHardwareBufferInfoANDROID src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryGetAndroidHardwareBufferInfoANDROID malloc() {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryGetAndroidHardwareBufferInfoANDROID calloc() {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryGetAndroidHardwareBufferInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryGetAndroidHardwareBufferInfoANDROID create(long address) {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(address, null);
    }

    public static VkMemoryGetAndroidHardwareBufferInfoANDROID createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(address, null);
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

    public static VkMemoryGetAndroidHardwareBufferInfoANDROID malloc(MemoryStack stack) {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryGetAndroidHardwareBufferInfoANDROID calloc(MemoryStack stack) {
        return new VkMemoryGetAndroidHardwareBufferInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmemory(long struct) {
        return MemoryUtil.memGetLong(struct + MEMORY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmemory(long struct, long value) {
        MemoryUtil.memPutLong(struct + MEMORY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryGetAndroidHardwareBufferInfoANDROID$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryGetAndroidHardwareBufferInfoANDROID$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryGetAndroidHardwareBufferInfoANDROID, Buffer> implements NativeResource {
        private static final VkMemoryGetAndroidHardwareBufferInfoANDROID ELEMENT_FACTORY = VkMemoryGetAndroidHardwareBufferInfoANDROID.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryGetAndroidHardwareBufferInfoANDROID.SIZEOF);
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
        public VkMemoryGetAndroidHardwareBufferInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryGetAndroidHardwareBufferInfoANDROID.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMemoryGetAndroidHardwareBufferInfoANDROID.npNext(address());
        }

        @NativeType("VkDeviceMemory")
        public long memory() {
            return VkMemoryGetAndroidHardwareBufferInfoANDROID.nmemory(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryGetAndroidHardwareBufferInfoANDROID.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMemoryGetAndroidHardwareBufferInfoANDROID.npNext(address(), value);
            return this;
        }

        public Buffer memory(@NativeType("VkDeviceMemory") long value) {
            VkMemoryGetAndroidHardwareBufferInfoANDROID.nmemory(address(), value);
            return this;
        }
    }
}
