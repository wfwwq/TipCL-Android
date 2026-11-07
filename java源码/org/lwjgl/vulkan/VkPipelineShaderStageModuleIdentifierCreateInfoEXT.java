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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageModuleIdentifierCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageModuleIdentifierCreateInfoEXT.class */
public class VkPipelineShaderStageModuleIdentifierCreateInfoEXT extends Struct<VkPipelineShaderStageModuleIdentifierCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IDENTIFIERSIZE;
    public static final int PIDENTIFIER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IDENTIFIERSIZE = layout.offsetof(2);
        PIDENTIFIER = layout.offsetof(3);
    }

    protected VkPipelineShaderStageModuleIdentifierCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(address, container);
    }

    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT(ByteBuffer container) {
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
    public int identifierSize() {
        return nidentifierSize(address());
    }

    @NativeType("uint8_t const *")
    public ByteBuffer pIdentifier() {
        return npIdentifier(address());
    }

    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT sType$Default() {
        return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT);
    }

    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT pIdentifier(@NativeType("uint8_t const *") ByteBuffer value) {
        npIdentifier(address(), value);
        return this;
    }

    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT set(int sType, long pNext, ByteBuffer pIdentifier) {
        sType(sType);
        pNext(pNext);
        pIdentifier(pIdentifier);
        return this;
    }

    public VkPipelineShaderStageModuleIdentifierCreateInfoEXT set(VkPipelineShaderStageModuleIdentifierCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT malloc() {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT calloc() {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT create(long address) {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(address, null);
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(address, null);
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

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineShaderStageModuleIdentifierCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineShaderStageModuleIdentifierCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nidentifierSize(long struct) {
        return MemoryUtil.memGetInt(struct + IDENTIFIERSIZE);
    }

    public static ByteBuffer npIdentifier(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + PIDENTIFIER), nidentifierSize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nidentifierSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + IDENTIFIERSIZE, value);
    }

    public static void npIdentifier(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PIDENTIFIER, MemoryUtil.memAddressSafe(value));
        nidentifierSize(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nidentifierSize(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PIDENTIFIER));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageModuleIdentifierCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineShaderStageModuleIdentifierCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageModuleIdentifierCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineShaderStageModuleIdentifierCreateInfoEXT ELEMENT_FACTORY = VkPipelineShaderStageModuleIdentifierCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineShaderStageModuleIdentifierCreateInfoEXT.SIZEOF);
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
        public VkPipelineShaderStageModuleIdentifierCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int identifierSize() {
            return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.nidentifierSize(address());
        }

        @NativeType("uint8_t const *")
        public ByteBuffer pIdentifier() {
            return VkPipelineShaderStageModuleIdentifierCreateInfoEXT.npIdentifier(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineShaderStageModuleIdentifierCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineShaderStageModuleIdentifierCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pIdentifier(@NativeType("uint8_t const *") ByteBuffer value) {
            VkPipelineShaderStageModuleIdentifierCreateInfoEXT.npIdentifier(address(), value);
            return this;
        }
    }
}
