package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplaySurfaceStereoCreateInfoNV.class */
public class VkDisplaySurfaceStereoCreateInfoNV extends Struct<VkDisplaySurfaceStereoCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STEREOTYPE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STEREOTYPE = layout.offsetof(2);
    }

    protected VkDisplaySurfaceStereoCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplaySurfaceStereoCreateInfoNV create(long address, ByteBuffer container) {
        return new VkDisplaySurfaceStereoCreateInfoNV(address, container);
    }

    public VkDisplaySurfaceStereoCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkDisplaySurfaceStereoTypeNV")
    public int stereoType() {
        return nstereoType(address());
    }

    public VkDisplaySurfaceStereoCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDisplaySurfaceStereoCreateInfoNV sType$Default() {
        return sType(NVDisplayStereo.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV);
    }

    public VkDisplaySurfaceStereoCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDisplaySurfaceStereoCreateInfoNV stereoType(@NativeType("VkDisplaySurfaceStereoTypeNV") int value) {
        nstereoType(address(), value);
        return this;
    }

    public VkDisplaySurfaceStereoCreateInfoNV set(int sType, long pNext, int stereoType) {
        sType(sType);
        pNext(pNext);
        stereoType(stereoType);
        return this;
    }

    public VkDisplaySurfaceStereoCreateInfoNV set(VkDisplaySurfaceStereoCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDisplaySurfaceStereoCreateInfoNV malloc() {
        return new VkDisplaySurfaceStereoCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplaySurfaceStereoCreateInfoNV calloc() {
        return new VkDisplaySurfaceStereoCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplaySurfaceStereoCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplaySurfaceStereoCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplaySurfaceStereoCreateInfoNV create(long address) {
        return new VkDisplaySurfaceStereoCreateInfoNV(address, null);
    }

    public static VkDisplaySurfaceStereoCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplaySurfaceStereoCreateInfoNV(address, null);
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

    public static VkDisplaySurfaceStereoCreateInfoNV malloc(MemoryStack stack) {
        return new VkDisplaySurfaceStereoCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplaySurfaceStereoCreateInfoNV calloc(MemoryStack stack) {
        return new VkDisplaySurfaceStereoCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstereoType(long struct) {
        return MemoryUtil.memGetInt(struct + STEREOTYPE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstereoType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STEREOTYPE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplaySurfaceStereoCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplaySurfaceStereoCreateInfoNV, Buffer> implements NativeResource {
        private static final VkDisplaySurfaceStereoCreateInfoNV ELEMENT_FACTORY = VkDisplaySurfaceStereoCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplaySurfaceStereoCreateInfoNV.SIZEOF);
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
        public VkDisplaySurfaceStereoCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDisplaySurfaceStereoCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDisplaySurfaceStereoCreateInfoNV.npNext(address());
        }

        @NativeType("VkDisplaySurfaceStereoTypeNV")
        public int stereoType() {
            return VkDisplaySurfaceStereoCreateInfoNV.nstereoType(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDisplaySurfaceStereoCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDisplayStereo.VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDisplaySurfaceStereoCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer stereoType(@NativeType("VkDisplaySurfaceStereoTypeNV") int value) {
            VkDisplaySurfaceStereoCreateInfoNV.nstereoType(address(), value);
            return this;
        }
    }
}
