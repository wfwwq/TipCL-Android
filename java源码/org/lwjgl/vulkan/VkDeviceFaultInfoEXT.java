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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultInfoEXT.class */
public class VkDeviceFaultInfoEXT extends Struct<VkDeviceFaultInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DESCRIPTION;
    public static final int PADDRESSINFOS;
    public static final int PVENDORINFOS;
    public static final int PVENDORBINARYDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __array(1, 256), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DESCRIPTION = layout.offsetof(2);
        PADDRESSINFOS = layout.offsetof(3);
        PVENDORINFOS = layout.offsetof(4);
        PVENDORBINARYDATA = layout.offsetof(5);
    }

    protected VkDeviceFaultInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceFaultInfoEXT create(long address, ByteBuffer container) {
        return new VkDeviceFaultInfoEXT(address, container);
    }

    public VkDeviceFaultInfoEXT(ByteBuffer container) {
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

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() {
        return ndescription(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() {
        return ndescriptionString(address());
    }

    @NativeType("VkDeviceFaultAddressInfoEXT *")
    public VkDeviceFaultAddressInfoEXT pAddressInfos() {
        return npAddressInfos(address());
    }

    @NativeType("VkDeviceFaultVendorInfoEXT *")
    public VkDeviceFaultVendorInfoEXT pVendorInfos() {
        return npVendorInfos(address());
    }

    @NativeType("void *")
    public long pVendorBinaryData() {
        return npVendorBinaryData(address());
    }

    public VkDeviceFaultInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceFaultInfoEXT sType$Default() {
        return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT);
    }

    public VkDeviceFaultInfoEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceFaultInfoEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkDeviceFaultInfoEXT set(VkDeviceFaultInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceFaultInfoEXT malloc() {
        return new VkDeviceFaultInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceFaultInfoEXT calloc() {
        return new VkDeviceFaultInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceFaultInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceFaultInfoEXT create(long address) {
        return new VkDeviceFaultInfoEXT(address, null);
    }

    public static VkDeviceFaultInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceFaultInfoEXT(address, null);
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

    public static VkDeviceFaultInfoEXT malloc(MemoryStack stack) {
        return new VkDeviceFaultInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceFaultInfoEXT calloc(MemoryStack stack) {
        return new VkDeviceFaultInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer ndescription(long struct) {
        return MemoryUtil.memByteBuffer(struct + DESCRIPTION, 256);
    }

    public static String ndescriptionString(long struct) {
        return MemoryUtil.memUTF8(struct + DESCRIPTION);
    }

    public static VkDeviceFaultAddressInfoEXT npAddressInfos(long struct) {
        return VkDeviceFaultAddressInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PADDRESSINFOS));
    }

    public static VkDeviceFaultVendorInfoEXT npVendorInfos(long struct) {
        return VkDeviceFaultVendorInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + PVENDORINFOS));
    }

    public static long npVendorBinaryData(long struct) {
        return MemoryUtil.memGetAddress(struct + PVENDORBINARYDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceFaultInfoEXT, Buffer> implements NativeResource {
        private static final VkDeviceFaultInfoEXT ELEMENT_FACTORY = VkDeviceFaultInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceFaultInfoEXT.SIZEOF);
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
        public VkDeviceFaultInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceFaultInfoEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDeviceFaultInfoEXT.npNext(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() {
            return VkDeviceFaultInfoEXT.ndescription(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() {
            return VkDeviceFaultInfoEXT.ndescriptionString(address());
        }

        @NativeType("VkDeviceFaultAddressInfoEXT *")
        public VkDeviceFaultAddressInfoEXT pAddressInfos() {
            return VkDeviceFaultInfoEXT.npAddressInfos(address());
        }

        @NativeType("VkDeviceFaultVendorInfoEXT *")
        public VkDeviceFaultVendorInfoEXT pVendorInfos() {
            return VkDeviceFaultInfoEXT.npVendorInfos(address());
        }

        @NativeType("void *")
        public long pVendorBinaryData() {
            return VkDeviceFaultInfoEXT.npVendorBinaryData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceFaultInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceFault.VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDeviceFaultInfoEXT.npNext(address(), value);
            return this;
        }
    }
}
