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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorGetInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorGetInfoEXT.class */
public class VkDescriptorGetInfoEXT extends Struct<VkDescriptorGetInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int DATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkDescriptorDataEXT.SIZEOF, VkDescriptorDataEXT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        DATA = layout.offsetof(3);
    }

    protected VkDescriptorGetInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorGetInfoEXT create(long address, ByteBuffer container) {
        return new VkDescriptorGetInfoEXT(address, container);
    }

    public VkDescriptorGetInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDescriptorType")
    public int type() {
        return ntype(address());
    }

    public VkDescriptorDataEXT data() {
        return ndata(address());
    }

    public VkDescriptorGetInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorGetInfoEXT sType$Default() {
        return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT);
    }

    public VkDescriptorGetInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorGetInfoEXT pNext(VkDescriptorGetTensorInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorGetInfoEXT type(@NativeType("VkDescriptorType") int value) {
        ntype(address(), value);
        return this;
    }

    public VkDescriptorGetInfoEXT data(VkDescriptorDataEXT value) {
        ndata(address(), value);
        return this;
    }

    public VkDescriptorGetInfoEXT data(Consumer<VkDescriptorDataEXT> consumer) {
        consumer.accept(data());
        return this;
    }

    public VkDescriptorGetInfoEXT set(int sType, long pNext, int type, VkDescriptorDataEXT data) {
        sType(sType);
        pNext(pNext);
        type(type);
        data(data);
        return this;
    }

    public VkDescriptorGetInfoEXT set(VkDescriptorGetInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorGetInfoEXT malloc() {
        return new VkDescriptorGetInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorGetInfoEXT calloc() {
        return new VkDescriptorGetInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorGetInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorGetInfoEXT create(long address) {
        return new VkDescriptorGetInfoEXT(address, null);
    }

    public static VkDescriptorGetInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorGetInfoEXT(address, null);
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

    public static VkDescriptorGetInfoEXT malloc(MemoryStack stack) {
        return new VkDescriptorGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorGetInfoEXT calloc(MemoryStack stack) {
        return new VkDescriptorGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static VkDescriptorDataEXT ndata(long struct) {
        return VkDescriptorDataEXT.create(struct + DATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void ndata(long struct, VkDescriptorDataEXT value) {
        MemoryUtil.memCopy(value.address(), struct + DATA, VkDescriptorDataEXT.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorGetInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorGetInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorGetInfoEXT, Buffer> implements NativeResource {
        private static final VkDescriptorGetInfoEXT ELEMENT_FACTORY = VkDescriptorGetInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorGetInfoEXT.SIZEOF);
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
        public VkDescriptorGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorGetInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorGetInfoEXT.npNext(address());
        }

        @NativeType("VkDescriptorType")
        public int type() {
            return VkDescriptorGetInfoEXT.ntype(address());
        }

        public VkDescriptorDataEXT data() {
            return VkDescriptorGetInfoEXT.ndata(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorGetInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_DESCRIPTOR_GET_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorGetInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDescriptorGetTensorInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer type(@NativeType("VkDescriptorType") int value) {
            VkDescriptorGetInfoEXT.ntype(address(), value);
            return this;
        }

        public Buffer data(VkDescriptorDataEXT value) {
            VkDescriptorGetInfoEXT.ndata(address(), value);
            return this;
        }

        public Buffer data(Consumer<VkDescriptorDataEXT> consumer) {
            consumer.accept(data());
            return this;
        }
    }
}
