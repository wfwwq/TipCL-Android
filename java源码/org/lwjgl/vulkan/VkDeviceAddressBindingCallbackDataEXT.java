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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceAddressBindingCallbackDataEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceAddressBindingCallbackDataEXT.class */
public class VkDeviceAddressBindingCallbackDataEXT extends Struct<VkDeviceAddressBindingCallbackDataEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int BASEADDRESS;
    public static final int SIZE;
    public static final int BINDINGTYPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        BASEADDRESS = layout.offsetof(3);
        SIZE = layout.offsetof(4);
        BINDINGTYPE = layout.offsetof(5);
    }

    protected VkDeviceAddressBindingCallbackDataEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceAddressBindingCallbackDataEXT create(long address, ByteBuffer container) {
        return new VkDeviceAddressBindingCallbackDataEXT(address, container);
    }

    public VkDeviceAddressBindingCallbackDataEXT(ByteBuffer container) {
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

    @NativeType("VkDeviceAddressBindingFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkDeviceAddress")
    public long baseAddress() {
        return nbaseAddress(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkDeviceAddressBindingTypeEXT")
    public int bindingType() {
        return nbindingType(address());
    }

    public VkDeviceAddressBindingCallbackDataEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceAddressBindingCallbackDataEXT sType$Default() {
        return sType(EXTDeviceAddressBindingReport.VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT);
    }

    public VkDeviceAddressBindingCallbackDataEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceAddressBindingCallbackDataEXT flags(@NativeType("VkDeviceAddressBindingFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDeviceAddressBindingCallbackDataEXT baseAddress(@NativeType("VkDeviceAddress") long value) {
        nbaseAddress(address(), value);
        return this;
    }

    public VkDeviceAddressBindingCallbackDataEXT size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkDeviceAddressBindingCallbackDataEXT bindingType(@NativeType("VkDeviceAddressBindingTypeEXT") int value) {
        nbindingType(address(), value);
        return this;
    }

    public VkDeviceAddressBindingCallbackDataEXT set(int sType, long pNext, int flags, long baseAddress, long size, int bindingType) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        baseAddress(baseAddress);
        size(size);
        bindingType(bindingType);
        return this;
    }

    public VkDeviceAddressBindingCallbackDataEXT set(VkDeviceAddressBindingCallbackDataEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceAddressBindingCallbackDataEXT malloc() {
        return new VkDeviceAddressBindingCallbackDataEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceAddressBindingCallbackDataEXT calloc() {
        return new VkDeviceAddressBindingCallbackDataEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceAddressBindingCallbackDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceAddressBindingCallbackDataEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceAddressBindingCallbackDataEXT create(long address) {
        return new VkDeviceAddressBindingCallbackDataEXT(address, null);
    }

    public static VkDeviceAddressBindingCallbackDataEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceAddressBindingCallbackDataEXT(address, null);
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

    public static VkDeviceAddressBindingCallbackDataEXT malloc(MemoryStack stack) {
        return new VkDeviceAddressBindingCallbackDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceAddressBindingCallbackDataEXT calloc(MemoryStack stack) {
        return new VkDeviceAddressBindingCallbackDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static long nbaseAddress(long struct) {
        return MemoryUtil.memGetLong(struct + BASEADDRESS);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static int nbindingType(long struct) {
        return MemoryUtil.memGetInt(struct + BINDINGTYPE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nbaseAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + BASEADDRESS, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void nbindingType(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDINGTYPE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceAddressBindingCallbackDataEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceAddressBindingCallbackDataEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceAddressBindingCallbackDataEXT, Buffer> implements NativeResource {
        private static final VkDeviceAddressBindingCallbackDataEXT ELEMENT_FACTORY = VkDeviceAddressBindingCallbackDataEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceAddressBindingCallbackDataEXT.SIZEOF);
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
        public VkDeviceAddressBindingCallbackDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceAddressBindingCallbackDataEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDeviceAddressBindingCallbackDataEXT.npNext(address());
        }

        @NativeType("VkDeviceAddressBindingFlagsEXT")
        public int flags() {
            return VkDeviceAddressBindingCallbackDataEXT.nflags(address());
        }

        @NativeType("VkDeviceAddress")
        public long baseAddress() {
            return VkDeviceAddressBindingCallbackDataEXT.nbaseAddress(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkDeviceAddressBindingCallbackDataEXT.nsize(address());
        }

        @NativeType("VkDeviceAddressBindingTypeEXT")
        public int bindingType() {
            return VkDeviceAddressBindingCallbackDataEXT.nbindingType(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceAddressBindingCallbackDataEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceAddressBindingReport.VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDeviceAddressBindingCallbackDataEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDeviceAddressBindingFlagsEXT") int value) {
            VkDeviceAddressBindingCallbackDataEXT.nflags(address(), value);
            return this;
        }

        public Buffer baseAddress(@NativeType("VkDeviceAddress") long value) {
            VkDeviceAddressBindingCallbackDataEXT.nbaseAddress(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkDeviceAddressBindingCallbackDataEXT.nsize(address(), value);
            return this;
        }

        public Buffer bindingType(@NativeType("VkDeviceAddressBindingTypeEXT") int value) {
            VkDeviceAddressBindingCallbackDataEXT.nbindingType(address(), value);
            return this;
        }
    }
}
