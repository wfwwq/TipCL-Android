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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceCreateInfo.class */
public class VkExportFenceCreateInfo extends Struct<VkExportFenceCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HANDLETYPES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HANDLETYPES = layout.offsetof(2);
    }

    protected VkExportFenceCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExportFenceCreateInfo create(long address, ByteBuffer container) {
        return new VkExportFenceCreateInfo(address, container);
    }

    public VkExportFenceCreateInfo(ByteBuffer container) {
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

    @NativeType("VkExternalFenceHandleTypeFlags")
    public int handleTypes() {
        return nhandleTypes(address());
    }

    public VkExportFenceCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExportFenceCreateInfo sType$Default() {
        return sType(1000113000);
    }

    public VkExportFenceCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExportFenceCreateInfo handleTypes(@NativeType("VkExternalFenceHandleTypeFlags") int value) {
        nhandleTypes(address(), value);
        return this;
    }

    public VkExportFenceCreateInfo set(int sType, long pNext, int handleTypes) {
        sType(sType);
        pNext(pNext);
        handleTypes(handleTypes);
        return this;
    }

    public VkExportFenceCreateInfo set(VkExportFenceCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExportFenceCreateInfo malloc() {
        return new VkExportFenceCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExportFenceCreateInfo calloc() {
        return new VkExportFenceCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExportFenceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportFenceCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkExportFenceCreateInfo create(long address) {
        return new VkExportFenceCreateInfo(address, null);
    }

    public static VkExportFenceCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExportFenceCreateInfo(address, null);
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

    public static VkExportFenceCreateInfo malloc(MemoryStack stack) {
        return new VkExportFenceCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExportFenceCreateInfo calloc(MemoryStack stack) {
        return new VkExportFenceCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nhandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + HANDLETYPES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nhandleTypes(long struct, int value) {
        MemoryUtil.memPutInt(struct + HANDLETYPES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExportFenceCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkExportFenceCreateInfo, Buffer> implements NativeResource {
        private static final VkExportFenceCreateInfo ELEMENT_FACTORY = VkExportFenceCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExportFenceCreateInfo.SIZEOF);
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
        public VkExportFenceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExportFenceCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkExportFenceCreateInfo.npNext(address());
        }

        @NativeType("VkExternalFenceHandleTypeFlags")
        public int handleTypes() {
            return VkExportFenceCreateInfo.nhandleTypes(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExportFenceCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000113000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkExportFenceCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer handleTypes(@NativeType("VkExternalFenceHandleTypeFlags") int value) {
            VkExportFenceCreateInfo.nhandleTypes(address(), value);
            return this;
        }
    }
}
