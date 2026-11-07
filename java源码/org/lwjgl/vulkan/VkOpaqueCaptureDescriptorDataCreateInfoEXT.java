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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpaqueCaptureDescriptorDataCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpaqueCaptureDescriptorDataCreateInfoEXT.class */
public class VkOpaqueCaptureDescriptorDataCreateInfoEXT extends Struct<VkOpaqueCaptureDescriptorDataCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OPAQUECAPTUREDESCRIPTORDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OPAQUECAPTUREDESCRIPTORDATA = layout.offsetof(2);
    }

    protected VkOpaqueCaptureDescriptorDataCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(address, container);
    }

    public VkOpaqueCaptureDescriptorDataCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("void const *")
    public long opaqueCaptureDescriptorData() {
        return nopaqueCaptureDescriptorData(address());
    }

    public VkOpaqueCaptureDescriptorDataCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkOpaqueCaptureDescriptorDataCreateInfoEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT);
    }

    public VkOpaqueCaptureDescriptorDataCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkOpaqueCaptureDescriptorDataCreateInfoEXT opaqueCaptureDescriptorData(@NativeType("void const *") long value) {
        nopaqueCaptureDescriptorData(address(), value);
        return this;
    }

    public VkOpaqueCaptureDescriptorDataCreateInfoEXT set(int sType, long pNext, long opaqueCaptureDescriptorData) {
        sType(sType);
        pNext(pNext);
        opaqueCaptureDescriptorData(opaqueCaptureDescriptorData);
        return this;
    }

    public VkOpaqueCaptureDescriptorDataCreateInfoEXT set(VkOpaqueCaptureDescriptorDataCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT malloc() {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT calloc() {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT create(long address) {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(address, null);
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(address, null);
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

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT malloc(MemoryStack stack) {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT calloc(MemoryStack stack) {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nopaqueCaptureDescriptorData(long struct) {
        return MemoryUtil.memGetAddress(struct + OPAQUECAPTUREDESCRIPTORDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nopaqueCaptureDescriptorData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + OPAQUECAPTUREDESCRIPTORDATA, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + OPAQUECAPTUREDESCRIPTORDATA));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpaqueCaptureDescriptorDataCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpaqueCaptureDescriptorDataCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkOpaqueCaptureDescriptorDataCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkOpaqueCaptureDescriptorDataCreateInfoEXT ELEMENT_FACTORY = VkOpaqueCaptureDescriptorDataCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkOpaqueCaptureDescriptorDataCreateInfoEXT.SIZEOF);
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
        public VkOpaqueCaptureDescriptorDataCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkOpaqueCaptureDescriptorDataCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkOpaqueCaptureDescriptorDataCreateInfoEXT.npNext(address());
        }

        @NativeType("void const *")
        public long opaqueCaptureDescriptorData() {
            return VkOpaqueCaptureDescriptorDataCreateInfoEXT.nopaqueCaptureDescriptorData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkOpaqueCaptureDescriptorDataCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkOpaqueCaptureDescriptorDataCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer opaqueCaptureDescriptorData(@NativeType("void const *") long value) {
            VkOpaqueCaptureDescriptorDataCreateInfoEXT.nopaqueCaptureDescriptorData(address(), value);
            return this;
        }
    }
}
