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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferPropertiesANDROID.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferPropertiesANDROID.class */
public class VkAndroidHardwareBufferPropertiesANDROID extends Struct<VkAndroidHardwareBufferPropertiesANDROID> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ALLOCATIONSIZE;
    public static final int MEMORYTYPEBITS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ALLOCATIONSIZE = layout.offsetof(2);
        MEMORYTYPEBITS = layout.offsetof(3);
    }

    protected VkAndroidHardwareBufferPropertiesANDROID(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAndroidHardwareBufferPropertiesANDROID create(long address, ByteBuffer container) {
        return new VkAndroidHardwareBufferPropertiesANDROID(address, container);
    }

    public VkAndroidHardwareBufferPropertiesANDROID(ByteBuffer container) {
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

    @NativeType("VkDeviceSize")
    public long allocationSize() {
        return nallocationSize(address());
    }

    @NativeType("uint32_t")
    public int memoryTypeBits() {
        return nmemoryTypeBits(address());
    }

    public VkAndroidHardwareBufferPropertiesANDROID sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAndroidHardwareBufferPropertiesANDROID sType$Default() {
        return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID);
    }

    public VkAndroidHardwareBufferPropertiesANDROID pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAndroidHardwareBufferPropertiesANDROID pNext(VkAndroidHardwareBufferFormatProperties2ANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAndroidHardwareBufferPropertiesANDROID pNext(VkAndroidHardwareBufferFormatPropertiesANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAndroidHardwareBufferPropertiesANDROID pNext(VkAndroidHardwareBufferFormatResolvePropertiesANDROID value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAndroidHardwareBufferPropertiesANDROID set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkAndroidHardwareBufferPropertiesANDROID set(VkAndroidHardwareBufferPropertiesANDROID src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAndroidHardwareBufferPropertiesANDROID malloc() {
        return new VkAndroidHardwareBufferPropertiesANDROID(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAndroidHardwareBufferPropertiesANDROID calloc() {
        return new VkAndroidHardwareBufferPropertiesANDROID(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAndroidHardwareBufferPropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAndroidHardwareBufferPropertiesANDROID(MemoryUtil.memAddress(container), container);
    }

    public static VkAndroidHardwareBufferPropertiesANDROID create(long address) {
        return new VkAndroidHardwareBufferPropertiesANDROID(address, null);
    }

    public static VkAndroidHardwareBufferPropertiesANDROID createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAndroidHardwareBufferPropertiesANDROID(address, null);
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

    public static VkAndroidHardwareBufferPropertiesANDROID malloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferPropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAndroidHardwareBufferPropertiesANDROID calloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferPropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nallocationSize(long struct) {
        return MemoryUtil.memGetLong(struct + ALLOCATIONSIZE);
    }

    public static int nmemoryTypeBits(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYTYPEBITS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferPropertiesANDROID$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferPropertiesANDROID$Buffer.class */
    public static class Buffer extends StructBuffer<VkAndroidHardwareBufferPropertiesANDROID, Buffer> implements NativeResource {
        private static final VkAndroidHardwareBufferPropertiesANDROID ELEMENT_FACTORY = VkAndroidHardwareBufferPropertiesANDROID.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAndroidHardwareBufferPropertiesANDROID.SIZEOF);
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
        public VkAndroidHardwareBufferPropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAndroidHardwareBufferPropertiesANDROID.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkAndroidHardwareBufferPropertiesANDROID.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long allocationSize() {
            return VkAndroidHardwareBufferPropertiesANDROID.nallocationSize(address());
        }

        @NativeType("uint32_t")
        public int memoryTypeBits() {
            return VkAndroidHardwareBufferPropertiesANDROID.nmemoryTypeBits(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAndroidHardwareBufferPropertiesANDROID.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkAndroidHardwareBufferPropertiesANDROID.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkAndroidHardwareBufferFormatProperties2ANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkAndroidHardwareBufferFormatPropertiesANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkAndroidHardwareBufferFormatResolvePropertiesANDROID value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
