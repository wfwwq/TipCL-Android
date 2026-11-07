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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassEndInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassEndInfo.class */
public class VkSubpassEndInfo extends Struct<VkSubpassEndInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
    }

    protected VkSubpassEndInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubpassEndInfo create(long address, ByteBuffer container) {
        return new VkSubpassEndInfo(address, container);
    }

    public VkSubpassEndInfo(ByteBuffer container) {
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

    public VkSubpassEndInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSubpassEndInfo sType$Default() {
        return sType(1000109006);
    }

    public VkSubpassEndInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSubpassEndInfo pNext(VkRenderPassFragmentDensityMapOffsetEndInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassEndInfo pNext(VkSubpassFragmentDensityMapOffsetEndInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSubpassEndInfo set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSubpassEndInfo set(VkSubpassEndInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassEndInfo malloc() {
        return new VkSubpassEndInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassEndInfo calloc() {
        return new VkSubpassEndInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassEndInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassEndInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassEndInfo create(long address) {
        return new VkSubpassEndInfo(address, null);
    }

    public static VkSubpassEndInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassEndInfo(address, null);
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

    public static VkSubpassEndInfo malloc(MemoryStack stack) {
        return new VkSubpassEndInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassEndInfo calloc(MemoryStack stack) {
        return new VkSubpassEndInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassEndInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassEndInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubpassEndInfo, Buffer> implements NativeResource {
        private static final VkSubpassEndInfo ELEMENT_FACTORY = VkSubpassEndInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubpassEndInfo.SIZEOF);
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
        public VkSubpassEndInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSubpassEndInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSubpassEndInfo.npNext(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassEndInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000109006);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassEndInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkRenderPassFragmentDensityMapOffsetEndInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSubpassFragmentDensityMapOffsetEndInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }
    }
}
