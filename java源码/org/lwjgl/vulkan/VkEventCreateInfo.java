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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkEventCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkEventCreateInfo.class */
public class VkEventCreateInfo extends Struct<VkEventCreateInfo> implements NativeResource {
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

    protected VkEventCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkEventCreateInfo create(long address, ByteBuffer container) {
        return new VkEventCreateInfo(address, container);
    }

    public VkEventCreateInfo(ByteBuffer container) {
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

    @NativeType("VkEventCreateFlags")
    public int flags() {
        return nflags(address());
    }

    public VkEventCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkEventCreateInfo sType$Default() {
        return sType(10);
    }

    public VkEventCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkEventCreateInfo pNext(VkExportMetalObjectCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkEventCreateInfo pNext(VkImportMetalSharedEventInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkEventCreateInfo flags(@NativeType("VkEventCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkEventCreateInfo set(int sType, long pNext, int flags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        return this;
    }

    public VkEventCreateInfo set(VkEventCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkEventCreateInfo malloc() {
        return new VkEventCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkEventCreateInfo calloc() {
        return new VkEventCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkEventCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkEventCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkEventCreateInfo create(long address) {
        return new VkEventCreateInfo(address, null);
    }

    public static VkEventCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkEventCreateInfo(address, null);
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

    public static VkEventCreateInfo malloc(MemoryStack stack) {
        return new VkEventCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkEventCreateInfo calloc(MemoryStack stack) {
        return new VkEventCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkEventCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkEventCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkEventCreateInfo, Buffer> implements NativeResource {
        private static final VkEventCreateInfo ELEMENT_FACTORY = VkEventCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkEventCreateInfo.SIZEOF);
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
        public VkEventCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkEventCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkEventCreateInfo.npNext(address());
        }

        @NativeType("VkEventCreateFlags")
        public int flags() {
            return VkEventCreateInfo.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkEventCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(10);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkEventCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkExportMetalObjectCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkImportMetalSharedEventInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkEventCreateFlags") int value) {
            VkEventCreateInfo.nflags(address(), value);
            return this;
        }
    }
}
