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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSharedPresentSurfaceCapabilitiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSharedPresentSurfaceCapabilitiesKHR.class */
public class VkSharedPresentSurfaceCapabilitiesKHR extends Struct<VkSharedPresentSurfaceCapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHAREDPRESENTSUPPORTEDUSAGEFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHAREDPRESENTSUPPORTEDUSAGEFLAGS = layout.offsetof(2);
    }

    protected VkSharedPresentSurfaceCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSharedPresentSurfaceCapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkSharedPresentSurfaceCapabilitiesKHR(address, container);
    }

    public VkSharedPresentSurfaceCapabilitiesKHR(ByteBuffer container) {
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

    @NativeType("VkImageUsageFlags")
    public int sharedPresentSupportedUsageFlags() {
        return nsharedPresentSupportedUsageFlags(address());
    }

    public VkSharedPresentSurfaceCapabilitiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSharedPresentSurfaceCapabilitiesKHR sType$Default() {
        return sType(1000111000);
    }

    public VkSharedPresentSurfaceCapabilitiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSharedPresentSurfaceCapabilitiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSharedPresentSurfaceCapabilitiesKHR set(VkSharedPresentSurfaceCapabilitiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSharedPresentSurfaceCapabilitiesKHR malloc() {
        return new VkSharedPresentSurfaceCapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSharedPresentSurfaceCapabilitiesKHR calloc() {
        return new VkSharedPresentSurfaceCapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSharedPresentSurfaceCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSharedPresentSurfaceCapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSharedPresentSurfaceCapabilitiesKHR create(long address) {
        return new VkSharedPresentSurfaceCapabilitiesKHR(address, null);
    }

    public static VkSharedPresentSurfaceCapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSharedPresentSurfaceCapabilitiesKHR(address, null);
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

    public static VkSharedPresentSurfaceCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkSharedPresentSurfaceCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSharedPresentSurfaceCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkSharedPresentSurfaceCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsharedPresentSupportedUsageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + SHAREDPRESENTSUPPORTEDUSAGEFLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSharedPresentSurfaceCapabilitiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSharedPresentSurfaceCapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkSharedPresentSurfaceCapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkSharedPresentSurfaceCapabilitiesKHR ELEMENT_FACTORY = VkSharedPresentSurfaceCapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSharedPresentSurfaceCapabilitiesKHR.SIZEOF);
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
        public VkSharedPresentSurfaceCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSharedPresentSurfaceCapabilitiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSharedPresentSurfaceCapabilitiesKHR.npNext(address());
        }

        @NativeType("VkImageUsageFlags")
        public int sharedPresentSupportedUsageFlags() {
            return VkSharedPresentSurfaceCapabilitiesKHR.nsharedPresentSupportedUsageFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSharedPresentSurfaceCapabilitiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000111000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSharedPresentSurfaceCapabilitiesKHR.npNext(address(), value);
            return this;
        }
    }
}
