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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportDepthClipControlCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportDepthClipControlCreateInfoEXT.class */
public class VkPipelineViewportDepthClipControlCreateInfoEXT extends Struct<VkPipelineViewportDepthClipControlCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int NEGATIVEONETOONE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NEGATIVEONETOONE = layout.offsetof(2);
    }

    protected VkPipelineViewportDepthClipControlCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineViewportDepthClipControlCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(address, container);
    }

    public VkPipelineViewportDepthClipControlCreateInfoEXT(ByteBuffer container) {
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
    public boolean negativeOneToOne() {
        return nnegativeOneToOne(address()) != 0;
    }

    public VkPipelineViewportDepthClipControlCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineViewportDepthClipControlCreateInfoEXT sType$Default() {
        return sType(EXTDepthClipControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT);
    }

    public VkPipelineViewportDepthClipControlCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineViewportDepthClipControlCreateInfoEXT negativeOneToOne(@NativeType("VkBool32") boolean value) {
        nnegativeOneToOne(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineViewportDepthClipControlCreateInfoEXT set(int sType, long pNext, boolean negativeOneToOne) {
        sType(sType);
        pNext(pNext);
        negativeOneToOne(negativeOneToOne);
        return this;
    }

    public VkPipelineViewportDepthClipControlCreateInfoEXT set(VkPipelineViewportDepthClipControlCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineViewportDepthClipControlCreateInfoEXT malloc() {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineViewportDepthClipControlCreateInfoEXT calloc() {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineViewportDepthClipControlCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineViewportDepthClipControlCreateInfoEXT create(long address) {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(address, null);
    }

    public static VkPipelineViewportDepthClipControlCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(address, null);
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

    public static VkPipelineViewportDepthClipControlCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineViewportDepthClipControlCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineViewportDepthClipControlCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nnegativeOneToOne(long struct) {
        return MemoryUtil.memGetInt(struct + NEGATIVEONETOONE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nnegativeOneToOne(long struct, int value) {
        MemoryUtil.memPutInt(struct + NEGATIVEONETOONE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportDepthClipControlCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineViewportDepthClipControlCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineViewportDepthClipControlCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineViewportDepthClipControlCreateInfoEXT ELEMENT_FACTORY = VkPipelineViewportDepthClipControlCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineViewportDepthClipControlCreateInfoEXT.SIZEOF);
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
        public VkPipelineViewportDepthClipControlCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineViewportDepthClipControlCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineViewportDepthClipControlCreateInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean negativeOneToOne() {
            return VkPipelineViewportDepthClipControlCreateInfoEXT.nnegativeOneToOne(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineViewportDepthClipControlCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDepthClipControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineViewportDepthClipControlCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer negativeOneToOne(@NativeType("VkBool32") boolean value) {
            VkPipelineViewportDepthClipControlCreateInfoEXT.nnegativeOneToOne(address(), value ? 1 : 0);
            return this;
        }
    }
}
