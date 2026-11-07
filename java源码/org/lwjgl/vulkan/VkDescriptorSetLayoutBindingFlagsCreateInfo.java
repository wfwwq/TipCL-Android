package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfo.class */
public class VkDescriptorSetLayoutBindingFlagsCreateInfo extends Struct<VkDescriptorSetLayoutBindingFlagsCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int BINDINGCOUNT;
    public static final int PBINDINGFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BINDINGCOUNT = layout.offsetof(2);
        PBINDINGFLAGS = layout.offsetof(3);
    }

    protected VkDescriptorSetLayoutBindingFlagsCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorSetLayoutBindingFlagsCreateInfo create(long address, ByteBuffer container) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(address, container);
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfo(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int bindingCount() {
        return nbindingCount(address());
    }

    @NativeType("VkDescriptorBindingFlags const *")
    public IntBuffer pBindingFlags() {
        return npBindingFlags(address());
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfo sType$Default() {
        return sType(1000161000);
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfo bindingCount(@NativeType("uint32_t") int value) {
        nbindingCount(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfo pBindingFlags(@NativeType("VkDescriptorBindingFlags const *") IntBuffer value) {
        npBindingFlags(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfo set(int sType, long pNext, int bindingCount, IntBuffer pBindingFlags) {
        sType(sType);
        pNext(pNext);
        bindingCount(bindingCount);
        pBindingFlags(pBindingFlags);
        return this;
    }

    public VkDescriptorSetLayoutBindingFlagsCreateInfo set(VkDescriptorSetLayoutBindingFlagsCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo malloc() {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo calloc() {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo create(long address) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(address, null);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(address, null);
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

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo malloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetLayoutBindingFlagsCreateInfo calloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nbindingCount(long struct) {
        return MemoryUtil.memGetInt(struct + BINDINGCOUNT);
    }

    public static IntBuffer npBindingFlags(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PBINDINGFLAGS), nbindingCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nbindingCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDINGCOUNT, value);
    }

    public static void npBindingFlags(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PBINDINGFLAGS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nbindingCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutBindingFlagsCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutBindingFlagsCreateInfo, Buffer> implements NativeResource {
        private static final VkDescriptorSetLayoutBindingFlagsCreateInfo ELEMENT_FACTORY = VkDescriptorSetLayoutBindingFlagsCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorSetLayoutBindingFlagsCreateInfo.SIZEOF);
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
        public VkDescriptorSetLayoutBindingFlagsCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorSetLayoutBindingFlagsCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorSetLayoutBindingFlagsCreateInfo.npNext(address());
        }

        @NativeType("uint32_t")
        public int bindingCount() {
            return VkDescriptorSetLayoutBindingFlagsCreateInfo.nbindingCount(address());
        }

        @NativeType("VkDescriptorBindingFlags const *")
        public IntBuffer pBindingFlags() {
            return VkDescriptorSetLayoutBindingFlagsCreateInfo.npBindingFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorSetLayoutBindingFlagsCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000161000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorSetLayoutBindingFlagsCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer bindingCount(@NativeType("uint32_t") int value) {
            VkDescriptorSetLayoutBindingFlagsCreateInfo.nbindingCount(address(), value);
            return this;
        }

        public Buffer pBindingFlags(@NativeType("VkDescriptorBindingFlags const *") IntBuffer value) {
            VkDescriptorSetLayoutBindingFlagsCreateInfo.npBindingFlags(address(), value);
            return this;
        }
    }
}
