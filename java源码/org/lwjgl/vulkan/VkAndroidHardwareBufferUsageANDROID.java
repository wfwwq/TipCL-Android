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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferUsageANDROID.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferUsageANDROID.class */
public class VkAndroidHardwareBufferUsageANDROID extends Struct<VkAndroidHardwareBufferUsageANDROID> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ANDROIDHARDWAREBUFFERUSAGE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ANDROIDHARDWAREBUFFERUSAGE = layout.offsetof(2);
    }

    protected VkAndroidHardwareBufferUsageANDROID(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAndroidHardwareBufferUsageANDROID create(long address, ByteBuffer container) {
        return new VkAndroidHardwareBufferUsageANDROID(address, container);
    }

    public VkAndroidHardwareBufferUsageANDROID(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long androidHardwareBufferUsage() {
        return nandroidHardwareBufferUsage(address());
    }

    public VkAndroidHardwareBufferUsageANDROID sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAndroidHardwareBufferUsageANDROID sType$Default() {
        return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID);
    }

    public VkAndroidHardwareBufferUsageANDROID pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAndroidHardwareBufferUsageANDROID set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkAndroidHardwareBufferUsageANDROID set(VkAndroidHardwareBufferUsageANDROID src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAndroidHardwareBufferUsageANDROID malloc() {
        return new VkAndroidHardwareBufferUsageANDROID(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAndroidHardwareBufferUsageANDROID calloc() {
        return new VkAndroidHardwareBufferUsageANDROID(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAndroidHardwareBufferUsageANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAndroidHardwareBufferUsageANDROID(MemoryUtil.memAddress(container), container);
    }

    public static VkAndroidHardwareBufferUsageANDROID create(long address) {
        return new VkAndroidHardwareBufferUsageANDROID(address, null);
    }

    public static VkAndroidHardwareBufferUsageANDROID createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAndroidHardwareBufferUsageANDROID(address, null);
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

    public static VkAndroidHardwareBufferUsageANDROID malloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferUsageANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAndroidHardwareBufferUsageANDROID calloc(MemoryStack stack) {
        return new VkAndroidHardwareBufferUsageANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nandroidHardwareBufferUsage(long struct) {
        return MemoryUtil.memGetLong(struct + ANDROIDHARDWAREBUFFERUSAGE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferUsageANDROID$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAndroidHardwareBufferUsageANDROID$Buffer.class */
    public static class Buffer extends StructBuffer<VkAndroidHardwareBufferUsageANDROID, Buffer> implements NativeResource {
        private static final VkAndroidHardwareBufferUsageANDROID ELEMENT_FACTORY = VkAndroidHardwareBufferUsageANDROID.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAndroidHardwareBufferUsageANDROID.SIZEOF);
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
        public VkAndroidHardwareBufferUsageANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAndroidHardwareBufferUsageANDROID.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkAndroidHardwareBufferUsageANDROID.npNext(address());
        }

        @NativeType("uint64_t")
        public long androidHardwareBufferUsage() {
            return VkAndroidHardwareBufferUsageANDROID.nandroidHardwareBufferUsage(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAndroidHardwareBufferUsageANDROID.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkAndroidHardwareBufferUsageANDROID.npNext(address(), value);
            return this;
        }
    }
}
