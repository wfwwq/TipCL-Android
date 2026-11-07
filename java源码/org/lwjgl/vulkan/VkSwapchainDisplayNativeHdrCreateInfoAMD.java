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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainDisplayNativeHdrCreateInfoAMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainDisplayNativeHdrCreateInfoAMD.class */
public class VkSwapchainDisplayNativeHdrCreateInfoAMD extends Struct<VkSwapchainDisplayNativeHdrCreateInfoAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int LOCALDIMMINGENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LOCALDIMMINGENABLE = layout.offsetof(2);
    }

    protected VkSwapchainDisplayNativeHdrCreateInfoAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainDisplayNativeHdrCreateInfoAMD create(long address, ByteBuffer container) {
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(address, container);
    }

    public VkSwapchainDisplayNativeHdrCreateInfoAMD(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean localDimmingEnable() {
        return nlocalDimmingEnable(address()) != 0;
    }

    public VkSwapchainDisplayNativeHdrCreateInfoAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainDisplayNativeHdrCreateInfoAMD sType$Default() {
        return sType(AMDDisplayNativeHdr.VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD);
    }

    public VkSwapchainDisplayNativeHdrCreateInfoAMD pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainDisplayNativeHdrCreateInfoAMD localDimmingEnable(@NativeType("VkBool32") boolean value) {
        nlocalDimmingEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkSwapchainDisplayNativeHdrCreateInfoAMD set(int sType, long pNext, boolean localDimmingEnable) {
        sType(sType);
        pNext(pNext);
        localDimmingEnable(localDimmingEnable);
        return this;
    }

    public VkSwapchainDisplayNativeHdrCreateInfoAMD set(VkSwapchainDisplayNativeHdrCreateInfoAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainDisplayNativeHdrCreateInfoAMD malloc() {
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainDisplayNativeHdrCreateInfoAMD calloc() {
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainDisplayNativeHdrCreateInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainDisplayNativeHdrCreateInfoAMD create(long address) {
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(address, null);
    }

    public static VkSwapchainDisplayNativeHdrCreateInfoAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(address, null);
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

    public static VkSwapchainDisplayNativeHdrCreateInfoAMD malloc(MemoryStack stack) {
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainDisplayNativeHdrCreateInfoAMD calloc(MemoryStack stack) {
        return new VkSwapchainDisplayNativeHdrCreateInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlocalDimmingEnable(long struct) {
        return MemoryUtil.memGetInt(struct + LOCALDIMMINGENABLE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nlocalDimmingEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOCALDIMMINGENABLE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainDisplayNativeHdrCreateInfoAMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainDisplayNativeHdrCreateInfoAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainDisplayNativeHdrCreateInfoAMD, Buffer> implements NativeResource {
        private static final VkSwapchainDisplayNativeHdrCreateInfoAMD ELEMENT_FACTORY = VkSwapchainDisplayNativeHdrCreateInfoAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainDisplayNativeHdrCreateInfoAMD.SIZEOF);
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
        public VkSwapchainDisplayNativeHdrCreateInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainDisplayNativeHdrCreateInfoAMD.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSwapchainDisplayNativeHdrCreateInfoAMD.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean localDimmingEnable() {
            return VkSwapchainDisplayNativeHdrCreateInfoAMD.nlocalDimmingEnable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainDisplayNativeHdrCreateInfoAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDDisplayNativeHdr.VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSwapchainDisplayNativeHdrCreateInfoAMD.npNext(address(), value);
            return this;
        }

        public Buffer localDimmingEnable(@NativeType("VkBool32") boolean value) {
            VkSwapchainDisplayNativeHdrCreateInfoAMD.nlocalDimmingEnable(address(), value ? 1 : 0);
            return this;
        }
    }
}
