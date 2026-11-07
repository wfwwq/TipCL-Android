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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.class */
public class VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures extends Struct<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERZEROINITIALIZEWORKGROUPMEMORY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERZEROINITIALIZEWORKGROUPMEMORY = layout.offsetof(2);
    }

    protected VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(address, container);
    }

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(ByteBuffer container) {
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
    public boolean shaderZeroInitializeWorkgroupMemory() {
        return nshaderZeroInitializeWorkgroupMemory(address()) != 0;
    }

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures sType$Default() {
        return sType(1000325000);
    }

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) {
        nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures set(int sType, long pNext, boolean shaderZeroInitializeWorkgroupMemory) {
        sType(sType);
        pNext(pNext);
        shaderZeroInitializeWorkgroupMemory(shaderZeroInitializeWorkgroupMemory);
        return this;
    }

    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures set(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures malloc() {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures calloc() {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures create(long address) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(address, null);
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(address, null);
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

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nshaderZeroInitializeWorkgroupMemory(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERZEROINITIALIZEWORKGROUPMEMORY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nshaderZeroInitializeWorkgroupMemory(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERZEROINITIALIZEWORKGROUPMEMORY, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures ELEMENT_FACTORY = VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.SIZEOF);
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
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean shaderZeroInitializeWorkgroupMemory() {
            return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.nshaderZeroInitializeWorkgroupMemory(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000325000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.npNext(address(), value);
            return this;
        }

        public Buffer shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0);
            return this;
        }
    }
}
