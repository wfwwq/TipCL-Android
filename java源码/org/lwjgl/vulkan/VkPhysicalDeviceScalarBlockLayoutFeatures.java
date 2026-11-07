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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceScalarBlockLayoutFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceScalarBlockLayoutFeatures.class */
public class VkPhysicalDeviceScalarBlockLayoutFeatures extends Struct<VkPhysicalDeviceScalarBlockLayoutFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SCALARBLOCKLAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SCALARBLOCKLAYOUT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceScalarBlockLayoutFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceScalarBlockLayoutFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceScalarBlockLayoutFeatures(address, container);
    }

    public VkPhysicalDeviceScalarBlockLayoutFeatures(ByteBuffer container) {
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
    public boolean scalarBlockLayout() {
        return nscalarBlockLayout(address()) != 0;
    }

    public VkPhysicalDeviceScalarBlockLayoutFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceScalarBlockLayoutFeatures sType$Default() {
        return sType(1000221000);
    }

    public VkPhysicalDeviceScalarBlockLayoutFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceScalarBlockLayoutFeatures scalarBlockLayout(@NativeType("VkBool32") boolean value) {
        nscalarBlockLayout(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceScalarBlockLayoutFeatures set(int sType, long pNext, boolean scalarBlockLayout) {
        sType(sType);
        pNext(pNext);
        scalarBlockLayout(scalarBlockLayout);
        return this;
    }

    public VkPhysicalDeviceScalarBlockLayoutFeatures set(VkPhysicalDeviceScalarBlockLayoutFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeatures malloc() {
        return new VkPhysicalDeviceScalarBlockLayoutFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeatures calloc() {
        return new VkPhysicalDeviceScalarBlockLayoutFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceScalarBlockLayoutFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeatures create(long address) {
        return new VkPhysicalDeviceScalarBlockLayoutFeatures(address, null);
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceScalarBlockLayoutFeatures(address, null);
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

    public static VkPhysicalDeviceScalarBlockLayoutFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceScalarBlockLayoutFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceScalarBlockLayoutFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceScalarBlockLayoutFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nscalarBlockLayout(long struct) {
        return MemoryUtil.memGetInt(struct + SCALARBLOCKLAYOUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nscalarBlockLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + SCALARBLOCKLAYOUT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceScalarBlockLayoutFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceScalarBlockLayoutFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceScalarBlockLayoutFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceScalarBlockLayoutFeatures ELEMENT_FACTORY = VkPhysicalDeviceScalarBlockLayoutFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceScalarBlockLayoutFeatures.SIZEOF);
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
        public VkPhysicalDeviceScalarBlockLayoutFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceScalarBlockLayoutFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceScalarBlockLayoutFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean scalarBlockLayout() {
            return VkPhysicalDeviceScalarBlockLayoutFeatures.nscalarBlockLayout(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceScalarBlockLayoutFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000221000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceScalarBlockLayoutFeatures.npNext(address(), value);
            return this;
        }

        public Buffer scalarBlockLayout(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceScalarBlockLayoutFeatures.nscalarBlockLayout(address(), value ? 1 : 0);
            return this;
        }
    }
}
