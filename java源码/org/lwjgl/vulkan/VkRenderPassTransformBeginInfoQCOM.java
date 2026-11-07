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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassTransformBeginInfoQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassTransformBeginInfoQCOM.class */
public class VkRenderPassTransformBeginInfoQCOM extends Struct<VkRenderPassTransformBeginInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TRANSFORM;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TRANSFORM = layout.offsetof(2);
    }

    protected VkRenderPassTransformBeginInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRenderPassTransformBeginInfoQCOM create(long address, ByteBuffer container) {
        return new VkRenderPassTransformBeginInfoQCOM(address, container);
    }

    public VkRenderPassTransformBeginInfoQCOM(ByteBuffer container) {
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

    public VkRenderPassTransformBeginInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRenderPassTransformBeginInfoQCOM sType$Default() {
        return sType(QCOMRenderPassTransform.VK_STRUCTURE_TYPE_RENDER_PASS_TRANSFORM_BEGIN_INFO_QCOM);
    }

    public VkRenderPassTransformBeginInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRenderPassTransformBeginInfoQCOM transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) {
        ntransform(address(), value);
        return this;
    }

    public VkRenderPassTransformBeginInfoQCOM set(int sType, long pNext, int transform) {
        sType(sType);
        pNext(pNext);
        transform(transform);
        return this;
    }

    public VkRenderPassTransformBeginInfoQCOM set(VkRenderPassTransformBeginInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRenderPassTransformBeginInfoQCOM malloc() {
        return new VkRenderPassTransformBeginInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRenderPassTransformBeginInfoQCOM calloc() {
        return new VkRenderPassTransformBeginInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRenderPassTransformBeginInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassTransformBeginInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkRenderPassTransformBeginInfoQCOM create(long address) {
        return new VkRenderPassTransformBeginInfoQCOM(address, null);
    }

    public static VkRenderPassTransformBeginInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRenderPassTransformBeginInfoQCOM(address, null);
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

    public static VkRenderPassTransformBeginInfoQCOM malloc(MemoryStack stack) {
        return new VkRenderPassTransformBeginInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRenderPassTransformBeginInfoQCOM calloc(MemoryStack stack) {
        return new VkRenderPassTransformBeginInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntransform(long struct, int value) {
        MemoryUtil.memPutInt(struct + TRANSFORM, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassTransformBeginInfoQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRenderPassTransformBeginInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkRenderPassTransformBeginInfoQCOM, Buffer> implements NativeResource {
        private static final VkRenderPassTransformBeginInfoQCOM ELEMENT_FACTORY = VkRenderPassTransformBeginInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRenderPassTransformBeginInfoQCOM.SIZEOF);
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
        public VkRenderPassTransformBeginInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRenderPassTransformBeginInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRenderPassTransformBeginInfoQCOM.npNext(address());
        }

        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int transform() {
            return VkRenderPassTransformBeginInfoQCOM.ntransform(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRenderPassTransformBeginInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMRenderPassTransform.VK_STRUCTURE_TYPE_RENDER_PASS_TRANSFORM_BEGIN_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRenderPassTransformBeginInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) {
            VkRenderPassTransformBeginInfoQCOM.ntransform(address(), value);
            return this;
        }
    }
}
