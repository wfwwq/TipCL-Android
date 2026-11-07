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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilitiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilitiesKHR.class */
public class VkDisplayPlaneCapabilitiesKHR extends Struct<VkDisplayPlaneCapabilitiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SUPPORTEDALPHA;
    public static final int MINSRCPOSITION;
    public static final int MAXSRCPOSITION;
    public static final int MINSRCEXTENT;
    public static final int MAXSRCEXTENT;
    public static final int MINDSTPOSITION;
    public static final int MAXDSTPOSITION;
    public static final int MINDSTEXTENT;
    public static final int MAXDSTEXTENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF), __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF), __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SUPPORTEDALPHA = layout.offsetof(0);
        MINSRCPOSITION = layout.offsetof(1);
        MAXSRCPOSITION = layout.offsetof(2);
        MINSRCEXTENT = layout.offsetof(3);
        MAXSRCEXTENT = layout.offsetof(4);
        MINDSTPOSITION = layout.offsetof(5);
        MAXDSTPOSITION = layout.offsetof(6);
        MINDSTEXTENT = layout.offsetof(7);
        MAXDSTEXTENT = layout.offsetof(8);
    }

    protected VkDisplayPlaneCapabilitiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayPlaneCapabilitiesKHR create(long address, ByteBuffer container) {
        return new VkDisplayPlaneCapabilitiesKHR(address, container);
    }

    public VkDisplayPlaneCapabilitiesKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDisplayPlaneAlphaFlagsKHR")
    public int supportedAlpha() {
        return nsupportedAlpha(address());
    }

    public VkOffset2D minSrcPosition() {
        return nminSrcPosition(address());
    }

    public VkOffset2D maxSrcPosition() {
        return nmaxSrcPosition(address());
    }

    public VkExtent2D minSrcExtent() {
        return nminSrcExtent(address());
    }

    public VkExtent2D maxSrcExtent() {
        return nmaxSrcExtent(address());
    }

    public VkOffset2D minDstPosition() {
        return nminDstPosition(address());
    }

    public VkOffset2D maxDstPosition() {
        return nmaxDstPosition(address());
    }

    public VkExtent2D minDstExtent() {
        return nminDstExtent(address());
    }

    public VkExtent2D maxDstExtent() {
        return nmaxDstExtent(address());
    }

    public static VkDisplayPlaneCapabilitiesKHR malloc() {
        return new VkDisplayPlaneCapabilitiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayPlaneCapabilitiesKHR calloc() {
        return new VkDisplayPlaneCapabilitiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayPlaneCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPlaneCapabilitiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayPlaneCapabilitiesKHR create(long address) {
        return new VkDisplayPlaneCapabilitiesKHR(address, null);
    }

    public static VkDisplayPlaneCapabilitiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayPlaneCapabilitiesKHR(address, null);
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

    public static VkDisplayPlaneCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkDisplayPlaneCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayPlaneCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkDisplayPlaneCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsupportedAlpha(long struct) {
        return MemoryUtil.memGetInt(struct + SUPPORTEDALPHA);
    }

    public static VkOffset2D nminSrcPosition(long struct) {
        return VkOffset2D.create(struct + MINSRCPOSITION);
    }

    public static VkOffset2D nmaxSrcPosition(long struct) {
        return VkOffset2D.create(struct + MAXSRCPOSITION);
    }

    public static VkExtent2D nminSrcExtent(long struct) {
        return VkExtent2D.create(struct + MINSRCEXTENT);
    }

    public static VkExtent2D nmaxSrcExtent(long struct) {
        return VkExtent2D.create(struct + MAXSRCEXTENT);
    }

    public static VkOffset2D nminDstPosition(long struct) {
        return VkOffset2D.create(struct + MINDSTPOSITION);
    }

    public static VkOffset2D nmaxDstPosition(long struct) {
        return VkOffset2D.create(struct + MAXDSTPOSITION);
    }

    public static VkExtent2D nminDstExtent(long struct) {
        return VkExtent2D.create(struct + MINDSTEXTENT);
    }

    public static VkExtent2D nmaxDstExtent(long struct) {
        return VkExtent2D.create(struct + MAXDSTEXTENT);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilitiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPlaneCapabilitiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayPlaneCapabilitiesKHR, Buffer> implements NativeResource {
        private static final VkDisplayPlaneCapabilitiesKHR ELEMENT_FACTORY = VkDisplayPlaneCapabilitiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayPlaneCapabilitiesKHR.SIZEOF);
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
        public VkDisplayPlaneCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDisplayPlaneAlphaFlagsKHR")
        public int supportedAlpha() {
            return VkDisplayPlaneCapabilitiesKHR.nsupportedAlpha(address());
        }

        public VkOffset2D minSrcPosition() {
            return VkDisplayPlaneCapabilitiesKHR.nminSrcPosition(address());
        }

        public VkOffset2D maxSrcPosition() {
            return VkDisplayPlaneCapabilitiesKHR.nmaxSrcPosition(address());
        }

        public VkExtent2D minSrcExtent() {
            return VkDisplayPlaneCapabilitiesKHR.nminSrcExtent(address());
        }

        public VkExtent2D maxSrcExtent() {
            return VkDisplayPlaneCapabilitiesKHR.nmaxSrcExtent(address());
        }

        public VkOffset2D minDstPosition() {
            return VkDisplayPlaneCapabilitiesKHR.nminDstPosition(address());
        }

        public VkOffset2D maxDstPosition() {
            return VkDisplayPlaneCapabilitiesKHR.nmaxDstPosition(address());
        }

        public VkExtent2D minDstExtent() {
            return VkDisplayPlaneCapabilitiesKHR.nminDstExtent(address());
        }

        public VkExtent2D maxDstExtent() {
            return VkDisplayPlaneCapabilitiesKHR.nmaxDstExtent(address());
        }
    }
}
