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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerReductionModeCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerReductionModeCreateInfo.class */
public class VkSamplerReductionModeCreateInfo extends Struct<VkSamplerReductionModeCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int REDUCTIONMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        REDUCTIONMODE = layout.offsetof(2);
    }

    protected VkSamplerReductionModeCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSamplerReductionModeCreateInfo create(long address, ByteBuffer container) {
        return new VkSamplerReductionModeCreateInfo(address, container);
    }

    public VkSamplerReductionModeCreateInfo(ByteBuffer container) {
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

    @NativeType("VkSamplerReductionMode")
    public int reductionMode() {
        return nreductionMode(address());
    }

    public VkSamplerReductionModeCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSamplerReductionModeCreateInfo sType$Default() {
        return sType(1000130001);
    }

    public VkSamplerReductionModeCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSamplerReductionModeCreateInfo reductionMode(@NativeType("VkSamplerReductionMode") int value) {
        nreductionMode(address(), value);
        return this;
    }

    public VkSamplerReductionModeCreateInfo set(int sType, long pNext, int reductionMode) {
        sType(sType);
        pNext(pNext);
        reductionMode(reductionMode);
        return this;
    }

    public VkSamplerReductionModeCreateInfo set(VkSamplerReductionModeCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerReductionModeCreateInfo malloc() {
        return new VkSamplerReductionModeCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerReductionModeCreateInfo calloc() {
        return new VkSamplerReductionModeCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerReductionModeCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerReductionModeCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerReductionModeCreateInfo create(long address) {
        return new VkSamplerReductionModeCreateInfo(address, null);
    }

    public static VkSamplerReductionModeCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerReductionModeCreateInfo(address, null);
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

    public static VkSamplerReductionModeCreateInfo malloc(MemoryStack stack) {
        return new VkSamplerReductionModeCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerReductionModeCreateInfo calloc(MemoryStack stack) {
        return new VkSamplerReductionModeCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nreductionMode(long struct) {
        return MemoryUtil.memGetInt(struct + REDUCTIONMODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nreductionMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + REDUCTIONMODE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerReductionModeCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerReductionModeCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSamplerReductionModeCreateInfo, Buffer> implements NativeResource {
        private static final VkSamplerReductionModeCreateInfo ELEMENT_FACTORY = VkSamplerReductionModeCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSamplerReductionModeCreateInfo.SIZEOF);
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
        public VkSamplerReductionModeCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSamplerReductionModeCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSamplerReductionModeCreateInfo.npNext(address());
        }

        @NativeType("VkSamplerReductionMode")
        public int reductionMode() {
            return VkSamplerReductionModeCreateInfo.nreductionMode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerReductionModeCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000130001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerReductionModeCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer reductionMode(@NativeType("VkSamplerReductionMode") int value) {
            VkSamplerReductionModeCreateInfo.nreductionMode(address(), value);
            return this;
        }
    }
}
