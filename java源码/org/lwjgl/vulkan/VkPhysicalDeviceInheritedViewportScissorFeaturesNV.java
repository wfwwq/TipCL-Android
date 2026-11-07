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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceInheritedViewportScissorFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceInheritedViewportScissorFeaturesNV.class */
public class VkPhysicalDeviceInheritedViewportScissorFeaturesNV extends Struct<VkPhysicalDeviceInheritedViewportScissorFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int INHERITEDVIEWPORTSCISSOR2D;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INHERITEDVIEWPORTSCISSOR2D = layout.offsetof(2);
    }

    protected VkPhysicalDeviceInheritedViewportScissorFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(address, container);
    }

    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV(ByteBuffer container) {
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
    public boolean inheritedViewportScissor2D() {
        return ninheritedViewportScissor2D(address()) != 0;
    }

    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV sType$Default() {
        return sType(NVInheritedViewportScissor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV);
    }

    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV inheritedViewportScissor2D(@NativeType("VkBool32") boolean value) {
        ninheritedViewportScissor2D(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV set(int sType, long pNext, boolean inheritedViewportScissor2D) {
        sType(sType);
        pNext(pNext);
        inheritedViewportScissor2D(inheritedViewportScissor2D);
        return this;
    }

    public VkPhysicalDeviceInheritedViewportScissorFeaturesNV set(VkPhysicalDeviceInheritedViewportScissorFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV malloc() {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV calloc() {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV create(long address) {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(address, null);
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

    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceInheritedViewportScissorFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceInheritedViewportScissorFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ninheritedViewportScissor2D(long struct) {
        return MemoryUtil.memGetInt(struct + INHERITEDVIEWPORTSCISSOR2D);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ninheritedViewportScissor2D(long struct, int value) {
        MemoryUtil.memPutInt(struct + INHERITEDVIEWPORTSCISSOR2D, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceInheritedViewportScissorFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceInheritedViewportScissorFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceInheritedViewportScissorFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceInheritedViewportScissorFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceInheritedViewportScissorFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceInheritedViewportScissorFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceInheritedViewportScissorFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceInheritedViewportScissorFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceInheritedViewportScissorFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean inheritedViewportScissor2D() {
            return VkPhysicalDeviceInheritedViewportScissorFeaturesNV.ninheritedViewportScissor2D(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceInheritedViewportScissorFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVInheritedViewportScissor.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceInheritedViewportScissorFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer inheritedViewportScissor2D(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceInheritedViewportScissorFeaturesNV.ninheritedViewportScissor2D(address(), value ? 1 : 0);
            return this;
        }
    }
}
