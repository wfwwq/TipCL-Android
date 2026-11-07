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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphoreFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphoreFeatures.class */
public class VkPhysicalDeviceTimelineSemaphoreFeatures extends Struct<VkPhysicalDeviceTimelineSemaphoreFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TIMELINESEMAPHORE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TIMELINESEMAPHORE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceTimelineSemaphoreFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceTimelineSemaphoreFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTimelineSemaphoreFeatures(address, container);
    }

    public VkPhysicalDeviceTimelineSemaphoreFeatures(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean timelineSemaphore() {
        return ntimelineSemaphore(address()) != 0;
    }

    public VkPhysicalDeviceTimelineSemaphoreFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceTimelineSemaphoreFeatures sType$Default() {
        return sType(1000207000);
    }

    public VkPhysicalDeviceTimelineSemaphoreFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceTimelineSemaphoreFeatures timelineSemaphore(@NativeType("VkBool32") boolean value) {
        ntimelineSemaphore(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTimelineSemaphoreFeatures set(int sType, long pNext, boolean timelineSemaphore) {
        sType(sType);
        pNext(pNext);
        timelineSemaphore(timelineSemaphore);
        return this;
    }

    public VkPhysicalDeviceTimelineSemaphoreFeatures set(VkPhysicalDeviceTimelineSemaphoreFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeatures malloc() {
        return new VkPhysicalDeviceTimelineSemaphoreFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeatures calloc() {
        return new VkPhysicalDeviceTimelineSemaphoreFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTimelineSemaphoreFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeatures create(long address) {
        return new VkPhysicalDeviceTimelineSemaphoreFeatures(address, null);
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTimelineSemaphoreFeatures(address, null);
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

    public static VkPhysicalDeviceTimelineSemaphoreFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTimelineSemaphoreFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTimelineSemaphoreFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTimelineSemaphoreFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntimelineSemaphore(long struct) {
        return MemoryUtil.memGetInt(struct + TIMELINESEMAPHORE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntimelineSemaphore(long struct, int value) {
        MemoryUtil.memPutInt(struct + TIMELINESEMAPHORE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphoreFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTimelineSemaphoreFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTimelineSemaphoreFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceTimelineSemaphoreFeatures ELEMENT_FACTORY = VkPhysicalDeviceTimelineSemaphoreFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceTimelineSemaphoreFeatures.SIZEOF);
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
        public VkPhysicalDeviceTimelineSemaphoreFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceTimelineSemaphoreFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceTimelineSemaphoreFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean timelineSemaphore() {
            return VkPhysicalDeviceTimelineSemaphoreFeatures.ntimelineSemaphore(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTimelineSemaphoreFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000207000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTimelineSemaphoreFeatures.npNext(address(), value);
            return this;
        }

        public Buffer timelineSemaphore(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTimelineSemaphoreFeatures.ntimelineSemaphore(address(), value ? 1 : 0);
            return this;
        }
    }
}
