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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageNodeCreateInfoAMDX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageNodeCreateInfoAMDX.class */
public class VkPipelineShaderStageNodeCreateInfoAMDX extends Struct<VkPipelineShaderStageNodeCreateInfoAMDX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PNAME;
    public static final int INDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PNAME = layout.offsetof(2);
        INDEX = layout.offsetof(3);
    }

    protected VkPipelineShaderStageNodeCreateInfoAMDX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineShaderStageNodeCreateInfoAMDX create(long address, ByteBuffer container) {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(address, container);
    }

    public VkPipelineShaderStageNodeCreateInfoAMDX(ByteBuffer container) {
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

    @NativeType("char const *")
    public ByteBuffer pName() {
        return npName(address());
    }

    @NativeType("char const *")
    public String pNameString() {
        return npNameString(address());
    }

    @NativeType("uint32_t")
    public int index() {
        return nindex(address());
    }

    public VkPipelineShaderStageNodeCreateInfoAMDX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineShaderStageNodeCreateInfoAMDX sType$Default() {
        return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX);
    }

    public VkPipelineShaderStageNodeCreateInfoAMDX pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineShaderStageNodeCreateInfoAMDX pName(@NativeType("char const *") ByteBuffer value) {
        npName(address(), value);
        return this;
    }

    public VkPipelineShaderStageNodeCreateInfoAMDX index(@NativeType("uint32_t") int value) {
        nindex(address(), value);
        return this;
    }

    public VkPipelineShaderStageNodeCreateInfoAMDX set(int sType, long pNext, ByteBuffer pName, int index) {
        sType(sType);
        pNext(pNext);
        pName(pName);
        index(index);
        return this;
    }

    public VkPipelineShaderStageNodeCreateInfoAMDX set(VkPipelineShaderStageNodeCreateInfoAMDX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineShaderStageNodeCreateInfoAMDX malloc() {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineShaderStageNodeCreateInfoAMDX calloc() {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineShaderStageNodeCreateInfoAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineShaderStageNodeCreateInfoAMDX(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineShaderStageNodeCreateInfoAMDX create(long address) {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(address, null);
    }

    public static VkPipelineShaderStageNodeCreateInfoAMDX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineShaderStageNodeCreateInfoAMDX(address, null);
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

    public static VkPipelineShaderStageNodeCreateInfoAMDX malloc(MemoryStack stack) {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineShaderStageNodeCreateInfoAMDX calloc(MemoryStack stack) {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npName(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + PNAME));
    }

    public static String npNameString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + PNAME));
    }

    public static int nindex(long struct) {
        return MemoryUtil.memGetInt(struct + INDEX);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + PNAME, MemoryUtil.memAddressSafe(value));
    }

    public static void nindex(long struct, int value) {
        MemoryUtil.memPutInt(struct + INDEX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageNodeCreateInfoAMDX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageNodeCreateInfoAMDX$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageNodeCreateInfoAMDX, Buffer> implements NativeResource {
        private static final VkPipelineShaderStageNodeCreateInfoAMDX ELEMENT_FACTORY = VkPipelineShaderStageNodeCreateInfoAMDX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineShaderStageNodeCreateInfoAMDX.SIZEOF);
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
        public VkPipelineShaderStageNodeCreateInfoAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineShaderStageNodeCreateInfoAMDX.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineShaderStageNodeCreateInfoAMDX.npNext(address());
        }

        @NativeType("char const *")
        public ByteBuffer pName() {
            return VkPipelineShaderStageNodeCreateInfoAMDX.npName(address());
        }

        @NativeType("char const *")
        public String pNameString() {
            return VkPipelineShaderStageNodeCreateInfoAMDX.npNameString(address());
        }

        @NativeType("uint32_t")
        public int index() {
            return VkPipelineShaderStageNodeCreateInfoAMDX.nindex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineShaderStageNodeCreateInfoAMDX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineShaderStageNodeCreateInfoAMDX.npNext(address(), value);
            return this;
        }

        public Buffer pName(@NativeType("char const *") ByteBuffer value) {
            VkPipelineShaderStageNodeCreateInfoAMDX.npName(address(), value);
            return this;
        }

        public Buffer index(@NativeType("uint32_t") int value) {
            VkPipelineShaderStageNodeCreateInfoAMDX.nindex(address(), value);
            return this;
        }
    }
}
