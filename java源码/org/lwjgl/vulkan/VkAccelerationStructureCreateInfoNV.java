package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCreateInfoNV.class */
public class VkAccelerationStructureCreateInfoNV extends Struct<VkAccelerationStructureCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMPACTEDSIZE;
    public static final int INFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(VkAccelerationStructureInfoNV.SIZEOF, VkAccelerationStructureInfoNV.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPACTEDSIZE = layout.offsetof(2);
        INFO = layout.offsetof(3);
    }

    protected VkAccelerationStructureCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAccelerationStructureCreateInfoNV create(long address, ByteBuffer container) {
        return new VkAccelerationStructureCreateInfoNV(address, container);
    }

    public VkAccelerationStructureCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkDeviceSize")
    public long compactedSize() {
        return ncompactedSize(address());
    }

    public VkAccelerationStructureInfoNV info() {
        return ninfo(address());
    }

    public VkAccelerationStructureCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoNV sType$Default() {
        return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV);
    }

    public VkAccelerationStructureCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoNV pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkAccelerationStructureCreateInfoNV compactedSize(@NativeType("VkDeviceSize") long value) {
        ncompactedSize(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoNV info(VkAccelerationStructureInfoNV value) {
        ninfo(address(), value);
        return this;
    }

    public VkAccelerationStructureCreateInfoNV info(Consumer<VkAccelerationStructureInfoNV> consumer) {
        consumer.accept(info());
        return this;
    }

    public VkAccelerationStructureCreateInfoNV set(int sType, long pNext, long compactedSize, VkAccelerationStructureInfoNV info) {
        sType(sType);
        pNext(pNext);
        compactedSize(compactedSize);
        info(info);
        return this;
    }

    public VkAccelerationStructureCreateInfoNV set(VkAccelerationStructureCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAccelerationStructureCreateInfoNV malloc() {
        return new VkAccelerationStructureCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAccelerationStructureCreateInfoNV calloc() {
        return new VkAccelerationStructureCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAccelerationStructureCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkAccelerationStructureCreateInfoNV create(long address) {
        return new VkAccelerationStructureCreateInfoNV(address, null);
    }

    public static VkAccelerationStructureCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAccelerationStructureCreateInfoNV(address, null);
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

    public static VkAccelerationStructureCreateInfoNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAccelerationStructureCreateInfoNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ncompactedSize(long struct) {
        return MemoryUtil.memGetLong(struct + COMPACTEDSIZE);
    }

    public static VkAccelerationStructureInfoNV ninfo(long struct) {
        return VkAccelerationStructureInfoNV.create(struct + INFO);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncompactedSize(long struct, long value) {
        MemoryUtil.memPutLong(struct + COMPACTEDSIZE, value);
    }

    public static void ninfo(long struct, VkAccelerationStructureInfoNV value) {
        MemoryUtil.memCopy(value.address(), struct + INFO, VkAccelerationStructureInfoNV.SIZEOF);
    }

    public static void validate(long struct) {
        VkAccelerationStructureInfoNV.validate(struct + INFO);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAccelerationStructureCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkAccelerationStructureCreateInfoNV, Buffer> implements NativeResource {
        private static final VkAccelerationStructureCreateInfoNV ELEMENT_FACTORY = VkAccelerationStructureCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAccelerationStructureCreateInfoNV.SIZEOF);
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
        public VkAccelerationStructureCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAccelerationStructureCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAccelerationStructureCreateInfoNV.npNext(address());
        }

        @NativeType("VkDeviceSize")
        public long compactedSize() {
            return VkAccelerationStructureCreateInfoNV.ncompactedSize(address());
        }

        public VkAccelerationStructureInfoNV info() {
            return VkAccelerationStructureCreateInfoNV.ninfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAccelerationStructureCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracing.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAccelerationStructureCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer compactedSize(@NativeType("VkDeviceSize") long value) {
            VkAccelerationStructureCreateInfoNV.ncompactedSize(address(), value);
            return this;
        }

        public Buffer info(VkAccelerationStructureInfoNV value) {
            VkAccelerationStructureCreateInfoNV.ninfo(address(), value);
            return this;
        }

        public Buffer info(Consumer<VkAccelerationStructureInfoNV> consumer) {
            consumer.accept(info());
            return this;
        }
    }
}
