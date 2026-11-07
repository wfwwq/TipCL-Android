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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderModuleIdentifierEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderModuleIdentifierEXT.class */
public class VkShaderModuleIdentifierEXT extends Struct<VkShaderModuleIdentifierEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int IDENTIFIERSIZE;
    public static final int IDENTIFIER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __array(1, 32));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IDENTIFIERSIZE = layout.offsetof(2);
        IDENTIFIER = layout.offsetof(3);
    }

    protected VkShaderModuleIdentifierEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkShaderModuleIdentifierEXT create(long address, ByteBuffer container) {
        return new VkShaderModuleIdentifierEXT(address, container);
    }

    public VkShaderModuleIdentifierEXT(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int identifierSize() {
        return nidentifierSize(address());
    }

    @NativeType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]")
    public ByteBuffer identifier() {
        return nidentifier(address());
    }

    @NativeType("uint8_t")
    public byte identifier(int index) {
        return nidentifier(address(), index);
    }

    public VkShaderModuleIdentifierEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkShaderModuleIdentifierEXT sType$Default() {
        return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT);
    }

    public VkShaderModuleIdentifierEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkShaderModuleIdentifierEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkShaderModuleIdentifierEXT set(VkShaderModuleIdentifierEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkShaderModuleIdentifierEXT malloc() {
        return new VkShaderModuleIdentifierEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkShaderModuleIdentifierEXT calloc() {
        return new VkShaderModuleIdentifierEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkShaderModuleIdentifierEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderModuleIdentifierEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkShaderModuleIdentifierEXT create(long address) {
        return new VkShaderModuleIdentifierEXT(address, null);
    }

    public static VkShaderModuleIdentifierEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkShaderModuleIdentifierEXT(address, null);
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

    public static VkShaderModuleIdentifierEXT malloc(MemoryStack stack) {
        return new VkShaderModuleIdentifierEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkShaderModuleIdentifierEXT calloc(MemoryStack stack) {
        return new VkShaderModuleIdentifierEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer nidentifier(long struct) {
        return MemoryUtil.memByteBuffer(struct + IDENTIFIER, nidentifierSize(struct));
    }

    public static byte nidentifier(long struct, int index) {
        return MemoryUtil.memGetByte(struct + IDENTIFIER + (Checks.check(index, 32) * 1));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderModuleIdentifierEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderModuleIdentifierEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkShaderModuleIdentifierEXT, Buffer> implements NativeResource {
        private static final VkShaderModuleIdentifierEXT ELEMENT_FACTORY = VkShaderModuleIdentifierEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkShaderModuleIdentifierEXT.SIZEOF);
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
        public VkShaderModuleIdentifierEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkShaderModuleIdentifierEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkShaderModuleIdentifierEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int identifierSize() {
            return VkShaderModuleIdentifierEXT.nidentifierSize(address());
        }

        @NativeType("uint8_t[VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT]")
        public ByteBuffer identifier() {
            return VkShaderModuleIdentifierEXT.nidentifier(address());
        }

        @NativeType("uint8_t")
        public byte identifier(int index) {
            return VkShaderModuleIdentifierEXT.nidentifier(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkShaderModuleIdentifierEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderModuleIdentifier.VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkShaderModuleIdentifierEXT.npNext(address(), value);
            return this;
        }
    }
}
