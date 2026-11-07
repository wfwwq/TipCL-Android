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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalBufferInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalBufferInfoEXT.class */
public class VkImportMetalBufferInfoEXT extends Struct<VkImportMetalBufferInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MTLBUFFER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MTLBUFFER = layout.offsetof(2);
    }

    protected VkImportMetalBufferInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkImportMetalBufferInfoEXT create(long address, ByteBuffer container) {
        return new VkImportMetalBufferInfoEXT(address, container);
    }

    public VkImportMetalBufferInfoEXT(ByteBuffer container) {
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

    @NativeType("MTLBuffer_id")
    public long mtlBuffer() {
        return nmtlBuffer(address());
    }

    public VkImportMetalBufferInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkImportMetalBufferInfoEXT sType$Default() {
        return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT);
    }

    public VkImportMetalBufferInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkImportMetalBufferInfoEXT mtlBuffer(@NativeType("MTLBuffer_id") long value) {
        nmtlBuffer(address(), value);
        return this;
    }

    public VkImportMetalBufferInfoEXT set(int sType, long pNext, long mtlBuffer) {
        sType(sType);
        pNext(pNext);
        mtlBuffer(mtlBuffer);
        return this;
    }

    public VkImportMetalBufferInfoEXT set(VkImportMetalBufferInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkImportMetalBufferInfoEXT malloc() {
        return new VkImportMetalBufferInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkImportMetalBufferInfoEXT calloc() {
        return new VkImportMetalBufferInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkImportMetalBufferInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMetalBufferInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkImportMetalBufferInfoEXT create(long address) {
        return new VkImportMetalBufferInfoEXT(address, null);
    }

    public static VkImportMetalBufferInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkImportMetalBufferInfoEXT(address, null);
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

    public static VkImportMetalBufferInfoEXT malloc(MemoryStack stack) {
        return new VkImportMetalBufferInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkImportMetalBufferInfoEXT calloc(MemoryStack stack) {
        return new VkImportMetalBufferInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nmtlBuffer(long struct) {
        return MemoryUtil.memGetAddress(struct + MTLBUFFER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmtlBuffer(long struct, long value) {
        MemoryUtil.memPutAddress(struct + MTLBUFFER, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + MTLBUFFER));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalBufferInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkImportMetalBufferInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkImportMetalBufferInfoEXT, Buffer> implements NativeResource {
        private static final VkImportMetalBufferInfoEXT ELEMENT_FACTORY = VkImportMetalBufferInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkImportMetalBufferInfoEXT.SIZEOF);
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
        public VkImportMetalBufferInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkImportMetalBufferInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkImportMetalBufferInfoEXT.npNext(address());
        }

        @NativeType("MTLBuffer_id")
        public long mtlBuffer() {
            return VkImportMetalBufferInfoEXT.nmtlBuffer(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkImportMetalBufferInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkImportMetalBufferInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer mtlBuffer(@NativeType("MTLBuffer_id") long value) {
            VkImportMetalBufferInfoEXT.nmtlBuffer(address(), value);
            return this;
        }
    }
}
