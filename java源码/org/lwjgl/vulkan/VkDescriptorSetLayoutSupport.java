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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutSupport.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutSupport.class */
public class VkDescriptorSetLayoutSupport extends Struct<VkDescriptorSetLayoutSupport> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUPPORTED;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTED = layout.offsetof(2);
    }

    protected VkDescriptorSetLayoutSupport(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorSetLayoutSupport create(long address, ByteBuffer container) {
        return new VkDescriptorSetLayoutSupport(address, container);
    }

    public VkDescriptorSetLayoutSupport(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean supported() {
        return nsupported(address()) != 0;
    }

    public VkDescriptorSetLayoutSupport sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutSupport sType$Default() {
        return sType(1000168001);
    }

    public VkDescriptorSetLayoutSupport pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutSupport pNext(VkDescriptorSetVariableDescriptorCountLayoutSupport value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorSetLayoutSupport pNext(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorSetLayoutSupport set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkDescriptorSetLayoutSupport set(VkDescriptorSetLayoutSupport src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetLayoutSupport malloc() {
        return new VkDescriptorSetLayoutSupport(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetLayoutSupport calloc() {
        return new VkDescriptorSetLayoutSupport(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetLayoutSupport create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetLayoutSupport(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetLayoutSupport create(long address) {
        return new VkDescriptorSetLayoutSupport(address, null);
    }

    public static VkDescriptorSetLayoutSupport createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetLayoutSupport(address, null);
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

    public static VkDescriptorSetLayoutSupport malloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutSupport(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetLayoutSupport calloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutSupport(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsupported(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTED);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutSupport$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutSupport$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutSupport, Buffer> implements NativeResource {
        private static final VkDescriptorSetLayoutSupport ELEMENT_FACTORY = VkDescriptorSetLayoutSupport.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorSetLayoutSupport.SIZEOF);
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
        public VkDescriptorSetLayoutSupport getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorSetLayoutSupport.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDescriptorSetLayoutSupport.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean supported() {
            return VkDescriptorSetLayoutSupport.nsupported(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorSetLayoutSupport.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000168001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDescriptorSetLayoutSupport.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDescriptorSetVariableDescriptorCountLayoutSupport value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDescriptorSetVariableDescriptorCountLayoutSupportEXT value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
