package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.class */
public class VkPhysicalDeviceExternalFormatResolveFeaturesANDROID extends Struct<VkPhysicalDeviceExternalFormatResolveFeaturesANDROID> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXTERNALFORMATRESOLVE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTERNALFORMATRESOLVE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(address, container);
    }

    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean externalFormatResolve() {
        return nexternalFormatResolve(address()) != 0;
    }

    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID sType$Default() {
        return sType(ANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID);
    }

    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID externalFormatResolve(@NativeType("VkBool32") boolean value) {
        nexternalFormatResolve(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID set(int sType, long pNext, boolean externalFormatResolve) {
        sType(sType);
        pNext(pNext);
        externalFormatResolve(externalFormatResolve);
        return this;
    }

    public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID set(VkPhysicalDeviceExternalFormatResolveFeaturesANDROID src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID malloc() {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID calloc() {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID create(long address) {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(address, null);
    }

    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(address, null);
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

    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalFormatResolveFeaturesANDROID calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalFormatResolveFeaturesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nexternalFormatResolve(long struct) {
        return MemoryUtil.memGetInt(struct + EXTERNALFORMATRESOLVE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nexternalFormatResolve(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTERNALFORMATRESOLVE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalFormatResolveFeaturesANDROID$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalFormatResolveFeaturesANDROID, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExternalFormatResolveFeaturesANDROID ELEMENT_FACTORY = VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.SIZEOF);
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
        public VkPhysicalDeviceExternalFormatResolveFeaturesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean externalFormatResolve() {
            return VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.nexternalFormatResolve(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_FEATURES_ANDROID);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.npNext(address(), value);
            return this;
        }

        public Buffer externalFormatResolve(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExternalFormatResolveFeaturesANDROID.nexternalFormatResolve(address(), value ? 1 : 0);
            return this;
        }
    }
}
