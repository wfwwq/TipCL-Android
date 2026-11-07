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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportAndroidHardwareBufferInfoANDROID.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportAndroidHardwareBufferInfoANDROID.class */
public class VkImportAndroidHardwareBufferInfoANDROID extends Struct<VkImportAndroidHardwareBufferInfoANDROID> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BUFFER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
    }

    protected VkImportAndroidHardwareBufferInfoANDROID(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImportAndroidHardwareBufferInfoANDROID create(long address, ByteBuffer container) {
        return new VkImportAndroidHardwareBufferInfoANDROID(address, container);
    }

    public VkImportAndroidHardwareBufferInfoANDROID(ByteBuffer container) {
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

    @NativeType("AHardwareBuffer *")
    public long buffer() {
        return nbuffer(address());
    }

    public VkImportAndroidHardwareBufferInfoANDROID sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImportAndroidHardwareBufferInfoANDROID sType$Default() {
        return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID);
    }

    public VkImportAndroidHardwareBufferInfoANDROID pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImportAndroidHardwareBufferInfoANDROID buffer(@NativeType("AHardwareBuffer *") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkImportAndroidHardwareBufferInfoANDROID set(int sType, long pNext, long buffer) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        return this;
    }

    public VkImportAndroidHardwareBufferInfoANDROID set(VkImportAndroidHardwareBufferInfoANDROID src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImportAndroidHardwareBufferInfoANDROID malloc() {
        return new VkImportAndroidHardwareBufferInfoANDROID(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImportAndroidHardwareBufferInfoANDROID calloc() {
        return new VkImportAndroidHardwareBufferInfoANDROID(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImportAndroidHardwareBufferInfoANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportAndroidHardwareBufferInfoANDROID(MemoryUtil.memAddress(container), container);
    }

    public static VkImportAndroidHardwareBufferInfoANDROID create(long address) {
        return new VkImportAndroidHardwareBufferInfoANDROID(address, null);
    }

    public static VkImportAndroidHardwareBufferInfoANDROID createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImportAndroidHardwareBufferInfoANDROID(address, null);
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

    public static VkImportAndroidHardwareBufferInfoANDROID malloc(MemoryStack stack) {
        return new VkImportAndroidHardwareBufferInfoANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImportAndroidHardwareBufferInfoANDROID calloc(MemoryStack stack) {
        return new VkImportAndroidHardwareBufferInfoANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nbuffer(long struct) {
        return MemoryUtil.memGetAddress(struct + BUFFER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + BUFFER, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + BUFFER));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportAndroidHardwareBufferInfoANDROID$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportAndroidHardwareBufferInfoANDROID$Buffer.class */
    public static class Buffer extends StructBuffer<VkImportAndroidHardwareBufferInfoANDROID, Buffer> implements NativeResource {
        private static final VkImportAndroidHardwareBufferInfoANDROID ELEMENT_FACTORY = VkImportAndroidHardwareBufferInfoANDROID.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImportAndroidHardwareBufferInfoANDROID.SIZEOF);
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
        public VkImportAndroidHardwareBufferInfoANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImportAndroidHardwareBufferInfoANDROID.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImportAndroidHardwareBufferInfoANDROID.npNext(address());
        }

        @NativeType("AHardwareBuffer *")
        public long buffer() {
            return VkImportAndroidHardwareBufferInfoANDROID.nbuffer(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImportAndroidHardwareBufferInfoANDROID.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ANDROIDExternalMemoryAndroidHardwareBuffer.VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImportAndroidHardwareBufferInfoANDROID.npNext(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("AHardwareBuffer *") long value) {
            VkImportAndroidHardwareBufferInfoANDROID.nbuffer(address(), value);
            return this;
        }
    }
}
