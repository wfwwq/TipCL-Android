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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4Features.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4Features.class */
public class VkPhysicalDeviceMaintenance4Features extends Struct<VkPhysicalDeviceMaintenance4Features> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAINTENANCE4;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAINTENANCE4 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMaintenance4Features(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMaintenance4Features create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance4Features(address, container);
    }

    public VkPhysicalDeviceMaintenance4Features(ByteBuffer container) {
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
    public boolean maintenance4() {
        return nmaintenance4(address()) != 0;
    }

    public VkPhysicalDeviceMaintenance4Features sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance4Features sType$Default() {
        return sType(1000413000);
    }

    public VkPhysicalDeviceMaintenance4Features pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMaintenance4Features maintenance4(@NativeType("VkBool32") boolean value) {
        nmaintenance4(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMaintenance4Features set(int sType, long pNext, boolean maintenance4) {
        sType(sType);
        pNext(pNext);
        maintenance4(maintenance4);
        return this;
    }

    public VkPhysicalDeviceMaintenance4Features set(VkPhysicalDeviceMaintenance4Features src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMaintenance4Features malloc() {
        return new VkPhysicalDeviceMaintenance4Features(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance4Features calloc() {
        return new VkPhysicalDeviceMaintenance4Features(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance4Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance4Features(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMaintenance4Features create(long address) {
        return new VkPhysicalDeviceMaintenance4Features(address, null);
    }

    public static VkPhysicalDeviceMaintenance4Features createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMaintenance4Features(address, null);
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

    public static VkPhysicalDeviceMaintenance4Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance4Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMaintenance4Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance4Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaintenance4(long struct) {
        return MemoryUtil.memGetInt(struct + MAINTENANCE4);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmaintenance4(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAINTENANCE4, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4Features$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMaintenance4Features$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance4Features, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMaintenance4Features ELEMENT_FACTORY = VkPhysicalDeviceMaintenance4Features.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMaintenance4Features.SIZEOF);
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
        public VkPhysicalDeviceMaintenance4Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMaintenance4Features.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMaintenance4Features.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean maintenance4() {
            return VkPhysicalDeviceMaintenance4Features.nmaintenance4(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMaintenance4Features.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000413000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMaintenance4Features.npNext(address(), value);
            return this;
        }

        public Buffer maintenance4(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMaintenance4Features.nmaintenance4(address(), value ? 1 : 0);
            return this;
        }
    }
}
