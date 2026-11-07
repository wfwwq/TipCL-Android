package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectExecutionSetShaderLayoutInfoEXT.class */
public class VkIndirectExecutionSetShaderLayoutInfoEXT extends Struct<VkIndirectExecutionSetShaderLayoutInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SETLAYOUTCOUNT;
    public static final int PSETLAYOUTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SETLAYOUTCOUNT = layout.offsetof(2);
        PSETLAYOUTS = layout.offsetof(3);
    }

    protected VkIndirectExecutionSetShaderLayoutInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkIndirectExecutionSetShaderLayoutInfoEXT create(long address, ByteBuffer container) {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(address, container);
    }

    public VkIndirectExecutionSetShaderLayoutInfoEXT(ByteBuffer container) {
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
    public int setLayoutCount() {
        return nsetLayoutCount(address());
    }

    @NativeType("VkDescriptorSetLayout const *")
    public LongBuffer pSetLayouts() {
        return npSetLayouts(address());
    }

    public VkIndirectExecutionSetShaderLayoutInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderLayoutInfoEXT sType$Default() {
        return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT);
    }

    public VkIndirectExecutionSetShaderLayoutInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderLayoutInfoEXT setLayoutCount(@NativeType("uint32_t") int value) {
        nsetLayoutCount(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderLayoutInfoEXT pSetLayouts(@NativeType("VkDescriptorSetLayout const *") LongBuffer value) {
        npSetLayouts(address(), value);
        return this;
    }

    public VkIndirectExecutionSetShaderLayoutInfoEXT set(int sType, long pNext, int setLayoutCount, LongBuffer pSetLayouts) {
        sType(sType);
        pNext(pNext);
        setLayoutCount(setLayoutCount);
        pSetLayouts(pSetLayouts);
        return this;
    }

    public VkIndirectExecutionSetShaderLayoutInfoEXT set(VkIndirectExecutionSetShaderLayoutInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkIndirectExecutionSetShaderLayoutInfoEXT malloc() {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkIndirectExecutionSetShaderLayoutInfoEXT calloc() {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkIndirectExecutionSetShaderLayoutInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkIndirectExecutionSetShaderLayoutInfoEXT create(long address) {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(address, null);
    }

    public static VkIndirectExecutionSetShaderLayoutInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(address, null);
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

    public static VkIndirectExecutionSetShaderLayoutInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkIndirectExecutionSetShaderLayoutInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsetLayoutCount(long struct) {
        return MemoryUtil.memGetInt(struct + SETLAYOUTCOUNT);
    }

    public static LongBuffer npSetLayouts(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PSETLAYOUTS), nsetLayoutCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsetLayoutCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SETLAYOUTCOUNT, value);
    }

    public static void npSetLayouts(long struct, LongBuffer value) {
        MemoryUtil.memPutAddress(struct + PSETLAYOUTS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nsetLayoutCount(struct, value.remaining());
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkIndirectExecutionSetShaderLayoutInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetShaderLayoutInfoEXT, Buffer> implements NativeResource {
        private static final VkIndirectExecutionSetShaderLayoutInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetShaderLayoutInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkIndirectExecutionSetShaderLayoutInfoEXT.SIZEOF);
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
        public VkIndirectExecutionSetShaderLayoutInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkIndirectExecutionSetShaderLayoutInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkIndirectExecutionSetShaderLayoutInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int setLayoutCount() {
            return VkIndirectExecutionSetShaderLayoutInfoEXT.nsetLayoutCount(address());
        }

        @NativeType("VkDescriptorSetLayout const *")
        public LongBuffer pSetLayouts() {
            return VkIndirectExecutionSetShaderLayoutInfoEXT.npSetLayouts(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkIndirectExecutionSetShaderLayoutInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkIndirectExecutionSetShaderLayoutInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer setLayoutCount(@NativeType("uint32_t") int value) {
            VkIndirectExecutionSetShaderLayoutInfoEXT.nsetLayoutCount(address(), value);
            return this;
        }

        public Buffer pSetLayouts(@NativeType("VkDescriptorSetLayout const *") LongBuffer value) {
            VkIndirectExecutionSetShaderLayoutInfoEXT.npSetLayouts(address(), value);
            return this;
        }
    }
}
