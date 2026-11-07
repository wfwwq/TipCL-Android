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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPropertiesKHR.class */
public class VkDisplayPropertiesKHR extends Struct<VkDisplayPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DISPLAY;
    public static final int DISPLAYNAME;
    public static final int PHYSICALDIMENSIONS;
    public static final int PHYSICALRESOLUTION;
    public static final int SUPPORTEDTRANSFORMS;
    public static final int PLANEREORDERPOSSIBLE;
    public static final int PERSISTENTCONTENT;

    static {
        Struct.Layout layout = __struct(__member(8), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DISPLAY = layout.offsetof(0);
        DISPLAYNAME = layout.offsetof(1);
        PHYSICALDIMENSIONS = layout.offsetof(2);
        PHYSICALRESOLUTION = layout.offsetof(3);
        SUPPORTEDTRANSFORMS = layout.offsetof(4);
        PLANEREORDERPOSSIBLE = layout.offsetof(5);
        PERSISTENTCONTENT = layout.offsetof(6);
    }

    protected VkDisplayPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayPropertiesKHR create(long address, ByteBuffer container) {
        return new VkDisplayPropertiesKHR(address, container);
    }

    public VkDisplayPropertiesKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDisplayKHR")
    public long display() {
        return ndisplay(address());
    }

    @NativeType("char const *")
    public ByteBuffer displayName() {
        return ndisplayName(address());
    }

    @NativeType("char const *")
    public String displayNameString() {
        return ndisplayNameString(address());
    }

    public VkExtent2D physicalDimensions() {
        return nphysicalDimensions(address());
    }

    public VkExtent2D physicalResolution() {
        return nphysicalResolution(address());
    }

    @NativeType("VkSurfaceTransformFlagsKHR")
    public int supportedTransforms() {
        return nsupportedTransforms(address());
    }

    @NativeType("VkBool32")
    public boolean planeReorderPossible() {
        return nplaneReorderPossible(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean persistentContent() {
        return npersistentContent(address()) != 0;
    }

    public static VkDisplayPropertiesKHR malloc() {
        return new VkDisplayPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayPropertiesKHR calloc() {
        return new VkDisplayPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayPropertiesKHR create(long address) {
        return new VkDisplayPropertiesKHR(address, null);
    }

    public static VkDisplayPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayPropertiesKHR(address, null);
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

    public static VkDisplayPropertiesKHR malloc(MemoryStack stack) {
        return new VkDisplayPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayPropertiesKHR calloc(MemoryStack stack) {
        return new VkDisplayPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ndisplay(long struct) {
        return MemoryUtil.memGetLong(struct + DISPLAY);
    }

    public static ByteBuffer ndisplayName(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + DISPLAYNAME));
    }

    public static String ndisplayNameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + DISPLAYNAME));
    }

    public static VkExtent2D nphysicalDimensions(long struct) {
        return VkExtent2D.create(struct + PHYSICALDIMENSIONS);
    }

    public static VkExtent2D nphysicalResolution(long struct) {
        return VkExtent2D.create(struct + PHYSICALRESOLUTION);
    }

    public static int nsupportedTransforms(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDTRANSFORMS);
    }

    public static int nplaneReorderPossible(long struct) {
        return MemoryUtil.memGetInt(struct + PLANEREORDERPOSSIBLE);
    }

    public static int npersistentContent(long struct) {
        return MemoryUtil.memGetInt(struct + PERSISTENTCONTENT);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayPropertiesKHR, Buffer> implements NativeResource {
        private static final VkDisplayPropertiesKHR ELEMENT_FACTORY = VkDisplayPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayPropertiesKHR.SIZEOF);
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
        public VkDisplayPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDisplayKHR")
        public long display() {
            return VkDisplayPropertiesKHR.ndisplay(address());
        }

        @NativeType("char const *")
        public ByteBuffer displayName() {
            return VkDisplayPropertiesKHR.ndisplayName(address());
        }

        @NativeType("char const *")
        public String displayNameString() {
            return VkDisplayPropertiesKHR.ndisplayNameString(address());
        }

        public VkExtent2D physicalDimensions() {
            return VkDisplayPropertiesKHR.nphysicalDimensions(address());
        }

        public VkExtent2D physicalResolution() {
            return VkDisplayPropertiesKHR.nphysicalResolution(address());
        }

        @NativeType("VkSurfaceTransformFlagsKHR")
        public int supportedTransforms() {
            return VkDisplayPropertiesKHR.nsupportedTransforms(address());
        }

        @NativeType("VkBool32")
        public boolean planeReorderPossible() {
            return VkDisplayPropertiesKHR.nplaneReorderPossible(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean persistentContent() {
            return VkDisplayPropertiesKHR.npersistentContent(address()) != 0;
        }
    }
}
