package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDirectDriverLoadingInfoLUNARG.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDirectDriverLoadingInfoLUNARG.class */
public class VkDirectDriverLoadingInfoLUNARG extends Struct<VkDirectDriverLoadingInfoLUNARG> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PFNGETINSTANCEPROCADDR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PFNGETINSTANCEPROCADDR = layout.offsetof(3);
    }

    protected VkDirectDriverLoadingInfoLUNARG(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDirectDriverLoadingInfoLUNARG create(long address, ByteBuffer container) {
        return new VkDirectDriverLoadingInfoLUNARG(address, container);
    }

    public VkDirectDriverLoadingInfoLUNARG(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkDirectDriverLoadingFlagsLUNARG")
    public int flags() {
        return nflags(address());
    }

    @NativeType("PFN_vkGetInstanceProcAddrLUNARG")
    public long pfnGetInstanceProcAddr() {
        return npfnGetInstanceProcAddr(address());
    }

    public VkDirectDriverLoadingInfoLUNARG sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDirectDriverLoadingInfoLUNARG sType$Default() {
        return sType(LUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG);
    }

    public VkDirectDriverLoadingInfoLUNARG pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDirectDriverLoadingInfoLUNARG flags(@NativeType("VkDirectDriverLoadingFlagsLUNARG") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDirectDriverLoadingInfoLUNARG pfnGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddrLUNARG") long value) {
        npfnGetInstanceProcAddr(address(), value);
        return this;
    }

    public VkDirectDriverLoadingInfoLUNARG set(int sType, long pNext, int flags, long pfnGetInstanceProcAddr) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pfnGetInstanceProcAddr(pfnGetInstanceProcAddr);
        return this;
    }

    public VkDirectDriverLoadingInfoLUNARG set(VkDirectDriverLoadingInfoLUNARG src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDirectDriverLoadingInfoLUNARG malloc() {
        return new VkDirectDriverLoadingInfoLUNARG(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDirectDriverLoadingInfoLUNARG calloc() {
        return new VkDirectDriverLoadingInfoLUNARG(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDirectDriverLoadingInfoLUNARG create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDirectDriverLoadingInfoLUNARG(MemoryUtil.memAddress(container), container);
    }

    public static VkDirectDriverLoadingInfoLUNARG create(long address) {
        return new VkDirectDriverLoadingInfoLUNARG(address, null);
    }

    public static VkDirectDriverLoadingInfoLUNARG createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDirectDriverLoadingInfoLUNARG(address, null);
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

    public static VkDirectDriverLoadingInfoLUNARG malloc(MemoryStack stack) {
        return new VkDirectDriverLoadingInfoLUNARG(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDirectDriverLoadingInfoLUNARG calloc(MemoryStack stack) {
        return new VkDirectDriverLoadingInfoLUNARG(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npfnGetInstanceProcAddr(long struct) {
        return MemoryUtil.memGetAddress(struct + PFNGETINSTANCEPROCADDR);
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

    public static void npfnGetInstanceProcAddr(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PFNGETINSTANCEPROCADDR, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PFNGETINSTANCEPROCADDR));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDirectDriverLoadingInfoLUNARG$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDirectDriverLoadingInfoLUNARG$Buffer.class */
    public static class Buffer extends StructBuffer<VkDirectDriverLoadingInfoLUNARG, Buffer> implements NativeResource {
        private static final VkDirectDriverLoadingInfoLUNARG ELEMENT_FACTORY = VkDirectDriverLoadingInfoLUNARG.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDirectDriverLoadingInfoLUNARG.SIZEOF);
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
        public VkDirectDriverLoadingInfoLUNARG getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDirectDriverLoadingInfoLUNARG.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkDirectDriverLoadingInfoLUNARG.npNext(address());
        }

        @NativeType("VkDirectDriverLoadingFlagsLUNARG")
        public int flags() {
            return VkDirectDriverLoadingInfoLUNARG.nflags(address());
        }

        @NativeType("PFN_vkGetInstanceProcAddrLUNARG")
        public long pfnGetInstanceProcAddr() {
            return VkDirectDriverLoadingInfoLUNARG.npfnGetInstanceProcAddr(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDirectDriverLoadingInfoLUNARG.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(LUNARGDirectDriverLoading.VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkDirectDriverLoadingInfoLUNARG.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDirectDriverLoadingFlagsLUNARG") int value) {
            VkDirectDriverLoadingInfoLUNARG.nflags(address(), value);
            return this;
        }

        public Buffer pfnGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddrLUNARG") long value) {
            VkDirectDriverLoadingInfoLUNARG.npfnGetInstanceProcAddr(address(), value);
            return this;
        }
    }
}
