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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCaptureDescriptorDataInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCaptureDescriptorDataInfoEXT.class */
public class VkBufferCaptureDescriptorDataInfoEXT extends Struct<VkBufferCaptureDescriptorDataInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BUFFER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BUFFER = layout.offsetof(2);
    }

    protected VkBufferCaptureDescriptorDataInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferCaptureDescriptorDataInfoEXT create(long address, ByteBuffer container) {
        return new VkBufferCaptureDescriptorDataInfoEXT(address, container);
    }

    public VkBufferCaptureDescriptorDataInfoEXT(ByteBuffer container) {
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

    @NativeType("VkBuffer")
    public long buffer() {
        return nbuffer(address());
    }

    public VkBufferCaptureDescriptorDataInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferCaptureDescriptorDataInfoEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
    }

    public VkBufferCaptureDescriptorDataInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferCaptureDescriptorDataInfoEXT buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkBufferCaptureDescriptorDataInfoEXT set(int sType, long pNext, long buffer) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        return this;
    }

    public VkBufferCaptureDescriptorDataInfoEXT set(VkBufferCaptureDescriptorDataInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferCaptureDescriptorDataInfoEXT malloc() {
        return new VkBufferCaptureDescriptorDataInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferCaptureDescriptorDataInfoEXT calloc() {
        return new VkBufferCaptureDescriptorDataInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferCaptureDescriptorDataInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferCaptureDescriptorDataInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferCaptureDescriptorDataInfoEXT create(long address) {
        return new VkBufferCaptureDescriptorDataInfoEXT(address, null);
    }

    public static VkBufferCaptureDescriptorDataInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferCaptureDescriptorDataInfoEXT(address, null);
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

    public static VkBufferCaptureDescriptorDataInfoEXT malloc(MemoryStack stack) {
        return new VkBufferCaptureDescriptorDataInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferCaptureDescriptorDataInfoEXT calloc(MemoryStack stack) {
        return new VkBufferCaptureDescriptorDataInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
        return MemoryUtil.memGetLong(struct + BUFFER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nbuffer(long struct, long value) {
        MemoryUtil.memPutLong(struct + BUFFER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCaptureDescriptorDataInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferCaptureDescriptorDataInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferCaptureDescriptorDataInfoEXT, Buffer> implements NativeResource {
        private static final VkBufferCaptureDescriptorDataInfoEXT ELEMENT_FACTORY = VkBufferCaptureDescriptorDataInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferCaptureDescriptorDataInfoEXT.SIZEOF);
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
        public VkBufferCaptureDescriptorDataInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferCaptureDescriptorDataInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferCaptureDescriptorDataInfoEXT.npNext(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkBufferCaptureDescriptorDataInfoEXT.nbuffer(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferCaptureDescriptorDataInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_BUFFER_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferCaptureDescriptorDataInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBufferCaptureDescriptorDataInfoEXT.nbuffer(address(), value);
            return this;
        }
    }
}
