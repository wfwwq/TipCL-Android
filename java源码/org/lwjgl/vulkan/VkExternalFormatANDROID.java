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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFormatANDROID.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFormatANDROID.class */
public class VkExternalFormatANDROID extends Struct<VkExternalFormatANDROID> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXTERNALFORMAT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTERNALFORMAT = layout.offsetof(2);
    }

    protected VkExternalFormatANDROID(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExternalFormatANDROID create(long address, ByteBuffer container) {
        return new VkExternalFormatANDROID(address, container);
    }

    public VkExternalFormatANDROID(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long externalFormat() {
        return nexternalFormat(address());
    }

    public VkExternalFormatANDROID sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExternalFormatANDROID sType$Default() {
        return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID);
    }

    public VkExternalFormatANDROID pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExternalFormatANDROID externalFormat(@NativeType("uint64_t") long value) {
        nexternalFormat(address(), value);
        return this;
    }

    public VkExternalFormatANDROID set(int sType, long pNext, long externalFormat) {
        sType(sType);
        pNext(pNext);
        externalFormat(externalFormat);
        return this;
    }

    public VkExternalFormatANDROID set(VkExternalFormatANDROID src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalFormatANDROID malloc() {
        return new VkExternalFormatANDROID(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalFormatANDROID calloc() {
        return new VkExternalFormatANDROID(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalFormatANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalFormatANDROID(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalFormatANDROID create(long address) {
        return new VkExternalFormatANDROID(address, null);
    }

    public static VkExternalFormatANDROID createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalFormatANDROID(address, null);
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

    public static VkExternalFormatANDROID malloc(MemoryStack stack) {
        return new VkExternalFormatANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalFormatANDROID calloc(MemoryStack stack) {
        return new VkExternalFormatANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nexternalFormat(long struct) {
        return MemoryUtil.memGetLong(struct + EXTERNALFORMAT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nexternalFormat(long struct, long value) {
        MemoryUtil.memPutLong(struct + EXTERNALFORMAT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFormatANDROID$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFormatANDROID$Buffer.class */
    public static class Buffer extends StructBuffer<VkExternalFormatANDROID, Buffer> implements NativeResource {
        private static final VkExternalFormatANDROID ELEMENT_FACTORY = VkExternalFormatANDROID.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExternalFormatANDROID.SIZEOF);
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
        public VkExternalFormatANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExternalFormatANDROID.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkExternalFormatANDROID.npNext(address());
        }

        @NativeType("uint64_t")
        public long externalFormat() {
            return VkExternalFormatANDROID.nexternalFormat(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalFormatANDROID.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkExternalFormatANDROID.npNext(address(), value);
            return this;
        }

        public Buffer externalFormat(@NativeType("uint64_t") long value) {
            VkExternalFormatANDROID.nexternalFormat(address(), value);
            return this;
        }
    }
}
