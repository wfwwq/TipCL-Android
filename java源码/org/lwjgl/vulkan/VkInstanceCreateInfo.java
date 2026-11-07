package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInstanceCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInstanceCreateInfo.class */
public class VkInstanceCreateInfo extends Struct<VkInstanceCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PAPPLICATIONINFO;
    public static final int ENABLEDLAYERCOUNT;
    public static final int PPENABLEDLAYERNAMES;
    public static final int ENABLEDEXTENSIONCOUNT;
    public static final int PPENABLEDEXTENSIONNAMES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PAPPLICATIONINFO = layout.offsetof(3);
        ENABLEDLAYERCOUNT = layout.offsetof(4);
        PPENABLEDLAYERNAMES = layout.offsetof(5);
        ENABLEDEXTENSIONCOUNT = layout.offsetof(6);
        PPENABLEDEXTENSIONNAMES = layout.offsetof(7);
    }

    protected VkInstanceCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkInstanceCreateInfo create(long address, ByteBuffer container) {
        return new VkInstanceCreateInfo(address, container);
    }

    public VkInstanceCreateInfo(ByteBuffer container) {
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

    @NativeType("VkInstanceCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkApplicationInfo const *")
    public VkApplicationInfo pApplicationInfo() {
        return npApplicationInfo(address());
    }

    @NativeType("uint32_t")
    public int enabledLayerCount() {
        return nenabledLayerCount(address());
    }

    @NativeType("char const * const *")
    public PointerBuffer ppEnabledLayerNames() {
        return nppEnabledLayerNames(address());
    }

    @NativeType("uint32_t")
    public int enabledExtensionCount() {
        return nenabledExtensionCount(address());
    }

    @NativeType("char const * const *")
    public PointerBuffer ppEnabledExtensionNames() {
        return nppEnabledExtensionNames(address());
    }

    public VkInstanceCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkInstanceCreateInfo sType$Default() {
        return sType(1);
    }

    public VkInstanceCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkInstanceCreateInfo pNext(VkDebugReportCallbackCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkInstanceCreateInfo pNext(VkDebugUtilsMessengerCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkInstanceCreateInfo pNext(VkDirectDriverLoadingListLUNARG value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkInstanceCreateInfo pNext(VkExportMetalObjectCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkInstanceCreateInfo pNext(VkLayerSettingsCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkInstanceCreateInfo pNext(VkValidationFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkInstanceCreateInfo pNext(VkValidationFlagsEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkInstanceCreateInfo flags(@NativeType("VkInstanceCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkInstanceCreateInfo pApplicationInfo(@NativeType("VkApplicationInfo const *") VkApplicationInfo value) {
        npApplicationInfo(address(), value);
        return this;
    }

    public VkInstanceCreateInfo ppEnabledLayerNames(@NativeType("char const * const *") PointerBuffer value) {
        nppEnabledLayerNames(address(), value);
        return this;
    }

    public VkInstanceCreateInfo ppEnabledExtensionNames(@NativeType("char const * const *") PointerBuffer value) {
        nppEnabledExtensionNames(address(), value);
        return this;
    }

    public VkInstanceCreateInfo set(int sType, long pNext, int flags, VkApplicationInfo pApplicationInfo, PointerBuffer ppEnabledLayerNames, PointerBuffer ppEnabledExtensionNames) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pApplicationInfo(pApplicationInfo);
        ppEnabledLayerNames(ppEnabledLayerNames);
        ppEnabledExtensionNames(ppEnabledExtensionNames);
        return this;
    }

    public VkInstanceCreateInfo set(VkInstanceCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkInstanceCreateInfo malloc() {
        return new VkInstanceCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkInstanceCreateInfo calloc() {
        return new VkInstanceCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkInstanceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkInstanceCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkInstanceCreateInfo create(long address) {
        return new VkInstanceCreateInfo(address, null);
    }

    public static VkInstanceCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkInstanceCreateInfo(address, null);
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

    public static VkInstanceCreateInfo malloc(MemoryStack stack) {
        return new VkInstanceCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkInstanceCreateInfo calloc(MemoryStack stack) {
        return new VkInstanceCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkApplicationInfo npApplicationInfo(long struct) {
        return VkApplicationInfo.createSafe(MemoryUtil.memGetAddress(struct + PAPPLICATIONINFO));
    }

    public static int nenabledLayerCount(long struct) {
        return MemoryUtil.memGetInt(struct + ENABLEDLAYERCOUNT);
    }

    public static PointerBuffer nppEnabledLayerNames(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PPENABLEDLAYERNAMES), nenabledLayerCount(struct));
    }

    public static int nenabledExtensionCount(long struct) {
        return MemoryUtil.memGetInt(struct + ENABLEDEXTENSIONCOUNT);
    }

    public static PointerBuffer nppEnabledExtensionNames(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + PPENABLEDEXTENSIONNAMES), nenabledExtensionCount(struct));
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

    public static void npApplicationInfo(long struct, VkApplicationInfo value) {
        MemoryUtil.memPutAddress(struct + PAPPLICATIONINFO, MemoryUtil.memAddressSafe(value));
    }

    public static void nenabledLayerCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENABLEDLAYERCOUNT, value);
    }

    public static void nppEnabledLayerNames(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PPENABLEDLAYERNAMES, MemoryUtil.memAddressSafe(value));
        nenabledLayerCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nenabledExtensionCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENABLEDEXTENSIONCOUNT, value);
    }

    public static void nppEnabledExtensionNames(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + PPENABLEDEXTENSIONNAMES, MemoryUtil.memAddressSafe(value));
        nenabledExtensionCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nenabledLayerCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPENABLEDLAYERNAMES));
        }
        if (nenabledExtensionCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PPENABLEDEXTENSIONNAMES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInstanceCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkInstanceCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkInstanceCreateInfo, Buffer> implements NativeResource {
        private static final VkInstanceCreateInfo ELEMENT_FACTORY = VkInstanceCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkInstanceCreateInfo.SIZEOF);
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
        public VkInstanceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkInstanceCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkInstanceCreateInfo.npNext(address());
        }

        @NativeType("VkInstanceCreateFlags")
        public int flags() {
            return VkInstanceCreateInfo.nflags(address());
        }

        @NativeType("VkApplicationInfo const *")
        public VkApplicationInfo pApplicationInfo() {
            return VkInstanceCreateInfo.npApplicationInfo(address());
        }

        @NativeType("uint32_t")
        public int enabledLayerCount() {
            return VkInstanceCreateInfo.nenabledLayerCount(address());
        }

        @NativeType("char const * const *")
        public PointerBuffer ppEnabledLayerNames() {
            return VkInstanceCreateInfo.nppEnabledLayerNames(address());
        }

        @NativeType("uint32_t")
        public int enabledExtensionCount() {
            return VkInstanceCreateInfo.nenabledExtensionCount(address());
        }

        @NativeType("char const * const *")
        public PointerBuffer ppEnabledExtensionNames() {
            return VkInstanceCreateInfo.nppEnabledExtensionNames(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkInstanceCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkInstanceCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDebugReportCallbackCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDebugUtilsMessengerCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkDirectDriverLoadingListLUNARG value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkExportMetalObjectCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkLayerSettingsCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkValidationFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkValidationFlagsEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkInstanceCreateFlags") int value) {
            VkInstanceCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer pApplicationInfo(@NativeType("VkApplicationInfo const *") VkApplicationInfo value) {
            VkInstanceCreateInfo.npApplicationInfo(address(), value);
            return this;
        }

        public Buffer ppEnabledLayerNames(@NativeType("char const * const *") PointerBuffer value) {
            VkInstanceCreateInfo.nppEnabledLayerNames(address(), value);
            return this;
        }

        public Buffer ppEnabledExtensionNames(@NativeType("char const * const *") PointerBuffer value) {
            VkInstanceCreateInfo.nppEnabledExtensionNames(address(), value);
            return this;
        }
    }
}
