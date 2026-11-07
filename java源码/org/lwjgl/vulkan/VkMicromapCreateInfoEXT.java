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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapCreateInfoEXT.class */
public class VkMicromapCreateInfoEXT extends Struct<VkMicromapCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CREATEFLAGS;
    public static final int BUFFER;
    public static final int OFFSET;
    public static final int SIZE;
    public static final int TYPE;
    public static final int DEVICEADDRESS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(8), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        SIZE = layout.offsetof(5);
        TYPE = layout.offsetof(6);
        DEVICEADDRESS = layout.offsetof(7);
    }

    protected VkMicromapCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMicromapCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkMicromapCreateInfoEXT(address, container);
    }

    public VkMicromapCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkMicromapCreateFlagsEXT")
    public int createFlags() {
        return ncreateFlags(address());
    }

    @NativeType("VkBuffer")
    public long buffer() {
        return nbuffer(address());
    }

    @NativeType("VkDeviceSize")
    public long offset() {
        return noffset(address());
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkMicromapTypeEXT")
    public int type() {
        return ntype(address());
    }

    @NativeType("VkDeviceAddress")
    public long deviceAddress() {
        return ndeviceAddress(address());
    }

    public VkMicromapCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMicromapCreateInfoEXT sType$Default() {
        return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT);
    }

    public VkMicromapCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMicromapCreateInfoEXT createFlags(@NativeType("VkMicromapCreateFlagsEXT") int value) {
        ncreateFlags(address(), value);
        return this;
    }

    public VkMicromapCreateInfoEXT buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkMicromapCreateInfoEXT offset(@NativeType("VkDeviceSize") long value) {
        noffset(address(), value);
        return this;
    }

    public VkMicromapCreateInfoEXT size(@NativeType("VkDeviceSize") long value) {
        nsize(address(), value);
        return this;
    }

    public VkMicromapCreateInfoEXT type(@NativeType("VkMicromapTypeEXT") int value) {
        ntype(address(), value);
        return this;
    }

    public VkMicromapCreateInfoEXT deviceAddress(@NativeType("VkDeviceAddress") long value) {
        ndeviceAddress(address(), value);
        return this;
    }

    public VkMicromapCreateInfoEXT set(int sType, long pNext, int createFlags, long buffer, long offset, long size, int type, long deviceAddress) {
        sType(sType);
        pNext(pNext);
        createFlags(createFlags);
        buffer(buffer);
        offset(offset);
        size(size);
        type(type);
        deviceAddress(deviceAddress);
        return this;
    }

    public VkMicromapCreateInfoEXT set(VkMicromapCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMicromapCreateInfoEXT malloc() {
        return new VkMicromapCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMicromapCreateInfoEXT calloc() {
        return new VkMicromapCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMicromapCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMicromapCreateInfoEXT create(long address) {
        return new VkMicromapCreateInfoEXT(address, null);
    }

    public static VkMicromapCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMicromapCreateInfoEXT(address, null);
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

    public static VkMicromapCreateInfoEXT malloc(MemoryStack stack) {
        return new VkMicromapCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMicromapCreateInfoEXT calloc(MemoryStack stack) {
        return new VkMicromapCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncreateFlags(long struct) {
        return MemoryUtil.memGetInt(struct + CREATEFLAGS);
    }

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetLong(struct + BUFFER);
    }

    public static long noffset(long struct) {
        return MemoryUtil.memGetLong(struct + OFFSET);
    }

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static long ndeviceAddress(long struct) {
        return MemoryUtil.memGetLong(struct + DEVICEADDRESS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncreateFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + CREATEFLAGS, value);
    }

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFER, value);
    }

    public static void noffset(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFFSET, value);
    }

    public static void nsize(long struct, long value) {
        MemoryUtil.memPutLong(struct + SIZE, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void ndeviceAddress(long struct, long value) {
        MemoryUtil.memPutLong(struct + DEVICEADDRESS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMicromapCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkMicromapCreateInfoEXT ELEMENT_FACTORY = VkMicromapCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMicromapCreateInfoEXT.SIZEOF);
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
        public VkMicromapCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMicromapCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMicromapCreateInfoEXT.npNext(address());
        }

        @NativeType("VkMicromapCreateFlagsEXT")
        public int createFlags() {
            return VkMicromapCreateInfoEXT.ncreateFlags(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkMicromapCreateInfoEXT.nbuffer(address());
        }

        @NativeType("VkDeviceSize")
        public long offset() {
            return VkMicromapCreateInfoEXT.noffset(address());
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkMicromapCreateInfoEXT.nsize(address());
        }

        @NativeType("VkMicromapTypeEXT")
        public int type() {
            return VkMicromapCreateInfoEXT.ntype(address());
        }

        @NativeType("VkDeviceAddress")
        public long deviceAddress() {
            return VkMicromapCreateInfoEXT.ndeviceAddress(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMicromapCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMicromapCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer createFlags(@NativeType("VkMicromapCreateFlagsEXT") int value) {
            VkMicromapCreateInfoEXT.ncreateFlags(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkMicromapCreateInfoEXT.nbuffer(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("VkDeviceSize") long value) {
            VkMicromapCreateInfoEXT.noffset(address(), value);
            return this;
        }

        public Buffer size(@NativeType("VkDeviceSize") long value) {
            VkMicromapCreateInfoEXT.nsize(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkMicromapTypeEXT") int value) {
            VkMicromapCreateInfoEXT.ntype(address(), value);
            return this;
        }

        public Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) {
            VkMicromapCreateInfoEXT.ndeviceAddress(address(), value);
            return this;
        }
    }
}
