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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryRequirementsInfo2.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryRequirementsInfo2.class */
public class VkBufferMemoryRequirementsInfo2 extends Struct<VkBufferMemoryRequirementsInfo2> implements NativeResource {
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

    protected VkBufferMemoryRequirementsInfo2(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkBufferMemoryRequirementsInfo2 create(long address, ByteBuffer container) {
        return new VkBufferMemoryRequirementsInfo2(address, container);
    }

    public VkBufferMemoryRequirementsInfo2(ByteBuffer container) {
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

    public VkBufferMemoryRequirementsInfo2 sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkBufferMemoryRequirementsInfo2 sType$Default() {
        return sType(1000146000);
    }

    public VkBufferMemoryRequirementsInfo2 pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkBufferMemoryRequirementsInfo2 buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkBufferMemoryRequirementsInfo2 set(int sType, long pNext, long buffer) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        return this;
    }

    public VkBufferMemoryRequirementsInfo2 set(VkBufferMemoryRequirementsInfo2 src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkBufferMemoryRequirementsInfo2 malloc() {
        return new VkBufferMemoryRequirementsInfo2(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkBufferMemoryRequirementsInfo2 calloc() {
        return new VkBufferMemoryRequirementsInfo2(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkBufferMemoryRequirementsInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferMemoryRequirementsInfo2(MemoryUtil.memAddress(container), container);
    }

    public static VkBufferMemoryRequirementsInfo2 create(long address) {
        return new VkBufferMemoryRequirementsInfo2(address, null);
    }

    public static VkBufferMemoryRequirementsInfo2 createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkBufferMemoryRequirementsInfo2(address, null);
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

    public static VkBufferMemoryRequirementsInfo2 malloc(MemoryStack stack) {
        return new VkBufferMemoryRequirementsInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkBufferMemoryRequirementsInfo2 calloc(MemoryStack stack) {
        return new VkBufferMemoryRequirementsInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryRequirementsInfo2$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkBufferMemoryRequirementsInfo2$Buffer.class */
    public static class Buffer extends StructBuffer<VkBufferMemoryRequirementsInfo2, Buffer> implements NativeResource {
        private static final VkBufferMemoryRequirementsInfo2 ELEMENT_FACTORY = VkBufferMemoryRequirementsInfo2.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkBufferMemoryRequirementsInfo2.SIZEOF);
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
        public VkBufferMemoryRequirementsInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkBufferMemoryRequirementsInfo2.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkBufferMemoryRequirementsInfo2.npNext(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkBufferMemoryRequirementsInfo2.nbuffer(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkBufferMemoryRequirementsInfo2.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000146000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkBufferMemoryRequirementsInfo2.npNext(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkBufferMemoryRequirementsInfo2.nbuffer(address(), value);
            return this;
        }
    }
}
