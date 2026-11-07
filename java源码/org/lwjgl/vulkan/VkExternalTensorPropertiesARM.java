package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalTensorPropertiesARM.class */
public class VkExternalTensorPropertiesARM extends Struct<VkExternalTensorPropertiesARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXTERNALMEMORYPROPERTIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExternalMemoryProperties.SIZEOF, VkExternalMemoryProperties.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTERNALMEMORYPROPERTIES = layout.offsetof(2);
    }

    protected VkExternalTensorPropertiesARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExternalTensorPropertiesARM create(long address, ByteBuffer container) {
        return new VkExternalTensorPropertiesARM(address, container);
    }

    public VkExternalTensorPropertiesARM(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    public VkExternalMemoryProperties externalMemoryProperties() {
        return nexternalMemoryProperties(address());
    }

    public VkExternalTensorPropertiesARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExternalTensorPropertiesARM sType$Default() {
        return sType(ARMTensors.VK_STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM);
    }

    public VkExternalTensorPropertiesARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExternalTensorPropertiesARM externalMemoryProperties(VkExternalMemoryProperties value) {
        nexternalMemoryProperties(address(), value);
        return this;
    }

    public VkExternalTensorPropertiesARM set(int sType, long pNext, VkExternalMemoryProperties externalMemoryProperties) {
        sType(sType);
        pNext(pNext);
        externalMemoryProperties(externalMemoryProperties);
        return this;
    }

    public VkExternalTensorPropertiesARM set(VkExternalTensorPropertiesARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalTensorPropertiesARM malloc() {
        return new VkExternalTensorPropertiesARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalTensorPropertiesARM calloc() {
        return new VkExternalTensorPropertiesARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalTensorPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalTensorPropertiesARM(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalTensorPropertiesARM create(long address) {
        return new VkExternalTensorPropertiesARM(address, null);
    }

    public static VkExternalTensorPropertiesARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalTensorPropertiesARM(address, null);
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

    public static VkExternalTensorPropertiesARM malloc(MemoryStack stack) {
        return new VkExternalTensorPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalTensorPropertiesARM calloc(MemoryStack stack) {
        return new VkExternalTensorPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExternalMemoryProperties nexternalMemoryProperties(long struct) {
        return VkExternalMemoryProperties.create(struct + EXTERNALMEMORYPROPERTIES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nexternalMemoryProperties(long struct, VkExternalMemoryProperties value) {
        MemoryUtil.memCopy(value.address(), struct + EXTERNALMEMORYPROPERTIES, VkExternalMemoryProperties.SIZEOF);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalTensorPropertiesARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkExternalTensorPropertiesARM, Buffer> implements NativeResource {
        private static final VkExternalTensorPropertiesARM ELEMENT_FACTORY = VkExternalTensorPropertiesARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExternalTensorPropertiesARM.SIZEOF);
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
        public VkExternalTensorPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExternalTensorPropertiesARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExternalTensorPropertiesARM.npNext(address());
        }

        public VkExternalMemoryProperties externalMemoryProperties() {
            return VkExternalTensorPropertiesARM.nexternalMemoryProperties(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalTensorPropertiesARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ARMTensors.VK_STRUCTURE_TYPE_EXTERNAL_TENSOR_PROPERTIES_ARM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExternalTensorPropertiesARM.npNext(address(), value);
            return this;
        }

        public Buffer externalMemoryProperties(VkExternalMemoryProperties value) {
            VkExternalTensorPropertiesARM.nexternalMemoryProperties(address(), value);
            return this;
        }
    }
}
