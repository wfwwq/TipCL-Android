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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceToolProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceToolProperties.class */
public class VkPhysicalDeviceToolProperties extends Struct<VkPhysicalDeviceToolProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int NAME;
    public static final int VERSION;
    public static final int PURPOSES;
    public static final int DESCRIPTION;
    public static final int LAYER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __array(1, 256), __array(1, 256), __member(4), __array(1, 256), __array(1, 256));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NAME = layout.offsetof(2);
        VERSION = layout.offsetof(3);
        PURPOSES = layout.offsetof(4);
        DESCRIPTION = layout.offsetof(5);
        LAYER = layout.offsetof(6);
    }

    protected VkPhysicalDeviceToolProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceToolProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceToolProperties(address, container);
    }

    public VkPhysicalDeviceToolProperties(ByteBuffer container) {
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

    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String nameString() {
        return nnameString(address());
    }

    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer version() {
        return nversion(address());
    }

    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String versionString() {
        return nversionString(address());
    }

    @NativeType("VkToolPurposeFlags")
    public int purposes() {
        return npurposes(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() {
        return ndescription(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() {
        return ndescriptionString(address());
    }

    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer layer() {
        return nlayer(address());
    }

    @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
    public String layerString() {
        return nlayerString(address());
    }

    public VkPhysicalDeviceToolProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceToolProperties sType$Default() {
        return sType(1000245000);
    }

    public VkPhysicalDeviceToolProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceToolProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceToolProperties set(VkPhysicalDeviceToolProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceToolProperties malloc() {
        return new VkPhysicalDeviceToolProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceToolProperties calloc() {
        return new VkPhysicalDeviceToolProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceToolProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceToolProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceToolProperties create(long address) {
        return new VkPhysicalDeviceToolProperties(address, null);
    }

    public static VkPhysicalDeviceToolProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceToolProperties(address, null);
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

    public static VkPhysicalDeviceToolProperties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceToolProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceToolProperties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceToolProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBuffer(struct + NAME, 256);
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(struct + NAME);
    }

    public static ByteBuffer nversion(long struct) {
        return MemoryUtil.memByteBuffer(struct + VERSION, 256);
    }

    public static String nversionString(long struct) {
        return MemoryUtil.memUTF8(struct + VERSION);
    }

    public static int npurposes(long struct) {
        return MemoryUtil.memGetInt(struct + PURPOSES);
    }

    public static ByteBuffer ndescription(long struct) {
        return MemoryUtil.memByteBuffer(struct + DESCRIPTION, 256);
    }

    public static String ndescriptionString(long struct) {
        return MemoryUtil.memUTF8(struct + DESCRIPTION);
    }

    public static ByteBuffer nlayer(long struct) {
        return MemoryUtil.memByteBuffer(struct + LAYER, 256);
    }

    public static String nlayerString(long struct) {
        return MemoryUtil.memUTF8(struct + LAYER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceToolProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceToolProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceToolProperties, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceToolProperties ELEMENT_FACTORY = VkPhysicalDeviceToolProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceToolProperties.SIZEOF);
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
        public VkPhysicalDeviceToolProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceToolProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceToolProperties.npNext(address());
        }

        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer name() {
            return VkPhysicalDeviceToolProperties.nname(address());
        }

        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String nameString() {
            return VkPhysicalDeviceToolProperties.nnameString(address());
        }

        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer version() {
            return VkPhysicalDeviceToolProperties.nversion(address());
        }

        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String versionString() {
            return VkPhysicalDeviceToolProperties.nversionString(address());
        }

        @NativeType("VkToolPurposeFlags")
        public int purposes() {
            return VkPhysicalDeviceToolProperties.npurposes(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() {
            return VkPhysicalDeviceToolProperties.ndescription(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() {
            return VkPhysicalDeviceToolProperties.ndescriptionString(address());
        }

        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer layer() {
            return VkPhysicalDeviceToolProperties.nlayer(address());
        }

        @NativeType("char[VK_MAX_EXTENSION_NAME_SIZE]")
        public String layerString() {
            return VkPhysicalDeviceToolProperties.nlayerString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceToolProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000245000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceToolProperties.npNext(address(), value);
            return this;
        }
    }
}
