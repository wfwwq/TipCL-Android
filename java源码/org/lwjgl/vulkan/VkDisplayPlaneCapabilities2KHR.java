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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilities2KHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilities2KHR.class */
public class VkDisplayPlaneCapabilities2KHR extends Struct<VkDisplayPlaneCapabilities2KHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CAPABILITIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkDisplayPlaneCapabilitiesKHR.SIZEOF, VkDisplayPlaneCapabilitiesKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CAPABILITIES = layout.offsetof(2);
    }

    protected VkDisplayPlaneCapabilities2KHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayPlaneCapabilities2KHR create(long address, ByteBuffer container) {
        return new VkDisplayPlaneCapabilities2KHR(address, container);
    }

    public VkDisplayPlaneCapabilities2KHR(ByteBuffer container) {
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

    public VkDisplayPlaneCapabilitiesKHR capabilities() {
        return ncapabilities(address());
    }

    public VkDisplayPlaneCapabilities2KHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDisplayPlaneCapabilities2KHR sType$Default() {
        return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR);
    }

    public VkDisplayPlaneCapabilities2KHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDisplayPlaneCapabilities2KHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkDisplayPlaneCapabilities2KHR set(VkDisplayPlaneCapabilities2KHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDisplayPlaneCapabilities2KHR malloc() {
        return new VkDisplayPlaneCapabilities2KHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayPlaneCapabilities2KHR calloc() {
        return new VkDisplayPlaneCapabilities2KHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayPlaneCapabilities2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPlaneCapabilities2KHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayPlaneCapabilities2KHR create(long address) {
        return new VkDisplayPlaneCapabilities2KHR(address, null);
    }

    public static VkDisplayPlaneCapabilities2KHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayPlaneCapabilities2KHR(address, null);
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

    public static VkDisplayPlaneCapabilities2KHR malloc(MemoryStack stack) {
        return new VkDisplayPlaneCapabilities2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayPlaneCapabilities2KHR calloc(MemoryStack stack) {
        return new VkDisplayPlaneCapabilities2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkDisplayPlaneCapabilitiesKHR ncapabilities(long struct) {
        return VkDisplayPlaneCapabilitiesKHR.create(struct + CAPABILITIES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilities2KHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilities2KHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayPlaneCapabilities2KHR, Buffer> implements NativeResource {
        private static final VkDisplayPlaneCapabilities2KHR ELEMENT_FACTORY = VkDisplayPlaneCapabilities2KHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayPlaneCapabilities2KHR.SIZEOF);
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
        public VkDisplayPlaneCapabilities2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDisplayPlaneCapabilities2KHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDisplayPlaneCapabilities2KHR.npNext(address());
        }

        public VkDisplayPlaneCapabilitiesKHR capabilities() {
            return VkDisplayPlaneCapabilities2KHR.ncapabilities(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDisplayPlaneCapabilities2KHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRGetDisplayProperties2.VK_STRUCTURE_TYPE_DISPLAY_PLANE_CAPABILITIES_2_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDisplayPlaneCapabilities2KHR.npNext(address(), value);
            return this;
        }
    }
}
