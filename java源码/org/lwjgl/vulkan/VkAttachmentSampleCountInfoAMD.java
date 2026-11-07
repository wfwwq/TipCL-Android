package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoAMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoAMD.class */
public class VkAttachmentSampleCountInfoAMD extends Struct<VkAttachmentSampleCountInfoAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COLORATTACHMENTCOUNT;
    public static final int PCOLORATTACHMENTSAMPLES;
    public static final int DEPTHSTENCILATTACHMENTSAMPLES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COLORATTACHMENTCOUNT = layout.offsetof(2);
        PCOLORATTACHMENTSAMPLES = layout.offsetof(3);
        DEPTHSTENCILATTACHMENTSAMPLES = layout.offsetof(4);
    }

    protected VkAttachmentSampleCountInfoAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAttachmentSampleCountInfoAMD create(long address, ByteBuffer container) {
        return new VkAttachmentSampleCountInfoAMD(address, container);
    }

    public VkAttachmentSampleCountInfoAMD(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int colorAttachmentCount() {
        return ncolorAttachmentCount(address());
    }

    @NativeType("VkSampleCountFlagBits const *")
    public IntBuffer pColorAttachmentSamples() {
        return npColorAttachmentSamples(address());
    }

    @NativeType("VkSampleCountFlagBits")
    public int depthStencilAttachmentSamples() {
        return ndepthStencilAttachmentSamples(address());
    }

    public VkAttachmentSampleCountInfoAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAttachmentSampleCountInfoAMD sType$Default() {
        return sType(1000044008);
    }

    public VkAttachmentSampleCountInfoAMD pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAttachmentSampleCountInfoAMD colorAttachmentCount(@NativeType("uint32_t") int value) {
        ncolorAttachmentCount(address(), value);
        return this;
    }

    public VkAttachmentSampleCountInfoAMD pColorAttachmentSamples(@NativeType("VkSampleCountFlagBits const *") IntBuffer value) {
        npColorAttachmentSamples(address(), value);
        return this;
    }

    public VkAttachmentSampleCountInfoAMD depthStencilAttachmentSamples(@NativeType("VkSampleCountFlagBits") int value) {
        ndepthStencilAttachmentSamples(address(), value);
        return this;
    }

    public VkAttachmentSampleCountInfoAMD set(int sType, long pNext, int colorAttachmentCount, IntBuffer pColorAttachmentSamples, int depthStencilAttachmentSamples) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentSamples(pColorAttachmentSamples);
        depthStencilAttachmentSamples(depthStencilAttachmentSamples);
        return this;
    }

    public VkAttachmentSampleCountInfoAMD set(VkAttachmentSampleCountInfoAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAttachmentSampleCountInfoAMD malloc() {
        return new VkAttachmentSampleCountInfoAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAttachmentSampleCountInfoAMD calloc() {
        return new VkAttachmentSampleCountInfoAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAttachmentSampleCountInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentSampleCountInfoAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkAttachmentSampleCountInfoAMD create(long address) {
        return new VkAttachmentSampleCountInfoAMD(address, null);
    }

    public static VkAttachmentSampleCountInfoAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAttachmentSampleCountInfoAMD(address, null);
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

    public static VkAttachmentSampleCountInfoAMD malloc(MemoryStack stack) {
        return new VkAttachmentSampleCountInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAttachmentSampleCountInfoAMD calloc(MemoryStack stack) {
        return new VkAttachmentSampleCountInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncolorAttachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + COLORATTACHMENTCOUNT);
    }

    public static IntBuffer npColorAttachmentSamples(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PCOLORATTACHMENTSAMPLES), ncolorAttachmentCount(struct));
    }

    public static int ndepthStencilAttachmentSamples(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHSTENCILATTACHMENTSAMPLES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncolorAttachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + COLORATTACHMENTCOUNT, value);
    }

    public static void npColorAttachmentSamples(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PCOLORATTACHMENTSAMPLES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ncolorAttachmentCount(struct, value.remaining());
        }
    }

    public static void ndepthStencilAttachmentSamples(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHSTENCILATTACHMENTSAMPLES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoAMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAttachmentSampleCountInfoAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkAttachmentSampleCountInfoAMD, Buffer> implements NativeResource {
        private static final VkAttachmentSampleCountInfoAMD ELEMENT_FACTORY = VkAttachmentSampleCountInfoAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAttachmentSampleCountInfoAMD.SIZEOF);
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
        public VkAttachmentSampleCountInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAttachmentSampleCountInfoAMD.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAttachmentSampleCountInfoAMD.npNext(address());
        }

        @NativeType("uint32_t")
        public int colorAttachmentCount() {
            return VkAttachmentSampleCountInfoAMD.ncolorAttachmentCount(address());
        }

        @NativeType("VkSampleCountFlagBits const *")
        public IntBuffer pColorAttachmentSamples() {
            return VkAttachmentSampleCountInfoAMD.npColorAttachmentSamples(address());
        }

        @NativeType("VkSampleCountFlagBits")
        public int depthStencilAttachmentSamples() {
            return VkAttachmentSampleCountInfoAMD.ndepthStencilAttachmentSamples(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAttachmentSampleCountInfoAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000044008);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAttachmentSampleCountInfoAMD.npNext(address(), value);
            return this;
        }

        public Buffer colorAttachmentCount(@NativeType("uint32_t") int value) {
            VkAttachmentSampleCountInfoAMD.ncolorAttachmentCount(address(), value);
            return this;
        }

        public Buffer pColorAttachmentSamples(@NativeType("VkSampleCountFlagBits const *") IntBuffer value) {
            VkAttachmentSampleCountInfoAMD.npColorAttachmentSamples(address(), value);
            return this;
        }

        public Buffer depthStencilAttachmentSamples(@NativeType("VkSampleCountFlagBits") int value) {
            VkAttachmentSampleCountInfoAMD.ndepthStencilAttachmentSamples(address(), value);
            return this;
        }
    }
}
