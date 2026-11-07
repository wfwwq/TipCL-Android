package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderPassTransformInfoQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderPassTransformInfoQCOM.class */
public class VkCommandBufferInheritanceRenderPassTransformInfoQCOM extends Struct<VkCommandBufferInheritanceRenderPassTransformInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TRANSFORM;
    public static final int RENDERAREA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TRANSFORM = layout.offsetof(2);
        RENDERAREA = layout.offsetof(3);
    }

    protected VkCommandBufferInheritanceRenderPassTransformInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM create(long address, ByteBuffer container) {
        return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(address, container);
    }

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM(ByteBuffer container) {
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

    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int transform() {
        return ntransform(address());
    }

    public VkRect2D renderArea() {
        return nrenderArea(address());
    }

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM sType$Default() {
        return sType(QCOMRenderPassTransform.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM);
    }

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) {
        ntransform(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea(VkRect2D value) {
        nrenderArea(address(), value);
        return this;
    }

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM renderArea(Consumer<VkRect2D> consumer) {
        consumer.accept(renderArea());
        return this;
    }

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM set(int sType, long pNext, int transform, VkRect2D renderArea) {
        sType(sType);
        pNext(pNext);
        transform(transform);
        renderArea(renderArea);
        return this;
    }

    public VkCommandBufferInheritanceRenderPassTransformInfoQCOM set(VkCommandBufferInheritanceRenderPassTransformInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM malloc() {
        return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM calloc() {
        return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM create(long address) {
        return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(address, null);
    }

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(address, null);
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

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM malloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM calloc(MemoryStack stack) {
        return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntransform(long struct) {
        return MemoryUtil.memGetInt(struct + TRANSFORM);
    }

    public static VkRect2D nrenderArea(long struct) {
        return VkRect2D.create(struct + RENDERAREA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntransform(long struct, int value) {
        MemoryUtil.memPutInt(struct + TRANSFORM, value);
    }

    public static void nrenderArea(long struct, VkRect2D value) {
        MemoryUtil.memCopy(value.address(), struct + RENDERAREA, VkRect2D.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderPassTransformInfoQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderPassTransformInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkCommandBufferInheritanceRenderPassTransformInfoQCOM, Buffer> implements NativeResource {
        private static final VkCommandBufferInheritanceRenderPassTransformInfoQCOM ELEMENT_FACTORY = VkCommandBufferInheritanceRenderPassTransformInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCommandBufferInheritanceRenderPassTransformInfoQCOM.SIZEOF);
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
        public VkCommandBufferInheritanceRenderPassTransformInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.npNext(address());
        }

        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int transform() {
            return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.ntransform(address());
        }

        public VkRect2D renderArea() {
            return VkCommandBufferInheritanceRenderPassTransformInfoQCOM.nrenderArea(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandBufferInheritanceRenderPassTransformInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMRenderPassTransform.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_RENDER_PASS_TRANSFORM_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandBufferInheritanceRenderPassTransformInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) {
            VkCommandBufferInheritanceRenderPassTransformInfoQCOM.ntransform(address(), value);
            return this;
        }

        public Buffer renderArea(VkRect2D value) {
            VkCommandBufferInheritanceRenderPassTransformInfoQCOM.nrenderArea(address(), value);
            return this;
        }

        public Buffer renderArea(Consumer<VkRect2D> consumer) {
            consumer.accept(renderArea());
            return this;
        }
    }
}
