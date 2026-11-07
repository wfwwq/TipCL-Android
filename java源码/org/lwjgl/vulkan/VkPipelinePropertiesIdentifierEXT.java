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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelinePropertiesIdentifierEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelinePropertiesIdentifierEXT.class */
public class VkPipelinePropertiesIdentifierEXT extends Struct<VkPipelinePropertiesIdentifierEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PIPELINEIDENTIFIER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __array(1, 16));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PIPELINEIDENTIFIER = layout.offsetof(2);
    }

    protected VkPipelinePropertiesIdentifierEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelinePropertiesIdentifierEXT create(long address, ByteBuffer container) {
        return new VkPipelinePropertiesIdentifierEXT(address, container);
    }

    public VkPipelinePropertiesIdentifierEXT(ByteBuffer container) {
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

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer pipelineIdentifier() {
        return npipelineIdentifier(address());
    }

    @NativeType("uint8_t")
    public byte pipelineIdentifier(int index) {
        return npipelineIdentifier(address(), index);
    }

    public VkPipelinePropertiesIdentifierEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelinePropertiesIdentifierEXT sType$Default() {
        return sType(EXTPipelineProperties.VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT);
    }

    public VkPipelinePropertiesIdentifierEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelinePropertiesIdentifierEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPipelinePropertiesIdentifierEXT set(VkPipelinePropertiesIdentifierEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelinePropertiesIdentifierEXT malloc() {
        return new VkPipelinePropertiesIdentifierEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelinePropertiesIdentifierEXT calloc() {
        return new VkPipelinePropertiesIdentifierEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelinePropertiesIdentifierEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelinePropertiesIdentifierEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelinePropertiesIdentifierEXT create(long address) {
        return new VkPipelinePropertiesIdentifierEXT(address, null);
    }

    public static VkPipelinePropertiesIdentifierEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelinePropertiesIdentifierEXT(address, null);
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

    public static VkPipelinePropertiesIdentifierEXT malloc(MemoryStack stack) {
        return new VkPipelinePropertiesIdentifierEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelinePropertiesIdentifierEXT calloc(MemoryStack stack) {
        return new VkPipelinePropertiesIdentifierEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npipelineIdentifier(long struct) {
        return MemoryUtil.memByteBuffer(struct + PIPELINEIDENTIFIER, 16);
    }

    public static byte npipelineIdentifier(long struct, int index) {
        return MemoryUtil.memGetByte(struct + PIPELINEIDENTIFIER + (Checks.check(index, 16) * 1));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelinePropertiesIdentifierEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelinePropertiesIdentifierEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelinePropertiesIdentifierEXT, Buffer> implements NativeResource {
        private static final VkPipelinePropertiesIdentifierEXT ELEMENT_FACTORY = VkPipelinePropertiesIdentifierEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelinePropertiesIdentifierEXT.SIZEOF);
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
        public VkPipelinePropertiesIdentifierEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelinePropertiesIdentifierEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPipelinePropertiesIdentifierEXT.npNext(address());
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer pipelineIdentifier() {
            return VkPipelinePropertiesIdentifierEXT.npipelineIdentifier(address());
        }

        @NativeType("uint8_t")
        public byte pipelineIdentifier(int index) {
            return VkPipelinePropertiesIdentifierEXT.npipelineIdentifier(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelinePropertiesIdentifierEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPipelineProperties.VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPipelinePropertiesIdentifierEXT.npNext(address(), value);
            return this;
        }
    }
}
