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
import org.lwjgl.vulkan.VkVertexInputAttributeDescription;
import org.lwjgl.vulkan.VkVertexInputBindingDescription;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineVertexInputStateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineVertexInputStateCreateInfo.class */
public class VkPipelineVertexInputStateCreateInfo extends Struct<VkPipelineVertexInputStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int VERTEXBINDINGDESCRIPTIONCOUNT;
    public static final int PVERTEXBINDINGDESCRIPTIONS;
    public static final int VERTEXATTRIBUTEDESCRIPTIONCOUNT;
    public static final int PVERTEXATTRIBUTEDESCRIPTIONS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        VERTEXBINDINGDESCRIPTIONCOUNT = layout.offsetof(3);
        PVERTEXBINDINGDESCRIPTIONS = layout.offsetof(4);
        VERTEXATTRIBUTEDESCRIPTIONCOUNT = layout.offsetof(5);
        PVERTEXATTRIBUTEDESCRIPTIONS = layout.offsetof(6);
    }

    protected VkPipelineVertexInputStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineVertexInputStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineVertexInputStateCreateInfo(address, container);
    }

    public VkPipelineVertexInputStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineVertexInputStateCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int vertexBindingDescriptionCount() {
        return nvertexBindingDescriptionCount(address());
    }

    @NativeType("VkVertexInputBindingDescription const *")
    public VkVertexInputBindingDescription.Buffer pVertexBindingDescriptions() {
        return npVertexBindingDescriptions(address());
    }

    @NativeType("uint32_t")
    public int vertexAttributeDescriptionCount() {
        return nvertexAttributeDescriptionCount(address());
    }

    @NativeType("VkVertexInputAttributeDescription const *")
    public VkVertexInputAttributeDescription.Buffer pVertexAttributeDescriptions() {
        return npVertexAttributeDescriptions(address());
    }

    public VkPipelineVertexInputStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineVertexInputStateCreateInfo sType$Default() {
        return sType(19);
    }

    public VkPipelineVertexInputStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineVertexInputStateCreateInfo pNext(VkPipelineVertexInputDivisorStateCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineVertexInputStateCreateInfo pNext(VkPipelineVertexInputDivisorStateCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineVertexInputStateCreateInfo pNext(VkPipelineVertexInputDivisorStateCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineVertexInputStateCreateInfo flags(@NativeType("VkPipelineVertexInputStateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineVertexInputStateCreateInfo pVertexBindingDescriptions(@NativeType("VkVertexInputBindingDescription const *") VkVertexInputBindingDescription.Buffer value) {
        npVertexBindingDescriptions(address(), value);
        return this;
    }

    public VkPipelineVertexInputStateCreateInfo pVertexAttributeDescriptions(@NativeType("VkVertexInputAttributeDescription const *") VkVertexInputAttributeDescription.Buffer value) {
        npVertexAttributeDescriptions(address(), value);
        return this;
    }

    public VkPipelineVertexInputStateCreateInfo set(int sType, long pNext, int flags, VkVertexInputBindingDescription.Buffer pVertexBindingDescriptions, VkVertexInputAttributeDescription.Buffer pVertexAttributeDescriptions) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pVertexBindingDescriptions(pVertexBindingDescriptions);
        pVertexAttributeDescriptions(pVertexAttributeDescriptions);
        return this;
    }

    public VkPipelineVertexInputStateCreateInfo set(VkPipelineVertexInputStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineVertexInputStateCreateInfo malloc() {
        return new VkPipelineVertexInputStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineVertexInputStateCreateInfo calloc() {
        return new VkPipelineVertexInputStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineVertexInputStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineVertexInputStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineVertexInputStateCreateInfo create(long address) {
        return new VkPipelineVertexInputStateCreateInfo(address, null);
    }

    public static VkPipelineVertexInputStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineVertexInputStateCreateInfo(address, null);
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

    public static VkPipelineVertexInputStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineVertexInputStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineVertexInputStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineVertexInputStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvertexBindingDescriptionCount(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXBINDINGDESCRIPTIONCOUNT);
    }

    public static VkVertexInputBindingDescription.Buffer npVertexBindingDescriptions(long struct) {
        return VkVertexInputBindingDescription.createSafe(MemoryUtil.memGetAddress(struct + PVERTEXBINDINGDESCRIPTIONS), nvertexBindingDescriptionCount(struct));
    }

    public static int nvertexAttributeDescriptionCount(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXATTRIBUTEDESCRIPTIONCOUNT);
    }

    public static VkVertexInputAttributeDescription.Buffer npVertexAttributeDescriptions(long struct) {
        return VkVertexInputAttributeDescription.createSafe(MemoryUtil.memGetAddress(struct + PVERTEXATTRIBUTEDESCRIPTIONS), nvertexAttributeDescriptionCount(struct));
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

    public static void nvertexBindingDescriptionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXBINDINGDESCRIPTIONCOUNT, value);
    }

    public static void npVertexBindingDescriptions(long struct, VkVertexInputBindingDescription.Buffer value) {
        MemoryUtil.memPutAddress(struct + PVERTEXBINDINGDESCRIPTIONS, MemoryUtil.memAddressSafe(value));
        nvertexBindingDescriptionCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nvertexAttributeDescriptionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXATTRIBUTEDESCRIPTIONCOUNT, value);
    }

    public static void npVertexAttributeDescriptions(long struct, VkVertexInputAttributeDescription.Buffer value) {
        MemoryUtil.memPutAddress(struct + PVERTEXATTRIBUTEDESCRIPTIONS, MemoryUtil.memAddressSafe(value));
        nvertexAttributeDescriptionCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nvertexBindingDescriptionCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PVERTEXBINDINGDESCRIPTIONS));
        }
        if (nvertexAttributeDescriptionCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PVERTEXATTRIBUTEDESCRIPTIONS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineVertexInputStateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineVertexInputStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineVertexInputStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineVertexInputStateCreateInfo ELEMENT_FACTORY = VkPipelineVertexInputStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineVertexInputStateCreateInfo.SIZEOF);
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
        public VkPipelineVertexInputStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineVertexInputStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineVertexInputStateCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineVertexInputStateCreateFlags")
        public int flags() {
            return VkPipelineVertexInputStateCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int vertexBindingDescriptionCount() {
            return VkPipelineVertexInputStateCreateInfo.nvertexBindingDescriptionCount(address());
        }

        @NativeType("VkVertexInputBindingDescription const *")
        public VkVertexInputBindingDescription.Buffer pVertexBindingDescriptions() {
            return VkPipelineVertexInputStateCreateInfo.npVertexBindingDescriptions(address());
        }

        @NativeType("uint32_t")
        public int vertexAttributeDescriptionCount() {
            return VkPipelineVertexInputStateCreateInfo.nvertexAttributeDescriptionCount(address());
        }

        @NativeType("VkVertexInputAttributeDescription const *")
        public VkVertexInputAttributeDescription.Buffer pVertexAttributeDescriptions() {
            return VkPipelineVertexInputStateCreateInfo.npVertexAttributeDescriptions(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineVertexInputStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(19);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineVertexInputStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineVertexInputDivisorStateCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineVertexInputDivisorStateCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineVertexInputDivisorStateCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineVertexInputStateCreateFlags") int value) {
            VkPipelineVertexInputStateCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer pVertexBindingDescriptions(@NativeType("VkVertexInputBindingDescription const *") VkVertexInputBindingDescription.Buffer value) {
            VkPipelineVertexInputStateCreateInfo.npVertexBindingDescriptions(address(), value);
            return this;
        }

        public Buffer pVertexAttributeDescriptions(@NativeType("VkVertexInputAttributeDescription const *") VkVertexInputAttributeDescription.Buffer value) {
            VkPipelineVertexInputStateCreateInfo.npVertexAttributeDescriptions(address(), value);
            return this;
        }
    }
}
