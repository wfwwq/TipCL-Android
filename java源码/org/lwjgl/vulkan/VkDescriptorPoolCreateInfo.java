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
import org.lwjgl.vulkan.VkDescriptorPoolSize;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolCreateInfo.class */
public class VkDescriptorPoolCreateInfo extends Struct<VkDescriptorPoolCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int MAXSETS;
    public static final int POOLSIZECOUNT;
    public static final int PPOOLSIZES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAXSETS = layout.offsetof(3);
        POOLSIZECOUNT = layout.offsetof(4);
        PPOOLSIZES = layout.offsetof(5);
    }

    protected VkDescriptorPoolCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDescriptorPoolCreateInfo create(long address, ByteBuffer container) {
        return new VkDescriptorPoolCreateInfo(address, container);
    }

    public VkDescriptorPoolCreateInfo(ByteBuffer container) {
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

    @NativeType("VkDescriptorPoolCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int maxSets() {
        return nmaxSets(address());
    }

    @NativeType("uint32_t")
    public int poolSizeCount() {
        return npoolSizeCount(address());
    }

    @NativeType("VkDescriptorPoolSize const *")
    public VkDescriptorPoolSize.Buffer pPoolSizes() {
        return npPoolSizes(address());
    }

    public VkDescriptorPoolCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDescriptorPoolCreateInfo sType$Default() {
        return sType(33);
    }

    public VkDescriptorPoolCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDescriptorPoolCreateInfo pNext(VkDataGraphProcessingEngineCreateInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorPoolCreateInfo pNext(VkDescriptorPoolInlineUniformBlockCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorPoolCreateInfo pNext(VkDescriptorPoolInlineUniformBlockCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorPoolCreateInfo pNext(VkMutableDescriptorTypeCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorPoolCreateInfo pNext(VkMutableDescriptorTypeCreateInfoVALVE value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDescriptorPoolCreateInfo flags(@NativeType("VkDescriptorPoolCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDescriptorPoolCreateInfo maxSets(@NativeType("uint32_t") int value) {
        nmaxSets(address(), value);
        return this;
    }

    public VkDescriptorPoolCreateInfo pPoolSizes(@NativeType("VkDescriptorPoolSize const *") VkDescriptorPoolSize.Buffer value) {
        npPoolSizes(address(), value);
        return this;
    }

    public VkDescriptorPoolCreateInfo set(int sType, long pNext, int flags, int maxSets, VkDescriptorPoolSize.Buffer pPoolSizes) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        maxSets(maxSets);
        pPoolSizes(pPoolSizes);
        return this;
    }

    public VkDescriptorPoolCreateInfo set(VkDescriptorPoolCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDescriptorPoolCreateInfo malloc() {
        return new VkDescriptorPoolCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDescriptorPoolCreateInfo calloc() {
        return new VkDescriptorPoolCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDescriptorPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDescriptorPoolCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDescriptorPoolCreateInfo create(long address) {
        return new VkDescriptorPoolCreateInfo(address, null);
    }

    public static VkDescriptorPoolCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDescriptorPoolCreateInfo(address, null);
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

    public static VkDescriptorPoolCreateInfo malloc(MemoryStack stack) {
        return new VkDescriptorPoolCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDescriptorPoolCreateInfo calloc(MemoryStack stack) {
        return new VkDescriptorPoolCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxSets(long struct) {
        return MemoryUtil.memGetInt(struct + MAXSETS);
    }

    public static int npoolSizeCount(long struct) {
        return MemoryUtil.memGetInt(struct + POOLSIZECOUNT);
    }

    public static VkDescriptorPoolSize.Buffer npPoolSizes(long struct) {
        return VkDescriptorPoolSize.createSafe(MemoryUtil.memGetAddress(struct + PPOOLSIZES), npoolSizeCount(struct));
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

    public static void nmaxSets(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAXSETS, value);
    }

    public static void npoolSizeCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + POOLSIZECOUNT, value);
    }

    public static void npPoolSizes(long struct, VkDescriptorPoolSize.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPOOLSIZES, MemoryUtil.memAddressSafe(value));
        npoolSizeCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (npoolSizeCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPOOLSIZES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDescriptorPoolCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDescriptorPoolCreateInfo, Buffer> implements NativeResource {
        private static final VkDescriptorPoolCreateInfo ELEMENT_FACTORY = VkDescriptorPoolCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDescriptorPoolCreateInfo.SIZEOF);
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
        public VkDescriptorPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDescriptorPoolCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDescriptorPoolCreateInfo.npNext(address());
        }

        @NativeType("VkDescriptorPoolCreateFlags")
        public int flags() {
            return VkDescriptorPoolCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int maxSets() {
            return VkDescriptorPoolCreateInfo.nmaxSets(address());
        }

        @NativeType("uint32_t")
        public int poolSizeCount() {
            return VkDescriptorPoolCreateInfo.npoolSizeCount(address());
        }

        @NativeType("VkDescriptorPoolSize const *")
        public VkDescriptorPoolSize.Buffer pPoolSizes() {
            return VkDescriptorPoolCreateInfo.npPoolSizes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDescriptorPoolCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(33);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDescriptorPoolCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDataGraphProcessingEngineCreateInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDescriptorPoolInlineUniformBlockCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDescriptorPoolInlineUniformBlockCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMutableDescriptorTypeCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkMutableDescriptorTypeCreateInfoVALVE value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkDescriptorPoolCreateFlags") int value) {
            VkDescriptorPoolCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer maxSets(@NativeType("uint32_t") int value) {
            VkDescriptorPoolCreateInfo.nmaxSets(address(), value);
            return this;
        }

        public Buffer pPoolSizes(@NativeType("VkDescriptorPoolSize const *") VkDescriptorPoolSize.Buffer value) {
            VkDescriptorPoolCreateInfo.npPoolSizes(address(), value);
            return this;
        }
    }
}
