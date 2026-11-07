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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.class */
public class VkDescriptorBufferBindingPushDescriptorBufferHandleEXT extends Struct<VkDescriptorBufferBindingPushDescriptorBufferHandleEXT> implements NativeResource {
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

    protected VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT create(long address, ByteBuffer container) {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(address, container);
    }

    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(ByteBuffer container) {
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

    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT);
    }

    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT buffer(@NativeType("VkBuffer") long value) {
        nbuffer(address(), value);
        return this;
    }

    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT set(int sType, long pNext, long buffer) {
        sType(sType);
        pNext(pNext);
        buffer(buffer);
        return this;
    }

    public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT set(VkDescriptorBufferBindingPushDescriptorBufferHandleEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT malloc() {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT calloc() {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT create(long address) {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(address, null);
    }

    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(address, null);
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

    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT malloc(MemoryStack stack) {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorBufferBindingPushDescriptorBufferHandleEXT calloc(MemoryStack stack) {
        return new VkDescriptorBufferBindingPushDescriptorBufferHandleEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorBufferBindingPushDescriptorBufferHandleEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorBufferBindingPushDescriptorBufferHandleEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorBufferBindingPushDescriptorBufferHandleEXT, Buffer> implements NativeResource {
        private static final VkDescriptorBufferBindingPushDescriptorBufferHandleEXT ELEMENT_FACTORY = VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.SIZEOF);
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
        public VkDescriptorBufferBindingPushDescriptorBufferHandleEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.npNext(address());
        }

        @NativeType("VkBuffer")
        public long buffer() {
            return VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.nbuffer(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_BUFFER_BINDING_PUSH_DESCRIPTOR_BUFFER_HANDLE_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.npNext(address(), value);
            return this;
        }

        public Buffer buffer(@NativeType("VkBuffer") long value) {
            VkDescriptorBufferBindingPushDescriptorBufferHandleEXT.nbuffer(address(), value);
            return this;
        }
    }
}
