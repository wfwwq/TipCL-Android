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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerBlockMatchWindowCreateInfoQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerBlockMatchWindowCreateInfoQCOM.class */
public class VkSamplerBlockMatchWindowCreateInfoQCOM extends Struct<VkSamplerBlockMatchWindowCreateInfoQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int WINDOWEXTENT;
    public static final int WINDOWCOMPAREMODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WINDOWEXTENT = layout.offsetof(2);
        WINDOWCOMPAREMODE = layout.offsetof(3);
    }

    protected VkSamplerBlockMatchWindowCreateInfoQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSamplerBlockMatchWindowCreateInfoQCOM create(long address, ByteBuffer container) {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(address, container);
    }

    public VkSamplerBlockMatchWindowCreateInfoQCOM(ByteBuffer container) {
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

    public VkExtent2D windowExtent() {
        return nwindowExtent(address());
    }

    @NativeType("VkBlockMatchWindowCompareModeQCOM")
    public int windowCompareMode() {
        return nwindowCompareMode(address());
    }

    public VkSamplerBlockMatchWindowCreateInfoQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSamplerBlockMatchWindowCreateInfoQCOM sType$Default() {
        return sType(QCOMImageProcessing2.VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM);
    }

    public VkSamplerBlockMatchWindowCreateInfoQCOM pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent(VkExtent2D value) {
        nwindowExtent(address(), value);
        return this;
    }

    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent(Consumer<VkExtent2D> consumer) {
        consumer.accept(windowExtent());
        return this;
    }

    public VkSamplerBlockMatchWindowCreateInfoQCOM windowCompareMode(@NativeType("VkBlockMatchWindowCompareModeQCOM") int value) {
        nwindowCompareMode(address(), value);
        return this;
    }

    public VkSamplerBlockMatchWindowCreateInfoQCOM set(int sType, long pNext, VkExtent2D windowExtent, int windowCompareMode) {
        sType(sType);
        pNext(pNext);
        windowExtent(windowExtent);
        windowCompareMode(windowCompareMode);
        return this;
    }

    public VkSamplerBlockMatchWindowCreateInfoQCOM set(VkSamplerBlockMatchWindowCreateInfoQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM malloc() {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM calloc() {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM create(long address) {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(address, null);
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(address, null);
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

    public static VkSamplerBlockMatchWindowCreateInfoQCOM malloc(MemoryStack stack) {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM calloc(MemoryStack stack) {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent2D nwindowExtent(long struct) {
        return VkExtent2D.create(struct + WINDOWEXTENT);
    }

    public static int nwindowCompareMode(long struct) {
        return MemoryUtil.memGetInt(struct + WINDOWCOMPAREMODE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nwindowExtent(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + WINDOWEXTENT, VkExtent2D.SIZEOF);
    }

    public static void nwindowCompareMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + WINDOWCOMPAREMODE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerBlockMatchWindowCreateInfoQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerBlockMatchWindowCreateInfoQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkSamplerBlockMatchWindowCreateInfoQCOM, Buffer> implements NativeResource {
        private static final VkSamplerBlockMatchWindowCreateInfoQCOM ELEMENT_FACTORY = VkSamplerBlockMatchWindowCreateInfoQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSamplerBlockMatchWindowCreateInfoQCOM.SIZEOF);
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
        public VkSamplerBlockMatchWindowCreateInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSamplerBlockMatchWindowCreateInfoQCOM.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSamplerBlockMatchWindowCreateInfoQCOM.npNext(address());
        }

        public VkExtent2D windowExtent() {
            return VkSamplerBlockMatchWindowCreateInfoQCOM.nwindowExtent(address());
        }

        @NativeType("VkBlockMatchWindowCompareModeQCOM")
        public int windowCompareMode() {
            return VkSamplerBlockMatchWindowCreateInfoQCOM.nwindowCompareMode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerBlockMatchWindowCreateInfoQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMImageProcessing2.VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerBlockMatchWindowCreateInfoQCOM.npNext(address(), value);
            return this;
        }

        public Buffer windowExtent(VkExtent2D value) {
            VkSamplerBlockMatchWindowCreateInfoQCOM.nwindowExtent(address(), value);
            return this;
        }

        public Buffer windowExtent(Consumer<VkExtent2D> consumer) {
            consumer.accept(windowExtent());
            return this;
        }

        public Buffer windowCompareMode(@NativeType("VkBlockMatchWindowCompareModeQCOM") int value) {
            VkSamplerBlockMatchWindowCreateInfoQCOM.nwindowCompareMode(address(), value);
            return this;
        }
    }
}
