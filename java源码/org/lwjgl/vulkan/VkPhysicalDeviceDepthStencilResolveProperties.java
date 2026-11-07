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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthStencilResolveProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthStencilResolveProperties.class */
public class VkPhysicalDeviceDepthStencilResolveProperties extends Struct<VkPhysicalDeviceDepthStencilResolveProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SUPPORTEDDEPTHRESOLVEMODES;
    public static final int SUPPORTEDSTENCILRESOLVEMODES;
    public static final int INDEPENDENTRESOLVENONE;
    public static final int INDEPENDENTRESOLVE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTEDDEPTHRESOLVEMODES = layout.offsetof(2);
        SUPPORTEDSTENCILRESOLVEMODES = layout.offsetof(3);
        INDEPENDENTRESOLVENONE = layout.offsetof(4);
        INDEPENDENTRESOLVE = layout.offsetof(5);
    }

    protected VkPhysicalDeviceDepthStencilResolveProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDepthStencilResolveProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDepthStencilResolveProperties(address, container);
    }

    public VkPhysicalDeviceDepthStencilResolveProperties(ByteBuffer container) {
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

    @NativeType("VkResolveModeFlags")
    public int supportedDepthResolveModes() {
        return nsupportedDepthResolveModes(address());
    }

    @NativeType("VkResolveModeFlags")
    public int supportedStencilResolveModes() {
        return nsupportedStencilResolveModes(address());
    }

    @NativeType("VkBool32")
    public boolean independentResolveNone() {
        return nindependentResolveNone(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean independentResolve() {
        return nindependentResolve(address()) != 0;
    }

    public VkPhysicalDeviceDepthStencilResolveProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDepthStencilResolveProperties sType$Default() {
        return sType(1000199000);
    }

    public VkPhysicalDeviceDepthStencilResolveProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDepthStencilResolveProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDepthStencilResolveProperties set(VkPhysicalDeviceDepthStencilResolveProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDepthStencilResolveProperties malloc() {
        return new VkPhysicalDeviceDepthStencilResolveProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthStencilResolveProperties calloc() {
        return new VkPhysicalDeviceDepthStencilResolveProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthStencilResolveProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDepthStencilResolveProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDepthStencilResolveProperties create(long address) {
        return new VkPhysicalDeviceDepthStencilResolveProperties(address, null);
    }

    public static VkPhysicalDeviceDepthStencilResolveProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDepthStencilResolveProperties(address, null);
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

    public static VkPhysicalDeviceDepthStencilResolveProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthStencilResolveProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthStencilResolveProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthStencilResolveProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsupportedDepthResolveModes(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDDEPTHRESOLVEMODES);
    }

    public static int nsupportedStencilResolveModes(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDSTENCILRESOLVEMODES);
    }

    public static int nindependentResolveNone(long struct) {
        return MemoryUtil.memGetInt(struct + INDEPENDENTRESOLVENONE);
    }

    public static int nindependentResolve(long struct) {
        return MemoryUtil.memGetInt(struct + INDEPENDENTRESOLVE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthStencilResolveProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthStencilResolveProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthStencilResolveProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDepthStencilResolveProperties ELEMENT_FACTORY = VkPhysicalDeviceDepthStencilResolveProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDepthStencilResolveProperties.SIZEOF);
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
        public VkPhysicalDeviceDepthStencilResolveProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDepthStencilResolveProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDepthStencilResolveProperties.npNext(address());
        }

        @NativeType("VkResolveModeFlags")
        public int supportedDepthResolveModes() {
            return VkPhysicalDeviceDepthStencilResolveProperties.nsupportedDepthResolveModes(address());
        }

        @NativeType("VkResolveModeFlags")
        public int supportedStencilResolveModes() {
            return VkPhysicalDeviceDepthStencilResolveProperties.nsupportedStencilResolveModes(address());
        }

        @NativeType("VkBool32")
        public boolean independentResolveNone() {
            return VkPhysicalDeviceDepthStencilResolveProperties.nindependentResolveNone(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean independentResolve() {
            return VkPhysicalDeviceDepthStencilResolveProperties.nindependentResolve(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDepthStencilResolveProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000199000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDepthStencilResolveProperties.npNext(address(), value);
            return this;
        }
    }
}
