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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyCommandTransformInfoQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyCommandTransformInfoQCOM.class */
public class VkCopyCommandTransformInfoQCOM extends Struct<VkCopyCommandTransformInfoQCOM> implements NativeResource {
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

    protected VkCopyCommandTransformInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCopyCommandTransformInfoQCOM create(long address, ByteBuffer container) {
        return new VkCopyCommandTransformInfoQCOM(address, container);
    }

    public VkCopyCommandTransformInfoQCOM(ByteBuffer container) {
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

    public VkCopyCommandTransformInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCopyCommandTransformInfoQCOM sType$Default() {
        return sType(QCOMRotatedCopyCommands.VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM);
    }

    public VkCopyCommandTransformInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCopyCommandTransformInfoQCOM transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) {
        ntransform(address(), value);
        return this;
    }

    public VkCopyCommandTransformInfoQCOM set(int sType, long pNext, int transform) {
        sType(sType);
        pNext(pNext);
        transform(transform);
        return this;
    }

    public VkCopyCommandTransformInfoQCOM set(VkCopyCommandTransformInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCopyCommandTransformInfoQCOM malloc() {
        return new VkCopyCommandTransformInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCopyCommandTransformInfoQCOM calloc() {
        return new VkCopyCommandTransformInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCopyCommandTransformInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyCommandTransformInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkCopyCommandTransformInfoQCOM create(long address) {
        return new VkCopyCommandTransformInfoQCOM(address, null);
    }

    public static VkCopyCommandTransformInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCopyCommandTransformInfoQCOM(address, null);
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

    public static VkCopyCommandTransformInfoQCOM malloc(MemoryStack stack) {
        return new VkCopyCommandTransformInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCopyCommandTransformInfoQCOM calloc(MemoryStack stack) {
        return new VkCopyCommandTransformInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyCommandTransformInfoQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCopyCommandTransformInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkCopyCommandTransformInfoQCOM, Buffer> implements NativeResource {
        private static final VkCopyCommandTransformInfoQCOM ELEMENT_FACTORY = VkCopyCommandTransformInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCopyCommandTransformInfoQCOM.SIZEOF);
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
        public VkCopyCommandTransformInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCopyCommandTransformInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCopyCommandTransformInfoQCOM.npNext(address());
        }

        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int transform() {
            return VkCopyCommandTransformInfoQCOM.ntransform(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCopyCommandTransformInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMRotatedCopyCommands.VK_STRUCTURE_TYPE_COPY_COMMAND_TRANSFORM_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCopyCommandTransformInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer transform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) {
            VkCopyCommandTransformInfoQCOM.ntransform(address(), value);
            return this;
        }
    }
}
