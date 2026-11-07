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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFenceCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFenceCreateInfo.class */
public class VkFenceCreateInfo extends Struct<VkFenceCreateInfo> implements NativeResource {
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

    protected VkFenceCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkFenceCreateInfo create(long address, ByteBuffer container) {
        return new VkFenceCreateInfo(address, container);
    }

    public VkFenceCreateInfo(ByteBuffer container) {
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

    @NativeType("VkFenceCreateFlags")
    public int flags() {
        return nflags(address());
    }

    public VkFenceCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkFenceCreateInfo sType$Default() {
        return sType(8);
    }

    public VkFenceCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkFenceCreateInfo pNext(VkExportFenceCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkFenceCreateInfo pNext(VkExportFenceCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkFenceCreateInfo pNext(VkExportFenceWin32HandleInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkFenceCreateInfo flags(@NativeType("VkFenceCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkFenceCreateInfo set(int sType, long pNext, int flags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        return this;
    }

    public VkFenceCreateInfo set(VkFenceCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkFenceCreateInfo malloc() {
        return new VkFenceCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkFenceCreateInfo calloc() {
        return new VkFenceCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkFenceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFenceCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkFenceCreateInfo create(long address) {
        return new VkFenceCreateInfo(address, null);
    }

    public static VkFenceCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkFenceCreateInfo(address, null);
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

    public static VkFenceCreateInfo malloc(MemoryStack stack) {
        return new VkFenceCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkFenceCreateInfo calloc(MemoryStack stack) {
        return new VkFenceCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFenceCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkFenceCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkFenceCreateInfo, Buffer> implements NativeResource {
        private static final VkFenceCreateInfo ELEMENT_FACTORY = VkFenceCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkFenceCreateInfo.SIZEOF);
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
        public VkFenceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkFenceCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkFenceCreateInfo.npNext(address());
        }

        @NativeType("VkFenceCreateFlags")
        public int flags() {
            return VkFenceCreateInfo.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkFenceCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(8);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkFenceCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkExportFenceCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportFenceCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportFenceWin32HandleInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkFenceCreateFlags") int value) {
            VkFenceCreateInfo.nflags(address(), value);
            return this;
        }
    }
}
