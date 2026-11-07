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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSynchronization2Features.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSynchronization2Features.class */
public class VkPhysicalDeviceSynchronization2Features extends Struct<VkPhysicalDeviceSynchronization2Features> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SYNCHRONIZATION2;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SYNCHRONIZATION2 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceSynchronization2Features(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSynchronization2Features create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSynchronization2Features(address, container);
    }

    public VkPhysicalDeviceSynchronization2Features(ByteBuffer container) {
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
    public boolean synchronization2() {
        return nsynchronization2(address()) != 0;
    }

    public VkPhysicalDeviceSynchronization2Features sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceSynchronization2Features sType$Default() {
        return sType(1000314007);
    }

    public VkPhysicalDeviceSynchronization2Features pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceSynchronization2Features synchronization2(@NativeType("VkBool32") boolean value) {
        nsynchronization2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceSynchronization2Features set(int sType, long pNext, boolean synchronization2) {
        sType(sType);
        pNext(pNext);
        synchronization2(synchronization2);
        return this;
    }

    public VkPhysicalDeviceSynchronization2Features set(VkPhysicalDeviceSynchronization2Features src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceSynchronization2Features malloc() {
        return new VkPhysicalDeviceSynchronization2Features(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceSynchronization2Features calloc() {
        return new VkPhysicalDeviceSynchronization2Features(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceSynchronization2Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceSynchronization2Features(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceSynchronization2Features create(long address) {
        return new VkPhysicalDeviceSynchronization2Features(address, null);
    }

    public static VkPhysicalDeviceSynchronization2Features createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSynchronization2Features(address, null);
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

    public static VkPhysicalDeviceSynchronization2Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceSynchronization2Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceSynchronization2Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceSynchronization2Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsynchronization2(long struct) {
        return MemoryUtil.memGetInt(struct + SYNCHRONIZATION2);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsynchronization2(long struct, int value) {
        MemoryUtil.memPutInt(struct + SYNCHRONIZATION2, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSynchronization2Features$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSynchronization2Features$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSynchronization2Features, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceSynchronization2Features ELEMENT_FACTORY = VkPhysicalDeviceSynchronization2Features.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSynchronization2Features.SIZEOF);
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
        public VkPhysicalDeviceSynchronization2Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceSynchronization2Features.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceSynchronization2Features.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean synchronization2() {
            return VkPhysicalDeviceSynchronization2Features.nsynchronization2(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceSynchronization2Features.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000314007);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceSynchronization2Features.npNext(address(), value);
            return this;
        }

        public Buffer synchronization2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceSynchronization2Features.nsynchronization2(address(), value ? 1 : 0);
            return this;
        }
    }
}
