package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultVendorInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultVendorInfoEXT.class */
public class VkDeviceFaultVendorInfoEXT extends Struct<VkDeviceFaultVendorInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DESCRIPTION;
    public static final int VENDORFAULTCODE;
    public static final int VENDORFAULTDATA;

    static {
        Struct.Layout layout = __struct(__array(1, 256), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DESCRIPTION = layout.offsetof(0);
        VENDORFAULTCODE = layout.offsetof(1);
        VENDORFAULTDATA = layout.offsetof(2);
    }

    protected VkDeviceFaultVendorInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceFaultVendorInfoEXT create(long address, ByteBuffer container) {
        return new VkDeviceFaultVendorInfoEXT(address, container);
    }

    public VkDeviceFaultVendorInfoEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() {
        return ndescription(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() {
        return ndescriptionString(address());
    }

    @NativeType("uint64_t")
    public long vendorFaultCode() {
        return nvendorFaultCode(address());
    }

    @NativeType("uint64_t")
    public long vendorFaultData() {
        return nvendorFaultData(address());
    }

    public VkDeviceFaultVendorInfoEXT description(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) {
        ndescription(address(), value);
        return this;
    }

    public VkDeviceFaultVendorInfoEXT vendorFaultCode(@NativeType("uint64_t") long value) {
        nvendorFaultCode(address(), value);
        return this;
    }

    public VkDeviceFaultVendorInfoEXT vendorFaultData(@NativeType("uint64_t") long value) {
        nvendorFaultData(address(), value);
        return this;
    }

    public VkDeviceFaultVendorInfoEXT set(ByteBuffer description, long vendorFaultCode, long vendorFaultData) {
        description(description);
        vendorFaultCode(vendorFaultCode);
        vendorFaultData(vendorFaultData);
        return this;
    }

    public VkDeviceFaultVendorInfoEXT set(VkDeviceFaultVendorInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceFaultVendorInfoEXT malloc() {
        return new VkDeviceFaultVendorInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceFaultVendorInfoEXT calloc() {
        return new VkDeviceFaultVendorInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceFaultVendorInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceFaultVendorInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceFaultVendorInfoEXT create(long address) {
        return new VkDeviceFaultVendorInfoEXT(address, null);
    }

    public static VkDeviceFaultVendorInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceFaultVendorInfoEXT(address, null);
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

    public static VkDeviceFaultVendorInfoEXT malloc(MemoryStack stack) {
        return new VkDeviceFaultVendorInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceFaultVendorInfoEXT calloc(MemoryStack stack) {
        return new VkDeviceFaultVendorInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer ndescription(long struct) {
        return MemoryUtil.memByteBuffer(struct + DESCRIPTION, 256);
    }

    public static String ndescriptionString(long struct) {
        return MemoryUtil.memUTF8(struct + DESCRIPTION);
    }

    public static long nvendorFaultCode(long struct) {
        return MemoryUtil.memGetLong(struct + VENDORFAULTCODE);
    }

    public static long nvendorFaultData(long struct) {
        return MemoryUtil.memGetLong(struct + VENDORFAULTDATA);
    }

    public static void ndescription(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
            Checks.checkGT(value, 256);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + DESCRIPTION, value.remaining());
    }

    public static void nvendorFaultCode(long struct, long value) {
        MemoryUtil.memPutLong(struct + VENDORFAULTCODE, value);
    }

    public static void nvendorFaultData(long struct, long value) {
        MemoryUtil.memPutLong(struct + VENDORFAULTDATA, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultVendorInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceFaultVendorInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceFaultVendorInfoEXT, Buffer> implements NativeResource {
        private static final VkDeviceFaultVendorInfoEXT ELEMENT_FACTORY = VkDeviceFaultVendorInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceFaultVendorInfoEXT.SIZEOF);
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
        public VkDeviceFaultVendorInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() {
            return VkDeviceFaultVendorInfoEXT.ndescription(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() {
            return VkDeviceFaultVendorInfoEXT.ndescriptionString(address());
        }

        @NativeType("uint64_t")
        public long vendorFaultCode() {
            return VkDeviceFaultVendorInfoEXT.nvendorFaultCode(address());
        }

        @NativeType("uint64_t")
        public long vendorFaultData() {
            return VkDeviceFaultVendorInfoEXT.nvendorFaultData(address());
        }

        public Buffer description(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) {
            VkDeviceFaultVendorInfoEXT.ndescription(address(), value);
            return this;
        }

        public Buffer vendorFaultCode(@NativeType("uint64_t") long value) {
            VkDeviceFaultVendorInfoEXT.nvendorFaultCode(address(), value);
            return this;
        }

        public Buffer vendorFaultData(@NativeType("uint64_t") long value) {
            VkDeviceFaultVendorInfoEXT.nvendorFaultData(address(), value);
            return this;
        }
    }
}
