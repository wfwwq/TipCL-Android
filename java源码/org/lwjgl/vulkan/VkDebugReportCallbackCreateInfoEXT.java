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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugReportCallbackCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugReportCallbackCreateInfoEXT.class */
public class VkDebugReportCallbackCreateInfoEXT extends Struct<VkDebugReportCallbackCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PFNCALLBACK;
    public static final int PUSERDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PFNCALLBACK = layout.offsetof(3);
        PUSERDATA = layout.offsetof(4);
    }

    protected VkDebugReportCallbackCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDebugReportCallbackCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkDebugReportCallbackCreateInfoEXT(address, container);
    }

    public VkDebugReportCallbackCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDebugReportFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("PFN_vkDebugReportCallbackEXT")
    public VkDebugReportCallbackEXT pfnCallback() {
        return npfnCallback(address());
    }

    @NativeType("void *")
    public long pUserData() {
        return npUserData(address());
    }

    public VkDebugReportCallbackCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDebugReportCallbackCreateInfoEXT sType$Default() {
        return sType(1000011000);
    }

    public VkDebugReportCallbackCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDebugReportCallbackCreateInfoEXT flags(@NativeType("VkDebugReportFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDebugReportCallbackCreateInfoEXT pfnCallback(@NativeType("PFN_vkDebugReportCallbackEXT") VkDebugReportCallbackEXTI value) {
        npfnCallback(address(), value);
        return this;
    }

    public VkDebugReportCallbackCreateInfoEXT pUserData(@NativeType("void *") long value) {
        npUserData(address(), value);
        return this;
    }

    public VkDebugReportCallbackCreateInfoEXT set(int sType, long pNext, int flags, VkDebugReportCallbackEXTI pfnCallback, long pUserData) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pfnCallback(pfnCallback);
        pUserData(pUserData);
        return this;
    }

    public VkDebugReportCallbackCreateInfoEXT set(VkDebugReportCallbackCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDebugReportCallbackCreateInfoEXT malloc() {
        return new VkDebugReportCallbackCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDebugReportCallbackCreateInfoEXT calloc() {
        return new VkDebugReportCallbackCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDebugReportCallbackCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugReportCallbackCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDebugReportCallbackCreateInfoEXT create(long address) {
        return new VkDebugReportCallbackCreateInfoEXT(address, null);
    }

    public static VkDebugReportCallbackCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDebugReportCallbackCreateInfoEXT(address, null);
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

    public static VkDebugReportCallbackCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDebugReportCallbackCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDebugReportCallbackCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDebugReportCallbackCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkDebugReportCallbackEXT npfnCallback(long struct) {
        return VkDebugReportCallbackEXT.create(MemoryUtil.memGetAddress(struct + PFNCALLBACK));
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

    public static void npfnCallback(long struct, VkDebugReportCallbackEXTI value) {
        MemoryUtil.memPutAddress(struct + PFNCALLBACK, value.address());
    }

    public static void npUserData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PUSERDATA, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PFNCALLBACK));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugReportCallbackCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugReportCallbackCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDebugReportCallbackCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkDebugReportCallbackCreateInfoEXT ELEMENT_FACTORY = VkDebugReportCallbackCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDebugReportCallbackCreateInfoEXT.SIZEOF);
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
        public VkDebugReportCallbackCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDebugReportCallbackCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDebugReportCallbackCreateInfoEXT.npNext(address());
        }

        @NativeType("VkDebugReportFlagsEXT")
        public int flags() {
            return VkDebugReportCallbackCreateInfoEXT.nflags(address());
        }

        @NativeType("PFN_vkDebugReportCallbackEXT")
        public VkDebugReportCallbackEXT pfnCallback() {
            return VkDebugReportCallbackCreateInfoEXT.npfnCallback(address());
        }

        @NativeType("void *")
        public long pUserData() {
            return VkDebugReportCallbackCreateInfoEXT.npUserData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDebugReportCallbackCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000011000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDebugReportCallbackCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDebugReportFlagsEXT") int value) {
            VkDebugReportCallbackCreateInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer pfnCallback(@NativeType("PFN_vkDebugReportCallbackEXT") VkDebugReportCallbackEXTI value) {
            VkDebugReportCallbackCreateInfoEXT.npfnCallback(address(), value);
            return this;
        }

        public Buffer pUserData(@NativeType("void *") long value) {
            VkDebugReportCallbackCreateInfoEXT.npUserData(address(), value);
            return this;
        }
    }
}
