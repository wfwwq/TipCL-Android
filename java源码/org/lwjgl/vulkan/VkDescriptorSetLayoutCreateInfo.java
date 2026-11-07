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
import org.lwjgl.vulkan.VkDescriptorSetLayoutBinding;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutCreateInfo.class */
public class VkDescriptorSetLayoutCreateInfo extends Struct<VkDescriptorSetLayoutCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int BINDINGCOUNT;
    public static final int PBINDINGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        BINDINGCOUNT = layout.offsetof(3);
        PBINDINGS = layout.offsetof(4);
    }

    protected VkDescriptorSetLayoutCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorSetLayoutCreateInfo create(long address, ByteBuffer container) {
        return new VkDescriptorSetLayoutCreateInfo(address, container);
    }

    public VkDescriptorSetLayoutCreateInfo(ByteBuffer container) {
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

    @NativeType("VkDescriptorSetLayoutCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int bindingCount() {
        return nbindingCount(address());
    }

    @NativeType("VkDescriptorSetLayoutBinding const *")
    public VkDescriptorSetLayoutBinding.Buffer pBindings() {
        return npBindings(address());
    }

    public VkDescriptorSetLayoutCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutCreateInfo sType$Default() {
        return sType(32);
    }

    public VkDescriptorSetLayoutCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutCreateInfo pNext(VkDescriptorSetLayoutBindingFlagsCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorSetLayoutCreateInfo pNext(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorSetLayoutCreateInfo pNext(VkMutableDescriptorTypeCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorSetLayoutCreateInfo pNext(VkMutableDescriptorTypeCreateInfoVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorSetLayoutCreateInfo flags(@NativeType("VkDescriptorSetLayoutCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutCreateInfo pBindings(@NativeType("VkDescriptorSetLayoutBinding const *") VkDescriptorSetLayoutBinding.Buffer value) {
        npBindings(address(), value);
        return this;
    }

    public VkDescriptorSetLayoutCreateInfo set(int sType, long pNext, int flags, VkDescriptorSetLayoutBinding.Buffer pBindings) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pBindings(pBindings);
        return this;
    }

    public VkDescriptorSetLayoutCreateInfo set(VkDescriptorSetLayoutCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorSetLayoutCreateInfo malloc() {
        return new VkDescriptorSetLayoutCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorSetLayoutCreateInfo calloc() {
        return new VkDescriptorSetLayoutCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorSetLayoutCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorSetLayoutCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorSetLayoutCreateInfo create(long address) {
        return new VkDescriptorSetLayoutCreateInfo(address, null);
    }

    public static VkDescriptorSetLayoutCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorSetLayoutCreateInfo(address, null);
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

    public static VkDescriptorSetLayoutCreateInfo malloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorSetLayoutCreateInfo calloc(MemoryStack stack) {
        return new VkDescriptorSetLayoutCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int nbindingCount(long struct) {
        return MemoryUtil.memGetInt(struct + BINDINGCOUNT);
    }

    public static VkDescriptorSetLayoutBinding.Buffer npBindings(long struct) {
        return VkDescriptorSetLayoutBinding.createSafe(MemoryUtil.memGetAddress(struct + PBINDINGS), nbindingCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void nbindingCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDINGCOUNT, value);
    }

    public static void npBindings(long struct, VkDescriptorSetLayoutBinding.Buffer value) {
        MemoryUtil.memPutAddress(struct + PBINDINGS, MemoryUtil.memAddressSafe(value));
        nbindingCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nbindingCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PBINDINGS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorSetLayoutCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutCreateInfo, Buffer> implements NativeResource {
        private static final VkDescriptorSetLayoutCreateInfo ELEMENT_FACTORY = VkDescriptorSetLayoutCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorSetLayoutCreateInfo.SIZEOF);
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
        public VkDescriptorSetLayoutCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorSetLayoutCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorSetLayoutCreateInfo.npNext(address());
        }

        @NativeType("VkDescriptorSetLayoutCreateFlags")
        public int flags() {
            return VkDescriptorSetLayoutCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int bindingCount() {
            return VkDescriptorSetLayoutCreateInfo.nbindingCount(address());
        }

        @NativeType("VkDescriptorSetLayoutBinding const *")
        public VkDescriptorSetLayoutBinding.Buffer pBindings() {
            return VkDescriptorSetLayoutCreateInfo.npBindings(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorSetLayoutCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(32);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorSetLayoutCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDescriptorSetLayoutBindingFlagsCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMutableDescriptorTypeCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMutableDescriptorTypeCreateInfoVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkDescriptorSetLayoutCreateFlags") int value) {
            VkDescriptorSetLayoutCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer pBindings(@NativeType("VkDescriptorSetLayoutBinding const *") VkDescriptorSetLayoutBinding.Buffer value) {
            VkDescriptorSetLayoutCreateInfo.npBindings(address(), value);
            return this;
        }
    }
}
