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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorAddressInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorAddressInfoEXT.class */
public class VkDescriptorAddressInfoEXT extends Struct<VkDescriptorAddressInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ADDRESS;
    public static final int RANGE;
    public static final int FORMAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ADDRESS = layout.offsetof(2);
        RANGE = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
    }

    protected VkDescriptorAddressInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorAddressInfoEXT create(long address, ByteBuffer container) {
        return new VkDescriptorAddressInfoEXT(address, container);
    }

    public VkDescriptorAddressInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDeviceAddress")
    public long address$() {
        return naddress$(address());
    }

    @NativeType("VkDeviceSize")
    public long range() {
        return nrange(address());
    }

    @NativeType("VkFormat")
    public int format() {
        return nformat(address());
    }

    public VkDescriptorAddressInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorAddressInfoEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT);
    }

    public VkDescriptorAddressInfoEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorAddressInfoEXT address$(@NativeType("VkDeviceAddress") long value) {
        naddress$(address(), value);
        return this;
    }

    public VkDescriptorAddressInfoEXT range(@NativeType("VkDeviceSize") long value) {
        nrange(address(), value);
        return this;
    }

    public VkDescriptorAddressInfoEXT format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    public VkDescriptorAddressInfoEXT set(int sType, long pNext, long address$, long range, int format) {
        sType(sType);
        pNext(pNext);
        address$(address$);
        range(range);
        format(format);
        return this;
    }

    public VkDescriptorAddressInfoEXT set(VkDescriptorAddressInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorAddressInfoEXT malloc() {
        return new VkDescriptorAddressInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorAddressInfoEXT calloc() {
        return new VkDescriptorAddressInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorAddressInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorAddressInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorAddressInfoEXT create(long address) {
        return new VkDescriptorAddressInfoEXT(address, null);
    }

    public static VkDescriptorAddressInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(address, null);
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

    public static VkDescriptorAddressInfoEXT malloc(MemoryStack stack) {
        return new VkDescriptorAddressInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorAddressInfoEXT calloc(MemoryStack stack) {
        return new VkDescriptorAddressInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long naddress$(long struct) {
        return MemoryUtil.memGetLong(struct + ADDRESS);
    }

    public static long nrange(long struct) {
        return MemoryUtil.memGetLong(struct + RANGE);
    }

    public static int nformat(long struct) {
        return MemoryUtil.memGetInt(struct + FORMAT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naddress$(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDRESS, value);
    }

    public static void nrange(long struct, long value) {
        MemoryUtil.memPutLong(struct + RANGE, value);
    }

    public static void nformat(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMAT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorAddressInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorAddressInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorAddressInfoEXT, Buffer> implements NativeResource {
        private static final VkDescriptorAddressInfoEXT ELEMENT_FACTORY = VkDescriptorAddressInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorAddressInfoEXT.SIZEOF);
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
        public VkDescriptorAddressInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorAddressInfoEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDescriptorAddressInfoEXT.npNext(address());
        }

        @NativeType("VkDeviceAddress")
        public long address$() {
            return VkDescriptorAddressInfoEXT.naddress$(address());
        }

        @NativeType("VkDeviceSize")
        public long range() {
            return VkDescriptorAddressInfoEXT.nrange(address());
        }

        @NativeType("VkFormat")
        public int format() {
            return VkDescriptorAddressInfoEXT.nformat(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorAddressInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_ADDRESS_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDescriptorAddressInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer address$(@NativeType("VkDeviceAddress") long value) {
            VkDescriptorAddressInfoEXT.naddress$(address(), value);
            return this;
        }

        public Buffer range(@NativeType("VkDeviceSize") long value) {
            VkDescriptorAddressInfoEXT.nrange(address(), value);
            return this;
        }

        public Buffer format(@NativeType("VkFormat") int value) {
            VkDescriptorAddressInfoEXT.nformat(address(), value);
            return this;
        }
    }
}
