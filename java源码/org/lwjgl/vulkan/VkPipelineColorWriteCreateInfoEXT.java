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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorWriteCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorWriteCreateInfoEXT.class */
public class VkPipelineColorWriteCreateInfoEXT extends Struct<VkPipelineColorWriteCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ATTACHMENTCOUNT;
    public static final int PCOLORWRITEENABLES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ATTACHMENTCOUNT = layout.offsetof(2);
        PCOLORWRITEENABLES = layout.offsetof(3);
    }

    protected VkPipelineColorWriteCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineColorWriteCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineColorWriteCreateInfoEXT(address, container);
    }

    public VkPipelineColorWriteCreateInfoEXT(ByteBuffer container) {
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
    public int attachmentCount() {
        return nattachmentCount(address());
    }

    @NativeType("VkBool32 const *")
    public IntBuffer pColorWriteEnables() {
        return npColorWriteEnables(address());
    }

    public VkPipelineColorWriteCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineColorWriteCreateInfoEXT sType$Default() {
        return sType(EXTColorWriteEnable.VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT);
    }

    public VkPipelineColorWriteCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineColorWriteCreateInfoEXT pColorWriteEnables(@NativeType("VkBool32 const *") IntBuffer value) {
        npColorWriteEnables(address(), value);
        return this;
    }

    public VkPipelineColorWriteCreateInfoEXT set(int sType, long pNext, IntBuffer pColorWriteEnables) {
        sType(sType);
        pNext(pNext);
        pColorWriteEnables(pColorWriteEnables);
        return this;
    }

    public VkPipelineColorWriteCreateInfoEXT set(VkPipelineColorWriteCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineColorWriteCreateInfoEXT malloc() {
        return new VkPipelineColorWriteCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineColorWriteCreateInfoEXT calloc() {
        return new VkPipelineColorWriteCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineColorWriteCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineColorWriteCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineColorWriteCreateInfoEXT create(long address) {
        return new VkPipelineColorWriteCreateInfoEXT(address, null);
    }

    public static VkPipelineColorWriteCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineColorWriteCreateInfoEXT(address, null);
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

    public static VkPipelineColorWriteCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineColorWriteCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineColorWriteCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineColorWriteCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nattachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + ATTACHMENTCOUNT);
    }

    public static IntBuffer npColorWriteEnables(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCOLORWRITEENABLES), nattachmentCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nattachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ATTACHMENTCOUNT, value);
    }

    public static void npColorWriteEnables(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOLORWRITEENABLES, MemoryUtil.memAddressSafe(value));
        nattachmentCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nattachmentCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PCOLORWRITEENABLES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorWriteCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorWriteCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineColorWriteCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineColorWriteCreateInfoEXT ELEMENT_FACTORY = VkPipelineColorWriteCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineColorWriteCreateInfoEXT.SIZEOF);
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
        public VkPipelineColorWriteCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineColorWriteCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineColorWriteCreateInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int attachmentCount() {
            return VkPipelineColorWriteCreateInfoEXT.nattachmentCount(address());
        }

        @NativeType("VkBool32 const *")
        public IntBuffer pColorWriteEnables() {
            return VkPipelineColorWriteCreateInfoEXT.npColorWriteEnables(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineColorWriteCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTColorWriteEnable.VK_STRUCTURE_TYPE_PIPELINE_COLOR_WRITE_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineColorWriteCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pColorWriteEnables(@NativeType("VkBool32 const *") IntBuffer value) {
            VkPipelineColorWriteCreateInfoEXT.npColorWriteEnables(address(), value);
            return this;
        }
    }
}
