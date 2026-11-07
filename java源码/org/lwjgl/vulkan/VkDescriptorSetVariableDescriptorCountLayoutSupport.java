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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountLayoutSupport.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountLayoutSupport.class */
public class VkDescriptorSetVariableDescriptorCountLayoutSupport extends Struct<VkDescriptorSetVariableDescriptorCountLayoutSupport> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXVARIABLEDESCRIPTORCOUNT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXVARIABLEDESCRIPTORCOUNT = layout.offsetof(2);
    }

    protected VkDescriptorSetVariableDescriptorCountLayoutSupport(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorSetVariableDescriptorCountLayoutSupport create(long address, ByteBuffer container) {
        return new VkDescriptorSetVariableDescriptorCountLayoutSupport(address, container);
    }

    public VkDescriptorSetVariableDescriptorCountLayoutSupport(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int maxVariableDescriptorCount() {
        return nmaxVariableDescriptorCount(address());
    }

    public VkDescriptorSetVariableDescriptorCountLayoutSupport sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorSetVariableDescriptorCountLayoutSupport sType$Default() {
        return sType(1000161004);
    }

    public VkDescriptorSetVariableDescriptorCountLayoutSupport pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorSetVariableDescriptorCountLayoutSupport set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkDescriptorSetVariableDescriptorCountLayoutSupport set(VkDescriptorSetVariableDescriptorCountLayoutSupport src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetVariableDescriptorCountLayoutSupport malloc() {
        return new VkDescriptorSetVariableDescriptorCountLayoutSupport(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetVariableDescriptorCountLayoutSupport calloc() {
        return new VkDescriptorSetVariableDescriptorCountLayoutSupport(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetVariableDescriptorCountLayoutSupport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetVariableDescriptorCountLayoutSupport(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetVariableDescriptorCountLayoutSupport create(long address) {
        return new VkDescriptorSetVariableDescriptorCountLayoutSupport(address, null);
    }

    public static VkDescriptorSetVariableDescriptorCountLayoutSupport createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetVariableDescriptorCountLayoutSupport(address, null);
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

    public static VkDescriptorSetVariableDescriptorCountLayoutSupport malloc(MemoryStack stack) {
        return new VkDescriptorSetVariableDescriptorCountLayoutSupport(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetVariableDescriptorCountLayoutSupport calloc(MemoryStack stack) {
        return new VkDescriptorSetVariableDescriptorCountLayoutSupport(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxVariableDescriptorCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXVARIABLEDESCRIPTORCOUNT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountLayoutSupport$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetVariableDescriptorCountLayoutSupport$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorSetVariableDescriptorCountLayoutSupport, Buffer> implements NativeResource {
        private static final VkDescriptorSetVariableDescriptorCountLayoutSupport ELEMENT_FACTORY = VkDescriptorSetVariableDescriptorCountLayoutSupport.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorSetVariableDescriptorCountLayoutSupport.SIZEOF);
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
        public VkDescriptorSetVariableDescriptorCountLayoutSupport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorSetVariableDescriptorCountLayoutSupport.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDescriptorSetVariableDescriptorCountLayoutSupport.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxVariableDescriptorCount() {
            return VkDescriptorSetVariableDescriptorCountLayoutSupport.nmaxVariableDescriptorCount(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorSetVariableDescriptorCountLayoutSupport.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000161004);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDescriptorSetVariableDescriptorCountLayoutSupport.npNext(address(), value);
            return this;
        }
    }
}
