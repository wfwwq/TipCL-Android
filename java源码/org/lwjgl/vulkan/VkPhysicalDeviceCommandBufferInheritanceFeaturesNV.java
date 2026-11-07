package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.class */
public class VkPhysicalDeviceCommandBufferInheritanceFeaturesNV extends Struct<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMMANDBUFFERINHERITANCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMMANDBUFFERINHERITANCE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(address, container);
    }

    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(ByteBuffer container) {
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
    public boolean commandBufferInheritance() {
        return ncommandBufferInheritance(address()) != 0;
    }

    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV sType$Default() {
        return sType(NVCommandBufferInheritance.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV);
    }

    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV commandBufferInheritance(@NativeType("VkBool32") boolean value) {
        ncommandBufferInheritance(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV set(int sType, long pNext, boolean commandBufferInheritance) {
        sType(sType);
        pNext(pNext);
        commandBufferInheritance(commandBufferInheritance);
        return this;
    }

    public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV set(VkPhysicalDeviceCommandBufferInheritanceFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV malloc() {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV calloc() {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV create(long address) {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(address, null);
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

    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceCommandBufferInheritanceFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCommandBufferInheritanceFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncommandBufferInheritance(long struct) {
        return MemoryUtil.memGetInt(struct + COMMANDBUFFERINHERITANCE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncommandBufferInheritance(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMMANDBUFFERINHERITANCE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceCommandBufferInheritanceFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCommandBufferInheritanceFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceCommandBufferInheritanceFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceCommandBufferInheritanceFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean commandBufferInheritance() {
            return VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.ncommandBufferInheritance(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVCommandBufferInheritance.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer commandBufferInheritance(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceCommandBufferInheritanceFeaturesNV.ncommandBufferInheritance(address(), value ? 1 : 0);
            return this;
        }
    }
}
