package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceConditionalRenderingInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceConditionalRenderingInfoEXT.class */
public class VkCommandBufferInheritanceConditionalRenderingInfoEXT extends Struct<VkCommandBufferInheritanceConditionalRenderingInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CONDITIONALRENDERINGENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONDITIONALRENDERINGENABLE = layout.offsetof(2);
    }

    protected VkCommandBufferInheritanceConditionalRenderingInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCommandBufferInheritanceConditionalRenderingInfoEXT create(long address, ByteBuffer container) {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(address, container);
    }

    public VkCommandBufferInheritanceConditionalRenderingInfoEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean conditionalRenderingEnable() {
        return nconditionalRenderingEnable(address()) != 0;
    }

    public VkCommandBufferInheritanceConditionalRenderingInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceConditionalRenderingInfoEXT sType$Default() {
        return sType(EXTConditionalRendering.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT);
    }

    public VkCommandBufferInheritanceConditionalRenderingInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceConditionalRenderingInfoEXT conditionalRenderingEnable(@NativeType("VkBool32") boolean value) {
        nconditionalRenderingEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkCommandBufferInheritanceConditionalRenderingInfoEXT set(int sType, long pNext, boolean conditionalRenderingEnable) {
        sType(sType);
        pNext(pNext);
        conditionalRenderingEnable(conditionalRenderingEnable);
        return this;
    }

    public VkCommandBufferInheritanceConditionalRenderingInfoEXT set(VkCommandBufferInheritanceConditionalRenderingInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT malloc() {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT calloc() {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT create(long address) {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(address, null);
    }

    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(address, null);
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

    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceConditionalRenderingInfoEXT calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceConditionalRenderingInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nconditionalRenderingEnable(long struct) {
        return MemoryUtil.memGetInt(struct + CONDITIONALRENDERINGENABLE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nconditionalRenderingEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONDITIONALRENDERINGENABLE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceConditionalRenderingInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceConditionalRenderingInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceConditionalRenderingInfoEXT, Buffer> implements NativeResource {
        private static final VkCommandBufferInheritanceConditionalRenderingInfoEXT ELEMENT_FACTORY = VkCommandBufferInheritanceConditionalRenderingInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCommandBufferInheritanceConditionalRenderingInfoEXT.SIZEOF);
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
        public VkCommandBufferInheritanceConditionalRenderingInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCommandBufferInheritanceConditionalRenderingInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCommandBufferInheritanceConditionalRenderingInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean conditionalRenderingEnable() {
            return VkCommandBufferInheritanceConditionalRenderingInfoEXT.nconditionalRenderingEnable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferInheritanceConditionalRenderingInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTConditionalRendering.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferInheritanceConditionalRenderingInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer conditionalRenderingEnable(@NativeType("VkBool32") boolean value) {
            VkCommandBufferInheritanceConditionalRenderingInfoEXT.nconditionalRenderingEnable(address(), value ? 1 : 0);
            return this;
        }
    }
}
