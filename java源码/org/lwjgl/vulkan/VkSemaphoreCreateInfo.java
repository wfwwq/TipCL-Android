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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreCreateInfo.class */
public class VkSemaphoreCreateInfo extends Struct<VkSemaphoreCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkSemaphoreCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSemaphoreCreateInfo create(long address, ByteBuffer container) {
        return new VkSemaphoreCreateInfo(address, container);
    }

    public VkSemaphoreCreateInfo(ByteBuffer container) {
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

    @NativeType("VkSemaphoreCreateFlags")
    public int flags() {
        return nflags(address());
    }

    public VkSemaphoreCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSemaphoreCreateInfo sType$Default() {
        return sType(9);
    }

    public VkSemaphoreCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSemaphoreCreateInfo pNext(VkExportMetalObjectCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSemaphoreCreateInfo pNext(VkExportSemaphoreCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSemaphoreCreateInfo pNext(VkExportSemaphoreCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSemaphoreCreateInfo pNext(VkExportSemaphoreWin32HandleInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSemaphoreCreateInfo pNext(VkImportMetalSharedEventInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSemaphoreCreateInfo pNext(VkQueryLowLatencySupportNV value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSemaphoreCreateInfo pNext(VkSemaphoreTypeCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSemaphoreCreateInfo pNext(VkSemaphoreTypeCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSemaphoreCreateInfo flags(@NativeType("VkSemaphoreCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkSemaphoreCreateInfo set(int sType, long pNext, int flags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        return this;
    }

    public VkSemaphoreCreateInfo set(VkSemaphoreCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSemaphoreCreateInfo malloc() {
        return new VkSemaphoreCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSemaphoreCreateInfo calloc() {
        return new VkSemaphoreCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSemaphoreCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSemaphoreCreateInfo create(long address) {
        return new VkSemaphoreCreateInfo(address, null);
    }

    public static VkSemaphoreCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSemaphoreCreateInfo(address, null);
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

    public static VkSemaphoreCreateInfo malloc(MemoryStack stack) {
        return new VkSemaphoreCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSemaphoreCreateInfo calloc(MemoryStack stack) {
        return new VkSemaphoreCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSemaphoreCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSemaphoreCreateInfo, Buffer> implements NativeResource {
        private static final VkSemaphoreCreateInfo ELEMENT_FACTORY = VkSemaphoreCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSemaphoreCreateInfo.SIZEOF);
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
        public VkSemaphoreCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSemaphoreCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSemaphoreCreateInfo.npNext(address());
        }

        @NativeType("VkSemaphoreCreateFlags")
        public int flags() {
            return VkSemaphoreCreateInfo.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSemaphoreCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(9);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSemaphoreCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkExportMetalObjectCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportSemaphoreCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportSemaphoreCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportSemaphoreWin32HandleInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportMetalSharedEventInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkQueryLowLatencySupportNV value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSemaphoreTypeCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSemaphoreTypeCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkSemaphoreCreateFlags") int value) {
            VkSemaphoreCreateInfo.nflags(address(), value);
            return this;
        }
    }
}
