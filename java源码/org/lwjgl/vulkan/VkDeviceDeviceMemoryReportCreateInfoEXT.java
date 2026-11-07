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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceDeviceMemoryReportCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceDeviceMemoryReportCreateInfoEXT.class */
public class VkDeviceDeviceMemoryReportCreateInfoEXT extends Struct<VkDeviceDeviceMemoryReportCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PFNUSERCALLBACK;
    public static final int PUSERDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PFNUSERCALLBACK = layout.offsetof(3);
        PUSERDATA = layout.offsetof(4);
    }

    protected VkDeviceDeviceMemoryReportCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceDeviceMemoryReportCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(address, container);
    }

    public VkDeviceDeviceMemoryReportCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDeviceMemoryReportFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("PFN_vkDeviceMemoryReportCallbackEXT")
    public VkDeviceMemoryReportCallbackEXT pfnUserCallback() {
        return npfnUserCallback(address());
    }

    @NativeType("void *")
    public long pUserData() {
        return npUserData(address());
    }

    public VkDeviceDeviceMemoryReportCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceDeviceMemoryReportCreateInfoEXT sType$Default() {
        return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT);
    }

    public VkDeviceDeviceMemoryReportCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceDeviceMemoryReportCreateInfoEXT flags(@NativeType("VkDeviceMemoryReportFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDeviceDeviceMemoryReportCreateInfoEXT pfnUserCallback(@NativeType("PFN_vkDeviceMemoryReportCallbackEXT") VkDeviceMemoryReportCallbackEXTI value) {
        npfnUserCallback(address(), value);
        return this;
    }

    public VkDeviceDeviceMemoryReportCreateInfoEXT pUserData(@NativeType("void *") long value) {
        npUserData(address(), value);
        return this;
    }

    public VkDeviceDeviceMemoryReportCreateInfoEXT set(int sType, long pNext, int flags, VkDeviceMemoryReportCallbackEXTI pfnUserCallback, long pUserData) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pfnUserCallback(pfnUserCallback);
        pUserData(pUserData);
        return this;
    }

    public VkDeviceDeviceMemoryReportCreateInfoEXT set(VkDeviceDeviceMemoryReportCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceDeviceMemoryReportCreateInfoEXT malloc() {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceDeviceMemoryReportCreateInfoEXT calloc() {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceDeviceMemoryReportCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceDeviceMemoryReportCreateInfoEXT create(long address) {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(address, null);
    }

    public static VkDeviceDeviceMemoryReportCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(address, null);
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

    public static VkDeviceDeviceMemoryReportCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceDeviceMemoryReportCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDeviceDeviceMemoryReportCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkDeviceMemoryReportCallbackEXT npfnUserCallback(long struct) {
        return VkDeviceMemoryReportCallbackEXT.create(MemoryUtil.memGetAddress(struct + PFNUSERCALLBACK));
    }

    public static long npUserData(long struct) {
        return MemoryUtil.memGetAddress(struct + PUSERDATA);
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

    public static void npfnUserCallback(long struct, VkDeviceMemoryReportCallbackEXTI value) {
        MemoryUtil.memPutAddress(struct + PFNUSERCALLBACK, value.address());
    }

    public static void npUserData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PUSERDATA, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PFNUSERCALLBACK));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceDeviceMemoryReportCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceDeviceMemoryReportCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceDeviceMemoryReportCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkDeviceDeviceMemoryReportCreateInfoEXT ELEMENT_FACTORY = VkDeviceDeviceMemoryReportCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceDeviceMemoryReportCreateInfoEXT.SIZEOF);
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
        public VkDeviceDeviceMemoryReportCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceDeviceMemoryReportCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceDeviceMemoryReportCreateInfoEXT.npNext(address());
        }

        @NativeType("VkDeviceMemoryReportFlagsEXT")
        public int flags() {
            return VkDeviceDeviceMemoryReportCreateInfoEXT.nflags(address());
        }

        @NativeType("PFN_vkDeviceMemoryReportCallbackEXT")
        public VkDeviceMemoryReportCallbackEXT pfnUserCallback() {
            return VkDeviceDeviceMemoryReportCreateInfoEXT.npfnUserCallback(address());
        }

        @NativeType("void *")
        public long pUserData() {
            return VkDeviceDeviceMemoryReportCreateInfoEXT.npUserData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceDeviceMemoryReportCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDeviceMemoryReport.VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceDeviceMemoryReportCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDeviceMemoryReportFlagsEXT") int value) {
            VkDeviceDeviceMemoryReportCreateInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer pfnUserCallback(@NativeType("PFN_vkDeviceMemoryReportCallbackEXT") VkDeviceMemoryReportCallbackEXTI value) {
            VkDeviceDeviceMemoryReportCreateInfoEXT.npfnUserCallback(address(), value);
            return this;
        }

        public Buffer pUserData(@NativeType("void *") long value) {
            VkDeviceDeviceMemoryReportCreateInfoEXT.npUserData(address(), value);
            return this;
        }
    }
}
