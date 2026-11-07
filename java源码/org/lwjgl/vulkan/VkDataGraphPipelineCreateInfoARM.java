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
import org.lwjgl.vulkan.VkDataGraphPipelineResourceInfoARM;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineCreateInfoARM.class */
public class VkDataGraphPipelineCreateInfoARM extends Struct<VkDataGraphPipelineCreateInfoARM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int LAYOUT;
    public static final int RESOURCEINFOCOUNT;
    public static final int PRESOURCEINFOS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        LAYOUT = layout.offsetof(3);
        RESOURCEINFOCOUNT = layout.offsetof(4);
        PRESOURCEINFOS = layout.offsetof(5);
    }

    protected VkDataGraphPipelineCreateInfoARM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDataGraphPipelineCreateInfoARM create(long address, ByteBuffer container) {
        return new VkDataGraphPipelineCreateInfoARM(address, container);
    }

    public VkDataGraphPipelineCreateInfoARM(ByteBuffer container) {
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

    @NativeType("VkPipelineCreateFlags2KHR")
    public long flags() {
        return nflags(address());
    }

    @NativeType("VkPipelineLayout")
    public long layout() {
        return nlayout(address());
    }

    @NativeType("uint32_t")
    public int resourceInfoCount() {
        return nresourceInfoCount(address());
    }

    @NativeType("VkDataGraphPipelineResourceInfoARM const *")
    public VkDataGraphPipelineResourceInfoARM.Buffer pResourceInfos() {
        return npResourceInfos(address());
    }

    public VkDataGraphPipelineCreateInfoARM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDataGraphPipelineCreateInfoARM sType$Default() {
        return sType(1000507000);
    }

    public VkDataGraphPipelineCreateInfoARM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDataGraphPipelineCreateInfoARM pNext(VkDataGraphPipelineBuiltinModelCreateInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineCreateInfoARM pNext(VkDataGraphPipelineCompilerControlCreateInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineCreateInfoARM pNext(VkDataGraphPipelineIdentifierCreateInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineCreateInfoARM pNext(VkDataGraphPipelineShaderModuleCreateInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineCreateInfoARM pNext(VkDataGraphProcessingEngineCreateInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineCreateInfoARM pNext(VkPipelineCreationFeedbackCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineCreateInfoARM pNext(VkPipelineCreationFeedbackCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineCreateInfoARM pNext(VkShaderModuleCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDataGraphPipelineCreateInfoARM flags(@NativeType("VkPipelineCreateFlags2KHR") long value) {
        nflags(address(), value);
        return this;
    }

    public VkDataGraphPipelineCreateInfoARM layout(@NativeType("VkPipelineLayout") long value) {
        nlayout(address(), value);
        return this;
    }

    public VkDataGraphPipelineCreateInfoARM pResourceInfos(@NativeType("VkDataGraphPipelineResourceInfoARM const *") VkDataGraphPipelineResourceInfoARM.Buffer value) {
        npResourceInfos(address(), value);
        return this;
    }

    public VkDataGraphPipelineCreateInfoARM set(int sType, long pNext, long flags, long layout, VkDataGraphPipelineResourceInfoARM.Buffer pResourceInfos) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        layout(layout);
        pResourceInfos(pResourceInfos);
        return this;
    }

    public VkDataGraphPipelineCreateInfoARM set(VkDataGraphPipelineCreateInfoARM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDataGraphPipelineCreateInfoARM malloc() {
        return new VkDataGraphPipelineCreateInfoARM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDataGraphPipelineCreateInfoARM calloc() {
        return new VkDataGraphPipelineCreateInfoARM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDataGraphPipelineCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineCreateInfoARM(MemoryUtil.memAddress(container), container);
    }

    public static VkDataGraphPipelineCreateInfoARM create(long address) {
        return new VkDataGraphPipelineCreateInfoARM(address, null);
    }

    public static VkDataGraphPipelineCreateInfoARM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDataGraphPipelineCreateInfoARM(address, null);
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

    public static VkDataGraphPipelineCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDataGraphPipelineCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nflags(long struct) {
        return MemoryUtil.memGetLong(struct + FLAGS);
    }

    public static long nlayout(long struct) {
        return MemoryUtil.memGetLong(struct + LAYOUT);
    }

    public static int nresourceInfoCount(long struct) {
        return MemoryUtil.memGetInt(struct + RESOURCEINFOCOUNT);
    }

    public static VkDataGraphPipelineResourceInfoARM.Buffer npResourceInfos(long struct) {
        return VkDataGraphPipelineResourceInfoARM.create(MemoryUtil.memGetAddress(struct + PRESOURCEINFOS), nresourceInfoCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, long value) {
        MemoryUtil.memPutLong(struct + FLAGS, value);
    }

    public static void nlayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + LAYOUT, value);
    }

    public static void nresourceInfoCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + RESOURCEINFOCOUNT, value);
    }

    public static void npResourceInfos(long struct, VkDataGraphPipelineResourceInfoARM.Buffer value) {
        MemoryUtil.memPutAddress(struct + PRESOURCEINFOS, value.address());
        nresourceInfoCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PRESOURCEINFOS));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDataGraphPipelineCreateInfoARM$Buffer.class */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineCreateInfoARM, Buffer> implements NativeResource {
        private static final VkDataGraphPipelineCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineCreateInfoARM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDataGraphPipelineCreateInfoARM.SIZEOF);
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
        public VkDataGraphPipelineCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDataGraphPipelineCreateInfoARM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDataGraphPipelineCreateInfoARM.npNext(address());
        }

        @NativeType("VkPipelineCreateFlags2KHR")
        public long flags() {
            return VkDataGraphPipelineCreateInfoARM.nflags(address());
        }

        @NativeType("VkPipelineLayout")
        public long layout() {
            return VkDataGraphPipelineCreateInfoARM.nlayout(address());
        }

        @NativeType("uint32_t")
        public int resourceInfoCount() {
            return VkDataGraphPipelineCreateInfoARM.nresourceInfoCount(address());
        }

        @NativeType("VkDataGraphPipelineResourceInfoARM const *")
        public VkDataGraphPipelineResourceInfoARM.Buffer pResourceInfos() {
            return VkDataGraphPipelineCreateInfoARM.npResourceInfos(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDataGraphPipelineCreateInfoARM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000507000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDataGraphPipelineCreateInfoARM.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDataGraphPipelineBuiltinModelCreateInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDataGraphPipelineCompilerControlCreateInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDataGraphPipelineIdentifierCreateInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDataGraphPipelineShaderModuleCreateInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDataGraphProcessingEngineCreateInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkShaderModuleCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineCreateFlags2KHR") long value) {
            VkDataGraphPipelineCreateInfoARM.nflags(address(), value);
            return this;
        }

        public Buffer layout(@NativeType("VkPipelineLayout") long value) {
            VkDataGraphPipelineCreateInfoARM.nlayout(address(), value);
            return this;
        }

        public Buffer pResourceInfos(@NativeType("VkDataGraphPipelineResourceInfoARM const *") VkDataGraphPipelineResourceInfoARM.Buffer value) {
            VkDataGraphPipelineCreateInfoARM.npResourceInfos(address(), value);
            return this;
        }
    }
}
