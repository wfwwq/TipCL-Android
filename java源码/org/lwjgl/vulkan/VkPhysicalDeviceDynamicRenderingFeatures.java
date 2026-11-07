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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingFeatures.class */
public class VkPhysicalDeviceDynamicRenderingFeatures extends Struct<VkPhysicalDeviceDynamicRenderingFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DYNAMICRENDERING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DYNAMICRENDERING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDynamicRenderingFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDynamicRenderingFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDynamicRenderingFeatures(address, container);
    }

    public VkPhysicalDeviceDynamicRenderingFeatures(ByteBuffer container) {
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
    public boolean dynamicRendering() {
        return ndynamicRendering(address()) != 0;
    }

    public VkPhysicalDeviceDynamicRenderingFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDynamicRenderingFeatures sType$Default() {
        return sType(1000044003);
    }

    public VkPhysicalDeviceDynamicRenderingFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDynamicRenderingFeatures dynamicRendering(@NativeType("VkBool32") boolean value) {
        ndynamicRendering(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDynamicRenderingFeatures set(int sType, long pNext, boolean dynamicRendering) {
        sType(sType);
        pNext(pNext);
        dynamicRendering(dynamicRendering);
        return this;
    }

    public VkPhysicalDeviceDynamicRenderingFeatures set(VkPhysicalDeviceDynamicRenderingFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDynamicRenderingFeatures malloc() {
        return new VkPhysicalDeviceDynamicRenderingFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDynamicRenderingFeatures calloc() {
        return new VkPhysicalDeviceDynamicRenderingFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDynamicRenderingFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDynamicRenderingFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDynamicRenderingFeatures create(long address) {
        return new VkPhysicalDeviceDynamicRenderingFeatures(address, null);
    }

    public static VkPhysicalDeviceDynamicRenderingFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDynamicRenderingFeatures(address, null);
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

    public static VkPhysicalDeviceDynamicRenderingFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDynamicRenderingFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDynamicRenderingFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndynamicRendering(long struct) {
        return MemoryUtil.memGetInt(struct + DYNAMICRENDERING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndynamicRendering(long struct, int value) {
        MemoryUtil.memPutInt(struct + DYNAMICRENDERING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDynamicRenderingFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDynamicRenderingFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDynamicRenderingFeatures ELEMENT_FACTORY = VkPhysicalDeviceDynamicRenderingFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDynamicRenderingFeatures.SIZEOF);
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
        public VkPhysicalDeviceDynamicRenderingFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDynamicRenderingFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDynamicRenderingFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean dynamicRendering() {
            return VkPhysicalDeviceDynamicRenderingFeatures.ndynamicRendering(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDynamicRenderingFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000044003);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDynamicRenderingFeatures.npNext(address(), value);
            return this;
        }

        public Buffer dynamicRendering(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDynamicRenderingFeatures.ndynamicRendering(address(), value ? 1 : 0);
            return this;
        }
    }
}
