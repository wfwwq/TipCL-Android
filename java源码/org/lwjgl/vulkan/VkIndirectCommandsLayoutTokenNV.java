package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenNV.class */
public class VkIndirectCommandsLayoutTokenNV extends Struct<VkIndirectCommandsLayoutTokenNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TOKENTYPE;
    public static final int STREAM;
    public static final int OFFSET;
    public static final int VERTEXBINDINGUNIT;
    public static final int VERTEXDYNAMICSTRIDE;
    public static final int PUSHCONSTANTPIPELINELAYOUT;
    public static final int PUSHCONSTANTSHADERSTAGEFLAGS;
    public static final int PUSHCONSTANTOFFSET;
    public static final int PUSHCONSTANTSIZE;
    public static final int INDIRECTSTATEFLAGS;
    public static final int INDEXTYPECOUNT;
    public static final int PINDEXTYPES;
    public static final int PINDEXTYPEVALUES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(8), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TOKENTYPE = layout.offsetof(2);
        STREAM = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        VERTEXBINDINGUNIT = layout.offsetof(5);
        VERTEXDYNAMICSTRIDE = layout.offsetof(6);
        PUSHCONSTANTPIPELINELAYOUT = layout.offsetof(7);
        PUSHCONSTANTSHADERSTAGEFLAGS = layout.offsetof(8);
        PUSHCONSTANTOFFSET = layout.offsetof(9);
        PUSHCONSTANTSIZE = layout.offsetof(10);
        INDIRECTSTATEFLAGS = layout.offsetof(11);
        INDEXTYPECOUNT = layout.offsetof(12);
        PINDEXTYPES = layout.offsetof(13);
        PINDEXTYPEVALUES = layout.offsetof(14);
    }

    protected VkIndirectCommandsLayoutTokenNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectCommandsLayoutTokenNV create(long address, ByteBuffer container) {
        return new VkIndirectCommandsLayoutTokenNV(address, container);
    }

    public VkIndirectCommandsLayoutTokenNV(ByteBuffer container) {
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

    @NativeType("VkIndirectCommandsTokenTypeNV")
    public int tokenType() {
        return ntokenType(address());
    }

    @NativeType("uint32_t")
    public int stream$() {
        return nstream$(address());
    }

    @NativeType("uint32_t")
    public int offset() {
        return noffset(address());
    }

    @NativeType("uint32_t")
    public int vertexBindingUnit() {
        return nvertexBindingUnit(address());
    }

    @NativeType("VkBool32")
    public boolean vertexDynamicStride() {
        return nvertexDynamicStride(address()) != 0;
    }

    @NativeType("VkPipelineLayout")
    public long pushconstantPipelineLayout() {
        return npushconstantPipelineLayout(address());
    }

    @NativeType("VkShaderStageFlags")
    public int pushconstantShaderStageFlags() {
        return npushconstantShaderStageFlags(address());
    }

    @NativeType("uint32_t")
    public int pushconstantOffset() {
        return npushconstantOffset(address());
    }

    @NativeType("uint32_t")
    public int pushconstantSize() {
        return npushconstantSize(address());
    }

    @NativeType("VkIndirectStateFlagsNV")
    public int indirectStateFlags() {
        return nindirectStateFlags(address());
    }

    @NativeType("uint32_t")
    public int indexTypeCount() {
        return nindexTypeCount(address());
    }

    @NativeType("VkIndexType const *")
    public IntBuffer pIndexTypes() {
        return npIndexTypes(address());
    }

    @NativeType("uint32_t const *")
    public IntBuffer pIndexTypeValues() {
        return npIndexTypeValues(address());
    }

    public VkIndirectCommandsLayoutTokenNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV sType$Default() {
        return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV);
    }

    public VkIndirectCommandsLayoutTokenNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV pNext(VkIndirectCommandsLayoutPushDataTokenNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkIndirectCommandsLayoutTokenNV tokenType(@NativeType("VkIndirectCommandsTokenTypeNV") int value) {
        ntokenType(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV stream$(@NativeType("uint32_t") int value) {
        nstream$(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV offset(@NativeType("uint32_t") int value) {
        noffset(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV vertexBindingUnit(@NativeType("uint32_t") int value) {
        nvertexBindingUnit(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV vertexDynamicStride(@NativeType("VkBool32") boolean value) {
        nvertexDynamicStride(address(), value ? 1 : 0);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV pushconstantPipelineLayout(@NativeType("VkPipelineLayout") long value) {
        npushconstantPipelineLayout(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV pushconstantShaderStageFlags(@NativeType("VkShaderStageFlags") int value) {
        npushconstantShaderStageFlags(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV pushconstantOffset(@NativeType("uint32_t") int value) {
        npushconstantOffset(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV pushconstantSize(@NativeType("uint32_t") int value) {
        npushconstantSize(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV indirectStateFlags(@NativeType("VkIndirectStateFlagsNV") int value) {
        nindirectStateFlags(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV indexTypeCount(@NativeType("uint32_t") int value) {
        nindexTypeCount(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV pIndexTypes(@NativeType("VkIndexType const *") IntBuffer value) {
        npIndexTypes(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV pIndexTypeValues(@NativeType("uint32_t const *") IntBuffer value) {
        npIndexTypeValues(address(), value);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV set(int sType, long pNext, int tokenType, int stream$, int offset, int vertexBindingUnit, boolean vertexDynamicStride, long pushconstantPipelineLayout, int pushconstantShaderStageFlags, int pushconstantOffset, int pushconstantSize, int indirectStateFlags, int indexTypeCount, IntBuffer pIndexTypes, IntBuffer pIndexTypeValues) {
        sType(sType);
        pNext(pNext);
        tokenType(tokenType);
        stream$(stream$);
        offset(offset);
        vertexBindingUnit(vertexBindingUnit);
        vertexDynamicStride(vertexDynamicStride);
        pushconstantPipelineLayout(pushconstantPipelineLayout);
        pushconstantShaderStageFlags(pushconstantShaderStageFlags);
        pushconstantOffset(pushconstantOffset);
        pushconstantSize(pushconstantSize);
        indirectStateFlags(indirectStateFlags);
        indexTypeCount(indexTypeCount);
        pIndexTypes(pIndexTypes);
        pIndexTypeValues(pIndexTypeValues);
        return this;
    }

    public VkIndirectCommandsLayoutTokenNV set(VkIndirectCommandsLayoutTokenNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectCommandsLayoutTokenNV malloc() {
        return new VkIndirectCommandsLayoutTokenNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutTokenNV calloc() {
        return new VkIndirectCommandsLayoutTokenNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutTokenNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutTokenNV(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectCommandsLayoutTokenNV create(long address) {
        return new VkIndirectCommandsLayoutTokenNV(address, null);
    }

    public static VkIndirectCommandsLayoutTokenNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectCommandsLayoutTokenNV(address, null);
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

    public static VkIndirectCommandsLayoutTokenNV malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutTokenNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectCommandsLayoutTokenNV calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutTokenNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntokenType(long struct) {
        return MemoryUtil.memGetInt(struct + TOKENTYPE);
    }

    public static int nstream$(long struct) {
        return MemoryUtil.memGetInt(struct + STREAM);
    }

    public static int noffset(long struct) {
        return MemoryUtil.memGetInt(struct + OFFSET);
    }

    public static int nvertexBindingUnit(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXBINDINGUNIT);
    }

    public static int nvertexDynamicStride(long struct) {
        return MemoryUtil.memGetInt(struct + VERTEXDYNAMICSTRIDE);
    }

    public static long npushconstantPipelineLayout(long struct) {
        return MemoryUtil.memGetLong(struct + PUSHCONSTANTPIPELINELAYOUT);
    }

    public static int npushconstantShaderStageFlags(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHCONSTANTSHADERSTAGEFLAGS);
    }

    public static int npushconstantOffset(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHCONSTANTOFFSET);
    }

    public static int npushconstantSize(long struct) {
        return MemoryUtil.memGetInt(struct + PUSHCONSTANTSIZE);
    }

    public static int nindirectStateFlags(long struct) {
        return MemoryUtil.memGetInt(struct + INDIRECTSTATEFLAGS);
    }

    public static int nindexTypeCount(long struct) {
        return MemoryUtil.memGetInt(struct + INDEXTYPECOUNT);
    }

    public static IntBuffer npIndexTypes(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PINDEXTYPES), nindexTypeCount(struct));
    }

    public static IntBuffer npIndexTypeValues(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PINDEXTYPEVALUES), nindexTypeCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntokenType(long struct, int value) {
        MemoryUtil.memPutInt(struct + TOKENTYPE, value);
    }

    public static void nstream$(long struct, int value) {
        MemoryUtil.memPutInt(struct + STREAM, value);
    }

    public static void noffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + OFFSET, value);
    }

    public static void nvertexBindingUnit(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXBINDINGUNIT, value);
    }

    public static void nvertexDynamicStride(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERTEXDYNAMICSTRIDE, value);
    }

    public static void npushconstantPipelineLayout(long struct, long value) {
        MemoryUtil.memPutLong(struct + PUSHCONSTANTPIPELINELAYOUT, value);
    }

    public static void npushconstantShaderStageFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHCONSTANTSHADERSTAGEFLAGS, value);
    }

    public static void npushconstantOffset(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHCONSTANTOFFSET, value);
    }

    public static void npushconstantSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + PUSHCONSTANTSIZE, value);
    }

    public static void nindirectStateFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDIRECTSTATEFLAGS, value);
    }

    public static void nindexTypeCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEXTYPECOUNT, value);
    }

    public static void npIndexTypes(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PINDEXTYPES, MemoryUtil.memAddressSafe(value));
    }

    public static void npIndexTypeValues(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PINDEXTYPEVALUES, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        if (nindexTypeCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PINDEXTYPES));
            Checks.check(MemoryUtil.memGetAddress(struct + PINDEXTYPEVALUES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectCommandsLayoutTokenNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutTokenNV, Buffer> implements NativeResource {
        private static final VkIndirectCommandsLayoutTokenNV ELEMENT_FACTORY = VkIndirectCommandsLayoutTokenNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectCommandsLayoutTokenNV.SIZEOF);
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
        public VkIndirectCommandsLayoutTokenNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkIndirectCommandsLayoutTokenNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkIndirectCommandsLayoutTokenNV.npNext(address());
        }

        @NativeType("VkIndirectCommandsTokenTypeNV")
        public int tokenType() {
            return VkIndirectCommandsLayoutTokenNV.ntokenType(address());
        }

        @NativeType("uint32_t")
        public int stream$() {
            return VkIndirectCommandsLayoutTokenNV.nstream$(address());
        }

        @NativeType("uint32_t")
        public int offset() {
            return VkIndirectCommandsLayoutTokenNV.noffset(address());
        }

        @NativeType("uint32_t")
        public int vertexBindingUnit() {
            return VkIndirectCommandsLayoutTokenNV.nvertexBindingUnit(address());
        }

        @NativeType("VkBool32")
        public boolean vertexDynamicStride() {
            return VkIndirectCommandsLayoutTokenNV.nvertexDynamicStride(address()) != 0;
        }

        @NativeType("VkPipelineLayout")
        public long pushconstantPipelineLayout() {
            return VkIndirectCommandsLayoutTokenNV.npushconstantPipelineLayout(address());
        }

        @NativeType("VkShaderStageFlags")
        public int pushconstantShaderStageFlags() {
            return VkIndirectCommandsLayoutTokenNV.npushconstantShaderStageFlags(address());
        }

        @NativeType("uint32_t")
        public int pushconstantOffset() {
            return VkIndirectCommandsLayoutTokenNV.npushconstantOffset(address());
        }

        @NativeType("uint32_t")
        public int pushconstantSize() {
            return VkIndirectCommandsLayoutTokenNV.npushconstantSize(address());
        }

        @NativeType("VkIndirectStateFlagsNV")
        public int indirectStateFlags() {
            return VkIndirectCommandsLayoutTokenNV.nindirectStateFlags(address());
        }

        @NativeType("uint32_t")
        public int indexTypeCount() {
            return VkIndirectCommandsLayoutTokenNV.nindexTypeCount(address());
        }

        @NativeType("VkIndexType const *")
        public IntBuffer pIndexTypes() {
            return VkIndirectCommandsLayoutTokenNV.npIndexTypes(address());
        }

        @NativeType("uint32_t const *")
        public IntBuffer pIndexTypeValues() {
            return VkIndirectCommandsLayoutTokenNV.npIndexTypeValues(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkIndirectCommandsLayoutTokenNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkIndirectCommandsLayoutTokenNV.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkIndirectCommandsLayoutPushDataTokenNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer tokenType(@NativeType("VkIndirectCommandsTokenTypeNV") int value) {
            VkIndirectCommandsLayoutTokenNV.ntokenType(address(), value);
            return this;
        }

        public Buffer stream$(@NativeType("uint32_t") int value) {
            VkIndirectCommandsLayoutTokenNV.nstream$(address(), value);
            return this;
        }

        public Buffer offset(@NativeType("uint32_t") int value) {
            VkIndirectCommandsLayoutTokenNV.noffset(address(), value);
            return this;
        }

        public Buffer vertexBindingUnit(@NativeType("uint32_t") int value) {
            VkIndirectCommandsLayoutTokenNV.nvertexBindingUnit(address(), value);
            return this;
        }

        public Buffer vertexDynamicStride(@NativeType("VkBool32") boolean value) {
            VkIndirectCommandsLayoutTokenNV.nvertexDynamicStride(address(), value ? 1 : 0);
            return this;
        }

        public Buffer pushconstantPipelineLayout(@NativeType("VkPipelineLayout") long value) {
            VkIndirectCommandsLayoutTokenNV.npushconstantPipelineLayout(address(), value);
            return this;
        }

        public Buffer pushconstantShaderStageFlags(@NativeType("VkShaderStageFlags") int value) {
            VkIndirectCommandsLayoutTokenNV.npushconstantShaderStageFlags(address(), value);
            return this;
        }

        public Buffer pushconstantOffset(@NativeType("uint32_t") int value) {
            VkIndirectCommandsLayoutTokenNV.npushconstantOffset(address(), value);
            return this;
        }

        public Buffer pushconstantSize(@NativeType("uint32_t") int value) {
            VkIndirectCommandsLayoutTokenNV.npushconstantSize(address(), value);
            return this;
        }

        public Buffer indirectStateFlags(@NativeType("VkIndirectStateFlagsNV") int value) {
            VkIndirectCommandsLayoutTokenNV.nindirectStateFlags(address(), value);
            return this;
        }

        public Buffer indexTypeCount(@NativeType("uint32_t") int value) {
            VkIndirectCommandsLayoutTokenNV.nindexTypeCount(address(), value);
            return this;
        }

        public Buffer pIndexTypes(@NativeType("VkIndexType const *") IntBuffer value) {
            VkIndirectCommandsLayoutTokenNV.npIndexTypes(address(), value);
            return this;
        }

        public Buffer pIndexTypeValues(@NativeType("uint32_t const *") IntBuffer value) {
            VkIndirectCommandsLayoutTokenNV.npIndexTypeValues(address(), value);
            return this;
        }
    }
}
