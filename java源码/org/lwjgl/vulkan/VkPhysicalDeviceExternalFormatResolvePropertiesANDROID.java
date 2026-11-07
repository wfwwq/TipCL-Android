package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.class */
public class VkPhysicalDeviceExternalFormatResolvePropertiesANDROID extends Struct<VkPhysicalDeviceExternalFormatResolvePropertiesANDROID> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int NULLCOLORATTACHMENTWITHEXTERNALFORMATRESOLVE;
    public static final int EXTERNALFORMATRESOLVECHROMAOFFSETX;
    public static final int EXTERNALFORMATRESOLVECHROMAOFFSETY;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NULLCOLORATTACHMENTWITHEXTERNALFORMATRESOLVE = layout.offsetof(2);
        EXTERNALFORMATRESOLVECHROMAOFFSETX = layout.offsetof(3);
        EXTERNALFORMATRESOLVECHROMAOFFSETY = layout.offsetof(4);
    }

    protected VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(address, container);
    }

    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(ByteBuffer container) {
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
    public boolean nullColorAttachmentWithExternalFormatResolve() {
        return nnullColorAttachmentWithExternalFormatResolve(address()) != 0;
    }

    @NativeType("VkChromaLocation")
    public int externalFormatResolveChromaOffsetX() {
        return nexternalFormatResolveChromaOffsetX(address());
    }

    @NativeType("VkChromaLocation")
    public int externalFormatResolveChromaOffsetY() {
        return nexternalFormatResolveChromaOffsetY(address());
    }

    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID sType$Default() {
        return sType(ANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID);
    }

    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID set(VkPhysicalDeviceExternalFormatResolvePropertiesANDROID src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID malloc() {
        return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID calloc() {
        return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID create(long address) {
        return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(address, null);
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(address, null);
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

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nnullColorAttachmentWithExternalFormatResolve(long struct) {
        return MemoryUtil.memGetInt(struct + NULLCOLORATTACHMENTWITHEXTERNALFORMATRESOLVE);
    }

    public static int nexternalFormatResolveChromaOffsetX(long struct) {
        return MemoryUtil.memGetInt(struct + EXTERNALFORMATRESOLVECHROMAOFFSETX);
    }

    public static int nexternalFormatResolveChromaOffsetY(long struct) {
        return MemoryUtil.memGetInt(struct + EXTERNALFORMATRESOLVECHROMAOFFSETY);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExternalFormatResolvePropertiesANDROID$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalFormatResolvePropertiesANDROID, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExternalFormatResolvePropertiesANDROID ELEMENT_FACTORY = VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.SIZEOF);
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
        public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean nullColorAttachmentWithExternalFormatResolve() {
            return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.nnullColorAttachmentWithExternalFormatResolve(address()) != 0;
        }

        @NativeType("VkChromaLocation")
        public int externalFormatResolveChromaOffsetX() {
            return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.nexternalFormatResolveChromaOffsetX(address());
        }

        @NativeType("VkChromaLocation")
        public int externalFormatResolveChromaOffsetY() {
            return VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.nexternalFormatResolveChromaOffsetY(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(ANDROIDExternalFormatResolve.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceExternalFormatResolvePropertiesANDROID.npNext(address(), value);
            return this;
        }
    }
}
